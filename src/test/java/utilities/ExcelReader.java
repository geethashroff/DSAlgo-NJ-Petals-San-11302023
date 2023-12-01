package utilities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static int totalRow;

	public List<Map<String, String>> getData(String excelFilePath, String sheetName)
			throws InvalidFormatException, IOException {

		Workbook workbook = WorkbookFactory.create(new File(excelFilePath));
		Sheet sheet = workbook.getSheet(sheetName);
		workbook.close();
		return readSheet(sheet); //error
	}

	private List<Map<String, String>> readSheet(Sheet sheet) {
	    int totalRow = sheet.getLastRowNum();
	    List<Map<String, String>> excelRows = new ArrayList<>();

	    // Get the first row to retrieve column header names
	    Row headerRow = sheet.getRow(sheet.getFirstRowNum());

	    if (headerRow == null) {
	        throw new RuntimeException("Header row is null. Verify your Excel sheet.");
	    }

	    int totalColumn = headerRow.getLastCellNum();

	    for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
	        Row dataRow = sheet.getRow(currentRow);

	        if (dataRow == null) {
	            // Handle this case, for example, by skipping the row or throwing an exception.
	            // You can't proceed if there's no data in the row.
	            continue;
	        }

	        LinkedHashMap<String, String> columnMapdata = new LinkedHashMap<>();

	        for (int currentColumn = 0; currentColumn < totalColumn; currentColumn++) {
	            Cell cell = dataRow.getCell(currentColumn);

	            if (cell != null) {
	                String columnHeaderName = headerRow.getCell(currentColumn).getStringCellValue();
	                String cellValue = cell.getStringCellValue();
	                columnMapdata.put(columnHeaderName, cellValue);
	            } else {
	                // Handle the case where the cell is null (e.g., it's empty)
	                // You can choose to add a default value or handle it as needed.
	                columnMapdata.put(headerRow.getCell(currentColumn).getStringCellValue(), "");
	            }
	        }

	        excelRows.add(columnMapdata);
	    }

	    return excelRows;
	}


}
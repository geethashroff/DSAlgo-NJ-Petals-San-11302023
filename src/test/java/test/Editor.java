package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Editor {
	
    public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\DSAlgo_ninjapetals\\src\\test\\resources\\driver\\chromedriver.exe");
    	String URL = "https://dsportalapp.herokuapp.com/";
    	By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
    	By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
    	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
    	By signinBtn = By.linkText("Sign in");
    	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
    	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
    	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
    	By aGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[2]/div/div/a");
    	By arrInPythLnk = By.linkText("Arrays in Python");
    	By pracQstnsLnk = By.linkText("Practice Questions");
    	By srchTheArrLnk = By.linkText("Search the array");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.manage().window().maximize();
    	driver.get(URL);
    	driver.findElement(getstartBtn).click();
    	driver.findElement(signinBtn).click();
    	driver.findElement(usrName).sendKeys("sangeetha");
    	driver.findElement(pwd).sendKeys("S@ibaba@123");
        driver.findElement(login).click();
        driver.findElement(aGetstrBtn).click();
        driver.findElement(arrInPythLnk).click();
        driver.findElement(pracQstnsLnk).click();
        driver.findElement(srchTheArrLnk).click();
        
    		Actions action = new Actions(driver);
    	    WebElement txt = driver.findElement(codeMirr);
    	    txt.click();
    	     action.keyDown(Keys.SHIFT)
    	    .sendKeys(txt, Keys.ARROW_RIGHT)  // Replace with your desired arrow keys
    	    .sendKeys(txt, Keys.ARROW_RIGHT)
    	    .sendKeys(txt, Keys.ARROW_RIGHT)
    	    .sendKeys(txt, Keys.ARROW_RIGHT)
    	    .sendKeys(txt, Keys.ARROW_RIGHT)
    	    .keyUp(Keys.SHIFT).perform();
    	    action.sendKeys(Keys.BACK_SPACE).perform();
    	    action.click(txt).sendKeys("print('Hello')").perform();  
    	    driver.findElement(runBtn).click();
    	    driver.close();
    }
}
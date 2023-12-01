package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSArraysPage {

	private WebDriver driver;
   
    //Getstart page
	String URL = "https://dsportalapp.herokuapp.com/";
	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
	By signinBtn = By.linkText("Sign in");
	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
	//editor page
	By tryHere = By.linkText("Try here>>>");
	By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
	By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
	
	//arrays page
	By aGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[2]/div/div/a");
	By arrInPythLnk = By.linkText("Arrays in Python");
	By arrUsinLstLnk = By.linkText("Arrays Using List");
	By bscOpInLstsLnk = By.linkText("Basic Operations in Lists");
	By appOfArrLnk = By.linkText("Applications of Array");
	
	//practice page
	By pracQstnsLnk = By.linkText("Practice Questions");
	By srchTheArrLnk = By.linkText("Search the array");
	By maxCsctvOnesLnk = By.linkText("Max Consecutive Ones");
	By fndNumWthEvnNumOfDgtsLnk = By.linkText("Find Numbers with Even Number of Digits");
	By sqrsOfSrtdArrLnk = By.xpath("//a[text()=\"Squares of  a Sorted Array\"]");
	
	public DSArraysPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnGetStart() {
		driver.findElement(getstartBtn).click();
		driver.findElement(signinBtn).click();
		driver.findElement(usrName).sendKeys("suvithra");
		driver.findElement(pwd).sendKeys("rudu1234@");
		driver.findElement(login).click();
	}
	 
	//array methods
	public void arraysStartBtn() {
		driver.findElement(aGetstrBtn).click();
	}
	public void clickArrInPythLnk() {
		driver.findElement(arrInPythLnk).click();
	}
	 public void clickArrUsinLstLnk() {
	  driver.findElement(arrUsinLstLnk).click();
    }
	  public void clickBscOpInLstsLnk() {
		  driver.findElement(bscOpInLstsLnk).click();
	}
	  public void clickAppOfArrLnk() {
		  driver.findElement(appOfArrLnk).click();
	}
	  public void clickOntryHere() {
			driver.findElement(tryHere).click();
	}
	  public void prcticeCode() {
			Actions action = new Actions(driver);
		    WebElement txt1 = driver.findElement(codeMirr);
		    action.click(txt1).sendKeys("print('Hello')").perform(); 
		    driver.findElement(runBtn).click();
	}
	// Practice page methods
	  public void srchTheArrLnk() {
		  driver.findElement(srchTheArrLnk).click();
	}
	  public void maxCsctvOnesLnk() {
		  driver.findElement(maxCsctvOnesLnk).click();
	}
	  public void fndNumWthEvnNumOfDgtsLnk() {
		  driver.findElement(fndNumWthEvnNumOfDgtsLnk).click();
	}
	  public void sqrsOfSrtdArrLnk() {
		  driver.findElement(sqrsOfSrtdArrLnk).click();
	}
	  public void clickOnpracQstnsLnk() {
		  driver.findElement(pracQstnsLnk).click();
	} 
	  public String getQueuePageTitle() {
	 		
	    	String title = driver.getTitle();
	 		return title;
    }
	  public void navBck(){
		  driver.navigate().back();
	 }
}



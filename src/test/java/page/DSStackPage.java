package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSStackPage {
	
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
	
	//stack page
	By sGetStart = By.xpath("//a[@href='stack']");
	By operationsInStack=By.xpath("//a[normalize-space()='Operations in Stack']");
	By implementation = By.xpath("//a[normalize-space()='Implementation']");
	By applications = By.xpath("//a[normalize-space()='Applications']");
	
	//practice page
	By pracQstnsLnk = By.linkText("Practice Questions");
	
	public DSStackPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void getstart_stack() {
    	driver.findElement(getstartBtn).click();
		driver.findElement(signinBtn).click();
		driver.findElement(usrName).sendKeys("sangeetha");
		driver.findElement(pwd).sendKeys("S@ibaba@123");
		driver.findElement(login).click();
		driver.findElement(sGetStart).click();
    }
	public void click_operationsInStack() {
		driver.findElement(operationsInStack).click();
	}
	public void clickOntryHere() {
		driver.findElement(tryHere).click();
    }
	 public void click_implementation() {
	  driver.findElement(implementation).click();
    }
	 public void click_applications() {
		  driver.findElement(applications).click();
	}
	public void click_pracQstnsLnk() {
		  driver.findElement(pracQstnsLnk).click();
	}
	public void prcticeCode() {
			Actions action = new Actions(driver);
		    WebElement txt1 = driver.findElement(codeMirr);
		    action.click(txt1).sendKeys("print('Hello')").perform(); 
		    driver.findElement(runBtn).click();
	}
	 public String getStackPageTitle() {
	 		
	    	String title = driver.getTitle();
	 		return title;
   }
	public void navBck(){
		  driver.navigate().back();
	 }

}
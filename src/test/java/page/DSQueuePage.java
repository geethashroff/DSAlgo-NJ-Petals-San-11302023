package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSQueuePage {

	private WebDriver driver;
	
	String URL = "https://dsportalapp.herokuapp.com/";
	
	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
	By signinBtn = By.linkText("Sign in");
	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
	By qGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[5]/div/div/a");
	By ImplofQLnk = By.linkText("Implementation of Queue in Python");
	By tryHere = By.linkText("Try here>>>");
	By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
	By impUsngArr = By.linkText("Implementation using array");
	By impusingCollecs = By.linkText("Implementation using collections.deque");
	By pracQstnsLnk = By.linkText("Practice Questions");
	By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
	By qOpertnsLnk = By.linkText("Queue Operations");
	
	
	public  DSQueuePage(WebDriver driver) {
    	
		this.driver = driver;
     }
	
	public void clickOnGetStart() {
		driver.findElement(getstartBtn).click();
	}
	public void signIn() {
		driver.findElement(signinBtn).click();
	}
	public void logInCred() {
		
		driver.findElement(usrName).sendKeys("suvithra");
		driver.findElement(pwd).sendKeys("rudu1234@");
		driver.findElement(login).click();
		
	}
	public void queueStartBtn() {
		driver.findElement(qGetstrBtn).click();
	}
	public void clickOnImplofQLnk() {
		driver.findElement(ImplofQLnk).click();
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
      public void clickOnimpUsngArr() {
	  driver.findElement(impUsngArr).click();
    }
	  public void clickOnimpusingCollecs() {
		  driver.findElement(impusingCollecs).click();
	}
	  
	  public void clickOnqOpertnsLnk() {
		  driver.findElement(qOpertnsLnk).click();
	}
	  public void clickOnpracQstnsLnk() {
		  driver.findElement(pracQstnsLnk).click();
	}
	 public void navBck(){
		 
		 driver.navigate().back();
	 }
     public void closeBrwser(){
		 
		 driver.close();
	 }
     public String getQueuePageTitle() {
 		
    	 String title = driver.getTitle();
 		return title;
 	}

}


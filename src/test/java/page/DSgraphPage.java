package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class DSgraphPage {

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
		//String URL = "https://dsportalapp.herokuapp.com/";
		By Graph_getstarted = By.xpath("//a[@href='graph']");
		By Graph=By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
		By Graph_rep= By.xpath("//a[normalize-space()='Graph Representations']");
		By codemirror=By.xpath("//pre[@role='presentation']");
		By runbtn= By.xpath("(//button[normalize-space()='Run'])[1]");
		
		
		public DSgraphPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void getStart_graph() {
			//driver.get(URL);
			driver.findElement(getstartBtn).click();
			driver.findElement(signinBtn).click();
			driver.findElement(usrName).sendKeys("sangeetha");
			driver.findElement(pwd).sendKeys("S@ibaba@123");
			driver.findElement(login).click();
			driver.findElement(Graph_getstarted).click();
		}
		 
		
		public void click_Graph() {
			driver.findElement(Graph).click();
		}
		public void click_tryhere() {
			driver.findElement(tryHere).click();
		}
		public void click_Graph_rep() {
			driver.findElement(Graph_rep).click();
		}
		public void prcticeCode() {
			Actions action = new Actions(driver);
		    WebElement txt1 = driver.findElement(codeMirr);
		    action.click(txt1).sendKeys("print('Hello')").perform(); 
		    driver.findElement(runBtn).click();
		}
		 public String getQueuePageTitle() {
		 		
		    	String title = driver.getTitle();
		 		return title;
	    }
		  public void navBck(){
			  driver.navigate().back();
		 }
}

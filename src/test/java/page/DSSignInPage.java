package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.DriverFactory;


public class DSSignInPage {
	
	private WebDriver driver;
	boolean isRequired;
	//public  static WebDriver driver=DriverFactory.getdriver();;
	//Getstart page
		String URL = "https://dsportalapp.herokuapp.com/";
		By getstartBtn = By.xpath("//button[@class=\"btn\"]");
		By signinBtn = By.linkText("Sign in");
		//By user = By.xpath("//*[@id='id_username']");
		By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
		//By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
		By pwd = By.xpath("//*[@id='id_password']");
		//By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
		By login = By.xpath("//*[@value='Login']");
	    By alert = By.xpath("//div[@class='alert alert-primary']");
	    By register = By.xpath("//a[@href='/register']");
	    By signOutBtn = By.xpath("//a[text()=\"Sign out\"]");
	
	  //  @FindBy (xpath="//*[@id='id_username']")static WebElement user;

	  //  @FindBy (xpath="//*[@id='id_password']")static WebElement pwd;
	public  DSSignInPage(WebDriver driver) {
    	
		this.driver = driver;
     }
	public void login_page() {
		driver.findElement(getstartBtn).click();
		driver.findElement(signinBtn).click();
			
	}
	public Boolean doLogin(String username, String password) {
		//Boolean isRequired = false; // Initialize to false
	//public void doLogin(String username, String password) {	
	    driver.findElement(usrName).clear(); //error
		driver.findElement(usrName).sendKeys(username);
		driver.findElement(pwd).clear();
		driver.findElement(pwd).sendKeys(password);
		/*user.clear();
		user.sendKeys(username);
		pwd.clear();
		pwd.sendKeys(password);*/

		// To check empty fields , we need to check "required" field is on an attribute
		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			// below line
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", driver.findElement(usrName));//driver.findElement(usrName)
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", driver.findElement(pwd));//driver.findElement(pwd)
			return isRequired;

		}
		return isRequired;
	}
	

	// input fields empty -click login
	public void login_button() {
		driver.findElement(login).click();
	}
	
	// login for excel sheet data
	public String click_login() {
		driver.findElement(login).click();
		String msg = driver.findElement(alert).getText();
		return msg;
	}

	public void register_link() {
		driver.findElement(register).click();
	}

	public String register_page() {
		String Title = driver.getTitle();
		return Title;
	}

	public void signout() {
		driver.findElement(signOutBtn).click();
	}
	/*public void doLoginp(String username, String password) {
		 driver.findElement(usrName).clear(); //error
			driver.findElement(usrName).sendKeys(username);
			driver.findElement(pwd).clear();
			driver.findElement(pwd).sendKeys(password);
	}*/
	public String get_title() {
		String title = driver.getTitle();
 		return title;
 	
	}

}

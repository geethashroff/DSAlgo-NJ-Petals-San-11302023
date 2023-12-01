<<<<<<< HEAD:src/test/java/stepdefinition/signin.java
package stepDefinition;
=======
package steps;
>>>>>>> origin/master:src/test/java/steps/signin.java

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import factory.DriverFactory;
import utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DSSignInPage;
import utilities.Loggerload;

public class SignIn {
	
<<<<<<< HEAD:src/test/java/stepdefinition/signin.java
	DSSignInPage signinpage = new DSSignInPage(DriverFactory.getDriver());
		
		static String username;
		static String password;
		static String message;
		Boolean isRequired;
		//Boolean isRequired = false;
		//String Excelpath ="C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San-test\\src\\test\\resources\\Exceldata\\Login.xlsx";
=======
	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
	By signinBtn = By.linkText("Sign in");
	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
	By qGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[5]/div/div/a");
	By signOutBtn = By.xpath("//a[text()=\"Sign out\"]");
	By lgdOutMsg = By.xpath("//div[@class=\"alert alert-primary\"]");
	@Given("user navigates to  sign-in page")
	public void user_navigates_to_sign_in_page() {
	    
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San\\src\\test\\resources\\driver\\chromedriver.exe");
	        driver = new ChromeDriver();
	     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(URL);
			driver.findElement(getstartBtn).click();
			driver.findElement(signinBtn).click();
	}
>>>>>>> origin/master:src/test/java/steps/signin.java

		// User is on Sigin page
		@Given("The user is on signin page")
		public void the_user_is_on_signin_page() {
			DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
			Loggerload.info("User is on Sigin Page");
			signinpage.login_page();
		}

		// User clicks on register link
		@When("The user clicks on register link on signin page")
		public void the_user_clicks_on_register_link_on_signin_page() {
			Loggerload.info("User clicks on Register ");
			signinpage.register_link();
		}

		@Then("The user redirected to Registration page from signin page")
		public void the_user_redirected_to_registration_page_from_signin_page() {
			Loggerload.info("User redirected to Registraion page ");
			String Title = signinpage.register_page();
			Loggerload.info("Title of the Page : \" " + Title + "\" ");
			assertEquals(Title, "Registration", "Title do not match");
		}
		
		// invalid data from scenario outline
		@When("The user enter invalid {string} and {string}")
		public void the_user_enter_invalid_and(String username, String password) {
			
			Loggerload.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\" ");
			//--------------------------------below line
		 isRequired = signinpage.doLogin(username, password);//	Boolean isRequired
			assertTrue(isRequired);
			Loggerload.info("Empty field value is validated");
		}

		@Then("click login button to verify")
		public void click_login_button_to_verify() {

			Loggerload.info("User clicks on login button");
			signinpage.login_button();
		}

		// user read both invalid and valid data from excel
		@When("The user enter sheet {string} and {int}")
		public void the_user_enter_sheet_and(String sheetname, Integer rownumber)
				throws InvalidFormatException, IOException {
			ExcelReader reader = new ExcelReader();

			List<Map<String, String>> testdata = reader.getData("C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San-test\\src\\test\\resources\\Exceldata\\Login.xlsx", sheetname); //error
			String username = testdata.get(rownumber).get("username");
			String password = testdata.get(rownumber).get("password");
			message = testdata.get(rownumber).get("expectedmessage");

			Loggerload.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
			if (username != null || password != null)
				signinpage.doLogin(username, password);

		}

		// user get an alert message when login with invalid data and login successfully
		// for valid data
		@Then("click login button")
		public void click_login_button() {

			Loggerload.info("User clicks on login button");
			Loggerload.info("Expected Message - Excel Sheet :  " + message);
			String msg = signinpage.click_login();
			Loggerload.info("Actual Message :  " + msg);
			assertEquals(msg, message);

		}

		// User clicks on signout
		@Given("The user is on signin page with valid username {string} and password {string}")
		public void the_user_is_on_signin_page_with_valid_username_and_password(String username, String password) {
			DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
			Loggerload.info("User is on Sigin Page");
			signinpage.login_page();
			signinpage.doLogin(username, password); //error
			signinpage.click_login();
		}

		@When("The user click signout button")
		public void the_user_click_signout_button() {
			signinpage.signout();
		}
		@Then("The user redirected to homepage")
		public void the_user_redirected_to_homepage() {
			signinpage.get_title();
		}
	}

<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
package stepDefinition;
=======
package steps;
>>>>>>> origin/master:src/test/java/steps/queue.java

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DSQueuePage;

public class Queue {
	
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
	DSQueuePage dsqpage= new DSQueuePage(DriverFactory.getDriver());
	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		dsqpage.clickOnGetStart();
		dsqpage.signIn();
		dsqpage.logInCred();
		dsqpage.queueStartBtn();
=======
	By getstartBtn = By.xpath("//button[@class=\"btn\"]");
	By signinBtn = By.linkText("Sign in");
	By usrName = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[2]");
	By pwd = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[3]");
	By login = By.xpath("//div[@class=\"container\"]/div/div[2]/form/input[4]");
	By qGetstrBtn = By.xpath("//div[@class=\"row row-cols-1 row-cols-md-3 g-4\"]/div[5]/div/div/a");
	By ImplofQLnk = By.linkText("Implementation of Queue in Python");
	By tryHere1 = By.linkText("Try here>>>");
	By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
	By impUsngArr = By.linkText("Implementation using array");
	By impusingCollecs = By.linkText("Implementation using collections.deque");
	By pracQstnsLnk = By.linkText("Practice Questions");
	By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
	
	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		    driver = new ChromeDriver();
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San\\src\\test\\resources\\driver\\chromedriver.exe");
	       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(URL);
			driver.findElement(getstartBtn).click();
			driver.findElement(signinBtn).click();
			driver.findElement(usrName).sendKeys("elahi");
			driver.findElement(pwd).sendKeys("sarvgun123");
		    driver.findElement(login).click();
		    driver.findElement(qGetstrBtn).click();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}

	@When("clicks on Implementation of Queue in Python user should be redirected to Implementation of Queue in Python page")
	public void clicks_on_implementation_of_queue_in_python_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		dsqpage.clickOnImplofQLnk();
	}

	@When("The user clicks Try Here button on Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_on_implementation_of_queue_in_python_page() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		dsqpage.clickOntryHere();
=======
		driver.findElement(tryHere1).click();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}

	@When("clicks on Implementation using collections user should be redirected to Implementation using collections page")
	public void clicks_on_implementation_using_collections_user_should_be_redirected_to_implementation_using_collections_page() {
		dsqpage.clickOnimpusingCollecs();
	}

	@When("The user clicks Try Here button on Implementation using collections page")
	public void the_user_clicks_try_here_button_on_implementation_using_collections_page() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		dsqpage.clickOntryHere();
=======
		driver.findElement(tryHere1).click();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}

	@When("clicks on Implementation using array user should be redirected to Implementation using array page")
	public void clicks_on_implementation_using_array_user_should_be_redirected_to_implementation_using_array_page() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		 dsqpage.clickOnimpUsngArr();
=======
		 driver.findElement(impUsngArr).click();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}

	@When("The user clicks Try Here button on Implementation using array page")
	public void the_user_clicks_try_here_button_on_implementation_using_array_page() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		dsqpage.clickOntryHere();
=======
		driver.findElement(tryHere1).click();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}

	@Then("The user should be redirected to a page having a tryEditor with a Run button to test1")
	public void the_user_should_be_redirected_to_a_page_having_a_tryeditor_with_a_run_button_to_test1() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		dsqpage.prcticeCode();
		dsqpage.closeBrwser();
	    
=======
		Actions action = new Actions(driver);
	    WebElement txt1 = driver.findElement(codeMirr);
	    action.click(txt1).sendKeys("print('Hello')").perform(); 
	    driver.findElement(runBtn).click();
	    driver.close();
>>>>>>> origin/master:src/test/java/steps/queue.java
	}
	    @When("clicks on Queue Operations user should be redirected to Queue Operations page")
	public void clicks_on_queue_operations_user_should_be_redirected_to_queue_operations_page() {
		dsqpage.clickOnqOpertnsLnk();
	}

	@When("The user clicks Try Here button on Queue Operations page")
	public void the_user_clicks_try_here_button_on_queue_operations_page() {
<<<<<<< HEAD:src/test/java/stepdefinition/queue.java
		dsqpage.clickOntryHere();
	}
	@Then("The user should be redirected to a page having a tryEditor with a Run button to test2")
	public void the_user_should_be_redirected_to_a_page_having_a_tryeditor_with_a_run_button_to_test2() {
		dsqpage.prcticeCode();
	}
=======
		driver.findElement(tryHere1).click();
	}
	@Then("The user should be redirected to a page having a tryEditor with a Run button to test2")
	public void the_user_should_be_redirected_to_a_page_having_a_tryeditor_with_a_run_button_to_test2() {
		Actions action = new Actions(driver);
	    WebElement txt1 = driver.findElement(codeMirr);
	    action.click(txt1).sendKeys("print('Hello')").perform(); 
	    driver.findElement(runBtn).click();
	    
>>>>>>> origin/master:src/test/java/steps/queue.java
	    
	@Given("The user navigates back to Queue Operations page and clicks on Practice Questions")
	public void the_user_navigates_back_to_queue_operations_page_and_clicks_on_practice_questions() {
	    dsqpage.navBck();
	    dsqpage.clickOnpracQstnsLnk();
	}

	@Then("The user is redirected to practice page")
	public void the_user_is_redirected_to_practice_page() {
	    String Title = dsqpage.getQueuePageTitle();
	    System.out.println("title of current page : " + Title);
	    
	}
}

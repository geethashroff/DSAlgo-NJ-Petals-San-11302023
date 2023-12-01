<<<<<<< HEAD:src/test/java/stepdefinition/Graph.java
package stepDefinition;
=======
package steps;
>>>>>>> origin/master:src/test/java/steps/Graph.java

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

<<<<<<< HEAD:src/test/java/stepdefinition/Graph.java
import factory.DriverFactory;
=======
>>>>>>> origin/master:src/test/java/steps/Graph.java
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD:src/test/java/stepdefinition/Graph.java
import page.DSgraphPage;

public class Graph{
		
	DSgraphPage dsgpage = new DSgraphPage(DriverFactory.getDriver());
	
	@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");	
	
		dsgpage.getStart_graph();

	}
	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
		dsgpage.click_Graph();
	 }

	@And("The user clicks try here button for Graph")
	public void the_user_clicks_try_here_button_for_graph() {
		dsgpage.click_tryhere();
	}

	@Then("The user should be redirected to a page having a tryEditor with a Run button to graph")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_graph() {
		dsgpage.prcticeCode();
	}
	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
		dsgpage.click_Graph_rep();
	}

	@And("The user clicks try here button for graph representations")
	public void the_user_clicks_try_here_button_for_graph_representations() {
		dsgpage.click_tryhere();
	}

	
=======

public class Graph{
	String URL = "https://dsportalapp.herokuapp.com/";
	By Graph_getstarted = By.xpath("//a[@href='graph']");
	By Graph=By.xpath("//a[@class='list-group-item'][normalize-space()='Graph']");
	By Graph_rep= By.xpath("//a[normalize-space()='Graph Representations']");
	By codemirror=By.xpath("//pre[@role='presentation']");
	By runbtn= By.xpath("(//button[normalize-space()='Run'])[1]");
	
	By tryhere_Graph= By.linkText("Try here>>>");
	By Practise_Questions=By.xpath("//a[normalize-space()='Practice Questions']");
	By getstarted = By.xpath("//button[@class=\"btn\"]");
	
	By signin= By.xpath("//a[normalize-space()='Sign in']");
	By username=By.id("id_username");
	By password=By.id("id_password");
	By login=By.xpath("//input[@value='Login']");
	

	

	
	private WebDriver driver;
	
	@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() {
	
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace_san\\DSAlgo-NJ-Petals-San\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(getstarted).click();
		driver.findElement(signin).click();
		driver.findElement(username).sendKeys("elahi");
		driver.findElement(password).sendKeys("sarvgun123");
		driver.findElement(login).click();
		driver.findElement(Graph_getstarted).click();
		
	}
	@When("The user clicks Graph button")
	public void the_user_clicks_graph_button() {
	    driver.findElement(Graph).click();
	   
	}

	@And("The user clicks try here button for Graph")
	public void the_user_clicks_try_here_button_for_graph() {
		driver.findElement(tryhere_Graph).click();
	}


	@Then("The user should be redirected to a page having a tryEditor with a Run button to graph")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_graph() {
		driver.close();
	}
	@When("The user clicks Graph Representations button")
	public void the_user_clicks_graph_representations_button() {
		driver.findElement(Graph_rep).click();
		
	}

	

	@And("The user clicks try here button for graph representations")
	public void the_user_clicks_try_here_button_for_graph_representations() {
		driver.findElement(tryhere_Graph).click();
	}



	@Then("The user should be redirected to a page having a tryEditor with a Run button to graph rep")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_graph_rep() {
	   driver.close();
	}



>>>>>>> origin/master:src/test/java/steps/Graph.java
	    
	}
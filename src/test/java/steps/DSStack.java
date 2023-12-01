package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DSArraysPage;
import page.DSStackPage;

public class DSStack {
	   DSStackPage dsspage = new DSStackPage(DriverFactory.getDriver());
	   
	    @Given("The user is in the Stack page after logged in")
		public void the_user_is_in_the_stack_page_after_logged_in() {
	    	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
	    	dsspage.getstart_stack();
	    	
		}
		@When("The user clicks Operations in Stack button")
		public void the_user_clicks_operations_in_stack_button() {
			dsspage.click_operationsInStack();
		}
		
		@When("The user clicks Try Here9 button on Operations in Stack page")
		public void the_user_clicks_try_here9_button_on_operations_in_stack_page() {
			dsspage.clickOntryHere();
		    
		}
		@When("The user clicks Implementation button")
		public void the_user_clicks_implementation_button() {
			dsspage.click_implementation();
		}
		@When("The user clicks Try Here9 button on Implementation in Stack page")
		public void the_user_clicks_try_here9_button_on_implementation_in_stack_page() {
			dsspage.clickOntryHere();
		    
		}
		@When("The user clicks Applications button")
		public void the_user_clicks_applications_button() {
			dsspage.click_applications();
		}
		@When("The user clicks Try Here9 button on Applications in Stack page")
		public void the_user_clicks_try_here9_button_on_applications_in_stack_page() {
			dsspage.clickOntryHere();
		    
		}
		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			dsspage.prcticeCode();
		}
			
		@When("The user clicks Practice Questions button")
		public void the_user_clicks_practice_questions_button() {
			dsspage.click_pracQstnsLnk();
		}

		@Then("The user is redirected to stack practice page")
		public void the_user_is_redirected_to_practice_page() {
			String Title = dsspage.getStackPageTitle();
		    System.out.println("User is in practice page and the title is : " + Title); 
		}
		  
		@When("The user navigates back and click on Implementation")
		public void the_user_navigates_back_and_click_on_implementation() {
			dsspage.navBck();
		}
		@When("The user navigates back and click on Applications")
		public void the_user_navigates_back_and_click_on_applications() {
			dsspage.navBck();
		}




}

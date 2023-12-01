package stepDefinition;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

import factory.DriverFactory;
import io.cucumber.java.After;
	import io.cucumber.java.Before;
	import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import page.DSDatastructurePage;

	public class DSDatastructure{
			
		DSDatastructurePage dsdatapage= new DSDatastructurePage(DriverFactory.getDriver());
			
			@Given("user already sigin")
			public void user_already_sigin() {
				DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
				dsdatapage.ds_button();    
				dsdatapage.ds_signinpag();
				dsdatapage.ds_username();
				dsdatapage.ds_password();	 
				dsdatapage.ds_signinpage();	 
					
			}

		@And("The user click Get Started button")
		public void the_user_click_get_started_button() {
			dsdatapage.ds_get();
				
		}

		@When("The user clicks Time complexity button")
		public void the_user_clicks_time_complexity_button() {
			dsdatapage.ds_time();
			//System.out.println("print('Hello, world!')");
			
		}
		@And("The user  clicks Try here button")
		public void the_user_clicks_try_here_button() {
			dsdatapage.ds_tryhere();
			//dsdatapage.ds_presentation();
			//dsdatapage.ds_run();
			
			
		}

		@Then("The user clicks the practice button")
		public void the_user_clicks_the_practice_button() {
			dsdatapage.ds_practice();
			
			
			
		}
	   
	
			   


	}


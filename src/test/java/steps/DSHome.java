package stepDefinition;

import factory.DriverFactory;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import page.DSHomePage;

	public class DSHome {
		
		DSHomePage dshomepage= new DSHomePage(DriverFactory.getDriver());
		
		@Given("The user opens DS-Algo portal link")
		public void the_user_opens_ds_algo_portal_link() {
			DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
			}

		@Given("The user clicks the Get Started button")
		public void the_user_clicks_the_get_started_button() {
			dshomepage.click_getstart();
			}

		@Then("The user should be redirected to homepage")
		public void the_user_should_be_redirected_to_homepage() {
			System.out.println("The user should be redirected to homepage");
		    
		    
		}
		@When("The user clicks get started button")
		public void the_user_clicks_get_started_button() {
			dshomepage.data_getstart();
		   
       }
		@Then("the user get alert message")
		public void the_user_get_alert_message() {
		    dshomepage.dataalert();
		}


		@When("The user clicks Data structure drop down")
		public void the_user_clicks_data_structure_drop_down() {
		  dshomepage.datastru_dropdown();
		   
		}

		//@Then("It should see six different data structure entries in that dropdown")
		public void it_should_see_different_data_structure_entries_in_that_dropdown(Integer int1) {
		    System.out.println("We can see six datastructure dropdown");
		}
		@When("The user selects any data structures item from dropdown without sign in")
		public void the_user_selects_any_data_structures_item_from_dropdown_without_sign_in() {
		    dshomepage.array();
		   
		}

		@Then("It should alert the user with a message You are not Logged in.")
		public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() {
		    dshomepage.alert();
		    
		   
		}
		
		
		@When("The user clicks Sign in")
		public void the_user_clicks_sign_in() {
	    	dshomepage.click_signin();
			}

		@Then("The user should be redirected to Sign in page")
		public void the_user_should_be_redirected_to_sign_in_page() {
			System.out.println("The user is redirected to sign in page");
			}
		
		@Given("The user navigates to Homepage")
		public void the_user_navigates_to_homepage() {
			System.out.println("User navigates to signin");
			DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
			}

		@When("The user clicks Register")
		public void the_user_clicks_register() {
             dshomepage.register();
			}

		@Then("The user should be redirected to Register form")
		public void the_user_should_be_redirected_to_register_form() {
			System.out.println("The user is redirected to sign in page");
			}













}

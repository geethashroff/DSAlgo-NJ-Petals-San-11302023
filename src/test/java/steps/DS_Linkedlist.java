package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import page.DSLinkedListPage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DS_Linkedlist {
	
	DSLinkedListPage dsllpage=new DSLinkedListPage(DriverFactory.getDriver());
	
	 
	@Given("The user is in the Linkedlist page after loggedin")
	public void the_user_is_in_the_linkedlist_page_after_loggedin() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
		dsllpage.click_getstart();    
		dsllpage.ds_signinpag();
		dsllpage.ds_username();
		dsllpage.ds_password();	 
		dsllpage.ds_signinpage();	 
		dsllpage.ll_getstarted();
	}

	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {
		dsllpage.ll_introduction();
	    
	}

	
	@Then("The user clicks Try Here button in Introduction Page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		dsllpage.ll_tryhere();
	    
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test() {
		 
		 dsllpage.prcticeCode();  
			
	}

	@When("The user clicks Creating a Linked List button")
	public void the_user_clicks_creating_a_linked_list_button() {
         dsllpage.ll_creatingll();
	}

	

	@Then("The user clicks Try Here button in Creating Linked list Page")
	public void the_user_clicks_try_here_button_in_creating_linked_list_page() {
		dsllpage.ll_tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test1")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test1() {
		dsllpage.prcticeCode(); 	  
	    
	}

	@When("The user clicks Types of Linked List button")
	public void the_user_clicks_types_of_linked_list_button() {
		dsllpage.ll_typesofll();
	}

	
	@Then("The user clicks Try Here button in Types of Linked list Page")
	public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
		dsllpage.ll_tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test2")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test2() {
		dsllpage.prcticeCode(); 	
	    
	}

	@When("The user clicks Implement Linked List in Python button")
	public void the_user_clicks_implement_linked_list_in_python_button() {
		dsllpage.ll_implementpython();
	}

	@Then("The user clicks Try Here button in Implement Linked list in Python")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
		dsllpage.ll_tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test3")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test3() {
		dsllpage.prcticeCode(); 	
	   
	}

	@When("The user clicks Traversal button")
	public void the_user_clicks_traversal_button() {
	    dsllpage.ll_traversal();
	}

	@Then("The user clicks Try Here button in Traversal Page")
	public void the_user_clicks_try_here_button_in_traversal_page() {
		dsllpage.ll_tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test4")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test4() {
		dsllpage.prcticeCode(); 	
		
	}

	@When("The user clicks Insertion button")
	public void the_user_clicks_insertion_button() {
		dsllpage.ll_insertion();
	}

	@Then("The user clicks Try Here button in Insertion Page")
	public void the_user_clicks_try_here_button_in_insertion_page() {
		dsllpage.ll_tryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button test5")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_test5() {
		dsllpage.prcticeCode(); 	
		
	}

	@When("The user clicks Deletion button")
	public void the_user_clicks_deletion_button() {
		dsllpage.ll_deletion();
	}

	
	@Then("The user clicks Try Here button in Deletion Page")
	public void the_user_clicks_try_here_button_in_deletion_page() {
		dsllpage.ll_tryhere();
	}
	    

	@When("The user navigates back and clicks Practise Questions button")
	public void the_user_navigates_back_and_clicks_practise_questions_button() {
		dsllpage.navBck();
		dsllpage.ll_practiseqa();
		
		
	}




}
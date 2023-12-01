package page;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	public class DSLinkedListPage {
		public WebDriver driver;
		String URL = "https://dsportalapp.herokuapp.com/";
		 By getstarted = By.xpath("//button[@class='btn']");
		 By signin= By.xpath("//a[normalize-space()='Sign in']");
		 By username=By.id("id_username");
		 By password=By.id("id_password");
		 By login=By.xpath("//input[@value='Login']");
		 By llgetstarted= By.xpath("//a[@href='linked-list']");
		 By introduction = By.linkText("Introduction");
		 By tryhere = By.linkText("Try here>>>");  //"//a[normalize-space()='Try here>>>']"
		 //By codemirror=By.xpath("//div[@class='CodeMirror-scroll']");
		 //By codemirror=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		 By codeMirr = By.xpath("//div[@class=\"CodeMirror-scroll\"]/div[1]/div/div/div/div[4]");
		 //By runbtn= By .xpath("//button[normalize-space()='Run']");
		 By runBtn = By.xpath("//div[@class=\"container\"]/div/form/button");
		 By creatinglinkedlist=By.xpath("//a[normalize-space()='Creating Linked LIst']");
		 
		 By typesoflinkedlist=By.linkText("Types of Linked List");
		 By implementllinpython=By.xpath("//a[normalize-space()='Implement Linked List in Python']");
	     By traversal=By.xpath("//a[normalize-space()='Traversal']");
		 By insertion=By.linkText("Insertion");
		 By deletion = By.linkText("Deletion");
		 //By practiseqa=By.xpath("//a[@href='/linked-list/practice']");
		 By datastructures=By.xpath("//a[@class='nav-link dropdown-toggle']");
		 By Stack=By.xpath("//a[normalize-space()='Stack']");
		 By pracQstnsLnk = By.linkText("Practice Questions");
		 
		 
		 public  DSLinkedListPage(WebDriver driver) {
		    	
				this.driver = driver;
	     }
		 public void click_getstart() {
			 driver.findElement(getstarted).click();
		 }
		 public void ds_signinpag() {
				driver.findElement(signin).click();
			}
			public void ds_username() {
				driver.findElement(username).sendKeys("suvithra");
			}
			public void ds_password() {
				driver.findElement(password).sendKeys("rudu1234@");
			}
			public void ds_signinpage() {
				driver.findElement(login).click();
			}
			public void ll_getstarted() {
				driver.findElement(llgetstarted).click();
				
			}
			public void ll_introduction() {
				driver.findElement(introduction).click();
			}
			public void ll_tryhere() {
				driver.findElement(tryhere).click();
			}
			
			public void prcticeCode() {
				Actions action = new Actions(driver);
			    WebElement txt1 = driver.findElement(codeMirr);
			    action.click(txt1).sendKeys("print('Hello')").perform(); 
			    driver.findElement(runBtn).click();
			  
			}
			public void ll_runbtn() {
				driver.findElement(runBtn).click();
			}
			public void ll_creatingll() {
				driver.findElement(creatinglinkedlist).click();
			}
			public void ll_typesofll() {
				driver.findElement(typesoflinkedlist).click();
			}
			public void ll_implementpython() {
				driver.findElement(implementllinpython).click();
			}
			public void ll_traversal() {
				driver.findElement(traversal).click();
			}
			public void ll_insertion() {
				driver.findElement(insertion).click();
			}
			public void ll_deletion() {
				driver.findElement(deletion).click();
			}
			public void ll_practiseqa() {
				driver.findElement(pracQstnsLnk).click();
			}
			public void ll_datastructure(){
				driver.findElement(datastructures).click();
			}
			public void ll_stack() {
				driver.findElement(Stack).click();
			}
			 public void navBck(){
				 
				 driver.navigate().back();
			 }
	}


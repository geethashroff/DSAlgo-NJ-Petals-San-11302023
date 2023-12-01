package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DSDatastructurePage {
		 private WebDriver driver;
		
			By button=By.xpath("//button[@class=\"btn\"]");
			By get=By.linkText("Get Started");
			By signinpag=By.linkText("Sign in");
			By username=By.xpath("//input[@name=\"username\"]");
			By password=By.xpath("//input[@name=\"password\"]");
			By signinpage=By.xpath("//input[@type=\"submit\"]");
			By practice=By.linkText("Practice Questions");
			By tryhere=By.xpath("//a[normalize-space()='Time Complexity']");
			By time=By.linkText("Time Complexity");
			//By presentation=By.xpath("//div[@class='CodeMirror-scroll']");
			By run=By.xpath("//button[@type=\"button\"]");

			public DSDatastructurePage(WebDriver driver) {
				this.driver=driver;
			}
			
			public void ds_button() {
				driver.findElement(button).click();
			}
			public void ds_get() {
				driver.findElement(get).click();
			}
			public void ds_signinpag() {
				driver.findElement(signinpag).click();
			}
			public void ds_username() {
				driver.findElement(username).sendKeys("suvithra");
			}
			public void ds_password() {
				driver.findElement(password).sendKeys("rudu1234@");
			}
			public void ds_signinpage() {
				driver.findElement(signinpage).click();
			}
			public void ds_practice() {
				driver.findElement(practice).click();
				driver.navigate().back();
			}
			public void ds_tryhere() {
				driver.findElement(tryhere).click();
				
			}
			public void ds_time() {
				driver.findElement(tryhere).click();
			}
			public void ds_presentation() {
				//driver.findElement(presentation).click();
				//Actions action = new Actions(driver);

				 //WebElement ght= driver.findElement(presentation);
				  //action.click(ght).sendKeys("print('Hello')").perform();  

				   
				
			}
			//public void ds_run() {
				//driver.findElement(run).click();
				
			//}
			

}

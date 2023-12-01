package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;


public class DSTreePage {

	private WebDriver driver;

//String url = "https://dsportalapp.herokuapp.com/";
	By button = By.xpath("//button[@class=\"btn\"]");
	By signinpag = By.linkText("Sign in");
	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By signinpage = By.xpath("//input[@type=\"submit\"]");
	By getbutton = By.xpath("//a[@href='tree']");
	By overview = By.xpath("//a[@href='overview-of-trees']");
	By trybutton = By.linkText("Try here>>>");
	By text = By.xpath("//div[@class='CodeMirror-lines']");
//By but = By.xpath("//button[normalize-space()='Run']");  
	By but = By.xpath("//button[@type='button']");
	By termi = By.xpath("//a[@href=\"/tree/terminologies/\"]");
	By but0 = By.xpath("//a[normalize-space()='Try here>>>']");
	By types = By.xpath("//a[@href=\"/tree/types-of-trees/\"]");
	By but1 = By.linkText("Try here>>>");
	By tree = By.xpath("//a[@href=\"/tree/tree-traversals/\"]");
	By but2 = By.xpath("//a[@href=\"/tryEditor\"]");
	By traversal = By.xpath("//a[@href=\"/tree/traversals-illustration/\"]");
	By but3 = By.xpath("//a[normalize-space()='Try here>>>']");
	By binary = By.xpath("//a[normalize-space()='Binary Trees']");
	By but4 = By.linkText("Try here>>>");
	By typesof = By.xpath("//a[normalize-space()='Types of Binary Trees']");
	By but5 = By.xpath("//a[normalize-space()='Try here>>>']");
	By imple = By.xpath("//a[@href=\"/tree/implementation-in-python/\"]");
	By but6 = By.xpath("//a[normalize-space()='Try here>>>']");

	By treetra = By.xpath("//a[@href=\"/tree/tree-traversals/\"]");
	By but7 = By.xpath("//a[normalize-space()='Try here>>>']");

	By impleofbinary = By.xpath("//a[normalize-space()='Implementation of Binary Trees']");
	By but8 = By.xpath("//a[normalize-space()='Try here>>>']");

	By appli = By.xpath("//a[@href=\"/tree/applications-of-binary-trees/\"]");
	By but9 = By.xpath("//a[normalize-space()='Try here>>>']");
	By search = By.xpath("//a[@href=\"/tree/binary-search-trees/\"]");
	By but10 = By.xpath("//a[normalize-space()='Try here>>>']");

	By bst = By.xpath("//a[@href=\"/tree/implementation-of-bst/\"]");
	By but11 = By.xpath("//a[normalize-space()='Try here>>>']");
	By pq = By.xpath("//a[normalize-space()='Practice Questions']");

	public DSTreePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ds_button() {
		driver.findElement(button).click();
	}

	public void ds_signin() {
		driver.findElement(signinpag).click();
	}

	public void ds_usename() {

		driver.findElement(username).sendKeys("suvithra");
	}

	public void ds_pasword() {
		driver.findElement(password).sendKeys("rudu1234@");
	}

	public void ds_submit() {
		driver.findElement(signinpage).click();
	}

	public void ds_getbutton() {
		driver.findElement(getbutton).click();
	}

	public void ds_overview() {
		driver.findElement(overview).click();
	}

	public void ds_trybutton() {
		driver.findElement(trybutton).click();

	}

	public void ds_text() {
		driver.findElement(text).click();
		Actions action = new Actions(driver);

		WebElement ght = driver.findElement(text);
		action.click(ght).sendKeys("print('Hello')").perform();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(but).click();

	}

	public void ds_but() {
		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_termi() {
		driver.findElement(termi).click();

	}

	public void ds_but0() {
		driver.findElement(but0).click();

	}

	public void ds_text1() {
		driver.findElement(text).click();
		Actions action = new Actions(driver);

		WebElement ght = driver.findElement(text);
		action.click(ght).sendKeys("print('Hello')").perform();
		driver.findElement(but1).click();
		driver.navigate().back();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement(but).click();

	}
//public void ds_but() {
	// driver.findElement(but1).click();
	// driver.navigate().back();

//public void ds_but0() {
	// driver.findElement(but0).click();

	// Actions action = new Actions(driver);

	// WebElement ght2 = driver.findElement(text);
	// action.click(ght2).sendKeys("print('Hello')").perform();

	// driver.findElement(but).click();
	// driver.navigate().back();
//}
	public void ds_types() {
		driver.findElement(types).click();
	}

	public void ds_but1() {
		driver.findElement(but1).click();
		Actions action = new Actions(driver);

		WebElement ght2 = driver.findElement(text);
		action.click(ght2).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_tree() {
		driver.findElement(tree).click();
	}

	public void ds_but2() {
		driver.findElement(but2).click();
		Actions action = new Actions(driver);

		WebElement ght3 = driver.findElement(text);
		action.click(ght3).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();

	}

	public void ds_travesal() {
		driver.findElement(traversal).click();
	}

	public void ds_but3() {
		driver.findElement(but3).click();
		Actions action = new Actions(driver);

		WebElement ght4 = driver.findElement(text);
		action.click(ght4).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_binary() {
		driver.findElement(binary).click();
	}

	public void ds_but4() {
		driver.findElement(but4).click();
		Actions action = new Actions(driver);

		WebElement obj = driver.findElement(text);
		action.click(obj).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_typesof() {
		driver.findElement(typesof).click();
	}

	public void ds_but5() {
		driver.findElement(but5).click();
		Actions action = new Actions(driver);

		WebElement ght5 = driver.findElement(text);
		action.click(ght5).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_imple() {
		driver.findElement(imple).click();
	}

	public void ds_but6() {
		driver.findElement(but6).click();
		Actions action = new Actions(driver);

		WebElement ght6 = driver.findElement(text);
		action.click(ght6).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();

	}

	public void ds_treetra() {
		driver.findElement(treetra).click();
	}

	public void ds_but7() {
		driver.findElement(but7).click();
		Actions action = new Actions(driver);

		WebElement ght7 = driver.findElement(text);
		action.click(ght7).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_impleofbinary() {
		driver.findElement(impleofbinary).click();
	}

	public void ds_but8() {
		driver.findElement(but8).click();
		Actions action = new Actions(driver);

		WebElement ght8 = driver.findElement(text);
		action.click(ght8).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_appli() {
		driver.findElement(appli).click();
	}

	public void ds_but9() {
		driver.findElement(but9).click();
		Actions action = new Actions(driver);

		WebElement ght9 = driver.findElement(text);
		action.click(ght9).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_search() {
		driver.findElement(search).click();
	}

	public void ds_but10() {
		driver.findElement(but10).click();
		Actions action = new Actions(driver);

		WebElement ght10 = driver.findElement(text);
		action.click(ght10).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_bst() {
		driver.findElement(bst).click();
	}

	public void ds_but11() {
		driver.findElement(but11).click();
		Actions action = new Actions(driver);

		WebElement ght11 = driver.findElement(text);
		action.click(ght11).sendKeys("print('Hello')").perform();

		driver.findElement(but).click();
		driver.navigate().back();
	}

	public void ds_pq() {
		driver.findElement(pq).click();

	}
}
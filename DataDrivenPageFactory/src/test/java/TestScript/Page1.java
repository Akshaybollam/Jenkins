package TestScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 {

//	By username=By.id("email");
//	By password=By.id("pass");
//	By log = By.xpath("//button[@name='login']");
//	By forget=By.xpath("//a[normalize-space()='Forgotten password?'][1]");

//	@FindBy(id = "email")
//	WebElement username;
//	@FindBy(id = "pass")
//	WebElement password;
//	@FindBy(xpath = "//button[@name='login']")
//	WebElement log;
//	@FindBy(xpath = "//a[normalize-space()='Forgotten password?'][1]")
//	WebElement forget;

	@FindBy(how = How.ID, using = "email")
	WebElement username;
	@FindBy(how = How.NAME, using = "pass")
	WebElement password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement log;
	@FindBy(how = How.LINK_TEXT, using = "Forgotten password?")
	WebElement forget;

	public void getLogin(String user, String pass) {
//		WebElement email = driver.findElement(username);
//		email.sendKeys(user);
		username.sendKeys(user);
		password.sendKeys(pass);
		log.click();
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(log).click();
	}

	public void getRecovered() {
		forget.click();

	}
}

//package TestScript;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//public class Page2 {
//	WebDriver driver;
//	public Page2(WebDriver driver) {
//		this.driver=driver;
//	}
//	By username=By.id("email");
//	By password=By.id("pass");
//	By log = By.xpath("//button[@name='login']");
//	By forget=By.xpath("//a[normalize-space()='Forgotten password?'][1]");
//	public void getLogin(String user,String pass) {
//		WebElement email = driver.findElement(username);
//		email.sendKeys(user);
//		driver.findElement(password).sendKeys(pass);
//		driver.findElement(log).click();
//	}
//	public void getRecoveredpwd() {
//		driver.findElement(forget).click();
//	}
//}

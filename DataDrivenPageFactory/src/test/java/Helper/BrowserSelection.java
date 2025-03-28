package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserSelection {
	WebDriver driver = null;

	public WebDriver getBrowser(String browser, String appUrl) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":

			driver = new FirefoxDriver();
			break;
		case "safari":

			driver = new SafariDriver();
			break;

		default:
			System.out.println("Unknown browser found");
		}
		driver.get(appUrl);
		return driver;

	}
}

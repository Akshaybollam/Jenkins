package Hooks;

import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Base;
import Utility.CaptureScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Base {

	@Before
	public void initBrowser() {
		System.out.println("Opening the browser");
		Base.driver = new ChromeDriver();
	}

	@After
	public void tearBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			CaptureScreenShot screenshot = new CaptureScreenShot();
			screenshot.getErrorScreenShot(Base.driver);
		}
		System.out.println("Closing the browser");
		Base.driver.quit();
	}
}

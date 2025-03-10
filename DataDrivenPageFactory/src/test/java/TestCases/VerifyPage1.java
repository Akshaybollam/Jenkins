package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Helper.BrowserSelection;
import Helper.CaptureScreenShot;
import Helper.ReadExcel;
import TestScript.Page1;

public class VerifyPage1 {
	WebDriver driver = null;
	Page1 page1;

	@BeforeMethod
	public void setup() {
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");

		BrowserSelection browser = new BrowserSelection();
		driver = browser.getBrowser("chrome", "https://www.facebook.com/");

		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		page1 = PageFactory.initElements(driver, Page1.class); // object
	}

	// Data Driven Testing
	@Test(dataProvider = "info", priority = 1)
	public void verifylogin(String u1, String p1) {
		page1.getLogin(u1, p1);
		Assert.assertEquals(0, 0);
	}

	@DataProvider
	public Object[][] info() {
		ReadExcel ex = new ReadExcel();
		int rowcnt = ex.getRowCount(0);
		short colcnt = ex.getColumnCount(0);
		System.out.println(rowcnt + "  " + colcnt);

		Object[][] dataobj = new Object[rowcnt + 1][colcnt];

		for (int r = 0; r <= rowcnt; r++) {
			for (int c = 0; c < colcnt; c++) {
				dataobj[r][c] = ex.getdata(0, r, c);
			}
		}
		return dataobj;

	}

	@Test(priority = 2)
	public void verifyForgetPwd() {
		page1.getRecovered();
		Assert.assertEquals(10, 10);
	}

	@AfterMethod
	public void tearDown(ITestResult r) {
		int actualStatus = r.getStatus();
		int expectStatus = ITestResult.FAILURE;
		if (actualStatus == expectStatus) {
			CaptureScreenShot screenshot = new CaptureScreenShot();
			screenshot.getErrorScreenShot(driver);
		} else {
			driver.quit();
		}

	}

}

package Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	WebDriver driver;

	public void getErrorScreenShot(WebDriver driver) {
		this.driver = driver; //Initialising the browser
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String time = df.format(d);
		System.out.println(time);
		File x = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File y = new File("src\\main\\java\\ScreenShots\\screen" + time + ".png");
		try {
			FileUtils.copyFile(x, y);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

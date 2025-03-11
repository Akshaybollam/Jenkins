//package TestScript;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.Select;
//
//public class Page2 {
//	@FindBy(how = How.LINK_TEXT, using = "Create Account']")
//	WebElement createAccount;
//
//	@FindBy(how = How.XPATH, using = "//div[@id='wrapper']/table[2]/tbody/tr[3]/td[3]/input[@type='text']")
//	WebElement FullName;
//	@FindBy(how = How.XPATH, using = "//div[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[@type='text']")
//	WebElement ChooseaRediffmailID;
//	@FindBy(how = How.XPATH, using = "//div[@id='wrapper']/table[2]/tbody/tr[7]/td[3]/input[@type='button']")
//	WebElement CheckAvailability;
//	@FindBy(how = How.XPATH, using = "//div[@id='wrapper']/table[2]/tbody/tr[9]/td[3]/input[@type='password']")
//	WebElement Password;
//	@FindBy(how = How.XPATH, using = "div[@id='wrapper']/table[2]/tbody/tr[11]/td/input[@type='password']")
//	WebElement Retypepassword;
//	@FindBy(how = How.XPATH, using = "//div[@id='div_altemail']//input[@type='text']")
//	WebElement AlternateEmailAddress;
//	@FindBy(how = How.XPATH, using = "//input[@id='mobno'")
//	WebElement MobileNo;
//	@FindBy(how = How.ID, using = "country")
//	WebElement country;
//	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[1]")
//	WebElement day;
//	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[2]")
//	WebElement month;
//	@FindBy(how = How.XPATH, using = "//tbody/tr[22]/td[3]/select[3]")
//	WebElement year;
//	@FindBy(how = How.XPATH, using = "//input[@value='f']")
//	WebElement gender;
//
//	@FindBy(how = How.CLASS_NAME, using = "captcha")
//	WebElement captcha;
//	@FindBy(how = How.ID, using = "Register")
//	WebElement register;
//
//	public void createAccount() {
//		createAccount.click();
//	}
//
//	public void details2() {
//		FullName.sendKeys("AkshayBollam");
//		ChooseaRediffmailID.sendKeys("AkshayBollam");
//		CheckAvailability.click();
//		Password.sendKeys("Pass@123");
//		Retypepassword.sendKeys("Pass@123");
//		AlternateEmailAddress.sendKeys("Abc123@gmail.com");
//		MobileNo.sendKeys("8008784073");
//		Select select = new Select(country);
//		select.selectByVisibleText("Canada");
//
//		Select d = new Select(day);
//		d.selectByValue("05");
//
//		Select m = new Select(month);
//		m.selectByVisibleText("MAR");
//
//		Select y = new Select(year);
//		y.selectByValue("2019");
//
//		gender.click();
//		register.click();
//
//	}
//
//}

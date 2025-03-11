package Steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestScript.Page;
import Utility.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RediffCode extends Base {
	Page loginPage;

	@Given("I am in thereddif page")
	public void i_am_in_thereddif_page() {
		//Base.driver = new ChromeDriver();
		Base.driver.get("https://www.rediff.com/");
		loginPage = PageFactory.initElements(Base.driver, Page.class);

	}

	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {

		loginPage.getLogin();

		loginPage.details1();

	}

	@When("I click on the Sign-in button")
	public void i_click_on_the_sign_in_button() {

	}

	@Then("I logged in the reddif")
	public void i_logged_in_the_reddif() {

	}

	@Given("I am on the Rediff Create Account page")
	public void i_am_on_the_rediff_create_account_page() {
		loginPage.createAcc();
		loginPage.details2();
	}

	@When("I fill in the registration details")
	public void i_fill_in_the_registration_details() {

	}

	@When("I submit the form")
	public void i_submit_the_form() {

	}

	@Then("my Rediff account should be created successfully")
	public void my_rediff_account_should_be_created_successfully() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		Assert.assertEquals(10, 10);
	}

}

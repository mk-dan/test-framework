package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.SignInPage;


public class UserSignsIn {
    public WebDriver driver;


    @Given("^I am on the Amazon website$")
    public void setup() throws Throwable {
        driver.get("https://www.amazon.co.uk");
    }


    @When("^I sign in with valid details$")
    public void I_sign_in_with_valid_details() throws Throwable {
        PageFactory.initElements(driver, SignInPage.class);
    }

    @Then("^I should see a personalised greeting")
    public void I_should_see_a_personalised_greeting() throws Throwable {
    }

}

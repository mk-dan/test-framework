package step_definitions;

//import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.PendingException;


public class TestWorkflow {
    public WebDriver driver;

    @Given("^I am on the guardian website$")
    public void setup() throws Throwable {
        driver.get("https://www.theguardian.com/uk");
        driver.manage().window().maximize();
    }


    @When("^I select the main article$")
    public void I_select_the_main_article() throws Throwable {
    }

    @Then("^the article is opened$")
    public void the_article_is_opened() throws Throwable {
  ;
    }

}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class SignInPage extends BaseClass {

	public SignInPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(how= How.CSS, using=".selector,.hover")
	public static WebElement div_heading;


	@FindBy(how= How.ID, using="id_contact")
	public static Select subject_heading;


	@FindBy(how= How.CLASS_NAME, using="fc-item_content")
	public static WebElement error_message;


	



}

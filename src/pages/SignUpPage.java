package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "My Account")
	private WebElement linkMyAcount;

	@FindBy(linkText = "Sign Up")
	private WebElement linkSignUp;

	@FindBy(name = "firstname")
	private WebElement txtFirstName;

	@FindBy(name = "lastname")
	private WebElement txtLastName;

	@FindBy(name = "phone")
	private WebElement txtPhone;

	@FindBy(name = "email")
	private WebElement txtEmail;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(name = "confirmpassword")
	private WebElement txtConfirmPassword;

	@FindBy(css = ".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg")
	private WebElement btnSignUp;

	public void clickLinkMyAccount() {
		linkMyAcount.click();
	}

	public void clickLinkSignUp() {
		linkSignUp.click();
	}

	public void enterFirstNameTextbox(String text) {
		txtFirstName.clear();
		txtFirstName.sendKeys(text);

	}

	public void enterLastNameTextbox(String text) {
		txtLastName.clear();
		txtLastName.sendKeys(text);

	}

	public void enterPhoneTextbox(String text) {
		txtPhone.clear();
		txtPhone.sendKeys(text);

	}

	public void enterEmailTextbox(String text) {
		txtEmail.clear();

		txtEmail.sendKeys(text);

	}

	public void enterPasswordTextbox(String text) {
		txtPassword.clear();
		txtPassword.sendKeys(text);

	}

	public void enterConfirmPasswordTextbox(String text) {
		txtConfirmPassword.clear();
		txtConfirmPassword.sendKeys(text);

	}

	public void clickSignUpButton() {
		btnSignUp.click();
	}

}

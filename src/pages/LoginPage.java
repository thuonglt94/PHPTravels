package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "My Account")
	private WebElement linkMyAcount;

	@FindBy(linkText = "Login")
	private WebElement linkLogin;

	@FindBy(name = "username")
	private WebElement txtEmail;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(css = ".btn.btn-action.btn-block.loginbtn")
	private WebElement btnLogin;

	public void clickLinkMyAccount() {
		linkMyAcount.click();
	}

	public void clickLinkLogin() {
		linkLogin.click();
	}

	public void enterEmailTextbox(String text) {
		txtEmail.clear();
		txtEmail.sendKeys(text);

	}

	public void enterPasswordTextbox(String text) {
		txtPassword.clear();
		txtPassword.sendKeys(text);

	}

	public void clickLoginButton() {
		btnLogin.click();
	}

}

package event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import detail.LoginDetail;
import detail.SignUpDetail;
import pages.LoginPage;
import pages.SignUpPage;
import util.WaitFor;

public class PHPTravelsEvent {
	WebDriver driver;
	LoginDetail loginDetai;
	SignUpDetail signUpDetail;

	LoginPage loginPage;
	SignUpPage signUpPage;

	public PHPTravelsEvent(WebDriver driver, LoginDetail loginDetail) {
		this.driver = driver;
		this.loginDetai = loginDetail;

	}

	public PHPTravelsEvent(WebDriver driver, SignUpDetail signUpDetail) {
		this.driver = driver;
		this.signUpDetail = signUpDetail;

	}

	public PHPTravelsEvent(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateLogInForm() {
		loginPage = new LoginPage(driver);

	}

	public void logIn(WebDriver driver, LoginDetail loginDetail) throws InterruptedException {
		WaitForHomePageToAppear();
		// Actions action = new Actions(driver);
		// WebElement element = driver.findElement(By.linkText("My Account"));
		// action.moveToElement(element).click();
		// driver.findElement(By.linkText("Login")).click();
		loginPage.clickLinkMyAccount();
		WaitForLinkLoginToAppear();
		loginPage.clickLinkLogin();
		WaitForLoginFormToAppear();
		loginPage.enterEmailTextbox(loginDetail.getEmail());
		loginPage.enterPasswordTextbox(loginDetail.getPass());
		loginPage.clickLoginButton();
		WaitForButtonLoginToHiden();
		Thread.sleep(3000);
	}

	public void navigateSignUpForm() {
		signUpPage = new SignUpPage(driver);

	}

	public void signUp(WebDriver driver, SignUpDetail signUpDetail) {
		WaitForHomePageToAppear();
		// Actions action = new Actions(driver);
		// WebElement element =
		// driver.findElement(By.cssSelector(".show-submenu"));
		// action.moveToElement(element).build().perform();
		// driver.findElement(By.linkText(" Sign Up")).click();
		signUpPage.clickLinkMyAccount();
		WaitForLinkSignUpToAppear();
		signUpPage.clickLinkSignUp();
		WaitForSignUpFormToAppear();
		signUpPage.enterFirstNameTextbox(signUpDetail.getFirstName());
		signUpPage.enterLastNameTextbox(signUpDetail.getLastName());
		signUpPage.enterPhoneTextbox(signUpDetail.getPhone());
		signUpPage.enterEmailTextbox(signUpDetail.getEmail());
		signUpPage.enterPasswordTextbox(signUpDetail.getPassword());
		signUpPage.enterConfirmPasswordTextbox(signUpDetail.getConfirmPassword());
		signUpPage.clickSignUpButton();
		WaitForSignUpButtonToHidden();

		
	}

	private void WaitForHomePageToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".logo"));
	}

	private void WaitForLinkLoginToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.linkText("Login"));
	}

	private void WaitForLoginFormToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".btn.btn-action.btn-block.loginbtn"));
	}

	private void WaitForButtonLoginToHiden() {
		// TODO Auto-generated method stub
		new WaitFor(driver).hiddenOfTheElement(By.cssSelector(".btn.btn-action.btn-block.loginbtn"));
	}

	private void WaitForLinkSignUpToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.linkText("Sign Up"));
	}

	private void WaitForSignUpFormToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
	}

	private void WaitForSignUpButtonToHidden() {
		// TODO Auto-generated method stub
		new WaitFor(driver).hiddenOfTheElement(By.cssSelector(".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
	}

}

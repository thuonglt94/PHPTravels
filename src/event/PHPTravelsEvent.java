package event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	public void logIn(WebDriver driver, LoginDetail loginDetail) {
		WaitForHomePageToAppear();
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector(".show-submenu"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Login")).click();
		WaitForLoginFormToAppear();
		loginPage.enterEmailTextbox(loginDetail.getEmail());
		loginPage.enterPasswordTextbox(loginDetail.getPass());
		loginPage.clickLoginButton();

	}

	public void navigateSignUpForm() {
		signUpPage = new SignUpPage(driver);

	}

	public void signUp(WebDriver driver, SignUpDetail signUpDetail) {
		WaitForHomePageToAppear();
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.cssSelector(".show-submenu"));
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Sign Up")).click();
		WaitForSignUpFormToAppear();
		signUpPage.enterFirstNameTextbox(signUpDetail.getFirstName());
		signUpPage.enterFirstNameTextbox(signUpDetail.getLastName());
		signUpPage.enterFirstNameTextbox(signUpDetail.getPhone());
		signUpPage.enterFirstNameTextbox(signUpDetail.getEmail());
		signUpPage.enterFirstNameTextbox(signUpDetail.getPassword());
		signUpPage.enterFirstNameTextbox(signUpDetail.getConfirmPassword());

	}

	private void WaitForHomePageToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".logo"));
	}

	private void WaitForLoginFormToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".btn.btn-primary.btn-block.btn-lg.loginbtn"));
	}

	private void WaitForSignUpFormToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".signupbtn.btn_full.btn.btn-action.btn-block.btn-lg"));
	}
}

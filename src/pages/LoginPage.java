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
	
	@FindBy(css = ".show-submenu")
	private WebElement linkAcount;
	
	@FindBy(linkText = "Login")
	private WebElement linkLogin;
	
	@FindBy(name= "username")
	private WebElement txtEmail;
	
	@FindBy(name = "password")
	private WebElement txtPassword;
	
	@FindBy(css = ".btn.btn-primary.btn-block.btn-lg.loginbtn")
	private WebElement btnLogin;
	
	 
	
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

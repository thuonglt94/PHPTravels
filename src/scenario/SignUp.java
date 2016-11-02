package scenario;

import java.io.IOException;

import org.testng.annotations.Test;

import builder.SignUpDetailBuilder;
import detail.SignUpDetail;
import event.PHPTravelsEvent;
import util.PropertiesStore;


public class SignUp extends ScriptBase {
	
	//information valid
	@Test(priority = 1, enabled = true)
	
	public void test_SignUp() throws InterruptedException, IOException {
		SignUpDetailBuilder signUpDetailBuilder = new SignUpDetailBuilder();
		signUpDetailBuilder.withFirstName(PropertiesStore.getProperty("firstName"))
				.withLastName(PropertiesStore.getProperty("lastName")).withPhone(PropertiesStore.getProperty("phone"))
				.withEmail(PropertiesStore.getProperty("email_signup"))
				.withPassword(PropertiesStore.getProperty("password_signup"))
				.withConfirmPassword(PropertiesStore.getProperty("confirmPassword"));
		SignUpDetail signUpDetail = signUpDetailBuilder.build();

		// Assert.assertEquals(true, false);
		PHPTravelsEvent user = new PHPTravelsEvent(driver, signUpDetail);

		given(user).navigateSignUpForm();
		and(user).signUp(driver, signUpDetail);
		
		// verify SignUp successful
				if (driver.getPageSource().contains("My Profile")) {
					System.out.println("SignUp Successful");
				} else {
					System.out.println("SignUp unsuccessful");
				}
		
	}
}

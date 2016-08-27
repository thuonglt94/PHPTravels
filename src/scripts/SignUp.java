package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import builder.SignUpDetailBuilder;
import detail.SignUpDetail;
import event.PHPTravelsEvent;
import util.PropertiesStore;
@Test
public class SignUp extends ScriptBase {
	public void test_SignUp() throws InterruptedException, IOException {
		SignUpDetailBuilder signUpDetailBuilder = new SignUpDetailBuilder();
		signUpDetailBuilder.withFirstName(PropertiesStore.getProperty("firstName")).withLastName("lastName").withPhone(PropertiesStore.getProperty("phone")).withEmail(PropertiesStore.getProperty("email_signup")).withPassword(PropertiesStore.getProperty("password_signup"))
				.withConfirmPassword(PropertiesStore.getProperty("confirmPassword"));
		SignUpDetail signUpDetail = signUpDetailBuilder.build();

		// Assert.assertEquals(true, false);
		PHPTravelsEvent user = new PHPTravelsEvent(driver, signUpDetail);

		given(user).navigateSignUpForm();
		and(user).signUp(driver, signUpDetail);
	}
}

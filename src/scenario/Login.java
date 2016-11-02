package scenario;

import java.io.IOException;

import org.testng.annotations.Test;

import builder.LoginDetailBuilder;
import detail.LoginDetail;
import event.PHPTravelsEvent;


public class Login extends ScriptBase {
	

	// email valid, password valid
		@Test(priority = 1, enabled = true)
		public void SuccessfulLogin() throws InterruptedException, IOException {
			LoginDetailBuilder loginDetailBuilder = new LoginDetailBuilder();
			loginDetailBuilder.withEmail("user@phptravels.com")
					.withPass("demouser");

			LoginDetail loginDetail = loginDetailBuilder.build();

			PHPTravelsEvent user = new PHPTravelsEvent(driver, loginDetail);

			given(user).navigateLogInForm();
			and(user).logIn(driver, loginDetail);

			// verify Login successful
		
			if (driver.getPageSource().contains("My Profile")) {
				System.out.println("Login Successful");
			} else {
				System.out.println("Login unsuccessful");
			}
		}

}
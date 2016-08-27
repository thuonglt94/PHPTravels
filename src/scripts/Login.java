package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import builder.LoginDetailBuilder;
import detail.LoginDetail;
import event.PHPTravelsEvent;
import util.PropertiesStore;

@Test
public class Login extends ScriptBase {
	public void test_Login() throws InterruptedException, IOException {
		LoginDetailBuilder loginDetailBuilder = new LoginDetailBuilder();
		loginDetailBuilder.withEmail(PropertiesStore.getProperty("email"))
				.withPass(PropertiesStore.getProperty("password"));

		LoginDetail loginDetail = loginDetailBuilder.build();
		// Assert.assertEquals(true, false);

		PHPTravelsEvent user = new PHPTravelsEvent(driver, loginDetail);

		given(user).navigateLogInForm();
		and(user).logIn(driver, loginDetail);
	}
}
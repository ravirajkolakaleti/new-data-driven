package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom.LoginPOM;

public class LoginValidation extends BaseTest {

	
//	@BeforeMethod
	public void beforeMethod() {
		driver.navigate().to("https://www.facebook.com");
	}
	@Parameters({ "validUsername", "validPassword" })
	@Test
	public void validUsernameValidPasswordTest(String username, String password) {

		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Parameters({ "invalidUsername", "validPassword" })
	@Test
	public void invalidUsernameValidPasswordTest(String username, String password) {

		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Parameters({ "validUsername", "invalidPassword" })
	@Test
	public void validUsernameInvalidPasswordTest(String username, String password) {

		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Parameters({ "invalidUsername", "invalidPassword" })
	@Test
	public void InvalidUsernameInvalidPasswordTest(String username, String password) {

		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Parameters({ "validPassword" })
	@Test
	public void blankUsernameValidPasswordTest(String password) {
		String username = "";
		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Parameters({ "validUsername" })
	@Test
	public void validUsernameBlankPasswordTest(String username) {
		String password = "";
		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

	@Test
	public void BlankUsernameBlankPasswordTest() {
		String username = "";
		String password = "";
		LoginPOM login = new LoginPOM(driver);
		login.loginWithCredentials(username, password);

	}

}

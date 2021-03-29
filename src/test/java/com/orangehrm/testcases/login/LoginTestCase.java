package com.orangehrm.testcases.login;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.orangehrm.pages.login.LoginPage;
import com.orangehrm.testcases.BaseTest;

public class LoginTestCase extends BaseTest {

	@Test
	public void checkLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		Reporter.log("Login to application successfull");
		loginPage.logout();
		Assert.fail("INtentional failure");

	}

}

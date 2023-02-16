package test2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest2 extends BaseTest2 {
	
	@Test(priority=0,groups= {"Smoke","Regression"})
	public void verifyTitleOfBuild() {
		String verifyBuildTitle = loginpage.getBuildTitle();
		Assert.assertEquals(verifyBuildTitle, "OrangeHRM");
	}
	
	@Test(priority=1,groups= {"Smoke","Regression"})
	public void verifyTitleofPage() {
		String verifyPageTitle = loginpage.getPageTitle();
		Assert.assertEquals(verifyPageTitle, "Login");
	}
	
	@Test(priority=2,groups= {"Smoke","Regression"})
	public void verifyCurrentUrlofPage() {
	    String verifyUrlofPage = loginpage.getPageUrl();
	    Assert.assertEquals(verifyUrlofPage, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=3,groups= {"Smoke","Regression"})
	public void verifyLoginWithCorrectCredentials() {
		loginpage.setUsername("Admin");
		loginpage.setPassword("admin123");
		loginpage.clickLoginButton();
		String verifydashTitle = dashboardpage.getDashBoardPageTitle();
		Assert.assertEquals(verifydashTitle, "Dashboard");
		
	}

}

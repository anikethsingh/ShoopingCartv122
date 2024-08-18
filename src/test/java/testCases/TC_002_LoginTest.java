package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	@Test(groups= {"regression,master"})
	public void verify_login()
	{
		logger.info("**** Starting TC_003_LoginDDT *****");
	logger.debug("This is a debug log message");
	try {
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("Clicked on MyAccount Link.. ");
	hp.clickLogin();
	logger.info("Clicked on Register Link.. ");
	
	LoginPage lp=new LoginPage(driver);
	logger.info("Entering valid email and password..");
	lp.setEmail(p.getProperty("email"));
	lp.setPassword(p.getProperty("password"));
	lp.clickLogin();
	logger.info("clicked on ligin button..");
	
	MyAccountPage macc=new MyAccountPage(driver);
	boolean targetPage =macc.isMyAccountPageExists();
	Assert.assertTrue(targetPage);;
	}
	catch(Exception e) {
		Assert.fail();
	}

	}
}
	
	
	


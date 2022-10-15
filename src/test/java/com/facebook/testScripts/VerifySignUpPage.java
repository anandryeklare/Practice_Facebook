package com.facebook.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.facebook.pom.SignUpPage;

public class VerifySignUpPage extends BaseTest
{
	@Test
	public void verifySignUpPage() throws IOException
	{
		SignUpPage sp=new SignUpPage(driver);
			
			sp.setFirstName("Anand");
			sp.setSurName("Kumar");
			sp.setEmail("anandryeklare@gail.com");
			sp.setReEnterEmail("anandryeklare@gail.com");
			sp.setPassword("Anand@12345");
			sp.setBirthDate(); //5
			sp.setBirthMonth(); //July
			sp.setBirthYear(); //1990
			sp.clickOnMaleRadioButton();
			sp.clickOnSignUpButton();
	
		String title = driver.getTitle();
		boolean result = title.contains("Sign up for Facebook | Facebook"); //1234567
		
		if(result == true)
		{
			Assert.assertTrue(true);
			Reporter.log("Test case passed........");
			
		}
		else
		{
			captureScreenshot("SignUpCustomerPage");
			Assert.assertTrue(false);
			Reporter.log("Test case failed........");
		}
	}
	
}

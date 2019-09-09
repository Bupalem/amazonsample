package com.amazon.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.SigninPage;
import com.amazon.util.TestBase;

public class TC01_LoginTestcase extends TestBase{
WebDriver driver;
public String title="Amazon Sign";
@BeforeMethod
public WebDriver startbrowser(){
	driver=intializedriver();
	urllink();
return driver;
}

@Test
public void LoginTestcase() throws InterruptedException, IOException{
	HomePage page= new HomePage(driver);
	page.siginnav();
	page.signinclick();
	
	Assert.assertTrue(driver.getTitle().contains(title));

	SigninPage spage= new SigninPage(driver);
	spage.enteremail();
	spage.clickon_continue();
	spage.enterpassword();
	spage.loginbutton();
	getscreenshot();
	System.out.println("Test case executed successfully");
	
	
}

@AfterMethod
public void closebrowser(){
//driver.quit();	
}
	
}

package com.amazon.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.SigninPage;
import com.amazon.pages.YourOrdersPage;
import com.amazon.util.TestBase;

public class TC02_YourOrdersTestcase extends TestBase{
	WebDriver driver;
	@BeforeMethod
	public WebDriver startbrowser(){
		driver=intializedriver();
		urllink();
	return driver;
	}

	@Test
	public void yourOrdersTestcase() throws InterruptedException, IOException{
		HomePage page= new HomePage(driver);
		page.siginnav();
		page.signinclick();
		SigninPage spage= new SigninPage(driver);
		spage.enteremail();
		spage.clickon_continue();
		spage.enterpassword();
		spage.loginbutton();
		getscreenshot();
		System.out.println("Test case executed successfully");
		page.siginnav();
		page.yourorderslink();
		
		YourOrdersPage yorders= new YourOrdersPage(driver);
		
		/*yorders.last30daysseldropdown();
		String numer=yorders.nooforders();
		System.out.println(numer);
		*/
		int count=yorders.listofOrders();
		System.out.println(count);

	}
}
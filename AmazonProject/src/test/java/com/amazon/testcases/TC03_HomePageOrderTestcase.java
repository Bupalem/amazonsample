package com.amazon.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.pages.HomePage;
import com.amazon.pages.OrderPage;
import com.amazon.pages.ShoppingCartPage;
import com.amazon.pages.SigninPage;
import com.amazon.util.TestBase;

public class TC03_HomePageOrderTestcase extends TestBase{
	WebDriver driver;
	@BeforeMethod
	public WebDriver startbrowser(){
		driver=intializedriver();
		urllink();
	return driver;
	}
	
  @Test
  public void HomePageOrder() {
	  HomePage page= new HomePage(driver);
		page.siginnav();
		page.signinclick();
		
SigninPage spage= new SigninPage(driver);
		spage.enteremail();
		spage.clickon_continue();
		spage.enterpassword();
		spage.loginbutton();

		page.dealslink();
		
		OrderPage opage= new OrderPage(driver);
		opage.productlink();
		opage.Addtocart();
		
		ShoppingCartPage scpage= new ShoppingCartPage(driver);
		scpage.proceedtobuy();
		
		
	  
  }
}

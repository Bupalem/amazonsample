package com.amazon.pages;

import org.openqa.selenium.WebDriver;

import com.amazon.objectproperty.HomePageProperty;
import com.amazon.util.WebDriverUtils;

public class HomePage extends WebDriverUtils implements HomePageProperty{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver=driver;
	}
	
	public void siginnav(){
		movecursor(signinmove);
	}
	public void signinclick(){
		click(signinlink);
	}
	public void yourorderslink(){
		click(yourorderslink);
	}
	
	public void dealslink(){//these element is not permanent
		click(deals_link);
	}
	
	

}

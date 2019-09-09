package com.amazon.objectproperty;

import org.openqa.selenium.By;

public interface HomePageProperty {

	//
	By signinmove= By.xpath("//a[@id='nav-link-accountList']");
	By signinlink= By.xpath("//span[text()='Sign in']");
	By youraccountlink= By.xpath("//span[text()='Your Account']");
	By yourorderslink= By.xpath("//span[text()='Your Orders']");
	By deals_link= By.cssSelector("div[id=desktop-grid-1] div div div img");
	
}

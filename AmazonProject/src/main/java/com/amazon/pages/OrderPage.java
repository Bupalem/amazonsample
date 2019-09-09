package com.amazon.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.amazon.objectproperty.OrderPageProperty;
import com.amazon.util.WebDriverUtils;

public class OrderPage extends WebDriverUtils implements OrderPageProperty {
	WebDriver driver;

	public OrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
	}

	public void productlink() {
		click(productlink);
		windownavigation();
	}
	
	public void Addtocart() {
		windownavigation();
		click(cartlink);
	}
	
	
	



}

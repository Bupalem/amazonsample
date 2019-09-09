package com.amazon.pages;

import org.openqa.selenium.WebDriver;

import com.amazon.objectproperty.ShoppingCartPageProperty;
import com.amazon.util.WebDriverUtils;

public class ShoppingCartPage extends WebDriverUtils implements ShoppingCartPageProperty {
	WebDriver driver;
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public void proceedtobuy(){
		click(proceedtobuy);
	}

}

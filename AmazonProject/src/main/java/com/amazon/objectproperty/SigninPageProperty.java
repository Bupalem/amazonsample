package com.amazon.objectproperty;

import org.openqa.selenium.By;

public interface SigninPageProperty {
	
	By emailtext= By.xpath("//input[@id='ap_email']");
	By contuinebutton = By.xpath("//input[@id='continue']");
	By password = By.id("ap_password");
	By loginbutton = By.id("signInSubmit");

}

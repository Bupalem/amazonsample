package com.amazon.pages;

import org.openqa.selenium.WebDriver;

import com.amazon.data.Data;
import com.amazon.objectproperty.SigninPageProperty;
import com.amazon.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProperty {
	WebDriver driver;

	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}
public void enteremail(){
	entertext(emailtext, Data.uname);
}
public void clickon_continue(){
	click(contuinebutton);
}
public void enterpassword(){
	entertext(password, Data.upassword);
	}
public void loginbutton(){
	click(loginbutton);
}

}

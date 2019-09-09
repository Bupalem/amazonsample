package com.amazon.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By prop) {
		driver.findElement(prop).click();
	}

	public void entertext(By prop, String var) {
		driver.findElement(prop).sendKeys(var);
	}

	public void movecursor(By prop) {
		WebElement element = driver.findElement(prop);
		new Actions(driver).moveToElement(element).build().perform();
	}
	
	public void dropdownselection(By prop, String var){
	Select sel= new Select(driver.findElement(prop));
	explicitwaitlocator(prop);
	sel.selectByVisibleText(var);
	}
	
	public String gettext(By prop){
		String value=driver.findElement(prop).getText();
	return value;
	}
	public List<WebElement> listofwebelements(By by){
		List<WebElement> webelement=driver.findElements(by);
	return webelement;
	}
	public void explicitwaitlocator(By by){
		new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	public void windownavigation() {
		String parent = driver.getWindowHandle();
		Set<String> mulwindows = driver.getWindowHandles();
		Iterator<String> it = mulwindows.iterator();
		while (it.hasNext()) {
			String window = it.next();
			if (!window.contains(parent)) {
				driver.switchTo().window(window);
			}
		}
	}
	
	
	
	
	
	}

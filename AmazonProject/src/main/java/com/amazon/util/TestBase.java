package com.amazon.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase extends Setup {
	WebDriver driver;

	public WebDriver intializedriver() {

		System.setProperty(chromedriverkey, chromepath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		return driver;

	}
	public void urllink(){
		driver.get(url);
	}
	
	public void getscreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Selenium workspace\\AmazonProject\\src\\test\\resources\\screeshots\\"
				+ System.currentTimeMillis() + ".png"));
	}
}

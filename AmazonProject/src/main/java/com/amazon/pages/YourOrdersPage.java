package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.objectproperty.YourOrdersPageProperty;
import com.amazon.util.WebDriverUtils;

public class YourOrdersPage extends WebDriverUtils implements YourOrdersPageProperty {
	WebDriver driver;

	public YourOrdersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void last30daysseldropdown(){
		dropdownselection(orderFilter, "last30");
	}
	
	public String nooforders()
	{
		String number=gettext(noorders);
		return number;
	}
	public int listofOrders() throws InterruptedException{
		int total=0;
		click(orderFilter2);
		//List<WebElement> webelement=listofwebelements(listofyears);
		List<WebElement> webelement=listofwebelements(By.cssSelector("div.a-popover-inner ul li a"));
		for(int i =1; i<=webelement.size();i++)
		{
		
		//	new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(listofyears));
System.out.println("size:"+ webelement.size());
System.out.println("selcting:"+i);
			driver.findElement(By.cssSelector("div.a-popover-inner ul li:nth-child("+i+") a")).click();
			
			explicitwaitlocator(noorders);
			String number=gettext(noorders);
			String[] strarr= number.split(" ");
			System.out.println(strarr[0]);
			int count=Integer.valueOf(strarr[0]);
			total=total+count;
			System.out.println("list"+total);
			driver.navigate().refresh();
			//click(orderFilter2);
			if(webelement.size()==i){
				break;
			}
			driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	
		}
		return total;
	}
}

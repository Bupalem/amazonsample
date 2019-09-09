package com.amazon.objectproperty;

import org.openqa.selenium.By;

public interface YourOrdersPageProperty  {


	By orderFilter= By.id("orderFilter");
	By noorders=By.xpath("//span[@class='num-orders']");
	By listofyears=By.xpath("//div[@class='a-popover-inner']/ul/li/a");
	By orderFilter2 = By.xpath("//span[@class='a-button-text a-declarative']");
	
	
	
}

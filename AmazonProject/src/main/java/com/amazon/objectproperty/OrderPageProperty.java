package com.amazon.objectproperty;

import org.openqa.selenium.By;

public interface OrderPageProperty {

	By phonepage = By.cssSelector("a[id='pe-bb-signup-button-announce']");
	By productlink=By.xpath("//span[text()='Parachute Coconut Oil Bottle - 600 ml']");
	By cartlink=By.id("add-to-cart-button");
}

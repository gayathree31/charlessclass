package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class card extends basepage
{
@FindBy(xpath= "//div[@class='button-container']//a[@data-id-product='1']")
private WebElement addcart;

@FindBy(xpath= "//a[@title='Proceed to checkout']")
private WebElement proceeds;

public card()
{
	PageFactory.initElements(driver, this);
}

public WebElement getpress()
{	
	Actions act=new Actions(driver);
	act.moveToElement(addcart).perform();
	addcart.click();
	return addcart;
}
public WebElement getproced()
{
	proceeds.click();
	return proceeds;	
}
	
}

//actions act=new actions(driver);
//(//a[@data-id-product='1'])[1]
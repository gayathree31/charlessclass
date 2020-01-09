package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mail1 extends basepage

{
	@FindBy(xpath = "//p[@class='alert alert-success']")
	  private WebElement notify;
	
public mail1()
{
	PageFactory.initElements(driver, this);
}
public WebElement verify()
{
	return notify;
	
}
}

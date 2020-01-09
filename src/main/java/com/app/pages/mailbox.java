package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailbox extends basepage
{
	 @FindBy(id="newsletter-input")
	  private WebElement mail;
	 @FindBy(name="submitNewsletter")
	  private WebElement button;
	 
public mailbox()
{
	PageFactory.initElements(driver, this);

}
public WebElement  getmaill()
{
	mail.sendKeys("gayathree@yahoo.in");
	return mail;
}
public WebElement getbtn()
{
	button.click();
	return button;
}
}
package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mailbox extends basepage
{
	 @FindBy(id="newsletter-input")
	  private WebElement mail;
	 @FindBy(id="submitNewsletter")
	  private WebElement button;
	 
public mailbox()
{
	PageFactory.initElements(driver, this);

}
public void maill()
{
	mail.sendKeys("qwe@com");
}
public void btn()
{
	button.click();
}
}
package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class size extends basepage
{
  @FindBy(xpath = "//label[@for='layered_id_attribute_group_1']")
  private WebElement sizeSS;
  
  @FindBy(xpath = "//label[@for='layered_id_attribute_group_2']")
  private WebElement sizeMM;
  
  @FindBy(xpath = "//label[@for='layered_id_attribute_group_3']")
  private WebElement sizeLL;
  
  public size()

  {
	PageFactory.initElements(driver, this); 
  }
  public WebElement getsmall()
  {
	  sizeSS.click();
	return sizeSS;  
  }
  public WebElement getmedium()
  {
	  sizeMM.click();
	  return sizeMM;
  }
  public WebElement getlarge()
  {
	  sizeLL.click();
	 return sizeLL; 
  }
}

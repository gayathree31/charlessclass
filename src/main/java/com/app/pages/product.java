package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product extends basepage
{
	@FindBy(xpath = "//img[@itemprop='image']")
	private List<WebElement> first;
	
	@FindBy(xpath = "//span[@class='heading-counter']")
	private WebElement word;
	
	public product()
	{
		PageFactory.initElements(driver, this);
	}

	public int count()
	{
		return first.size();
	}

	public int image()
	{
		String count=word.getText();
		String[] w=count.split(" ");
		int no=Integer.parseInt(w[2]);
		return no;
		
	}
}

////a//img[@title='Faded Short Sleeve T-shirts']
//  //a//img[@height='250']
package com.app.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class homepage extends basepage
	{
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement Wpage;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement Dpage;

	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement Tpage;

	public homepage() {
		PageFactory.initElements(driver, this);

	}
	public WebElement getWomenpage() {
		Wpage.click();
		return Wpage;
	}
	public WebElement getdresspage() {
		Dpage.click();
		return Dpage;
	}
	public WebElement getTshirts() {
		return Tpage;
	}
	//public void mywomen()
	//{
	//	Wpage.click();
	//}
	//public void mydress()
	//{
	//	Dpage.click();
	//}
	public void mytshirt()
	{
		Tpage.click();
	}
	}


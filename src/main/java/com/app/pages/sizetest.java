package com.app.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sizetest {
	homepage hp;
	basepage bp;
	size sp;
	public sizetest()
	{
		hp=new homepage();
		bp=new basepage();
		sp=new size();
		}
	@Test
	public void size()
	{
		hp.getWomenpage();
	   Assert.assertTrue(sp.getsmall().isDisplayed());
	   Assert.assertTrue(sp.getmedium().isDisplayed());
	   Assert.assertTrue(sp.getlarge().isDisplayed());
		
	}

}

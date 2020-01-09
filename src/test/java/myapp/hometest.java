package myapp;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.app.pages.basepage;
import com.app.pages.homepage;
import com.app.pages.mail1;
import com.app.pages.mailbox;
import com.app.pages.size;

	public class hometest {
		homepage hp;
		basepage bp;
		size sp;
		mailbox mbp;
		mail1 mbp1;
		
		public hometest()
		{
			hp=new homepage();
			bp=new basepage();
			sp=new size();
			mbp=new mailbox();
			mbp1=new mail1();
			
			}
		@Test
		public void womens() {
			Assert.assertTrue(hp.getWomenpage().isDisplayed());
		}
		@Test
		public void Dress() {
			Assert.assertTrue(hp.getdresspage().isDisplayed());
		}
		@Test
		public void Tshirts() {
			Assert.assertTrue(hp.getTshirts().isDisplayed());
		}
	@Test
		public void wclick()
		{
		hp.getWomenpage();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
	hp.getdresspage();
	Assert.assertTrue(hp.getTitlte().contains("Dresses"));
	hp.mytshirt();
	Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
	}
	@Test(enabled=false)
	public void wsize()
	{
		hp.getWomenpage();
	   Assert.assertTrue(sp.getsmall().isDisplayed());
	   Assert.assertTrue(sp.getmedium().isDisplayed());
	   Assert.assertTrue(sp.getlarge().isDisplayed());
		
	}
	@Test(enabled=false)
	public void zmbox()
	{
	Assert.assertTrue(mbp.getmaill().isDisplayed());
    mbp.getbtn();
    Assert.assertTrue(mbp1.verify().getText().contains("You have successfully subscribed to this newsletter."));

	}

}

	

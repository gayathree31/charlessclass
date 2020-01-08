package myapp;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import com.app.pages.basepage;
import com.app.pages.homepage;


	public class hometest {
		homepage hp;
		basepage bp;
		public hometest()
		{
			hp=new homepage();
			bp=new basepage();
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

	}


package myapp;

import org.testng.annotations.Test;

import com.app.pages.basepage;
import com.app.pages.card;
import com.app.pages.homepage;
import com.app.pages.product;

public class cardtest {
	homepage hp;
	basepage bp;
	product pp;
	card cp;
	public cardtest()
	{
		hp=new homepage();
		bp=new basepage();
        pp=new product();
        cp=new card();
    }
	@Test(enabled=false)
	public void prodct() 
	{
		hp.getWomenpage();
		System.out.println(pp.count());
		System.out.println(pp.image());
		
	}
	@Test
	public void add()
	{
		hp.getWomenpage();
		
	cp.getpress();
	cp.getproced();
	}

}
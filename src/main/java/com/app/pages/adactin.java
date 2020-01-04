package com.app.pages;

	import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class adactin {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.adactin.com/HotelApp/");
			WebElement user=driver.findElement(By.id("username"));
			  user.sendKeys("gayathree");
			  WebElement pass=driver.findElement(By.id("password"));
			  pass.sendKeys("gayu12345");
			  WebElement button=driver.findElement(By.id("login"));
			   button.click();   
			 
			   WebElement place=driver.findElement(By.id("location"));
			   Select se=new Select(place);
			   if(se.isMultiple())
			   {
				   se.selectByIndex(0);
				   se.selectByIndex(1);
				   se.selectByIndex(2);
				   se.selectByIndex(3);
			   }
			   else
			   {
				   se.selectByIndex(4);
			   }
			   WebElement hotels=driver.findElement(By.id("hotels"));
			   Select aa=new Select(hotels);
			   aa.selectByIndex(1);
			   
			   WebElement roomtyp=driver.findElement(By.id("room_type"));
			   Select bb=new Select(roomtyp);
			   bb.selectByIndex(1);
			   
			   WebElement noroom=driver.findElement(By.name("room_nos"));
			   Select cc=new Select(noroom);
			   cc.selectByIndex(1);

			   WebElement cindate=driver.findElement(By.id("datepick_in"));
		        cindate.sendKeys("18/12/2019");
		        
		       WebElement coutdate=driver.findElement(By.id("datepick_out"));
		        coutdate.sendKeys("19/12/2019");
			  
		        WebElement people=driver.findElement(By.id("adult_room"));
		        Select ff=new Select(people);
		        ff.selectByValue("2");
		        
		        WebElement child=driver.findElement(By.id("child_room"));
		        Select gg=new Select(child);
		        gg.selectByValue("1");
		        
		        WebElement button1=driver.findElement(By.id("Submit"));
				   button1.click();

				   WebElement button2=driver.findElement(By.id("radiobutton_0"));
				   button2.click();

				    WebElement button3=driver.findElement(By.id("continue"));
				   button3.click();

				   WebElement us=driver.findElement(By.id("first_name"));
					  us.sendKeys("gayathree");
					  WebElement last=driver.findElement(By.id("last_name"));
					  last.sendKeys("manik"); 
					  
					  WebElement bill=driver.findElement(By.id("address"));
					  bill.sendKeys("ggggggggg");
					  
					  WebElement card=driver.findElement(By.id("cc_num"));
					  card.sendKeys("1234568899000123");

					  WebElement ctype=driver.findElement(By.id("cc_type"));
				        Select tt=new Select(ctype);
				        tt.selectByValue("VISA");
				        
				        WebElement exp=driver.findElement(By.name("cc_exp_month"));
						   Select uu=new Select(exp);
						   uu.selectByIndex(1);
						   
						   WebElement exmonth=driver.findElement(By.name("cc_exp_month"));
						   Select vv=new Select(exmonth);
						   vv.selectByIndex(1);
						   
						   WebElement exyr=driver.findElement(By.name("cc_exp_year"));
						   Select ss=new Select(exyr);
						   ss.selectByIndex(5);
						   
						   WebElement ccv=driver.findElement(By.name("cc_cvv"));
						   ccv.sendKeys("gayu12345");
						   
						   WebElement book=driver.findElement(By.name("book_now"));
						   book.click();
						 		
						  WebDriverWait wait1 = new WebDriverWait(driver,10);
						  wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("order_no")));
						   
						   WebElement ggg=driver.findElement(By.name("order_no"));
						   String order=ggg.getAttribute("value");
						   System.out.println(order);
						   
						   WebElement myopt=driver.findElement(By.name("my_itinerary"));
						  myopt.click();
						   
						  List<WebElement> a=driver.findElements(By.xpath("(//table[@border='0'])[5]"));
						  for(WebElement b: a)
						  {
							  List<WebElement> c=b.findElements(By.xpath("(//tr//td[@align='right'])[3]"));
		
						  
						  for(WebElement d:c)
							  {
							System.out.println(d.getText());
							  }
						  }
	}
		}


////tr[@align='center']


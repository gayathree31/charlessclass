package myapp;

import org.testng.annotations.Test;

public class announts {


		@Test
		public void testCase1() 
		{
			System.out.println("in test case 1");
		}

		@Test(dependsOnMethods={"testCase3"})
		public void testCase2() 
		{
			System.out.println("in test case 2");
		}
		
		@Test()
		public void testCase3() 
		{
			System.out.println("in test case 3");
		}
	}




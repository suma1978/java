package LinkedList.copy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class isnumeric {
	
	public boolean isdatanumeric(String testdata)
	{
		
		try {
			Integer.parseInt(testdata);
			return true;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		
		
			
	}
	
	@DataProvider(name="test-data")
	Object[][] validtestdata()
	{
		
		return new Object[][]
				{
			{"123"},
			{"-12345"},
			{"1234567890"}
			
			
				};
	}
	@DataProvider(name="Invalid test-data")
	Object[][] Invaliddata()
	{
		return new Object[][]
				{
			{"hi"},
			{"2.456"},
			{"1E10"}
				};
	}
	
	@Test(dataProvider="test-data")
	void isnumericwithvaliddata(String input)
	{
		//isdatanumeric(input);
		Assert.assertTrue(isdatanumeric(input));
	}

	@Test(dataProvider="Invalid test-data")
	void isnumericwithinvalid(String input)
	{
		Assert.assertFalse(isdatanumeric(input));
	}
}
 class numerictest{
	 public void test()
	 {
		 System.out.println("another one class");
	 }
	
}

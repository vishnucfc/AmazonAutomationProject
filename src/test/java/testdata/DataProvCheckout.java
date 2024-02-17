package testdata;

import org.testng.annotations.DataProvider;

public class DataProvCheckout {
	
	@DataProvider(name = "cartuserdetails")
	public Object[][] data() {

		return new Object[][] {
			
			{"vishnu","8978456534","Nehru Layout","New Jersey","Sbi Bank"}
			
		};

	}
	
	
	
	
	
	
	
	
	
	
	
}

package testdata;

import org.testng.annotations.DataProvider;

public class DataProvLogin {
	@DataProvider(name = "userdetailsprimary")
	public Object[][] data() {

		return new Object[][] {

			{"vishnucfc125@gmail.com","53575022"},
			{"vishnucfc125","53575022"},
			{"9578908769","3456789"},
			{"vishnucfc125@gmail.com",""},
			{"","3456789"},
			{"vishnucfc125@gmail.","3456789"},
			{"vishnucfc125@gmail.com","345"},
			{"vishnufdz@gmail.com","3456789"},
		};

	}
	
	@DataProvider(name = "userdetailssecondary")
	public Object[][] datas() {

		return new Object[][] {

			{"vishnucfc125@gmail.com","53575022"}
			
		};

	}
	
}

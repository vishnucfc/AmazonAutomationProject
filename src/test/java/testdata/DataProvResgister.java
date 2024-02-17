package testdata;

import org.testng.annotations.DataProvider;

public class DataProvResgister {

	
		@DataProvider(name = "userdetailsprimary")
		public Object[][] primarydata() {

			return new Object[][] {

					{ "Vishnu", "9597260769", "12345667890__" }, { "Vishnu", "95972607692", "12345667890__" },
					{ "", "9597260769", "12345667890__" }, { "Vishnu", "959726769", "12345667890__" },
					{ "Vishnu", "9597260769", "1234" }, { "Vishnu", "", "12345667890__" },
					{ "Vishnu", "9597260769", "" }, { "", "", "" },

			};

		}

		@DataProvider(name = "secondary")
		public Object[][] secondary() {

			return new Object[][] {

					{ "9597567834" },

			};
		}
	}


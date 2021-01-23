package test;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.BroweserFactory;

public class RaunchAutomatioExamWebSiteTest {
	WebDriver driver;
	@Test
	public void User_Is_On_HomePage() {
		BroweserFactory.unit();
		
		BroweserFactory.Teardown();
		
	}
	
	
}

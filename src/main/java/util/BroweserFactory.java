package util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserFactory {
	static WebDriver driver;
	public static WebDriver unit() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abasi\\eclipse-workspace\\BDD\\AutomationPlacticalExam\\driver\\chromedriver1.exe");
		 driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver Teardown() {
		driver.close();
		driver.quit();
		
		return driver;
	}

}

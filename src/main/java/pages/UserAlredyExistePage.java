package pages;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserAlredyExistePage {
	
	WebDriver driver;
	BasePage base;
	public UserAlredyExistePage(WebDriver driver) {
	this.driver=driver;
	
	}
	
	
	@FindBy(how=How.XPATH,using="/html/body/text()") WebElement USER_ALREAD_EXIST_ELEMENT_LOCATOR;
	
	public void User_is_not_able_to_Add_deplicate_Category() {
		base = PageFactory.initElements(driver, BasePage.class);
		
		String CategoryExistanceMassage =USER_ALREAD_EXIST_ELEMENT_LOCATOR.getText();
		base.ExpricityWait(driver, 60, USER_ALREAD_EXIST_ELEMENT_LOCATOR);
		assertEquals(CategoryExistanceMassage, "Sorry that TODO item already exists. ","This Message does'nt apear on the page");
		
	}
	public  void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		  TakesScreenshot ts = ((TakesScreenshot) driver);
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  String currentDir = System.getProperty("user.dir");
		  FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	

}

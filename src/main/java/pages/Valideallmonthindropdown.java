package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.BasePage;
import util.BroweserFactory;

public class Valideallmonthindropdown {
	WebDriver driver;
	BasePage base;
public Valideallmonthindropdown(WebDriver driver) {
	this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//select[@name='due_month']") WebElement CATECORY_DUE_MONTH_ELEMENT_LOCATOR;
	
	public void AllMonthsareOnDropBox() {
		base = PageFactory.initElements(driver, BasePage.class);
		
	
	base.selectdropdown(CATECORY_DUE_MONTH_ELEMENT_LOCATOR, "Jan");
	String Month =driver.findElement(By.xpath("//select[@name='due_month']")).getText();
	
	System.out.println(Month );
	}
		
		
	 
	 
	
	
	}



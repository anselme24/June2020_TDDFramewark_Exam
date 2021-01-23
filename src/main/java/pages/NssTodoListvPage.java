package pages;

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
import org.testng.Assert;



public class NssTodoListvPage {
	WebDriver driver;
	BasePage base;
	public NssTodoListvPage (WebDriver driver){
		
	this.driver=driver;
	base = PageFactory.initElements(driver, BasePage.class);
	
	}
	
	@FindBy (how=How.XPATH,using="//div[@id='label-first']")WebElement NSS_TODO_LIST_V_1_1_LOCATIR;
	@FindBy(how=How.XPATH,using="//input[@name='allbox']")WebElement TOGGLE_ALL_CHECK_BOX_ELEMENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@name='data']") WebElement ADD_CATECORY_FIELD_ELEMENT_LOCATER;
	@FindBy(how=How.XPATH,using="//select[@name='category']") WebElement CATECORY_ELEMENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//select[@name='due_day']") WebElement CATECORY_DUE_DAY_ELEMENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//select[@name='due_month']") WebElement CATECORY_DUE_MONTH_ELEMENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//select[@name='due_year']") WebElement CATECORY_DUE_YEAR_ELEMENT_LOCATOR;
	@FindBy(how=How.XPATH,using="//input[@value='Add']") WebElement ADD_CATECORY_BUTTON_ELEMENT_LOCATOR;
public void Validete_if_The_User_Is_NSS_TODO_List_vPage() {
	String 	HomePage =NSS_TODO_LIST_V_1_1_LOCATIR.getText();
	Assert.assertEquals(	HomePage, "NSS-TODO List v 1.1", "Page not found");
	
	
}

public void User_is_Ckecging_Toggle_all_Check_Box() {
	
	TOGGLE_ALL_CHECK_BOX_ELEMENT_LOCATOR.click();
	
	
}
public void User_is_Able_to_add_Category(String CategoryName) {
	ADD_CATECORY_FIELD_ELEMENT_LOCATER.sendKeys( CategoryName);
	
	
	
	
}
public void User_is_Able_to_Select_Category(String Category) {
	base.selectdropdown(CATECORY_ELEMENT_LOCATOR, Category);
	
}
public void User_is_Able_to_Select_Due_Day(int day) {
	base.selectdropdown_numbers(CATECORY_DUE_DAY_ELEMENT_LOCATOR, day);
	
}
public void User_is_Able_to_Select_Due_Month(String month) {
	base.selectdropdown(CATECORY_DUE_MONTH_ELEMENT_LOCATOR, month);
	
}
public void User_is_Able_to_Select_Due_Year(int year) {
	
	base.selectdropdown_numbers(CATECORY_DUE_YEAR_ELEMENT_LOCATOR, year);	
	
}
public void User_Clicks_on_ADD () {
	base.ExpricityWait(driver, 60, ADD_CATECORY_BUTTON_ELEMENT_LOCATOR);
	ADD_CATECORY_BUTTON_ELEMENT_LOCATOR.click();
	
}


}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.NssTodoListvPage;
import pages.Valideallmonthindropdown;
import util.BroweserFactory;
import util.ExcelReader;

@Test
public class ValideteIfAllMonthApearOnDropDown {
	WebDriver driver;
	NssTodoListvPage TestPage;

	public void AllMonthsAreONDropDown() {

		driver = BroweserFactory.unit();

		ExcelReader ExcelDocument = new ExcelReader(
				"C:\\Users\\abasi\\eclipse-workspace\\BDD\\AutomationPlacticalExam\\src\\main\\java\\util\\Automation Test Data.xlsx");
		String Category_name = ExcelDocument.getCellData("ExamaTestData", "Category", 2);

		String Category = ExcelDocument.getCellData("ExamaTestData", "Category", 4);
		String month = ExcelDocument.getCellData("ExamaTestData", "month", 2);

		TestPage = PageFactory.initElements(driver, NssTodoListvPage.class);
		TestPage.User_is_Able_to_add_Category(Category_name);
		TestPage.User_is_Able_to_Select_Category(Category);
		TestPage.User_is_Able_to_Select_Due_Day(25);
		TestPage.User_is_Able_to_Select_Due_Month(month);

		Valideallmonthindropdown moth = PageFactory.initElements(driver, Valideallmonthindropdown.class);
		moth.AllMonthsareOnDropBox();
		BroweserFactory.Teardown();
	}

}

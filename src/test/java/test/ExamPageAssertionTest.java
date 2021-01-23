package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.NssTodoListvPage;
import util.BroweserFactory;
@Test
public class ExamPageAssertionTest {
	WebDriver driver;
	public void User_is_on_Test_Page() {
		driver =BroweserFactory.unit();
		NssTodoListvPage TestPage = PageFactory.initElements(driver, NssTodoListvPage.class);
		TestPage.Validete_if_The_User_Is_NSS_TODO_List_vPage();
		TestPage.User_is_Ckecging_Toggle_all_Check_Box();
		BroweserFactory.Teardown();
	}
	

}

package pages;




import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage  {
	
	
	
	public int RondumNumber() {
		Random rand1 = new Random();
		int randomnumber= rand1.nextInt(999);
		return randomnumber;
	}
	public void ExpricityWait(WebDriver driver,int timeinseconds,WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectdropdown(WebElement element ,String visibilitytext) {
		
		Select sel = new Select(element);
		sel.selectByVisibleText(visibilitytext);
		}

	public void selectdropdown_numbers(WebElement element, int index) {
			
			Select sel = new Select(element);
			sel.selectByIndex(index);;
		
			
				
			}


	public void action(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();;
	}
	public void keyBoard_action(WebDriver driver) {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
		
	}
	
		
	



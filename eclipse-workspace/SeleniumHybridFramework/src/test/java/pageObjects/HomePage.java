package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//*[@class=\"card-text\"]//h3[contains(text(),'Complete the Timesheet')]")
WebElement timeSheet;

public void clickOnTimeSheet()
{
	timeSheet.click();	
}




}






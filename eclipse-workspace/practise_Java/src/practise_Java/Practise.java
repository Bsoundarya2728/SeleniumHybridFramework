package practise_Java;

import java.awt.Dimension;

/*public class Practise {
	int width = 600;
	int height = 400;
	Dimension dimension = new Dimension(width, height);
	driver.manage().window().setSize(dimension);
	((JavascriptExecutor)driver).executeScript("window.resizeTo(600,400);");
	window.resizeTo();
	
	we can pass ALT, SHIFT, and CONTROL as parameters together in the modifier key argument.
	Actions a = new Actions(driver) ;
	a.keyDown(Keys.ALT).keyDown(Keys.SHIFT) .keyDown(Keys.CONTROL).sendKeys('test') .build() .perform();
	driver.switchTo().frame(2)
	
	Wait wait = new FluentWait<WebDriver>(driver)
	.withTimeout(45, TimeUnit.SECONDS)
	.pollingevery(5, TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class);
	
	storeAlert() command can be used to retrieve the message from the alert pop-up -
	without using the getText() method
	
	We can use the command getCSSValue(arg0) 
	to fetch the colours by sending the colour as the argument
	
	
	System.setProperty("Service_name", "selenium_java_client");
	System.setProperty("Service_host", "localhost");
	System.setProperty("Service_port", "14258");
	ImmutableCapabilities capabilities = new ImmutableCapabilities("browserName", "chrome");
	WebDriver driver=new RemoteWebDriver(new URL("http//sample.com"), capabilities);
	
	‘StaleElement’ exception
	1.driver. navigate().refresh()
	driver.findElement (By.xpath(“sample”)).click();
	2.wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf("sample")));
	3.for(int i=0;i<=2;i++)
	{ try { driver.findElement(By.xpath("sample")).click();
		break; }
	Catch (Exception e){
		Sysout(e.getMessage());
				}
	}
	
	How will you enable a disabled textbox?
	String enable ="doc.getElementsByName("name').removeAttribute('disabled');";
			javascript.executeScript(enable);
	
	 verifyElementPositionLeft”, “verifyElementPositionRight”, “verifyElementPositionTop”, “verifyElementPositionBottom”
	 
	 An immediate child in XPath is indicated using “/”. To find paragraph elements that are descendants to any div element.
	 We can use “//” in the XPath.
}*/


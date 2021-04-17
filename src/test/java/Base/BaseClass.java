package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
public WebDriver launchBrowser()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 return driver;
}

public void hitURL(String URL)
{
	
	driver.get(URL);
}

public void sendValues(WebElement element, String value)
{
	element.sendKeys(value);
}
public void clickButton(WebElement element)
{
element.click();
	
}
public void selectByIndex(WebElement element,int index)
{
	Select sc=new Select(element);
	sc.selectByIndex(index);
}

}


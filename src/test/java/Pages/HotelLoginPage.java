package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HotelLoginPage extends BaseClass {

	public HotelLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "username")
	private WebElement username;
	
	public WebElement getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	
	@FindBy(id = "password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id = "login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}


	
	}
		

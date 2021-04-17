package Stepdef;

import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Pages.HotelLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotelLogin extends BaseClass {
	WebDriver driver;
	HotelLoginPage lp;	
	@Given("launch the browser")
	public void launch_the_browser() {
	   driver = launchBrowser();
	   lp =new HotelLoginPage(driver);

	}

	@Given("open th AdactinHotel page")
	public void open_th_adactin_hotel_page() {
	   hitURL("https://adactinhotelapp.com/");
	}

	@When("enter the username and password")
	public void enter_the_username_and_password() {
		sendValues(lp.getUsername(), "Nish");
		sendValues(lp.getPassword(), "Nish123");
	    
	}

	@When("click the login button")
	public void click_the_login_button() {
		clickButton(lp.getLogin());
	   
	}

	@Then("validate the Success message")
	public void validate_the_success_message() {
	    
	}


}

package StepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Driver.driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation extends driver {
	 WebDriver webdriver;
	 FileInputStream fis;
	 Properties prop;
	 
	@Given("^open the browser$")
	public void open_the_browser() throws Throwable {				
				
		try{			
			webdriver = new FirefoxDriver();
			 prop = new Properties();
			 fis = new FileInputStream("C:\\Users\\anand\\Desktop\\sel\\Jtest\\RealProject\\src\\test\\resources\\base\\objectrepository.properties");
			 prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	     System.out.println("Browser opened successfully");
	   
	}

	@When("^I want to getin to the URL with \"(.*?)\"$")
	public void i_want_to_getin_to_the_URL_with(String url) throws Throwable {
		try{
		webdriver.get(url);
		} catch(Exception e)
		{
			driver.screenshot(webdriver);
		}
	}

	@When("^I use the username as \"(.*?)\"$")
	public void i_use_the_username_as(String username) throws Throwable {
		webdriver.findElement(By.id(prop.getProperty("prop1"))).sendKeys(username);
	}

	@When("^I use the password as \"(.*?)\"$")
	public void i_use_the_password_as(String password) throws Throwable {
		webdriver.findElement(By.id(prop.getProperty("prop2"))).sendKeys(password);
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		webdriver.findElement(By.id(prop.getProperty("prop3"))).click();
		
	
	}

	@Then("^I want to login to the application successfully$")
	public void i_want_to_login_to_the_application_successfully() throws Throwable {
	    System.out.println("Login to the application is success");
	}

	
}



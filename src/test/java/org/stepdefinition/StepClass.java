package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepClass {
	public static WebDriver driver;

	
	

@Given("User has to launch the chrome browser and hit the url")
public void user_has_to_launch_the_chrome_browser_and_hit_the_url() {

	//WebDriverManager.chromedriver().setup();;
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	
}

@When("User has to pass the invalid username in email field")
public void user_has_to_pass_the_invalid_username_in_email_field() {
  WebElement email=driver.findElement(By.id("email"));
  email.sendKeys("greens@gmail.com");
}

@When("User has to pass valid password in password field")
public void user_has_to_pass_valid_password_in_password_field() {
	WebElement pass=driver.findElement(By.id("pass"));
	 pass.sendKeys("greens");  
}

@When("User has to click the login button")
public void user_has_to_click_the_login_button() {
  WebElement login=driver.findElement(By.name("login"));
  login.click();
}

@When("User has to navigate to the home page")
public void user_has_to_navigate_to_the_home_page() {
   System.out.println("Please check the Facebook......."); 
}

@Then("User has to close the chrome browser")
public void user_has_to_close_the_chrome_browser() {
   driver.quit(); 
}


}

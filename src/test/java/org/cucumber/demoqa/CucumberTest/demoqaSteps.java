package org.cucumber.demoqa.CucumberTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoqaSteps {

	static WebDriver driver;
	@Given("^User in Demoqa page$")
	public void user_in_Demoqa_page() {
		//launchBrowser("chrome", "http://demoqa.com/registration/");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demoqa.com/registration/");
	}
	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String firstname, String lastName) {
	driver.findElement(By.id("name_3_firstname")).sendKeys(firstname);
	driver.findElement(By.id("name_3_lastname")).sendKeys(lastName);
	}
	
	@Then("^The user Verifies \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_Verifies_and(String firstname, String lastName) {
		Assert.assertEquals(firstname, driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals(lastName,driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
	}
}

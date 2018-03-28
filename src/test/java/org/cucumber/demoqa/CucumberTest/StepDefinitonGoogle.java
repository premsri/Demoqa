package org.cucumber.demoqa.CucumberTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitonGoogle {

	static WebDriver driver;
	
	@Given("^The user is in google\\.com$")
	public void the_user_is_in_google_com() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\javapracctise\\SeleniumPractise\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

	@When("^The user enters \"([^\"]*)\"and click on search$")
	public void the_user_enters_and_click_on_search(String Text1) throws AWTException {
		driver.findElement(By.id("lst-ib")).sendKeys(Text1);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@Then("^The user verify \"([^\"]*)\" is displayed$")
	public void the_user_verify_is_displayed(String Text1) throws InterruptedException {
		Thread.sleep(5000);
		org.junit.Assert.assertTrue(driver.findElement(By.xpath("//span[text()='"+Text1+"']")).isDisplayed());
		System.out.println("Verified");
		driver.quit();
	}

}

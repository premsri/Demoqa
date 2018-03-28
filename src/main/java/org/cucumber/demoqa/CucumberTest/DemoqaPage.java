package org.cucumber.demoqa.CucumberTest;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaPage extends BaseClass{
	
	private static  DemoqaPage demo = null;
	 public DemoqaPage() {
		
		PageFactory.initElements(driver, this);
	} 
	 
	@FindBy(id="name_3_firstname")
	private WebElement firstName;
	
	@FindBy(id="name_3_lastname")
	private WebElement lastName;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}
	

}

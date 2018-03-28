package org.cucumber.demoqa.CucumberTest;


	import cucumber.api.java.After;
	import cucumber.api.java.Before;

	public class Hooks {
		
		@Before
	    public void beforeScenario(){
	        System.out.println("This will run before the Scenario");
	    }	
		
		@After
	    public void afterScenario(){
	        System.out.println("This will run after the Scenario");
	    }
	
		@Before("@First")
		public void before() {
			System.out.println("first");
		}
		
		@After("@First")
		public void after() {
			System.out.println("last");
		}
		
	}

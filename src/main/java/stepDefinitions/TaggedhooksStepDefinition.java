package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TaggedhooksStepDefinition {

	//Global Hooks:
	@Before(order=0)
	public void setup() {
		System.out.println("Launch Browser");
		System.out.println("Enter url for Application");
	}
	@After(order=0)
	public void close() {
		System.out.println("Close the Application");
	}
	
	@Before(order=1)
	public void setup1() {
		System.out.println("Launch Browser");
		System.out.println("Enter url for Application");
	}
	@After(order=1)
	public void close1() {
		System.out.println("Close the Application");
	}
	
	//Local: Only For FIrst Scenario
	@Before("@First")
	public void beforeFisrt() {
		System.out.println("before only first Scenario");
	}
	//Local: Only For FIrst Scenario
	@After("@First")
	public void afterFisrt() {
		System.out.println("After only first Scenario");
	}
	//Local: Only For Second Scenario
	@Before("@Second")
	public void beforeSecond() {
		System.out.println("before only Second Scenario");
	}
	//Local: Only For Second Scenario
	@After("@Second")
	public void afterSecond() {
		System.out.println("After only Second Scenario");
	}
	//Local: Only For Second Scenario
	@Before("@Third")
	public void beforeThird() {
		System.out.println("before only Third Scenario");
	}
	//Local: Only For Second Scenario
	@After("@Third")
	public void afterThird() {
		System.out.println("After only Third Scenario");
	}
	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
	  System.out.println("This is First Step");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		 System.out.println("This is second Step");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		 System.out.println("This is third Step");
	}

}

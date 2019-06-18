//package stepDefinitions;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//
//public class Hooks_StepDefinition {
//	
//	
//	@Before
//	public void setup() {
//		System.out.println("Launch Browser");
//		System.out.println("Enter url for Application");
//	}
//	
//	@After
//	public void close() {
//		System.out.println("Close the Application");
//	}
//	
//	
//	@Given("^Open chrome and start Application$")
//	public void Open_chrome_and_start_Application() throws Throwable {
//	   System.out.println("Open Timesheet Aplliaction");
//	}
//	@When("^title of Login Page is Timesheet$")
//	public void title_of_Login_Page_is_Timesheet() throws Throwable {
//	    System.out.println("Tiltle of Login Timesheet");
//	}
//	
//	@When("^Nest of Login Page is Timesheet$")
//	public void Nest_of_Login_Page_is_Timesheet() throws Throwable {
//	    System.out.println("Nest of Login Title");
//	}
//
//
//}

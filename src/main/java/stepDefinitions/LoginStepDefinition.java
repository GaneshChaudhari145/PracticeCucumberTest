//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	
//	WebDriver driver;
//	
//	@Given("^Open chrome and start Application$")
//	public void Open_chrome_and_start_Application(){
//		System.setProperty("webdriver.chrome.driver","E:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
//		driver.get("http://timesheet.aqmtechnologies.com/");
//	}
//
//	@When("^title of Login Page is Timesheet$")
//	public void title_of_Login_Page_is_Timesheet(){
//	   String title=driver.getTitle();
//	  // System.out.println(title);
//	   Assert.assertEquals("Timesheet - AQM Technologies Ltd", title);
//	}
//	
//	
//	//For Example Keyword
//	@Then("^user enters valid \"(.*)\" & \"(.*)\"$")
//	public void user_enters_valid_username_password(String username,String password){
//		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
//		
//	}
//	@Then("^user clicks on Login Button$")
//	public void user_clicks_on_Login_Button(){
//		driver.findElement(By.id("btnLogin")).click();
//		driver.close();
//	}
//}

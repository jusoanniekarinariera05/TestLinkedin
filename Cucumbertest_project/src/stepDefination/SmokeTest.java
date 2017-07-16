package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

 
	 
public class SmokeTest {
	
	WebDriver driver;

	@Given("^Open Linkedin and start application$")
	public void Open_linkedin_and_start_application() throws Throwable {
		System . setProperty ( "webdriver.chrome.driver" , "C:\\Users\\Karina Riera\\workspace\\Cucumbertest_project\\chrome\\chromedriver.exe" ) ;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ve.linkedin.com/");
	    
	}

	@When("^I Enter valid username and  valid password$")
	public void I_Enter_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("login-email")).sendKeys("PR234598@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("98764512");
	}

	@Then("^User does not exist$")
	public void User_does_be_not_exist() throws Throwable {
		
		driver.findElement(By.id("login-submit")).click();
	    
	}
	
	
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		
        System . setProperty ( "webdriver.chrome.driver" , "C:\\Users\\Karina Riera\\workspace\\Cucumbertest_project\\chrome\\chromedriver.exe" ) ;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ve.linkedin.com/");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page() throws Throwable {
		
		driver.findElement(By.id("login-email")).sendKeys("MaC96398@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("87128896");
	    
	}

	

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully() throws Throwable {
		
		driver.findElement(By.id("login-submit")).click();
	    
	}

	@Then("^Search contact$")
	public void Search_contact() throws Throwable {
	    
		driver.findElement(By.xpath("//input")).sendKeys("Jusoannie");
		   driver.findElement(By.xpath("//form/div[2]/button")).click();
		   driver.findElement(By.xpath("//li[6]/div/button")).click();
		   driver.findElement(By.xpath("//li[4]/ul/li/a")).sendKeys("Jusoannie");
		   
	}


}

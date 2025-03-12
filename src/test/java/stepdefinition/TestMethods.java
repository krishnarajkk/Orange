package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobject.Login;

public class TestMethods extends Base {

	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
		System.out.println("Login Test");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		lp=new Login(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		}
	@When("the user enter the {string} and {string}")
	public void the_user_enter_the_and(String uname, String pword) {
		lp.setUn(uname);
		lp.setPw(pword);
	}
	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
		lp.setBtn();
		Thread.sleep(3000);
		
	}
	@Then("the user should verify the outcomes for the respective input")
	public void the_user_should_verify_the_outcomes_for_the_respective_input() {
		String s=driver.getTitle();
		System.out.println(s);
		  System.out.println("Completed");
	}

}

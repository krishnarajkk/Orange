package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods {
   WebDriver driver;
	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("the user enter the {string} and {string}")
	public void the_user_enter_the_and(String un, String pw) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pw);
	}
	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	@Then("the user should verify the outcomes for the respective input")
	public void the_user_should_verify_the_outcomes_for_the_respective_input() {
		  System.out.println("Completed");
	}

}

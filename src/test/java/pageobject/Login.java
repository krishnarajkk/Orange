package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Base;

public class Login {
	
	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="username") WebElement un;
	@FindBy(name="password") WebElement pw;
	@FindBy(xpath="//button[@type='submit']") WebElement btn;
	
	
	public void setUn(String user) {
		un.clear();
		un.sendKeys(user);
	}
	
	
	public void setPw(String pass) {
		pw.clear();
		pw.sendKeys(pass);
	}
	
	
	public void setBtn() {
		btn.click();
	}

	

	
	
	
	

}

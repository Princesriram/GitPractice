package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage{
	
	WebDriver web;
	
	public Loginpage(WebDriver web) {
		this.web = web;
		PageFactory.initElements(web, this);
	}
	

	@FindBy(id = "inputUsername")
	WebElement Username;
	@FindBy(name = "inputPassword")
	WebElement Password;
	@FindBy(id="chkboxOne")
	WebElement Rememberme;
	@FindBy(id="chkboxTwo")
	WebElement Iagree;
	@FindBy(xpath = "//button[@class='submit signInBtn']")
	WebElement Submit;
	
	public void invokebrowser() {
		
		web.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	
	public void Signin(String name,String pass) {
		Username.sendKeys(name);
	    Password.sendKeys(pass);
	    Rememberme.click();
	    Iagree.click();
	    Submit.click();
	}
	
	
}

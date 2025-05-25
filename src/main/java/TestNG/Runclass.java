package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runclass {
	WebDriver web = new ChromeDriver();
	@Test
	public void Signup(){
		
	Loginpage login = new Loginpage(web);
	login.invokebrowser();
	login.Signin("rahul", "rahulshettyacademy");
	web.quit();
	}

}

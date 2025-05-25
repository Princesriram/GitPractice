package TestNG;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGtestclass {
    @Test
	public void TestNGloginpage1()
	 {
		
		 
		WebDriver web = new ChromeDriver();
		web.get("https://www.google.com/");
		String title = web.getTitle();
		System.out.println(title);
		AssertJUnit.assertEquals(title, "Google");
		web.close();
	}
    @Test
    public void TestNGLoginpage2() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/locatorspractice/");
    	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
    	driver.findElement(By.id("chkboxOne")).click();
    	driver.findElement(By.id("chkboxTwo")).click();
    	driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
    	Thread.sleep(1000);
    	AssertJUnit.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello rahul,");
    	driver.close();
    	
	
}
}

package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGtestclass3 {
	@Test
	public static void Actionclass()
	 {
			// TODO Auto-generated method stub
			
		WebDriver web = new ChromeDriver();
		web.get("https://rahulshettyacademy.com/locatorspractice/");
		web.findElement(By.cssSelector("#visitUsTwo")).click();
		Set<String> pages = web.getWindowHandles();
		Iterator <String> it = pages.iterator();
		String page1 = it.next();
		String page2 = it.next();
		web.switchTo().window(page2);
		System.out.println(web.findElement(By.xpath("//a[text()='Mentorship']")).getText());
		web.switchTo().window(page1);
		System.out.println(web.findElement(By.xpath("//div[@class='overlay-panel overlay-right'] /h1")).getText());
		
		
		
		
		

		}

}

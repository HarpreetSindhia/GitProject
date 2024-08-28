package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableScoll_Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,700)");
		executor.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500;");
		List<WebElement> numbers = driver.findElements(By.cssSelector(".tableFixHead table tbody tr td:nth-child(4)"));
		
		int sum = 0;
		for(int i = 0; i < numbers.size(); i++)
		{
		 
			int numerals = Integer.parseInt(numbers.get(i).getText());
		 
		 sum = sum + Integer.parseInt(numbers.get(i).getText());
		 
		 System.out.println(numerals);
		}
		
		System.out.println(sum);
		
		int actualData = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		
		
		Assert.assertEquals(sum, actualData);
		
		
		
		
		
		
	}
}

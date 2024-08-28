package TestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTables {
	
	@Test
	public void workWebTable() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,600)","");
		executor.executeScript("document.querySelector('.tableFixHead').scrollTop=5000;");
		List<WebElement> numerals = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum = 0;
		for(int i = 0; i < numerals.size(); i++)
		{
			
		int numberData = Integer.parseInt(numerals.get(i).getText());
			
			sum = sum + numberData;
		}
		
		System.out.println(sum);
		
		// Total Amount Collected: 296 
	int actualData =  Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, actualData);
			
	}
	
	
	
	@Test
	public void workWebTable2() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> numbers = driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr/td[3]"));
		int sum = 0;
		for(int i = 0; i < numbers.size(); i++)
		{
			
			int numberData1 = Integer.parseInt(numbers.get(i).getText());
			
			sum = sum + numberData1;
		}
		
		System.out.println(sum);
		
		
	}

}

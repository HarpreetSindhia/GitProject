package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandlingUI_Practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		driver.findElement(By.cssSelector(".react-date-picker__wrapper button:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation button:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation button:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".react-calendar__viewContainer div div button:nth-child(5)")).click();
		driver.findElement(By.cssSelector(".react-calendar__viewContainer div div button:nth-child(1)")).click();
		driver.findElement(By.cssSelector(".react-calendar__month-view__days button:nth-child(17)")).click();
		String date = driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText();
		List<WebElement> dateFormat = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i = 0; i < dateFormat.size(); i++ )
		{
			System.out.println(dateFormat.get(i).getAttribute("value"));
		}
		
		
		
		
		
		
		
		
	}

}

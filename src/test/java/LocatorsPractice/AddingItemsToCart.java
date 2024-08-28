package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {
	
	public static void main(String[] args) {
		
		String veggie = "Corn - 1 Kg";//Variable
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> veggies = driver.findElements(By.cssSelector(".products h4"));
		for(int i = 0; i < veggies.size(); i++)
		{
			if(veggies.get(i).getText().contains(veggie))
			
			{
				
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
				break;
			}	
		
	}

}

}
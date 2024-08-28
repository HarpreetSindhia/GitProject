package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonInterview_AddingItemsToCart {
	
	public static void main(String[] args) {
		
		String name = "Apple";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> groceryItems = driver.findElements(By.cssSelector(".products h4"));
		for(int i = 0; i < groceryItems.size(); i++) {
			
			String fruitveg = groceryItems.get(i).getText();
			
			if(fruitveg.contains(name)) {
				
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
				break;
			}
			
		}
		
		
		
		
		
	}

}

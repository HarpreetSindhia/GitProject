package LocatorsPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingMultipleProductsToCart {
	
	public static void main(String[] args) {
		
		
		String[] vegList = {"Brocolli","Carrot","Cucumber","Beetroot","Almonds","Pumpkin"};
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		productsNeeded(driver,vegList);
		
		
		
	}

	
	
	public static void productsNeeded(WebDriver driver , String[] vegList) {
		
    List<WebElement> groceryItems = driver.findElements(By.cssSelector(".product-name"));
		
		//Brocolli - 1 Kg
		int j = 0;
		int m = 1;
		for(int i = 0; i < groceryItems.size(); i++)
		{
			String actualVegList = groceryItems.get(i).getText().split("-")[0].trim();
			
			List<String> productList = Arrays.asList(vegList);
			
			if(productList.contains(actualVegList))
			{
				j++;
				
			while(m<2)
			{
				m++;
				driver.findElements(By.cssSelector(".increment")).get(i).click();
				
			}
				
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
			}
			
		
		if(j == vegList.length)
			
		{
			break;
		}
		
		
	}
		

	}
}
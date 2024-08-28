package LocatorsPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonInterview_MultipleItemsToCart {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] names = { "Apple", "Banana", "Mango", "Pomegranate", "Water Melon" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver, names);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector(".action-block button")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		String couponApplied = driver.findElement(By.cssSelector(".promoInfo")).getText();
		Assert.assertEquals(couponApplied, "Code applied ..!");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement staticDropDown = driver.findElement(By.xpath("//div/select"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByIndex(11);
		String country = dropDown.getFirstSelectedOption().getText();
		Assert.assertEquals(country, "Australia");
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	
	}
	
	public static void addItems(WebDriver driver , String[] names)
	{
		
		int j = 0;
		List<WebElement> groceryItems = driver.findElements(By.cssSelector(".products h4"));
		for (int i = 0; i < groceryItems.size(); i++) {

			// Format it to get the actual fruit name
			String formattedFruit = groceryItems.get(i).getText().split("-")[0].trim();
			// Convert Array into ArrayList
			List<String> fruitList = Arrays.asList(names);

			if (fruitList.contains(formattedFruit)) {
				
				j++;
				
				int m = 1; 
				while(m < 3) {
				
				driver.findElements(By.cssSelector(".increment")).get(i).click();
				m++;
				
				}
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();

				if (j == names.length) {

					break;
				}

			}

		}
	}

	
}



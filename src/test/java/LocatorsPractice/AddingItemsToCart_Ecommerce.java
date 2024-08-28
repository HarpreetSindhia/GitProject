package LocatorsPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddingItemsToCart_Ecommerce {

	public static void main(String[] args) {
		
		String name = "Cauliflower - 1 Kg";
		
		String myVegetable = name.split("-")[0].trim();


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> vegetables = driver.findElements(By.cssSelector(".products h4"));
		WebElement vegetable = vegetables.stream().filter(p -> p.getText().contains(myVegetable)).findFirst()
				.orElse(null);
		vegetable.findElement(By.xpath("//div[@class='product-action']/button")).click();

		/*
		 * List<WebElement> veggies =
		 * driver.findElements(By.cssSelector(".product h4"));
		 * 
		 * WebElement vegetable1 = veggies.stream().filter(h ->
		 * h.getText().contains("Beetroot ")).findFirst().orElse(null); vegetable1
		 * .findElement(By.cssSelector(".product-action button")).click();
		 */

	}

}

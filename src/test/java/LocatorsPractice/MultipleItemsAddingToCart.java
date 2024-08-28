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

public class MultipleItemsAddingToCart {

	public static void main(String[] args) {
		

		String[] vegNeeded = { "Carrot", "Cauliflower", "Beetroot", "Tomato", "Potato" };

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		itemsNeeded(driver,vegNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.cssSelector(".action-block button")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		String promoInfo = driver.findElement(By.cssSelector(".promoInfo")).getText();
		Assert.assertEquals(promoInfo, "Code applied ..!");
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement staticDropDown = driver.findElement(By.xpath("//div/select"));
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByVisibleText("Australia");
		String countrySelected = dropDown.getFirstSelectedOption().getText();
		Assert.assertEquals(countrySelected, "Australia");
		driver.findElement(By.cssSelector(".chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		

	}

	public static void itemsNeeded(WebDriver driver, String[] vegNeeded) {

		int j = 0;
		int m = 1;
		List<WebElement> vegetables = driver.findElements(By.cssSelector(".products h4"));
		for (int i = 0; i < vegetables.size(); i++) {
			String actualVegetable = vegetables.get(i).getText().split("-")[0].trim();

			// Brocolli - 1 Kg

			List<String> vegetableList = Arrays.asList(vegNeeded);

			if (vegetableList.contains(actualVegetable)) {
				j++;
				while (m < 2) {
					driver.findElements(By.cssSelector(".increment")).get(i).click();
					m++;
				}
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
			}

			if (j == vegNeeded.length) {
				break;
			}
		}

	}

}

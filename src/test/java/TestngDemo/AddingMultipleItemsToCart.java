package TestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddingMultipleItemsToCart {

	String [] vegetableList = {"Brocolli","Beans","Capsicum","Onion","Mango"};
	@Test
	public void addItems() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> items = driver.findElements(By.cssSelector(".product h4"));
		for(int i = 0; i < items.size() ; i++)
		{
			//Carrot - 1 Kg
			String actualVegetableName = items.get(i).getText().split("-")[0].trim();
			
			List<String> neededVegetables = Arrays.asList(vegetableList);
			int j = 0;
			if(neededVegetables.contains(actualVegetableName))
			
			{
				j++;
				driver.findElements(By.cssSelector(".product-action button")).get(i).click();
			}
			
			if(j == vegetableList.length)
			{
				break;
			}
		}
		
		    driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
			driver.findElement(By.cssSelector(".action-block button")).click();
			
			driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
			
			driver.findElement(By.cssSelector(".promoBtn")).click();
			
			String promoInfor = driver.findElement(By.cssSelector(".promoInfo")).getText();
			
			Assert.assertEquals(promoInfor,"Code applied ..!");
			
			driver.findElement(By.xpath("//button[text()='Place Order']")).click();
			
			Select dropDown = new Select(driver.findElement(By.tagName("select")));
			
			dropDown.selectByVisibleText("Australia");
			
			String option = dropDown.getFirstSelectedOption().getText();
			
			Assert.assertEquals(option, "Australia");
			
			driver.findElement(By.cssSelector(".chkAgree")).click();
			
			driver.findElement(By.xpath("//button[text()='Proceed']")).click();
			
			driver.close();
			
			
			
			
		}
		
		
		
		
	}
	


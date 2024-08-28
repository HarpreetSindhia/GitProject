package TestngDemo;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleItemsToCart_Streams {
	
	String [] myVegetables = {"Brocolli","Carrot","Beans","Capsicum","Tomato"};
	
	@Test
	public void addingItems() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> items = driver.findElements(By.cssSelector(".product h4"));
		List<String> vegetableList = Arrays.asList(myVegetables);
		items.stream().filter(a -> vegetableList.contains(a.getText().split("-")[0].trim())).forEach(a -> a.findElement(By.xpath("following-sibling::div/button")).click());
			
			
			
			
			
	}	
		
	}



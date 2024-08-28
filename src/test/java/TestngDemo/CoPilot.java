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
public class CoPilot {
	
	

	    String[] myVegetables = {"Brocolli", "Carrot", "Beans", "Capsicum", "Tomato"};

	    @Test
	    public void addingItems() {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	        List<WebElement> items = driver.findElements(By.cssSelector(".product h4"));
	        List<String> actualVegetable = items.stream()
	                .map(m -> m.getText().split("-")[0].trim())
	                .collect(Collectors.toList());

	        System.out.println(actualVegetable);

	        List<String> vegetableList = Arrays.asList(myVegetables);

	        // Filter the items that are in the vegetable list and click the corresponding "Add to Cart" button
	        items.stream()
	                .filter(item -> vegetableList.contains(item.getText().split("-")[0].trim()))
	                .forEach(item -> item.findElement(By.xpath("following-sibling::div/button")).click());

	        //driver.quit();
	    }
	}



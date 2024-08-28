package MultipleItems_Streams;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddMultipleItems_UsingStreams {
	
	//Brocolli - 1 Kg
	@Test
	public void submitCart()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> groceryItems = driver.findElements(By.cssSelector(".product"));
		List<String> targetProducts = Arrays.asList("Brocolli","Carrot","Corn","Grapes","Raspberry","Strawberry","Cashews");
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		//Loop through the targetProducts and add them to the cart
		targetProducts.forEach(targetProduct -> {
			
			WebElement product = groceryItems.stream().filter(w -> w.findElement(By.tagName("h4")).getText().split("-")[0].trim().equals(targetProduct))
			.findFirst().orElse(null);
			
			if(product != null)
			{
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-action button")));
				product.findElement(By.cssSelector(".product-action button")).click();
				
			}
			
		});
		
	}

}

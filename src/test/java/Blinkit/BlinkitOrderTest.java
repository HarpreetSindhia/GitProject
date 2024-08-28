package Blinkit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlinkitOrderTest {
	
	@Test
	public void submitBlinkitOrder()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.blinkit.com/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("input[class*='LocationSearchBox']"))).click().sendKeys("Amritsar").keyDown(Keys.CONTROL).click().keyDown(Keys.ENTER)
		.build().perform();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[class*='LocationListContainer']")));
		List<WebElement> location = driver.findElements(By.cssSelector("div[class*='LocationListContainer']"));
		for(WebElement actualLocation : location)
		{
			if(actualLocation.findElement(By.tagName("div")).getText().contains("Amritsar"))
			{
				actualLocation.click();
				break;
			}
		}
		
		
	}

}

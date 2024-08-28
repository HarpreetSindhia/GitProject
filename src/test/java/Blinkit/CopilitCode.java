package Blinkit;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopilitCode {
	
	    @Test
	    public void submitBlinkitOrder() {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("disable-notifications");
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://www.blinkit.com/");

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class*='LocationSearchBox']")));
	        searchBox.click();
	        searchBox.sendKeys("amrit");

	        List<WebElement> location = driver.findElements(By.cssSelector("div[class*='LocationListContainer']"));
	        System.out.println("Locations found: " + location.size());
	    }
	}




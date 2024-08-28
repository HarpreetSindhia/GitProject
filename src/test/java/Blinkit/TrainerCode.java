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
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainerCode {
	
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



	        // Locate the location input box

	        WebElement locationInput = driver.findElement(By.cssSelector("input[class*='LocationSearchBox']"));



	        // Use Actions to interact with the input box

	        Actions actions = new Actions(driver);

	        actions.moveToElement(locationInput).click().sendKeys("Amritsar").pause(Duration.ofMillis(500))

	               .sendKeys(Keys.ARROW_DOWN).pause(Duration.ofMillis(500)) // Simulate pressing the down arrow

	               .sendKeys(Keys.ENTER)  // Select the first suggestion

	               .build().perform();



	        // Wait for the dropdown to appear

	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='LocationListContainer']")));



	        // Retrieve the list of locations from the dropdown

	        List<WebElement> locationList = driver.findElements(By.cssSelector("div[class*='LocationListContainer'] div"));



	        for (WebElement actualLocation : locationList) {

	            if (actualLocation.getText().contains("Amritsar")) {

	                actualLocation.click();

	                break;

	            }

	        }

	       

	        // Additional steps if needed, e.g., asserting the selected location

	        WebElement selectedLocation = driver.findElement(By.cssSelector("selector-for-selected-location"));

	        Assert.assertTrue(selectedLocation.getText().contains("Amritsar"));

	    }

	}



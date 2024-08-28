package LocatorsPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganicHarvest_Practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.organicharvest.in/");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector(".ui-autocomplete-input"))).click().keyDown(Keys.SHIFT)
				.sendKeys("serum").build().perform();
		actions.moveToElement(driver.findElement(By.cssSelector(".overflow-scroll a:nth-child(5) li"))).click().build()
				.perform();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowID = windowHandles.iterator();
		while (windowID.hasNext()) {
			driver.switchTo().window(windowID.next());

			
		}	
		// actions.moveToElement(driver.findElement(By.cssSelector(".w-screen div
		// div:nth-child(2) button"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.cssSelector(".pl-6 div:nth-child(6) button"))).click().build()
				.perform();
		// actions.moveToElement(driver.findElement(By.xpath("//button[text()='checkout']"))).click().build().perform();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,2000)", "");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(".right-modal section div:nth-child(3) button:nth-child(3)")));
		actions.moveToElement(
				driver.findElement(By.cssSelector(".right-modal section div:nth-child(3) button:nth-child(3)"))).click()
				.build().perform();
		// driver.switchTo().window(windowID.next());

		actions.moveToElement(driver.findElement(By.xpath("//button[text()='PROCEED TO PAYMENT']"))).click().build()
				.perform();

		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='GTM']")));

		// driver.switchTo().window(windowID.next());

		/*wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".shadow-lg div form div div:nth-child(3) input[aria-label='mobile']")));
		WebElement mobileInputField1 = driver.findElement(By.cssSelector(".shadow-lg div form div div:nth-child(3) input[aria-label='mobile']"));*/
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='SIGN IN']")));
		
		//WebElement mobileField = driver.findElement(By.xpath("//button[text()='SIGN IN']"));
		
		WebElement mobileTextBox = driver.findElement(By.cssSelector("input[autocomplete='tel']"));
		
		mobileTextBox.clear();
		
		executor.executeScript("arguments[0].value='9876486932'",mobileTextBox);
		
		
		driver.findElement(By.cssSelector(".mt-10")).click();
		
		
		
		//mobileField.clear();
		
		
		//mobileInputField1.sendKeys("9876486932");
		
		//executor.executeScript("arguments[0].value='1234567890'",mobileField);

		/*
		 * WebElement mobileInputField = driver.findElement(By.
		 * cssSelector(".shadow-lg div form div div:nth-child(3) input[aria-label='mobile']"
		 * ));
		 * 
		 * mobileInputField.clear();
		 * 
		 * mobileInputField.sendKeys("1234567890");
		 * 
		 * Using JavaScript to Set the Value
		 * 
		 * WebElement mobileInputField = driver.findElement(By.
		 * cssSelector(".shadow-lg div form div div:nth-child(3) input[aria-label='mobile']"
		 * ));
		 * 
		 * JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		 * 
		 * jsExecutor.executeScript("arguments[0].value='1234567890';",
		 * mobileInputField);
		 * 
		 * 
		 */

	

}
}

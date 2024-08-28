package LocatorsPractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClass_MouseHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("headphones")
		.doubleClick().build().perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".left-pane-results-container div:nth-child(4) div:nth-child(1) div[aria-label='headphones bluetooth']")));
		//actions.moveToElement(driver.findElement(By.cssSelector("div[class='left-pane-results-container'] div:nth-child(5) div:nth-child(2)"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.cssSelector(".left-pane-results-container div:nth-child(4) div:nth-child(1) div[aria-label='headphones bluetooth']"))).click().build().perform();
		//actions.moveToElement(driver.findElement(By.xpath("//div[@class='s-suggestion-container'] //div[@aria-label='headphones bluetooth']"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.id("a-autoid-1-announce"))).click().build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//span[@class='a-button-inner'] //a[@class='a-button-text']"))).click().build().perform();
		//actions.moveToElement(driver.findElement(By.xpath("//span[@class='a-button-inner'] //input[@name='proceedToRetailCheckout']"))).click().build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowID = windows.iterator();
		while(windowID.hasNext())
		{
			String parentID = windowID.next();
			String childID = windowID.next();
			//String newChildID = windowID.next();
		
		driver.switchTo().window(childID);
	
		
		actions.moveToElement(driver.findElement(By.cssSelector(".a-button-input"))).click().build().perform();
		driver.switchTo().window(parentID);
		JavascriptExecutor executor = 	(JavascriptExecutor)driver;
		executor.executeScript("window.scrollBy(0,-200)");
		actions.moveToElement(driver.findElement(By.cssSelector("div[id='nav-tools'] a:nth-child(2)"))).build().perform();
		
		//actions.moveToElement(driver.findElement(By.id("ap_email"))).sendKeys("harpreetsindhia999@gmail.com").build().perform();
	}

}
}
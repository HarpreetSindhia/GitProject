package InvokingMultipleWindows;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokingandHandlingMultipleWindows_Practice {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> windowID = windowHandles.iterator();
		String parentID = windowID.next();
		String childID = windowID.next();
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.xpath("//div[@class='lower-content']/div/h2/a")).get(0).getText();
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys(courseName);
		
		WebElement name = driver.findElement(By.xpath("//form/div[1]/input"));
		
	File file = 	name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File ("harry.png"));
		
		System.out.println(name.getRect().getDimension().getHeight());
		
		System.out.println(name.getRect().getDimension().getWidth());
		
	}

}

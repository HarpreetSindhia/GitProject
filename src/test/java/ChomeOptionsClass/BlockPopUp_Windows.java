package ChomeOptionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockPopUp_Windows {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://theindusvalley.in/");
		driver.switchTo().frame(driver.findElement(By.id("nitrotemplate-id")));
		driver.findElement(By.cssSelector(".close-button")).click();
		driver.switchTo().defaultContent();
		
		//driver.get("https://www.myborosil.com/");
		
		
		
		
		
		
		
		
		
	}

}

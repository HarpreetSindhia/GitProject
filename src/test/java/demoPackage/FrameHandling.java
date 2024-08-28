package demoPackage;


	import java.time.Duration;
	 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	 
	public class FrameHandling {
	 
		public static void main(String[] args) {
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-notifications");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
			driver.get("https://www.mycarmesi.com/");
			driver.switchTo().frame(driver.findElement(By.cssSelector("#cntl-placeholder-form-fixed-item iframe")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".close_icon svg path")));
			driver.findElement(By.cssSelector(".close_icon svg path")).click();
			driver.switchTo().defaultContent();
				
		}
	

}

package RevisionSelenium.RevisionSeleniumTime;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {
	
	public static void main(String[] args) {
		
		String url = "/p/postman-tutorial";
		
		String myCourse = "Learn Postman for API Automation Testing with Javascript";
		
		String newCourse = "Boost your career with UNLIMITED ACCESS to ALL existing and future courses";
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com");
		
		driver.getTitle();
		
		driver.getCurrentUrl();

	    driver.getPageSource();
		
		driver.findElement(By.linkText("Courses")).click();
		
		JavascriptExecutor script = (JavascriptExecutor)driver;
		
		script.executeScript("window.scrollBy(0,200)");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		
		driver.findElement(By.cssSelector("div[data-course-url='/p/postman-tutorial']")).click();
		
		//driver.findElement(By.cssSelector("#enroll-button-top")).click();
		
		JavascriptExecutor script1 = (JavascriptExecutor)driver;
		
		script1.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.xpath("//div[@class='row']/div[2]/a[2]")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Enroll in Course']")));
		
		//driver.findElement(By.xpath("//button[text()='Enroll in Course']")).click();
		
		//driver.findElement(By.cssSelector("#enroll-button")).click();
		
		driver.findElement(By.name("commit")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	

}

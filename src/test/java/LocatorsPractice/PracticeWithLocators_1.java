package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PracticeWithLocators_1 {
	
	public static void main(String[] args) {
		
		String name = "Harpreet Sindhia";
		
		//Invoke the browser 
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Invoking the method
		String myPassword = getPassword(driver);
		//Hit the URL 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Apply some Implicit wait -> global wait to used to make objects show up on the screen.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("harrysindhia");
		driver.findElement(By.cssSelector("input[value='rmbrUsername']")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector(".submit")).click();
		String errorMessage = driver.findElement(By.cssSelector(".error")).getText();
		Assert.assertEquals(errorMessage, "* Incorrect username or password");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("harpreetsindhia999@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876486856");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String infoMessage = driver.findElement(By.cssSelector(".infoMsg")).getText();
		Assert.assertEquals(infoMessage, "Please use temporary password 'rahulshettyacademy' to Login.");
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(myPassword);
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(7));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']")));
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		String loginMessage = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		Assert.assertEquals(loginMessage, "You are successfully logged in.");
		String loginUser = driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText();
		Assert.assertEquals(loginUser, "Hello " + name + ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		
	}
	
	public static String getPassword(WebDriver driver) {
		
		//"Please use temporary password 'rahulshettyacademy' to Login."
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".reset-pwd-btn")));
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String infoMessage = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String [] password = infoMessage.split("'");
		String [] newPassword = password[1].split("'");
		String revisedPassword = newPassword[0];
		return revisedPassword;
		
		
		
		
	}

}

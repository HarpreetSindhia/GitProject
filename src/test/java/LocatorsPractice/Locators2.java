package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		
		String name = "Harpreet Sindhia";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String loginPassword = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(loginPassword);
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#chkboxOne")));
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("#chkboxTwo")).click();
		driver.findElement(By.cssSelector(".submit")).click();
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
package LocatorsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice_3SiblingsTraverse {
	
	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String firstButton = driver.findElement(By.xpath("//button[text()='Practice']/following-sibling::button[1]")).getText();
		System.out.println(firstButton);
		
		
		//Parent to Child Traversal
		
		String parentToChild = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(parentToChild);
		
		String childToParentToChild = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/div/button[3]")).getText();
		System.out.println(childToParentToChild);
		
	}

}

package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.name("Username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
	}
	

}

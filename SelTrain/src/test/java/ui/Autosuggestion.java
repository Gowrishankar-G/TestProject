package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div/textarea[@class='gLFyf']")).click();
	//	driver.findElement(By.xpath("//div/textarea[@class='gLFyf']")).sendKeys("studycafe");
		driver.findElement(By.xpath("//div/textarea[@class='gLFyf']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div/textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
		
		
		

	}

}

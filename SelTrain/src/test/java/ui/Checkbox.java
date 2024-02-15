package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("doi")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@type='checkbox']")).getSize();

		
		
		

	}

}

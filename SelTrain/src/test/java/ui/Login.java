package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "D:\\Browser\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		
	    driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//td/input[@id='gh-btn']")).click();
		driver.close();
		//driver.get("https://pages.ebay.in/photocenter/");
		
	}

}

package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucelogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		//div//input[@id='user-name']
		driver.findElement(By.xpath("//div//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//div//input[@id='login-button']")).click();
        driver.close();
	}

}

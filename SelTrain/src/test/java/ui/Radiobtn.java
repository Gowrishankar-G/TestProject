package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		
		WebElement radio2 = driver.findElement(By.xpath("//div/input[@id='bookFlights']"));
		Thread.sleep(2000);
		radio2.click();
		System.out.println(radio2.isSelected());
	

		
		
		

	}

}

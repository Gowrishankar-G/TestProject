package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Printlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		System.out.println("total tags are :" +alltags.size());
		
		for (int i=0;i<alltags.size();i++)
		{
			System.out.println("links on page are " +alltags.get(i).getAttribute("href"));
			System.out.println("links on page are " +alltags.get(i).getText());
			
		}
		
		

	}

}

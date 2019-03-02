package Two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		// to provide month and date eg April 14
				driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		// while will only work when the condition is true
		// here we have put a negation !
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		//grab the common attribute
		List<WebElement> dates = driver.findElements(By.className("day"));
		//get size
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i<count; i++)
		{
			String txt= driver.findElements(By.className("day")).get(i).getText();
			if (txt.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		

	}

}

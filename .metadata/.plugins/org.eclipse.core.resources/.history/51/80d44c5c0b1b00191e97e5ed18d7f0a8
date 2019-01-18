package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oneStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("https://jetwaste.com/");
		a.findElement(By.cssSelector("[id='menu-item-348']")).click();
		a.findElement(By.cssSelector("[id='menu-item-172']")).click();
		Select s = new Select(a.findElement(By.cssSelector("[id='input_1_24']")));
		s.selectByValue("Roll-Off");
		s.selectByIndex(5);
		s.selectByVisibleText("Front Load Compactor");
		Thread.sleep(2000L);// to keep wait synchronization in the code
		a.close();
		

		
		
	}

}

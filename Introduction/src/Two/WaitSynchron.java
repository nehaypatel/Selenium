package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WaitSynchron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.alaskaair.com/hotels/mp/home/en/?t=1547938691859&utm_source=alaska&utm_medium=partner-page&utm_campaign=alaska-homepage-bookingformlet-hotelstab-Q12019-home-tr");
		driver.findElement(By.xpath("//input[@placeholder='Where do you need a hotel?']")).sendKeys("IAH");
		

	}

}

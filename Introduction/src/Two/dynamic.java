package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
WebDriver n = new ChromeDriver();
n.get("https://www.spicejet.com/");
n.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
n.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1']/option[3]")).click();
//n.findElement(By.xpath("//table[@id='citydropdown']//div[@id='dropdownGroup1']//a[@value='AMD']")).click();
n.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
n.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1']/option[3]")).click();
	}

}

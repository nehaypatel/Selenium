package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver b = new FirefoxDriver();
		b.get("https://www.expedia.com/");
		b.findElement(By.id("primary-header-flight")).click();
		b.findElement(By.id("traveler-selector-flp")).click();
		for (int i=1; i<3; i++)
		{
			b.findElement(By.xpath("//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[4]/button")).click();
		}
		/*b.findElement(By.xpath("//div[class='menu sticky gcw-menu']/footer/div/div[2]/button")).click();
		System.out.println(b.findElement(By.id("primary-header-flight")).getText());

		int i=1;
		while(i<6) 
			{
			
		b.findElement(By.xpath("//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[4]/button")).click();
		i++;
			}*/
	
	}

}
package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoopsAutoSuggest {

	public static void main(String[] args) throws InterruptedException  {
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
		b.findElement(By.xpath("//footer[@class='menu-footer']/div/div[2]/button")).click();
		
		System.out.println(b.findElement(By.xpath("//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']/span/span[4]")).getText());
		
		/*
		int i=1;
		while(i<6) 
			{
			
		b.findElement(By.xpath("//div[@class='uitk-grid step-input-outside gcw-component gcw-component-step-input gcw-step-input gcw-component-initialized']/div[4]/button")).click();
		i++;
			}*/
		WebElement origin= b.findElement(By.id("flight-origin-flp"));
		origin.clear();
		origin.sendKeys("orl");
		Thread.sleep(2000);
		for (int c=1; c<5; c++) 
		{
		origin.sendKeys(Keys.ARROW_DOWN);
		}
		origin.sendKeys(Keys.ENTER);
		
		WebElement desti = b.findElement(By.id("flight-destination-flp"));
		desti.clear();
		desti.sendKeys("IAH");
		Thread.sleep(2000);
		desti.sendKeys(Keys.ENTER);
	
		
	}

}

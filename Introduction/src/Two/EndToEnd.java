package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flyfrontier.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.findElement(By.id("rbroundtrip")).getAttribute("checked"));
		//System.out.println(driver.findElement(By.id("departureDate")).isEnabled());
		
		Assert.assertEquals(driver.findElement(By.id("rbroundtrip")).getAttribute("checked"), "true");
		Assert.assertFalse(driver.findElement(By.id("departureDate")).isEnabled(), "false");
		Assert.assertFalse(driver.findElement(By.id("returnDate")).isEnabled(), "false");
		driver.findElement(By.id("rboneway")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("kendoDepartFrom_input")).click();
		Thread.sleep(2000);
		
		WebElement dd =	driver.findElement(By.xpath("//ul[@id='kendoDepartFrom_listbox']/li[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", dd);
		driver.findElement(By.id("kendoArrivalTo_input")).sendKeys("IAH");
		Thread.sleep(1000);
		driver.findElement(By.id("kendoArrivalTo_input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#departureDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		Thread.sleep(500);
		//driver.findElement(By.cssSelector("div[class=divPassengers]+div+span+span")).click();
		

	}

}

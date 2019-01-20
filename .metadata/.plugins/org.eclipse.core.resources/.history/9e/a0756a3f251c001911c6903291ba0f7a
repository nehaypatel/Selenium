package Two;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");

Map<String, Object> p = new HashMap<String, Object>();
p.put("profile.default_content_setting_values.notifications", 2);
ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", p);
WebDriver driver = new ChromeDriver(options);

driver.get("https://www.cleartrip.com/");
driver.manage().window().maximize();

Assert.assertTrue(driver.findElement(By.id("OneWay")).isSelected());

WebElement a = driver.findElement(By.id("Adults"));
Select adult = new Select(a);
adult.selectByIndex(0);


Select child = new Select(driver.findElement(By.id("Childrens")));
child.selectByValue("1");

Select infant = new Select(driver.findElement(By.id("Infants")));
infant.selectByValue("1");

driver.findElement(By.cssSelector("#MoreOptionsLink")).click();

Select x = new Select(driver.findElement(By.cssSelector("#Class")));
x.selectByVisibleText("Premium Economy");

driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("United");

driver.findElement(By.cssSelector("#DepartDate")).click();
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
driver.findElement(By.cssSelector("#SearchBtn")).click();
System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}



//driver.switchTo().alert().;
//System.out.println(driver.switchTo().alert().getText());
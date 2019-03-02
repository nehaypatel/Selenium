package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//Select a checkbox
		driver.findElement(By.id("checkBoxOption3")).click();
		// store the value field 
		String sel = driver.findElement(By.id("checkBoxOption3")).getAttribute("value");
		//create a webelement 
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		//select the value in dropdown same as value captured 
		Select opt = new Select(drop);
		opt.selectByValue(sel);
		// insert same value in textfield
		driver.findElement(By.id("name")).sendKeys(sel);
		driver.findElement(By.id("alertbtn")).click();
		//get the text on alert box
		String sel1 = driver.switchTo().alert().getText();
		// show if the value has passed correctly into the alert
		if (sel1.contains(sel))
		{
			System.out.println(sel1);
		}
		else
		{
			System.out.println("Failed");
			
		}
		Thread.sleep(2000L);
		driver.switchTo().alert().accept();

	}

}

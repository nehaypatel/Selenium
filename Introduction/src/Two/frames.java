package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://jqueryui.com/droppable/");
System.out.println(driver.findElements(By.tagName("iframe")).size());// to check the no of tags
driver.switchTo().frame(0);// to get the first index
//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
//driver.findElement(By.id("draggable")).click();
Actions a = new Actions(driver);
WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));
a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();// make sure to make code go back to default once you have worked towards frames
	}

}

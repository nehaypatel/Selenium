import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectors {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\geckodriver.exe");
	
WebDriver n = new FirefoxDriver();
n.get("https://login.salesforce.com/");
n.findElement(By.cssSelector("[id='username']")).sendKeys("nehaypatel@gmail.com");
n.findElement(By.cssSelector("#password")).sendKeys("Ganpat1bappa");
n.findElement(By.cssSelector(".button.r4.wide.primary")).click();

	}

}

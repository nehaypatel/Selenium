import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoMSEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver",  "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("www.cnn.com");
System.out.println(driver.getTitle());
	}

}

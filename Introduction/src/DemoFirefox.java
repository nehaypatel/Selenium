import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoFirefox {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\geckodriver.exe");
			WebDriver b = new FirefoxDriver();
			b.get("https://www.bing.com/");
			b.findElement(By.className("b_searchbox")).sendKeys("how to be a hero?");
			b.findElement(By.className("b_searchboxSubmit")).click();
			b.findElement(By.id("rh_meter")).click();
			System.out.println(b.getTitle());
			

		}

	

}

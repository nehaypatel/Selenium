import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.facebook.com/"); //url
		b.findElement(By.id("email")).sendKeys("test-test");
		//b.findElement(By.name("pass")).sendKeys("test123");
		b.findElement(By.cssSelector("#pass")).sendKeys("test123");
		b.findElement(By.linkText("Forgot account?")).click();
		b.findElement(By.xpath("//*[@id=\'identify_email\']")).sendKeys("test");
		System.out.println(b.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[1]/div/div[2]/h2")).getText());
		b.findElement(By.xpath("//input[@id='email']")).sendKeys("voila!");
		
		

	}

}

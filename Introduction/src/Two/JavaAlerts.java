package Two;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.tizag.com/javascriptT/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Javascript - Alert")).click();
	driver.findElement(By.cssSelector("[value='Confirmation Alert']")).click();
	System.out.println(	driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	//to cancel 	driver.switchTo().alert().dismiss();
//send text on the textbox of alert  	driver.switchTo().alert().sendKeys("test");

	}

}
package Two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver x = new FirefoxDriver();
		x.manage().window().maximize();
		x.get("https://www.keynotesupport.com/websites/contact-form-example-radio-buttons.shtml");
		x.findElement(By.xpath("//input[@value='Excel']")).click();
//System.out.println(x.findElements(By.xpath("//input[@name='software']")).size());
		int count = x.findElements(By.xpath("//input[@name='software']")).size();

		for (int i = 0; i < count; i++) {
			String text = x.findElements(By.xpath("//input[@name='software']")).get(i).getAttribute("value");

			if (text.equals("Adobe Photoshop")) {
				x.findElements(By.xpath("/input[@name='software']")).get(i).click();
			}

		}

	}
}
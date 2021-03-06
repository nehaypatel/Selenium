package Two;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://accounts.google.com/signup");
		System.out.println(b.getTitle());
		b.manage().window().maximize();
		b.findElement(By.xpath("//div[@id='initialView']/footer/ul/li/a")).click();
		Set<String> ids=b.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid= it.next();
		b.switchTo().window(childid);
		System.out.println("We are on child tab now: ");
		System.out.println(b.getTitle());
		b.switchTo().window(parentid);
		System.out.println("Going back to first window: ");
		System.out.println(b.getTitle());
		

	}

}

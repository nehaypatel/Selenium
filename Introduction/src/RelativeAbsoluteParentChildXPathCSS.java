import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAbsoluteParentChildXPathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		a.get("http://www.qaclickacademy.com/");
		a.findElement(By.xpath("//nav[@class='navbar-collapse collapse']/ul/li[4]/a")).click();// this is an absolute xpath
		a.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();// this is relative path
		a.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();// following Sibling using xpath
	a.findElement(By.cssSelector("li[id=tablist1-tab2]+li+li")).click(); // following sibling using css selector. in css we cannot give path '/' THE CSS is breaking when we put [2] in the code
	//a.findElement(By.xpath("//*[@id='tablist1-tab1']parent::ul")).click();// going back to parent using child
	a.findElement(By.xpath("//*[@id='tablist1-tab3']/preceding-sibling::li[1]")).click(); // to go to the previous sibling
	a.findElement(By.xpath("//*[text()=' Appium ']")).click();// using text attribute

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://www.facebook.com/"); //url
		b.findElement(By.xpath("//input[@id='email']")).sendKeys("TRYtry");//Xpath
		b.findElement(By.cssSelector("input[type='password']")).sendKeys("lovelove");//Css
		b.findElement(By.cssSelector("[value='Log In'")).click();// css with no tag name
		b.findElement(By.cssSelector("input#email")).clear();
		b.findElement(By.cssSelector("input#email")).sendKeys("Neha"); // css with tagname#id
		//b.findElement(By.xpath("//i[@contains(@class,'fb_logo')]")).click(); // REGULAR EXPRESSION SYNTAX using xpath
		b.findElement(By.cssSelector("i[class*='fb_logo']")).click(); // REGULAR EXPRESSION SYNTAX using css
		b.findElement(By.xpath("//td[@class='login_form_label_field']/div/a")).click(); //xpath with parent-child when no unique identifiers
		//b.findElement(By.xpath("id('globalContainer')/div/div/div/a")
		

	}

}

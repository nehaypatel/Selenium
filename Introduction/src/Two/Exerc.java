package Two;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Exerc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Data\\Cloud\\OneDrive - hk sar baomin inc\\Selenium\\Drivers\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();

   

        driver.get("http://qaclickacademy.com/practice.php");

      //Clicking on Checkbox

        driver.findElement(By.id("checkBoxOption2")).click();

        //Grabbing the Value

        String cbValue=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");

        //Implemeting Select Class

        Select s = new Select (driver.findElement(By.id("dropdown-class-example")));

        // Selecting Value from dropdown

        s.selectByValue(cbValue);

        //Entering the value to text box

        driver.findElement(By.id("name")).sendKeys(cbValue);

        //Clicking on Alert

        driver.findElement(By.id("alertbtn")).click();

        //Verification

        String alertMsg=driver.switchTo().alert().getText();

        Assert.assertTrue(alertMsg.contains(cbValue));
        

}

       

       

     //  System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   
	                   
	}



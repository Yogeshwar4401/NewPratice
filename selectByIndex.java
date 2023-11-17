package selectClass1;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");
       WebElement month = driver.findElement(By.id("month"));
       
       Select s = new Select(month);
    //   s.selectByIndex(5);
      for (int i = 0; i <=11; i++) {
    	  s.selectByIndex(i);
	}
       
       
         

	}

}

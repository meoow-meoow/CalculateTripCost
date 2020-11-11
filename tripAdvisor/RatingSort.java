package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RatingSort {
	public static void high(WebDriver driver) throws Exception{
		//switching control to newly opened tab
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		driver.findElement(By.xpath(prop.getProperty("drop"))).click(); //click on drop-down
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.xpath(prop.getProperty("category"))).click(); //select to sort by traveller rating
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
	}
}

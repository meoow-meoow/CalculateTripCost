package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CruiseLine {
	public static void fromDropDown(WebDriver driver) throws Exception{
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		Actions actions = new Actions(driver); //create actions class object
		WebElement cruiseLineclick = driver.findElement(By.xpath(prop.getProperty("cruiseLine")));	//click on cruise line 
		actions.moveToElement(cruiseLineclick).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e5) { //wait for synchronization
			
			e5.printStackTrace();
		}
		cruiseLineclick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e5) { //wait for synchronization
			
			e5.printStackTrace();
		}
		WebElement cruiseKaneda = driver.findElement(By.xpath(prop.getProperty("cruiseCanada"))); //select cruise line from drop-down
		actions.moveToElement(cruiseKaneda).perform(); //move mouse pointer to target
		cruiseKaneda.click(); //click  on selected cruise line
		
		
		
	}

}

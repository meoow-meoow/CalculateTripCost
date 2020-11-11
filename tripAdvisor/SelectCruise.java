package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectCruise {
	public static void fromNavBar(WebDriver driver) throws Exception{
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		Actions actions = new Actions(driver);
		WebElement cruiseSelect = driver.findElement(By.xpath(prop.getProperty("cruise"))); //select cruises from nav-bar
		actions.moveToElement(cruiseSelect).perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e5) { //wait for synchronization
			
			e5.printStackTrace();
		}
		cruiseSelect.click(); //click on cruises
	}

}

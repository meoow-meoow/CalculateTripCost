package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchCruise {
	public static void fromDropDown1(WebDriver driver) throws Exception{
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		Actions actions = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		actions.moveToElement(search).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e5) {
			
			e5.printStackTrace();search.click(); //wait for synchronization
		}
		search.click();
	}
}

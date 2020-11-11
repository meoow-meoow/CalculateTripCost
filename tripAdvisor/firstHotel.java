package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class firstHotel {
	public static void fromList1(WebDriver driver) throws Exception{
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		JavascriptExecutor js = (JavascriptExecutor) driver; //to execute javascript
		String display1= driver.findElement(By.xpath(prop.getProperty("hotelOneName"))).getText(); //get hotel name
		System.out.println(display1); //display the name
		String display2= driver.findElement(By.xpath(prop.getProperty("hotelOneDay"))).getText(); //get per night cost
		System.out.println(display2+" / night"); //display per night cost
		String display3= driver.findElement(By.xpath(prop.getProperty("hotelOne"))).getText(); //get total cost
		System.out.println(display3); //display total cost
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e5) { //wait for synchronization
			
			e5.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,350)", ""); //scroll down
		Thread.sleep(1000); //wait for 1000 ms
	}

}
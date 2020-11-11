package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secondHotel {
	public static void fromList2(WebDriver driver) throws Exception{
		//switching control to newly opened tab
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		//get and display second hotel name, per night cost and total cost
		String display1= driver.findElement(By.xpath(prop.getProperty("hotelTwoName"))).getText();
		System.out.println(display1);
		String display2= driver.findElement(By.xpath(prop.getProperty("hotelTwoDay"))).getText();
		System.out.println(display2+" / night");
		String display3= driver.findElement(By.xpath(prop.getProperty("hotelTwo"))).getText();
		System.out.println(display3);
	}
}

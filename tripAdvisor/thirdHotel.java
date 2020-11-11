package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class thirdHotel {
	public static void fromList3(WebDriver driver) throws Exception{
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		//get and display third hotel name, per night cost and total cost
		String display1= driver.findElement(By.xpath(prop.getProperty("hotelThreeName"))).getText();
		System.out.println(display1);
		String display2= driver.findElement(By.xpath(prop.getProperty("hotelThreeDay"))).getText();
		System.out.println(display2+" / night");
		String display3= driver.findElement(By.xpath(prop.getProperty("hotelThree"))).getText();
		System.out.println(display3);
	}
}


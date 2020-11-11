package tripAdvisor;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoOfGuests {
	public static void Add(WebDriver driver)throws Exception {
		//create property file object and import file
		Properties prop =new Properties();
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties");
		prop.load(input);
		driver.findElement(By.xpath(prop.getProperty("Members"))).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		Thread.sleep(2000);
		//driver.findElement(By.xpath(prop.getProperty("Add"))).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body.rebrand_2017.js_logging.desktop_web.VacationRentals.cx_brand_refresh_phase2.brand_refresh_bubble_ratings:nth-child(2) div._1HphCM4i:nth-child(331) div.zGG8H0c4 div._3Vh-bNyy div._1laeAPbS:nth-child(2) div._12XIJCe1 div._1h6PBHw9 span:nth-child(3) > span.ui_icon.plus.HxR7KwIa")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.cssSelector("body.rebrand_2017.js_logging.desktop_web.VacationRentals.cx_brand_refresh_phase2.brand_refresh_bubble_ratings:nth-child(2) div._1HphCM4i:nth-child(331) div.zGG8H0c4 div._3Vh-bNyy div._1laeAPbS:nth-child(2) div._12XIJCe1 div._1h6PBHw9 span:nth-child(3) > span.ui_icon.plus.HxR7KwIa")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Implicit wait for synchronization
	}
}

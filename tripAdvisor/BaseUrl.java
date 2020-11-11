package tripAdvisor;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BaseUrl {
	public static void open(WebDriver driver) throws Exception{
		driver.get("https://www.tripadvisor.in/VacationRentals-g3688711-Reviews-Nairobi_Region-Vacation_Rentals.html"); //load url
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit wait for synchronization
		try {
			WebElement take=driver.findElement(By.linkText("Take survey")); //open survey through linkText
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
			take.click(); //click on survey
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
			Set<String> all=driver.getWindowHandles(); //Creates a set and stores all GUID in it
			ArrayList<String> tab=new ArrayList<String>(all); //Creates an array list and stores all GUID in it
			driver.switchTo().window(tab.get(1)); //switching control to newly opened tab
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization

			driver.close(); //close the tab
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
			driver.switchTo().window(tab.get(0)); //back to previous tab
			
		}
		catch(Exception e)
		{
			System.out.println("No Survey"); //display when no survey pops up
			
		}
	}	


}

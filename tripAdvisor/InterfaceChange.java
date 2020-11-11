package tripAdvisor;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InterfaceChange {
	public static void openHome(WebDriver driver) throws Exception
	{
		driver.get("https://www.tripadvisor.in");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		try {
			//survey pop-up handling
			WebElement take=driver.findElement(By.linkText("Take survey"));
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
			take.click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
			Set<String> all=driver.getWindowHandles();
			ArrayList<String> tab=new ArrayList<String>(all);
			driver.switchTo().window(tab.get(1));
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
			driver.close();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
			driver.switchTo().window(tab.get(0));
			
		}
		catch(Exception e)
		{
			System.out.println("No Survey");
		}
	
		try {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.xpath("//body/div[@id='lithium-root']/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click(); //click on holiday home
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		driver.findElement(By.xpath("//body/div[2]/div[1]/form[1]/input[1]")).sendKeys("Nairobi"); //enter input as Nairobi
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		Actions action=new Actions(driver); //create actions class object
		WebElement trgt=driver.findElement(By.xpath("//body/div[2]/div[1]/form[1]/div[1]/a[1]")); //select search
		action.moveToElement(trgt).perform(); //move to target
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		trgt.click(); //click on search button
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		}
		catch(Exception m)
		{
			BaseUrl.open(driver);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //Implicit wait for synchronization
		}
		 
	}

}


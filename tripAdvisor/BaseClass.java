package tripAdvisor;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;	 
public class BaseClass {
	//creating RemoteWebDriver to implement multiple interfaces
	public RemoteWebDriver driver;
	public RemoteWebDriver driver1;
	@Test
	public void CalculateTripCost() throws Throwable {
		
		Properties prop =new Properties(); //object of property file
		InputStream input= new FileInputStream("C:\\Users\\ankit\\Workspace\\CalculateTripCost\\src\\tripAdvisor\\config.properties"); //importing config file
		prop.load(input); //load input file
		RemoteWebDriver driver = null; 
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		
	    	 DesiredCapabilities capabilities= DesiredCapabilities.chrome(); //customize the desired capabilities for the browser
	    	 /* The execution happens on the Selenium Grid with the address mentioned*/
			 driver=new RemoteWebDriver(new URL("http://192.168.0.116:4444/wd/hub"), capabilities); 
			 driver.manage().window().maximize(); // maximizes window
			 driver.manage().deleteAllCookies(); //deletes all the cookies 
		InterfaceChange.openHome(driver); //Open the TripAdvisor interface
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		BaseUrl.open(driver);//open url of the website to be automated
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		SetDate.Date(driver); //set check-in and check-out date
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		NoOfGuests.Add(driver); //add the number of guests
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		RatingSort.high(driver); //sort according to traveller rating
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		LiftAccess.select(driver); //check for lift/elevator access
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization		
		firstHotel.fromList1(driver); //select and display first hotel name, cost per night and total cost
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		secondHotel.fromList2(driver); //select and display second hotel name, cost per night and total cost
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		thirdHotel.fromList3(driver); //select and display third hotel name, cost per night and total costhotel name, cost per night and total cost
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		SelectCruise.fromNavBar(driver); //select cruise
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		CruiseLine.fromDropDown(driver); //select cruise line
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		SearchCruise.fromDropDown1(driver); //select cruise ship and search
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		PassengersNCrew.fromNextTab(driver); //display the no. of passengers and crew
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		LaunchYear.fromNextTab1(driver); //display launch year
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization
		Languages.all(driver); //display all languages
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit wait for synchronization	
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		    	 DesiredCapabilities capabilities1= DesiredCapabilities.firefox();
				driver1=new RemoteWebDriver(new URL("http://192.168.0.116:4444/wd/hub"), capabilities1);
				driver1.manage().window().maximize();	// Maximizes the window
				driver1.manage().deleteAllCookies(); 	// Delete all the cookies
			//InterfaceChange.openHome(driver1);
			//driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			BaseUrl.open(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SetDate.Date(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			NoOfGuests.Add(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			RatingSort.high(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LiftAccess.select(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
			firstHotel.fromList1(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			secondHotel.fromList2(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			thirdHotel.fromList3(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SelectCruise.fromNavBar(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			CruiseLine.fromDropDown(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SearchCruise.fromDropDown1(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PassengersNCrew.fromNextTab(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LaunchYear.fromNextTab1(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Languages.all(driver1);
			driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}	
		
		driver.quit();	

	
		}
	
	}


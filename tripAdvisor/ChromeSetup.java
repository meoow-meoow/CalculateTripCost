package tripAdvisor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//not for RemoteDriver only for WebDriver
public class ChromeSetup {
	public static  WebDriver getChrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ankit\\Workspace\\WelcomeSelenium\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}

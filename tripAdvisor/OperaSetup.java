package tripAdvisor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
//not for RemoteDriver only for WebDriver
public class OperaSetup {
	public static  WebDriver getOpera() {
		System.setProperty("webdriver.opera.driver","C:\\Users\\ankit\\Workspace\\WelcomeSelenium\\operadriver_win64\\operadriver_win64\\operadriver.exe");  
		WebDriver driver = new OperaDriver();
		return driver;
	}

}

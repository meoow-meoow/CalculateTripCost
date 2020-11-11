package tripAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Languages {
	public static void all(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e5) { //wait for synchronization
			
			e5.printStackTrace();
		}
		//code to display all languages
		String display= driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/label[1]")).getText();
		System.out.println("Language: "+display);
		}
}

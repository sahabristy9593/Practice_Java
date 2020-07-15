package DataDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {

	public static WebDriver getDriver(String browser) {
		WebDriver driver=null;
		if(browser.equals("Chrome")) {
			System.setProperty("Webdriver.chrome.driver","");
			driver=new ChromeDriver();
		}else if (browser.equals("IE")) {
			
		}
		return null;
	}

}

package DataDrivenFramework;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ReadExcelTestData {
	
	private WebDriver driver=null;
	
	@Test
	public void test1() {
		try {
			List<Map<String,String>> testDataAllRows= ExeclUtility.getTestDataInMap();
			
			driver=BrowserUtility.getDriver("Chrome");
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(testDataInMap.get(0).get("Keywords"));
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.quit();
			
			System.out.println(getTestDataInMap().get(0).get("user"));
			System.out.println(getTestDataInMap().get(0).get("Password"));
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}

	@Test
	public void test2() {
		try {
			List<Map<String,String>> testDataAllRows= ExeclUtility.getTestDataInMap();
			
			driver=BrowserUtility.getDriver("Chrome");
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(testDataInMap.get(1).get("Keywords"));
			driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			driver.quit();
			
			System.out.println(getTestDataInMap().get(0).get("user"));
			System.out.println(getTestDataInMap().get(0).get("Password"));
			
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		@Test
		public void test7() {
			try {
				List<Map<String,String>> testDataAllRows= ExeclUtility.getTestDataInMap();
				
				driver=BrowserUtility.getDriver("Chrome");
				driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(testDataInMap.get(8).get("Keywords"));
				driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
				Thread.sleep(5000);
				driver.quit();
				
				System.out.println(getTestDataInMap().get(0).get("user"));
				System.out.println(getTestDataInMap().get(0).get("Password"));
				
				}catch(IOException e) {
					e.printStackTrace();
				}
			
		}
		
	}
	}

}

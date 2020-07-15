package DataDrivenFramework;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DataDrivenTesting {
	
	@Test(dataProvider="getTestDataForTest1") 
	public void test1(Map<Object,Object> testData){
		
		WebDriver driver = BrowserUtility.getDriver("Chrome");
		driver.get("https://www.google.com/");
		String searchKeyword=(String)testData.get("Keywords");
		driver.findElement(By.xpath("//*[@title='search']")).sendKeys(searchKeyword);
		driver.findElement(By.xpath("//*[@title='search']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}

	@DataProvider(name="getTestDataForTest1")
	public static Object[][] getTestData(){
		Object[][] objArray = null;
		try{
			List<Map<String,String>> testDataAllRows= ExeclUtility.getTestDataInMap();
		
		objArray = new Object [testDataAllRows.size()][1];
		
		for(int i=0; i< testDataAllRows.size(); i++) {
			objArray[i][0] = testDataAllRows.get(i);
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}

package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.google.common.collect.Table.Cell;

public class ExeclUtility {

	public static List<Map<String, String>> getTestDataInMap() throws IOException {
		List<Map<String, String>> testDataAllRows=null;
		
		Map<String,String> testData = null;
		try {
			FileInputStream fileInputStream=new FileInputStream("");
			Workbook workbook=new XSSFWorkBook(fileInputStream);
			Sheet sheet=workbook.getSheetAt(0);
			
			int lastRowNumber=sheet.getLastRowNum();
			int lastColNumber=sheet.getLastCellNum();
			
			int LastRowNumber = sheet.getLastRowNum();
			int LastColNumber = sheet.getRow(0).getLastCellNum();
			
			List list=new ArrayList();
			for(int i=0; i<=lastColNumber; i++) {
				Row row = sheet.getRow(0);
				Cell cell=row.getCell(i);
				String rowHeader=cell.getStringCellValue().trim();
				list.add(rowHeader);
				
			}
			
			testDataAllRows = new ArrayList<Map<String,String>>();
			for(int j=0; j<=lastRowNumber; j++) {
				Row row = sheet.getRow(j);
				testData= new TreeMap<String,String>(String.CASE_INSENSITIVE_ORDER);
				for(int k=0; k<=lastColNumber; k++) {
					 Cell cell = row.getCell(k);	
					 String colValue = cell.getStringCellValue().trim();
					 testData.put((String) list.get(k), colValue);
			}
				testDataAllRows.add(testData);
			
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}

//	public static List<Map<String, String>> getTestDataInMap() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}

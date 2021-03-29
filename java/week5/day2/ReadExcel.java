package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] excelRead() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRowNum = ws.getLastRowNum();
		int  lastCellNum = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				String value = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
				
			}
		}
		
		wb.close();
		return data;
	}

}

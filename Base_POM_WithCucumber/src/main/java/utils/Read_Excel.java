package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base_confiq.Base_Config;

public class Read_Excel extends Base_Config {

	public static String [][]get_Read_ExcelData(String excelfileName) throws IOException


	{ 

		XSSFWorkbook wBook= new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		XSSFSheet sheet = wBook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();

		String[][] data= new String[lastRowNum][lastCellNum];

		for (int i =1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j <lastCellNum; j++) {
				data[i-1][j] = row.getCell(j).getStringCellValue();


			}
		}

		System.out.println(data.toString());
		return data;

	}
}

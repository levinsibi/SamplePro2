package KewordDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public String[] getmethods()throws IOException {
		// TODO Auto-generated method stub

		int i;
		String[] str = new String[5];
		FileInputStream fis=new FileInputStream("C:\\Data\\Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		int num=sheet.getLastRowNum();
		for(i=0;i<num+1;i++)
		{
			System.out.println(sheet.getRow(i).getCell(2).getStringCellValue());
			str[i]=sheet.getRow(i).getCell(2).getStringCellValue();
		}
		for(i=0;i<str.length-1;i++)
		{
			System.out.println(str[i]);
		}
		return str;
	}

}

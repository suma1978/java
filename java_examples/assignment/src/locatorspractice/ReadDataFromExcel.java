package locatorspractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.org.apache.poi.ooxml.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ReadDataFromExcel {
	
	static XSSFSheet ws;
	static XSSFWorkbook wb;
	static XSSFRow r;
	static XSSFCell c;
	
	public static void excelPath(String pathname) throws IOException
	{

	File f=new File(pathname);
	FileInputStream fis=new FileInputStream(f);
	wb=new XSSFWorkbook(fis);
	
	
	}
	public static String readValue(String sheetname,int rownumber,int colnumber)
	{
		ws=wb.getSheet(sheetname);
		//c=ws.getRow(rownumber).getCell(colnumber);
		c=ws.getRow(rownumber).getCell(colnumber);
		String cellvalue=c.getStringCellValue();
		return cellvalue;
		
	}
	public static void main(String[] args) throws Exception 
	{
		excelPath("/Users/nbommu/Downloads/Test.xlsx");
		String firstvalue=readValue("TestScenario", 1, 1);
		System.out.println(firstvalue);
		System.out.print("Hello");
		writevalue("TestScenario",1,4);
		
	}
	public static void writevalue(String sheetname,int rowno,int colno) throws Exception
	{
		//ws=wb.getSheet(sheetname);
		ws.getRow(rowno).createCell(colno).setCellValue("heioo");
		//c.setCellType(c.CELL_TYPE_STRING);
		//c.setCellValue("HELLO");
		FileOutputStream fos=new FileOutputStream("/Users/nbommu/Downloads/Test.xlsx");
		fos.close();
		
	}

}

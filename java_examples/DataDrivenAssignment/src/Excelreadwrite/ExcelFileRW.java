package Excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import constantvalues.ConstantValues;

public class ExcelFileRW {
	
	static XSSFSheet worksheet;
	static XSSFRow   wsrow;
	static XSSFCell wscol;
	static XSSFWorkbook workbook;
	
	public static void excelPath(String pathname) throws IOException
	{
		File f=new File(pathname);
		 FileInputStream fis=new FileInputStream(f);
	 workbook=new XSSFWorkbook(fis);
	} 
	 public static String readValue(String sheetname,int row,int col)
	 {
		worksheet=workbook.getSheet(sheetname) ;
		wsrow=worksheet.getRow(row);
		wscol=wsrow.getCell(col);
		if (wscol.getCellType()==CellType.NUMERIC)
		{
			
			String numericvalue = NumberToTextConverter.toText(wscol.getNumericCellValue());
			System.out.println(numericvalue);
			return numericvalue;
			
		}
		else
		{
		String cellVal=wscol.getStringCellValue();
		 System.out.println(cellVal);
		return cellVal;}
		
	 }
	 public static void writeValue(String sheetname,int rowno,int colno,String value) throws Exception
	 {
		 worksheet = workbook.getSheet(sheetname);
			wscol = worksheet.getRow(rowno).getCell(colno);
			wscol.setCellValue(value);
			
			FileOutputStream fos = new FileOutputStream(ConstantValues.excelPath);
			workbook.write(fos);
			fos.close();
			
			FileInputStream fis = new FileInputStream(ConstantValues.excelPath);
			workbook = new XSSFWorkbook(fis); 
	 }
		
	}



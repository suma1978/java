package ExReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ConstantValues.constantvalues;


public class Excelreadwrite {
	 static XSSFWorkbook workbook;
	 static XSSFSheet worksheet;
	 static XSSFCell column;
	 static XSSFRow row;
	public static void excelFilePath(String path) throws Exception
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		workbook=new XSSFWorkbook(fis);
	}
	public static String getExcelValue1(String sheetname,int rownum,int colno)
	{
		worksheet=workbook.getSheet(sheetname);
		column=worksheet.getRow(rownum).getCell(colno);
		
		if (column!=null)
	{
			switch(column.getCellType())
			{
			case NUMERIC:
				String numericvalue = NumberToTextConverter.toText(column.getNumericCellValue());
			    return numericvalue;
			
			case  STRING:
				String cellValue = column.getStringCellValue();
				return cellValue;
			case BLANK:
					String bcellValue=column.getStringCellValue();
					return bcellValue;	
				
			}
			
	}
		else {
				return "";
		}
		return null;
			
	}
		
						
				
		
	public static void writeValue(String sheetname,int rowno,int colno,String value) throws Exception
	{
		int no=workbook.getNumberOfSheets();
		System.out.println("no of sheets: " + no + "1st sheet name is :" + workbook.getSheetName(0));

		worksheet=workbook.getSheet(sheetname);
	
		System.out.println("noof rows :" + worksheet.getLastRowNum());
        System.out.println("get col value " + worksheet.getRow(1).getCell(2).getStringCellValue());
       
        worksheet.getRow(1).getCell(2).setCellValue("PASS");
        row=worksheet.getRow(rowno);
		column=row.getCell(colno);
		System.out.println(row.getRowNum());
		//System.out.println("trying to get column val is:" + column.getStringCellValue());
		System.out.println("entered into sheet" + column.getCellType());
		column.setCellValue(value);
		FileOutputStream fos=new FileOutputStream(constantvalues.excelPath);
		workbook.write(fos);
		fos.close();
		
		FileInputStream fis = new FileInputStream(constantvalues.excelPath);
		workbook = new XSSFWorkbook(fis);
		
		
	}
	public static void writevaltocell(String sheetname,int rownum,int colno,String val) throws Exception
	{
		worksheet=workbook.getSheet(sheetname);
		column=worksheet.getRow(rownum).createCell(colno);
		System.out.println(column.getCellType());
		column.setCellValue(val);
		FileOutputStream fos=new FileOutputStream(constantvalues.excelPath);
		workbook.write(fos);
		fos.close();
		
	}
	

}

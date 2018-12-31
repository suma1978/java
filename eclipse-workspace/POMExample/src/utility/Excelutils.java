package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	 static XSSFWorkbook wb;
	 static XSSFSheet ws;
	 static XSSFCell wc;
	 static XSSFRow wr;
	 public static void Setexcel(String pathname,String Sheetname) throws IOException
	 {
		 try {
			 File f=new File(pathname);
			 FileInputStream fis=new FileInputStream(f);
			 wb=new XSSFWorkbook(fis);
			 ws=wb.getSheet(Sheetname);
			 
		 }
		 catch (Exception e)
		 {
		   throw(e);
		 }
	 }
	 public static String getcellVal(int rowno,int colno) throws Exception
	 {
		 try {
		 wc=ws.getRow(rowno).getCell(colno);
		 String cellVal=wc.getStringCellValue();
		 return cellVal;}
		 catch(Exception e) {
			 throw(e);
		 }
		 
	 }
	 public static void setCelldata(String result,int row,int col) throws Exception
	 {
		 try
		 {
			 wr=ws.getRow(row);
			 wc=wr.getCell(col);
			 if(wc==null)
			 {
				 wc=wr.createCell(col);
				 wc.setCellValue(result);
			 }
			 else
			 {
				 wc.setCellValue(result); 
			 }
			 FileOutputStream fout=new FileOutputStream(constant.testPath);
			 wb.write(fout);
			 fout.flush();
			 fout.close();
			 
			 
			 
			 
		 }
		 catch(Exception e)
		 {
			 throw(e);
		 }
	 }

}

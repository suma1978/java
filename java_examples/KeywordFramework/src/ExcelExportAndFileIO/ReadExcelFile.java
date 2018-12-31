package ExcelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ReadExcelFile {
	XSSFWorkbook wb ;
	XSSFSheet ws;
	XSSFRow wr;
	XSSFCell wc;
	public XSSFSheet readExcel(String filePath,String fileName,String sheetName) throws IOException
	{
		File file=new File(filePath + "/" + fileName);
		FileInputStream fis=new FileInputStream(file);
		 wb=new XSSFWorkbook(fis);
 ws=wb.getSheet(sheetName);
 return (XSSFSheet) ws;
		
		
	}
	public void Writetoexcel(int row,int col,String result) throws IOException 
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
			 FileOutputStream fout=new FileOutputStream(System.getProperty("user.dir")+"/testCase.xlsx");
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
package Newpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		List<Integer> l=ReadFile("/Users/nbommu/Documents/IntText.txt");
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i));
		}

	}

	
	public static List<Integer> ReadFile(String fileName) throws Exception
	{
		List<Integer> list=new ArrayList<Integer>();
		try {
			FileReader fr=new FileReader(fileName);
			BufferedReader raf=new BufferedReader(fr);
			//RandomAccessFile raf = new RandomAccessFile(fileName, "r");
			String line=null;
			
			while((line=raf.readLine()) !=null)
			{
				Integer eachln=new Integer(Integer.parseInt(line));
				System.out.print(eachln);
				list.add(eachln);
			}
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Entered final block");
		}
		return list;
		
	}
}

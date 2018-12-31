package Newpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadwrite {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String directory=System.getProperty("user.home") +File.separator+"Documents"+File.separator;
		String filename="sample.txt";
		String absolutePath=directory+filename;
		System.out.println(absolutePath);
		try {
			
			FileWriter wr=new FileWriter(absolutePath);
			String fileContent="This is Sample File Content";
			wr.write(fileContent);
			wr.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try {
				FileReader fr=new FileReader(absolutePath);
				int ch=fr.read();
				while(ch!=-1)
				{
					System.out.println((char)ch);
					ch=fr.read();
					
				}
				
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
			
		}

	}

}

package Newpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaswrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory=System.getProperty("user.home") +File.separator+"Documents"+File.separator;
		String filename="sample.txt";
		String absolutePath=directory+filename;
		System.out.println(absolutePath);
		try {
			FileWriter fw=new FileWriter(absolutePath);
			BufferedWriter bwr=new BufferedWriter(fw);
			String filecontent="This is second sample \n hello";
			bwr.write(filecontent);
			bwr.close();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
try {
	FileReader fr=new FileReader(absolutePath);
	BufferedReader br=new BufferedReader(fr);
	String line=br.readLine();
	while(line!=null)
	{
		System.out.println(line);
		line=br.readLine();
		
	}
}
catch(FileNotFoundException ex)
{
	System.out.println("File Not found");
}
catch(IOException ex)
{
	//System.out.println("File Not found");
	ex.printStackTrace();
}
	}

}

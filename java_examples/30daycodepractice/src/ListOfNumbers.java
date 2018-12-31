

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
	
	
	public static List<Integer> ReadFile(String fileName) throws Exception
	{
		List<Integer> list=new ArrayList<Integer>();
		try {
			FileReader fr=new FileReader(fileName);
			int i;
			
			while((i=fr.read()) !=-1)
			{
				System.out.print((int) i);
				list.add(i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Entered final block");
		}
		return list;
		
	}
	
	static void main(String args[]) throws Exception
	{
		List<Integer> l=ReadFile("/Users/nbommu/Documents/IntText.txt ");
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i));
		}
	}

}

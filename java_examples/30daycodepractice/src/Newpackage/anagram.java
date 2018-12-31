package Newpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(anagram1("hello","Hello"));
		System.out.print(smalllarge("welcometojava",3));
		
	}
	
	public static boolean anagram(String str1,String str2)
	{
		
		char[] s1=str1.toLowerCase().toCharArray();
		char[] s2=str2.toLowerCase().toCharArray();
		if(s1.length!=s2.length)
		
		 return false;	
		
		//sort the arrays
		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i=0;i<s1.length;i++)
		
			if(s1[i]!=s2[i])
		
				return false;
			
		 return true;
			
				
			
		
	}
public static boolean anagram1(String str1,String str2)
{
	if(str1.length()!=str2.length())
	 return false;
	String s1=str1.toLowerCase();
	String s2=str2.toLowerCase();
	HashMap<Character, Integer> map=new HashMap<>();
	for(int i=0;i<s1.length();i++)
	{
		char a=s1.charAt(i);
		if(!map.containsKey(a))
		{
			map.put(a, 1);
		}else
		{
			int val=map.get(a);
			map.put(a, ++val);
		}
		
	}
	
	//verify second string with map
	for(int i=0;i<s2.length();i++)
	{
		char b=s2.charAt(i);
		if(!map.containsKey(b))
		
			return false;
		int freq=map.get(b);
		map.put(b, --freq);
	}
	for(Integer value:map.values())
	
		if(value!=0)
			return false;
	return true;
	
}
public static String smalllarge(String s,int k)
{
	List<String> arrstr=new ArrayList<>();
	String large="";
	String small="";
	for(int i=0;i<s.length()-1;i++)
	{
		String s1=s.substring(0, k);
		s=s.substring(1);
		arrstr.add(s1);
		i=0;
		
	}
Collections.sort(arrstr);
small=arrstr.get(0);
large=arrstr.get(arrstr.size()-1);
	
	return large +"\n"+small;
}
}

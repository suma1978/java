package Newpackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



import bsh.StringUtil;
public class NewClass {
	
	
	static String superReducedString(String s) {

		
		 for(int i=0;i<s.length()-1;i++)
		 {
		  if( s.charAt(i)==s.charAt(i+1))
		  {
			  s=s.substring(0, i)+s.substring(i+2);
			 // System.out.println(s);
			
			  i=-1;
		  }
		 }
		 if(s.length()==0)
		 {
			 System.out.println("Empty String");
		 }
		 else
		 {
			 System.out.println(s);
		 }
		 
  return s;
    }

	
	public static void main(String args[])
	{
		String s="aa";
		//System.out.println(superReducedString(s));
		String s1="saveChangesInTheEditor";
		//System.out.println(camelcase(s1));
		//System.out.println(minimumNumber(5, "Ab1"));
		//String s2=checkIfIsHacker("hereiamstackerrank");
		//System.out.println(s2);
		//System.out.println(funnyString("zxca"));
		//arraytolist();
		//dupchar();
		//System.out.print(countChar("abcdef", 'f'));
		//removeS();
		//System.out.println(anagram("aaabbb"));
		//palindromeIndex();
		//String[] arr1={"abcdde","baccd","eeabg"};
		//System.out.println(gemstones(arr1));
		palindrome("a");
	}
	static void palindrome(String s)
	{
		int len=s.length();
		boolean flag=false;
		for(int i=0;i<=len/2;i++)
		{
			if(s.charAt(i)==s.charAt(len-1))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
			len--;
		}
		if(flag==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	static int gemstones(String[] arr) {
		int gcount=0,ch=0;
		String str =arr[0];
		String arstr="";
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i), 1);
		}
		for(int i=1;i<arr.length;i++)
		{
			ch=0; arstr=arr[i];
			while(ch<arstr.length())
			{
			    
				if(map.containsKey(arstr.charAt(ch)))
				{
					int val=map.get(arstr.charAt(ch));
				map.put(arstr.charAt(ch), val+1);
				}
				
			
			else 
			{
				map.remove(arstr.charAt(ch));
				//break;
			}
			
			ch++;
			}
			
		}
		Set set = map.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
		System.out.println(gcount);
			return gcount;
			
			
			
			
			
			
			

    }

	
	static void palindromeIndex() {
		Set<String> setOfString = new HashSet<>( Arrays.asList("1", "2", "3", "4", "5")); 
	  
	        // Print the set of String 
	        System.out.println("Set of String: " + setOfString); 
	  
	        // Convert Set of String to set of Integer 
	        Set<Integer> setOfInteger = setOfString.stream() 
	                                        .map(s -> Integer.parseInt(s)) 
	                                        .collect(Collectors.toSet()); 
	  
	        // Print the set of Integer 
	        System.out.println("Set of Integer: " + setOfInteger); 
	        
	        Set<Integer> set2=new HashSet<>(Arrays.asList(1,2,3,4,5));
	        Set<String> set3=set2.stream().map(s ->String.valueOf(s)).collect(Collectors.toSet());
	        
	        System.out.println("Set of Strings: " + set3);
	        
	        int g = 1234; 
	        int k=567;
	        String s="hi";
	        StringBuilder sb = new StringBuilder(); 
	        sb.append(g);
	        sb.append(k);
	        sb.append(s);
	        String str7 = sb.toString(); 
	        System.out.println("String str7 = " + str7); 
	    } 
    
	
	static int minimumNumber(int n, String password)
	{
		 boolean upperflag=false;
		 boolean lowerflag=false;
		 int noofmatches=0;
		 
			Pattern digit=Pattern.compile("[0-9]");
			Pattern patternUpper = Pattern.compile("([A-Z])");
			Pattern patternLower = Pattern.compile("([a-z])");
			Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			Matcher matcherUpper = patternUpper.matcher(password);
			Matcher matcherLower = patternLower.matcher(password);
	           Matcher hasDigit = digit.matcher(password);
	           Matcher hasSpecial = special.matcher(password);
	           if(matcherUpper.find()==false)
	           {
	        	   noofmatches++;
	           }
	           if(matcherLower.find()==false)
	           {
	        	   noofmatches++;
	           }
	           if(hasDigit.find()==false)
	           {
	        	   noofmatches++;
	        	   System.out.println(noofmatches);
	           }
	           if(hasSpecial.find()==false)
	           {
	        	   noofmatches++;
	        	  
	           }
	           
	           if ((noofmatches+password.length())<6) {
	        	   noofmatches =  6-password.length();
	   		}
	           
	            
		
		return noofmatches;
	}
	private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }
	static String funnyString(String s) {

		boolean funnyflag=false;
		
		for(int i=0;i<s.length()-1;i++)
		{
			int s1=(int)s.charAt(i);
			System.out.println(s1);
			
			int s2=(int)(s.charAt(i+1));
			System.out.println(s2);
			int s3=(int)(s.charAt(s.length()-i-1));
			System.out.println(s3);
			int s4=(int)(s.charAt(s.length()-i-2));
			System.out.println(s4);
			if(Math.abs(s1-s2)!=Math.abs(s4-s3))
			{
				funnyflag=false;
				break;
			}
			else
			{
				funnyflag=true;
			}
			
			
		}
		if(funnyflag==false)
		{
			return "Not Funny";
		}
		else
		{
			return "Funny";
		}
    }
	static int camelcase(String s)
	{
		char ch;
		int countstr=0;
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{if(i==0)
			{
				countstr++;
			}
				continue;
			}
			else if(Character.isUpperCase(ch))
			{
				
				countstr++;
					
				
				System.out.println(countstr + "."+s.substring(0, i));
				s=s.substring(i);
				System.out.println(s);
				i=0;
				
				
			}
			
		}
		return countstr++;
	}
	
	
	public static void arraytolist()
	{
		String[] assigned= {"001","002","003","004","005","006","007","008","009"};
		String[] unassigned= {"001","003"};
		List<String> list1=new ArrayList<String>(Arrays.asList(assigned));
		List<String> list2=new ArrayList<String>(Arrays.asList(unassigned));
		list1.removeAll(list2);
		list1.toArray();
		
		System.out.println(Arrays.toString(list1.toArray()));
	}
	public static int countChar(String s,char x)
	{
		int n=10;
		int div=0;int rem=0;
		int count=0;
		  //no of chars to be added for string
		div=n/s.length();
		rem=n%s.length();
		String str2 = new String(new char[div]).replace("\0", s)+ s.substring(0, rem);
	     
		System.out.println(str2);
		for(int i=0;i<str2.length();i++)
		{
			if(str2.charAt(i)==x)
			{
				count++;
			}
		}
		return count;
		
	}
	public static void removeS()
	{
		String s="Amazon_w_e_b_services are___widely__used";
		List<String> list1=new ArrayList<String>(Arrays.asList(s.split("_")));
		String fstr=String.join(" ", list1);
		s=s.replace("_", " ");
		System.out.println(fstr);
		List<String> list= new ArrayList<String>(Arrays.asList("Geek","ForGeeks","GeeksForGeeks"));
			//Covert list of string to string
		String str=String.join(":", list);
		System.out.print("Comma string:"+str);
		
		
		
	}
	static int anagram(String s) {


		  String str1=s.substring(0,s.length()/2);
		  String str2=s.substring(s.length()/2);
		  System.out.println(str1+ ":"+ str2);
		  int count=0;
		  
		  if(s.length()%2!=0)
		  {
		  return -1;
		  }
		  else 
		  
		  {
			  for(int i=0;i<str1.length();i++)
			  {
				  if(!str2.contains(str1.charAt(i) +""))
				  {
					 count++; 
				  }
				  else
				  {
					  str2=str2.replaceFirst(str1.charAt(i)+"", "");
				  }
			  }
		  }
		  
		  return count;
    }
	public static void dupchar()
	{
		String s="sumalatha";
		HashSet<Character> h=new HashSet<>();	
		
		for(int i=0;i<s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(h.contains(c))
			{
				System.out.println(c);
				break;
			}
			else
			{
				h.add(c);
			}
		}
	}
       
}

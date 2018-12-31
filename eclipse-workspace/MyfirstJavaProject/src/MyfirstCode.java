import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MyfirstCode {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)
	{
		//private static final Scanner scanner = new Scanner(System.in);
		/*// TODO Auto-generated method stub
		//int a=15,b=30,c;
		//c = a + b ;
		//double d;
		//System.out.println("Result = " + c);
		//System.out.println("Hello World");
		 //d=(double)a/2;
		
		System.out.println(args[0]);
		//System.out.println(d);
		List<Integer> d1;
		List<Integer> a1 =List.of(1,2,3);
		List<Integer> b1=List.of(3,2,1);
		//d1=compare(a1,b1);*/
		long[] arr1= {5,1000000001,1000000004,1000000005,1000000003};
		//long sum=bigsum(arr1);
		//System.out.println(sum);
		int[][] scores= {{1,2,3},{4,5,6},{7,8,-10}};
		int difference=diagonalsum(scores);
		//System.out.println(difference);
		int[] arrpre= {-4,3,-9,0,4,1};
		//plusMinus(arrpre);
		//print(4);
		//pstair(6);
		int[] minmaxarr= {1,2,3,4,5};
		//minmax(minmaxarr);
		int[] candles= {18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
		//int count=blowcandles(candles);
	//	System.out.println(count);
		//String Time=Conversion("12:00:00PM");
		//System.out.println(Time);
		int[] gradearr= {75,67,40,33};
		int[] resultarr=new int[gradearr.length];
		resultarr=stGrades(gradearr);
		for(int i=0;i<resultarr.length;i++)
		{
		//	System.out.println(resultarr[i]);
		}
	/*	solve(15.50, 15, 10);
		String[] longest={"suma","latha","Hi","Hello"};
		String longstr=findLongestName(longest);
		System.out.println(longstr);*/
		int s=2;
		int t=3;
		int a=1,b=5;
		int[] apples= {2};
		int[] oranges= {-2};
		
		//checkn();
		//countApplesAndOranges( s, t,  a, b, apples, oranges) ;
		//String s1=kangaroo(21,6,47,3);
		//System.out.println(s1);
		//string();
		//List<Integer> s1=List.of(4);
		//int bd=birthday(s1, 4, 1);
		//int[] ar= {1,3,2,6,1,2};
		List<Integer> s1=List.of(1,2,3,4,5,4,3,2,1,3,4);
		int bcount=migratoryBirds(s1);
		System.out.println("bcount is " + bcount);
       //PhoneBook();
	//System.out.println(bd);
		//reverseprint();
		//printdict();
		//int count=divisibleSumPairs(6, 3, ar);
		//System.out.println(count);
		//int fact=factorial(5);
		//System.out.println(fact);
         //convertbinary();
		//hourglass();
		//classexample();
		//bookdisplay();
		//computeDifference();
		String year=dayOfProgrammer(1918);
		String[] arrstr= {"aba","baba","aba","xzxb"};
		String[] query= {"aba","xzxb","ab"};
		
		int[] countstr= matchingStrings( arrstr, query);
		for(int i=0;i<countstr.length;i++)
		{
			System.out.println(countstr[i]);
		}
	}
	 static int[] matchingStrings(String[] strings, String[] queries) {

         int[] finalcount=new int[queries.length];  ;
         List<Integer> count=new ArrayList<Integer>(queries.length);
         int lenstrings=strings.length;
         int lenqueries=queries.length;
         int querystrCount=0;
         for(int i=0;i<lenqueries;i++)
         {
             String strquery=queries[i];
             for(int j=0;j<lenstrings;j++)
             {
                 if(strings[j]==strquery)
                 {
                     querystrCount++;
                 }
             }
             finalcount[i]=querystrCount;
             //count.add(querystrCount);
             querystrCount=0;
           
             
         }
        /* finalcount=new int[queries.length];
         for(int i=0;i<count.size();i++)
         {
        	 finalcount[i]=count.get(i);
        	// System.out.println(finalcount[i]);
         }*/
         return finalcount;

 }
	static int simpleArraysum(int[] ar)
	{
		int length=0,total=0;
		length=ar.length;
		for(int i=0;i<length;i++)
		{
			total=total+ar[i];
		}
		
		return total;
	}
	public static List<Integer> compare(List<Integer> a,List<Integer> b)
	{
		List<Integer> c = new ArrayList<Integer>();
		int acount=0;
		int bcount=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>b.get(i))
			{
			 acount=acount+1;	
			 System.out.println("Acount is :" + acount);
			}
			else if(a.get(i)<b.get(i))
			{
				bcount=bcount+1;
				 System.out.println("Bcount is :" + bcount);
			}
		}
		
		c.add(acount);
		c.add(bcount);
		System.out.println(c.get(0) + ":" + c.get(1));
		return c;
		
	}
	public static long bigsum(long[] ar)
	{
		long sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
		
	}
	public static int diagonalsum(int[][] arr)
	{
		int sum=0;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i][i];
			sum1=sum1+arr[i][arr.length-i-1];
		}
		
		return Math.abs(sum-sum1);
		
	}
	public static void plusMinus(int[] arr)
	{
		DecimalFormat df = new DecimalFormat(".000000");
		
		int pluscount=0;
		int minuscount=0;
		int zero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				pluscount+=1;
			}
			else if(arr[i]<0)
			{
				minuscount+=1;
			}
			else if(arr[i]==0) {
				zero+=1;
			}
		}
		
		System.out.println(arr.length);
		System.out.println(df.format((double)pluscount/arr.length));
		System.out.println(df.format((double)pluscount/arr.length));
		System.out.println(df.format((double)minuscount/arr.length));
		System.out.println(df.format((double)zero/arr.length));
		
		
	}
	
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j<n-i?" ":"#");
				
			}
			System.out.println("");
		}
	}
	public static void pstair(int n)
	{
		for(int j=0;j<n;j++){
            for(int i=1;i<=n;i++){
                System.out.print(i<n-j?" ":"#");
            }
            System.out.println("");
	}
	}
	public static void minmax(int[] arr)
	{
		long min=arr[0];//1
		long max=arr[0];//1
		long sum=0;
		for(int i=0;i<5;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
			sum+=arr[i];
			System.out.println("sum:"+sum);
		}
		System.out.println((sum-max)+" "+(sum-min));
		//System.out.println(Int.parse (4.0+12));
		
	}
	public static int blowcandles(int[] arr) {
		
		int count=0;
		int max=0;
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
			
			}
			
			
		}
		System.out.println("max no is:"+max);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max)
			{
				count++;
			}
		}
		return count;
		
		
	}
	public static String Conversion(String s)
	{
		String s1=null;
		int timeint=0;
		String[] strar=s.split(":");
		String mystring=strar[2];
		if((strar[2].contains("AM"))|| (strar[2].contains("am")))
		{
			timeint+=Integer.parseInt(strar[0]);
			if(timeint==12)
			{
				timeint=0;
				
				//s1=String.format("%02d", timeint)+":"+strar[1]+":"+ mystring.substring(0, mystring.length() -2);
			}
				s1=String.format("%02d", timeint)+":"+strar[1]+":"+ mystring.substring(0, mystring.length() -2);
			
				
			
			return s1;
		}
		else if((strar[2].contains("PM"))||(strar[2].contains("pm")))
		{
			timeint=Integer.parseInt(strar[0]);
			if(timeint == 12)
			{
				timeint=timeint+0;
			}
			else
			{
			timeint=timeint+12;
			}
			
			s1=String.valueOf(timeint)+":"+strar[1]+":"+ mystring.substring(0, mystring.length() -2);
			
		}
		
		return s1;
	}
	public static int[] stGrades(int[] grades)
	
	{
		int[] result=new int[(grades.length)];
		String s;
		
		for(int i=0;i<grades.length;i++)
		{
			if(grades[i]<38)
			{
				result[i]=grades[i];
			}
			else
			{
				int remainder=grades[i]%5;
				int gradeQ=grades[i]/5;
				gradeQ=gradeQ+1;
				int nextmultiple=gradeQ*5;
				
				
				if((nextmultiple-grades[i])<3)
				{
					
					result[i]=gradeQ*5;
				}
				else
				{
					result[i]=grades[i];
				}
				
			}
		}
		return result;
	}
	
	 static void solve(double meal_cost, int tip_percent, int tax_percent) {
		 int total_cost=(int)Math.round((meal_cost+((meal_cost*tip_percent)/100)+((meal_cost*tax_percent)/100)));
             System.out.println("Total is :" + total_cost);
             
		     }
	 
	 public static String findLongestName(String [] names){

		  int longlen=0;
		  String longstr="";
		  for(int i=0;i<names.length;i++)
		  {
		      if(names[i].length() >longlen)
		      {
		          longlen=names[i].length();
		          longstr=names[i];
		      }
		  }
		    return longstr;
		}
	 public static void checkn()
	 {
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(N%2>0)
	        {
	        	System.out.println("Weird");
	        }
	        else if((N%2==0)) 
	        {
	        	if((N>=2)&&(N<=5))
	        	{
	        	System.out.println("Not Weird");
	        	}
	        	else if((N>=6)&&(N<=20))
	        	{
	        	System.out.println("Weird");
	        	}
	        	else if(N>20)
	        	{
	        		System.out.println("Not Weird");	
	        	}
	        	
	        }
	        	
	        	

	        scanner.close();
	 }
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		 
		 int[] appfall=new int[apples.length];
		 int[] orangefall=new int[oranges.length];
		 int applecount=0;
		 int orangecount=0;
		 int noofapples=apples.length;
		 int nooforanges =oranges.length;
		 
		 for(int app=0;app<apples.length;app++)
		 {
			 appfall[app]=apples[app]+a;
			 if((appfall[app]>=s)&&(appfall[app]<=t))
			 {
				 applecount++;
			 }
				 
			 
		 }
		 for(int oran=0;oran<oranges.length;oran++)
		 {
			 orangefall[oran]=oranges[oran]+b;
			 if((orangefall[oran]>=s)&&(orangefall[oran]<=t))
			 {
				 orangecount++;
			 }
			
			 
		 }
		 System.out.println(applecount);
		 System.out.println(orangecount);
		 
		 
	 }
	 public static String kangaroo(int x1, int v1, int x2, int v2)
	 {
		 int initx1;
		 int initx2;
		 String result;
		 int jump=0;
		 
		 if((x2>x1)&&(v2>v1)||(v2<v1))
		 {
			result="NO"; 
		 }
		 else
		 {
		 initx1=x1+v1;
		 initx2=x2+v2;
		 System.out.println(initx1 + ":"+initx2);
		 while(initx1!=initx2)
		 {
			initx1=initx1+v1;
			initx2=initx2+v2;
			jump++;
			if(jump>=10000)
					{
				       result="NO";
				       return result;
					}
			System.out.println(initx1 + ":"+initx2);
		 }
		 result="YES";
		 
		 }
		 
		 return result;
	 }
	 public static void string()
	 {
		 Scanner scanner=new Scanner(System.in);
		 //System.out.println("Please enter int");
	     int T=scanner.nextInt();
	     
	     String evenstr="";
	     String oddstr="";
	     
	     String[] s=new String[T];
	     
	     for(int strcount=0;strcount<T;strcount++)
	     {
	      s[strcount]=scanner.next();
	     }
	     for(int strcount=0;strcount<T;strcount++)
	     {
	     char[] str=s[strcount].toCharArray();
	     
	     for(int i=0;i<str.length;i++)
	     {
	    	 if((i%2)==0)
	    	 {
	    		evenstr+= str[i];
	    		
	   	     
	    	 }
	    	 else if(i%2==1)
	    	 {
	    		 oddstr+=str[i];
	    		
	    	 }
	     }
	     System.out.println(evenstr + " "+oddstr);
	     evenstr="";
	     oddstr="";
	     
	     }
	     
	     
	 }
	 static int birthday(List<Integer> s, int d, int m) {
         int sum=0;
         int birthday=0;
         for(int listcount=0;listcount<s.size();listcount++)
         {
        	 sum=0;
        	
        		 
         for(int i=listcount;i<=m+listcount-1;i++)
         {
        	if(i<=s.size()-1) 
        	{
           sum=sum+s.get(i); 
          // System.out.println(s.get(i)); 
        	}
         }
         
        // System.out.println(sum); 
         if(sum==d)
         {
        	// System.out.println("sum is equal d" + d);  
           birthday++;
           //sum=0;
           
         }
         }
         
         
         
        
         return birthday;
    }
	 
	 public static void reverseprint()
	 {
		 
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	        for(int i=n-1;i>=0;i--)
	        {
	         System.out.print(arr[i]+" ");
	        }

	        scanner.close();
	 }
	 
	 public static void printdict()
	 {
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        Map<String,Integer> map=new HashMap<String,Integer>();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            
	            // Write code here
	            map.put(name, phone);
	            
	        }
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            if(map.containsKey(s))
	            {
	            int value=map.get(s);
	            System.out.println(s+"="+value);
	            }
	            else
	            {
	            	System.out.println("Not found");
	            }
	        }
	        in.close(); 
	 }
	 static int divisibleSumPairs(int n, int k, int[] ar) {
		 
		 int count=0;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if((i<j)&&((ar[i]+ar[j])%k==0))
				 {
					 count++;
				 }
			 }
		 }
		return count;


	    }
	 static int migratoryBirds(List<Integer> arr) {
		 
		
		ArrayList<Integer> keys = new ArrayList<>();
		
		 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		 int count=0;
		 int max=0;
		 int val=0;
		 int key;
		 int largest,secondlargest;
		
		 for(int i=0;i<arr.size();i++)
		 {
			 count=0;
			 for(int j=0;j<arr.size();j++)
			 {
				 if(arr.get(i)==arr.get(j))
				 {
					 count++;
				 }
			 }
			
		      if(!(map.containsKey(arr.get(i))))
		      {
			 map.put(arr.get(i), count);
			 System.out.println(arr.get(i));
			// keys.add(arr.get(i));
			
		      }
			 
		 }
		 
		 System.out.println("map length is :" + map.size());
		 
			
			max= Collections.max(map.values());
		 
		 System.out.println("max is :" + max);
		
		 
	   
	   for(Map.Entry<Integer, Integer> entry:map.entrySet())
		 {
			 if(entry.getValue().equals(max))
				
			 {
				 
				 System.out.println(entry.getKey());
				 int s=entry.getKey();
				 
					 
				keys.add(s); 
				
			 }
		 }
	   largest=keys.get(0);
	   secondlargest=keys.get(0);
	   System.out.println("largest is:" + largest);
	   System.out.println("secondlargest is:" + secondlargest);
		 for(Map.Entry<Integer, Integer> entry:map.entrySet())
		 {
			 if(entry.getValue().equals(max))
				
			 {
				 
				 System.out.println(entry.getKey());
				 int s=entry.getKey();
				 if(s>largest)
				 {
					 secondlargest=largest;
					 largest=s;					 
				 }
					 
				
				
			 }
		 }
		
		 return secondlargest;
		 
		 
   
	    }
	 
	 public static void PhoneBook()
	 {
		 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         Map<String,Integer> map=new HashMap<String,Integer>();
         for(int i = 0; i < n; i++){
             String name = in.next();
             int phone = in.nextInt();
             
             // Write code here
             map.put(name, phone);
             
         }
         while(in.hasNext()){
             String s = in.next();
             // Write code here
             if(map.containsKey(s))
             {
             int value=map.get(s);
             System.out.println(s+"="+value);
             }
             else
             {
                 System.out.println("Not found");
             }
         }
         in.close(); 
	 }
         public static int factorial(int n)
         {
        	 if (n==0)
        	 {
        		 return 1;
        	 }
        	 else if(n>0)
        	 {
        		 return n*factorial(n-1);
        	 }
        	 else if(!(n>0))
        	 {
        		 System.out.println("Not valid");
        		 return 0;
        	 }
			return 0;
        	 
         }
         
         public static void convertbinary()
         {
        	 int n = scanner.nextInt();
        	 String s="";
        	 char[] reverse;
        	 int count=1;
        	 int max=0;
        	 
             scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
             while(n!=0)
             {
             int remainder=n%2;
             s=s+ String.valueOf(remainder);
             int quo=n/2;
          
             n=quo;
             }
          System.out.println(s);
          int j=s.length();
          reverse=new char[j];
          for(int i=0;i<s.length();i++)
          {
        	  
        	  reverse[j-1]=s.charAt(i);  
        	  j--;
        	  if(i<s.length()-1)
        	  if((s.charAt(i)=='1') && (s.charAt(i+1)=='1'))
        	  {
        		count++;  
        	  }
        	  else
        	  {
        		  count=1;
        	  }
        	  if(count>max)
        	  {
        		  max=count;
        	  }
        	  
          }
          String reveersestr=new String(reverse);
          System.out.println(reveersestr +":"+count);
          System.out.println(reveersestr +":"+max);
             scanner.close();
         }
         
         
         public static void hourglass()
         {
        	 int[][] arr = new int[6][6];
        	 int count=0;
        	 int mid=0;
        	 int max=-100;

             for (int i = 0; i < 6; i++) {
                 String[] arrRowItems = scanner.nextLine().split(" ");
                 scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                 for (int j = 0; j < 6; j++) {
                     int arrItem = Integer.parseInt(arrRowItems[j]);
                     arr[i][j] = arrItem;
                 }
             }
                 
                 for(int i=0;i<4;i++) {
                	 for(int j=0;j<4;j++)
                	 {
                		mid= arr[i+1][j+1];
                	   for(int k=j;k<j+3;k++)
                	   {
                		 count=count+arr[i][k]+arr[i+2][k];
                	   }
                	   count=mid+count;
                	   System.out.println("count is:" + count);
                	   if(count>max)
                	   {
                		   max=count;
                	   }
                	   count=0;
                	 }
                 }
             
                 System.out.println("max is:" + max);
             scanner.close();
         }
         public static void classexample()
         {
        	 Scanner scan = new Scanner(System.in);
     		String firstName = scan.next();
     		String lastName = scan.next();
     		int id = scan.nextInt();
     		int numScores = scan.nextInt();
     		int[] testScores = new int[numScores];
     		for(int i = 0; i < numScores; i++){
     			testScores[i] = scan.nextInt();
     		}
     		scan.close();
     		
     		Student s = new Student(firstName, lastName, id, testScores);
     		s.printPerson();
     		System.out.println("Grade: " + s.calculate());
     	}
         
         public static void computeDifference()
         {
        	 int[ ] elements= {10,30,13,20,40};
            int maximumDifference=0;
             int difference=0;
             for(int i=0;i<elements.length;i++)
             {
                 for(int j=0;j<elements.length;j++)
                 {
                     difference=Math.abs(elements[i]-elements[j]);
                     if(difference>maximumDifference)
                     {
                    	 maximumDifference=difference;
                     }
                 }
             }
             
             System.out.println(maximumDifference);
         }
         
        public  static String dayOfProgrammer(int year) {
        	
        	
        	int today=0;
        	int day=0;
        	if((year>=1700)&&(year<1918))
        	{
        	if(year%4==0)
        	{
        		today=244;
        		day=256-244;
        	}
        	else
        	{
        	today=243;	
        	day=256-243;
        	}
        	}
        	else if(year>1918)
        	{
        		if((year%400==0)||(year%4==0 && year%100!=0))
        		{
        			today=244;
            		day=256-244;
        		}
        		else
        		{
        			today=243;	
                	day=256-243;
        		}
        		
        	}
        	else if(year==1918)
        	{
        		today=230;
        		day=256-230;
        	}
        	
        	String s=String.valueOf(day) +"."+"09"+"."+String.valueOf(year);
        	System.out.println(s);
          return "s";

         }
         public static void bookdisplay()
 		{
 			int price = 285;
 	       // scanner.close();
 String title="Hello";
 String author="Suma";
 	        MyBook book = new MyBook(title, author, price);
 	        book.display();
 		}
         }
 
	 
	 
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
} 

class Student extends Person{
	
	private int[] testScores;
	
	Student(String firstName, String lastName, int identification,int[] scores) {
	
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		testScores=new int[scores.length];
		for(int i=0;i<scores.length;i++)
		{
			testScores[i]=scores[i];
		}
	}
		
		public char calculate()
		{
			char Grade=' ';
			int sum=0;
			int avg;
			for(int i=0;i<testScores.length;i++)
			{
				sum=sum+testScores[i];
			}
			avg=sum/(testScores.length);
			System.out.println("Avg is:"+avg);
			
			if((avg>=90)&&(avg<=100))
			{
				Grade='O';
			}
			else if((avg>=80)&&(avg<90))
			{
				Grade='E';
			}
			else if((avg>=70)&&(avg<80))
			{
				Grade='A';
			}
			else if((avg>=55)&&(avg<70))
			{
				Grade='P';
			}
			else if((avg>=40)&&(avg<55))
			{
				Grade='D';
			}
			else if(avg<40)
			{
				Grade='T';
			}
			return Grade;
		}
	
	
   
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
      
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
		
		
}
abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    class MyBook extends Book{

        int bookPrice;
        MyBook(String title,String author,int price)
        {
         super(title,author);
         this.bookPrice=price;
        }

        void display()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+ bookPrice);

    }
    }




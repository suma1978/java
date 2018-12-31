import java.io.Console;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args)
	{
		//Addition 
		int i=10;
		i=i+5;
		System.out.println("Value of I sfter addition is :" + i);
		int j=20;
		j=j-20;
		
		System.out.println("Value of J sfter subtraction is :" + j);
		int c=5;
		c=c * 3;
		System.out.println("Value of c sfter multiplication is :" + c);
		i++;
		System.out.println("Value of I sfter increment is :" + i);
		j--;
		System.out.println("Value of J sfter decrement is :" + j);
		c=c/2;
		System.out.println("Value of c sfter division is :" + c);
		
		Assignment.checkfun();
		Assignment.checksign();
		Assignment.findlargest();
		  Assignment.evenodd();
		Assignment.printevenodd();
		Assignment.factorial();
		Assignment.gentable();
		Assignment.adddigits();
		Assignment.reverse();
		Assignment.febinocci();
		Assignment.printevenodd2();
		Assignment.printevenodd1();
		Assignment.gentablewhile();
		Assignment.gentable2();
		
	}
	
	public static void checkfun()
	{
		 Scanner reader=new Scanner(System.in);
		 System.out.println("Please enter a integer  :");
		 
		 int age=reader.nextInt();
		 System.out.println(age);
		 
		 if (age >= 18)
		 {
			 System.out.println("He/she eligible for voting");
		 }
		 else
		 {
			 System.out.println("He/she  not eligible for voting"); 
		 }
	}
	public static void checksign()
	{
		Scanner reader=new Scanner(System.in);
		 System.out.println("Please enter a integer  :");
		 
		 int age=reader.nextInt();
		 System.out.println(age);
		 if(age>0)
		 {
			 System.out.println("it is positive number"); 
		 }
		 else if(age<0)
		 {
			 System.out.println("it is negative number");
		 }
		 else if(age==0)
		 {
			 System.out.println("it is Zero"); 
		 }
		 reader.close();
	}
	public static void findlargest()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("please enter integer   :");
		int firstnumber=reader.nextInt();
		int secondnumber=reader.nextInt();
		
		System.out.println(firstnumber + "," +secondnumber);
		if (firstnumber>secondnumber)
		{
			System.out.println("first number is greater than second");
		}
		else if (firstnumber < secondnumber)
		{
			System.out.println("first number is less than second");
		}
		else
		{
			System.out.println("first number is eual to second");
		}
		reader.close();
	}
	public static void evenodd()

		{
			Scanner reader=new Scanner(System.in);
			System.out.println("please enter integer   :");
			int number=reader.nextInt();
			if (number % 2== 0)
			{
				System.out.println("Number is even");
			}
			else
			{
				System.out.println("Number is Odd");
			}
		}
	public static void printevenodd()
		{
			for(int i=0;i<20;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even  umber:  " + i);
				}
				else
				{
					System.out.println("Odd Number:  " + i);
				}
			}
		}
	public static void factorial()
		{
			Scanner reader=new Scanner(System.in);
			System.out.println("please enter integer   :");
			int number=reader.nextInt();
			int i=1;
			int fact=1;
			while(i<=number)
			{
				fact=fact * i;
				i++;
			}
			System.out.println("factorial of :" + number + "is:" + fact);
		}
	public static void gentable()
		{
			Scanner reader=new Scanner(System.in);
			System.out.println("please enter integer   :");
			int number=reader.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(number + "* "+ i+"= " + number * i);
			}
		}
	public static void adddigits()
		{
			Scanner reader=new Scanner(System.in);
			System.out.println("please enter integer   :");
			int number=reader.nextInt();
			int n=0;
			while (number >0)
			{
			 n=n+number % 10;
			 number=number/10;
			}
			System.out.println("after adding :" + ":"+n);
			
			
		}
	public static void reverse()
		{
			Scanner reader=new Scanner(System.in);
			System.out.println("please enter integer   :");
			int number=reader.nextInt();
			String n="";
			while(number>0)
			{
				n=n+String.valueOf(number%10);
				number=number/10;
			}
			System.out.println("after Reverse :" + ":"+n);
			}
	public static void febinocci()
		{
			int a=0;
			int b=1;
			int c;
			System.out.println(a);
			System.out.println(b);
			for(int i=2;i<10;i++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.println(c);
			}
		}	

public static void printevenodd1()
{
	int number=20;
	int i=1;
	while(i<=number)
	{
		if(i%2==0)
		{
			System.out.println(i+":is number is Even");
		}
		else
		{
			System.out.println(i+": is number is odd");	
		}
		i=i+1;
	}
}
public static void printevenodd2()
{
	int number=20;
	int i=1;
	do
	{
		if(i%2==0)
		{
			System.out.println(i+":is number is Even");
		}
		else
		{
			System.out.println(i+": is number is odd");	
		}
		i=i+1;
	} 
	while(i<=number);
}

public static void gentablewhile()
{
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter integer   :");
	int number=reader.nextInt();
	int i=1;
	while(i<=10)
	{
		System.out.println(number + "* "+ i+"= " + number * i);
		i++;
	}
}
public static void gentable2()
{
	Scanner reader=new Scanner(System.in);
	System.out.println("please enter integer   :");
	int number=reader.nextInt();
	int i=1;
	do
	{
		System.out.println(number + "* "+ i+"= " + number * i);
	     i++;
	}while(i<=number);
}
public static void febinocci1()
{
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	int i=2;
	while(i<10)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		i++;
	}
}
public static void febinoccidowhile()
{
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	int i=2;
	do
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		i++;
	}while(i<10);
}	


}


	


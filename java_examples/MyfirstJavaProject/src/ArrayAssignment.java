import java.util.HashMap;
import java.util.Scanner;




public class ArrayAssignment {

	public static void main(String[] args) {
		//Function call
		//Question1();
		int[] empid= {001,002,003,004,005};
		String[] empname= {"john","paul","suma","laura","cindy"};
		double[] salary= {5000,6000,7000,8000,9000};
		//Display d=new Display();
		//d.display(empid);
		//d.display(empname);
		//DisplayQuestion3 d1=new DisplayQuestion3();
		//String name=getname();
		//System.out.println(name);
		// d1.display(name, empid, empname, salary);
		 menu();
		
		
	}
	public static void menu()
	{
	   String[] drinks= {"orange","mango","Pineapple"};
	   int[] price= {20,40,50};
	   System.out.println("_______Menu_____");
	   System.out.println("Drinks  "+"    Price");
	   
	   for(int i=0;i<3;i++)
	   {
		   System.out.println(drinks[i] +"   "+price[i]);
	   }
	   Scanner reader=new Scanner(System.in);
	   System.out.println("please enter Drink  :");
		  System.out.println();
		  String name=reader.nextLine();
		  
		  System.out.println("please enter no of drinks :");
 
		  int noofdr=reader.nextInt();
		  
		  for(int i=0;i<3;i++)
		  {
		  if(drinks[i].equalsIgnoreCase(name))
		  {
			  int total=price[i]*noofdr;
			  System.out.println("Total bill for the drinks is:" + total);
			  break;
		  }
		  //Map<String, Integer> map=new HashMap<String,Integer>();
		  
		  
		  
		  }
		  
	}
	
	public static String getname()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("please enter EmployeeName   :");
		  System.out.println();
		  String name=reader.nextLine();
		  return name;
	}  
		// TODO Auto-generated method stub
public static void Question1()
{
  int[] ID;
  String[] name;
  int[] Salary;
  
  ID=new int[5];
  name=new String[5];
  Salary=new int[5];
  Scanner reader=new Scanner(System.in);
  Scanner reader1=new Scanner(System.in);
  Scanner reader2=new Scanner(System.in);
  for(int i=0;i<5;i++)
  {
  
  System.out.println("please enter EmployeeID  :");
  System.out.println();
  ID[i]=reader.nextInt();
 
  
  System.out.println("please enter EmployeeName   :");
  System.out.println();
  name[i]=reader1.nextLine();
  
  System.out.println("please enter EmployeeSalaray <10000$   :");
  System.out.println();
  Salary[i]=reader2.nextInt();
  
  }
  System.out.println("ID  name  salary");
  for(int i=0;i<5;i++)
  {
    System.out.println( ID[i] +"  "+name[i]+"   "+Salary[i]);
  }
	}
}
class Display
{
	
	//Declare Two function loading methods
	public void display(int[] EmpID)
	{
		int l=EmpID.length;
		for(int i=0;i<l;i++)
		{
			System.out.println(EmpID[i]);
		}
	}
	public void display(String[] EmpName)
{
		int l=EmpName.length;
		for(int i=0;i<l;i++)
		{
			System.out.println(EmpName[i]);
		}
	
}
}
class DisplayQuestion3 
{
	
		
	
	public void display(String name,int regno[],String Empname[],double salary[])
	{
		int l=Empname.length;
		System.out.println("NAme  ID  Salary");
		System.out.println("=================");
		for(int i=0;i<l;i++)
		{
			if(Empname[i].equalsIgnoreCase(name))
			{
				System.out.println(name +"  "+regno[i]+"  "+salary[i]);
			}
		}
	
	}
}


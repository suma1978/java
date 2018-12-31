import java.util.Scanner;

public class Callbyreference {

	static String Phnoval="56789234";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
      Callbyreference c1=new Callbyreference();
      makeaCall(c1);
      message(c1);
      receiveCall(c1);
	}
	
public static void makeaCall(Callbyreference call)
{
	Scanner reader=new Scanner(System.in);
    System.out.println("Enter a 10 digit phno:");
     Phnoval=reader.nextLine();
	call.Phnoval=Phnoval;
	System.out.println("Making call");
}
public static  void message(Callbyreference call)
{
	System.out.println("Received Message from " + call.Phnoval + "as  :HI,");
}
public static void receiveCall(Callbyreference receive)
{
	System.out.println("Received call from :" + receive.Phnoval);
}
}


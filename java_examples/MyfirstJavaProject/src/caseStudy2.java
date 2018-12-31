import java.util.Scanner;

public class caseStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("please enter what type of ticket buying?   :");
		String typeticket=reader.nextLine();
	    System.out.println(typeticket);
	    int totPrice=0;
	    System.out.println(typeticket.toLowerCase());
        if(typeticket.toLowerCase().equals("silver"))
        {
        	totPrice=2*150;
        	System.out.println(typeticket +" Price for 2 is :"+totPrice);
        }
        else if(typeticket.toLowerCase().equals("golden"))
        {
        	totPrice=2*200;
        	System.out.println(typeticket +" Price for 2 is :"+totPrice);
        }
        
        
	}

}

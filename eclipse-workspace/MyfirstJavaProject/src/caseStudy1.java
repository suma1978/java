import java.util.Scanner;

public class caseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ticketPrice=400;
		int totalPrice=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("please enter no of Tikets   :");
		int noTickets=reader.nextInt();
		if(noTickets>10)
		{
			totalPrice=(ticketPrice*noTickets)-(ticketPrice*noTickets)*10/100;
			System.out.println("you have received 10% discount:" + totalPrice);
		}
		else
		{
			totalPrice=ticketPrice*noTickets;
			System.out.println("your total ticket amount is :"+totalPrice);
		}

	}

}

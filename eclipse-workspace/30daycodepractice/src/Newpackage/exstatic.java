package Newpackage;

public class exstatic {
	public static int x=2;
	public int y=4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exstatic a=new exstatic();
		exstatic b=new exstatic();
		a.x=4;
		b.y=5;
		a.y=6;
		b.x=10;
		System.out.println("a.y = " + a.y); 
		System.out.println("b.y = " + b.y); 
		System.out.println("a.x = " + a.x); 
		System.out.println("b.x = " + b.x); 
		System.out.println("exstatics.x = " + exstatic.x);

	}

}

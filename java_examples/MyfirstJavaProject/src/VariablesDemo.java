

/** 
 * Q. What are Local, Instance and Class variables?
 * Variables in java can be Local, Instance or Class type, based on the scope/visibility
 * a.Local variable: 
 * Lifetime: Created at the beginning of method execution and destroyed at the end of method execution
 * Scope:    Visible only in the method or block where it is declared
 * 
 * b.Instance/Member variable: 
 * Lifetime: Created when an object is created and destroyed when the object is garbage collected
 * Scope:    Visible to all the methods in the class and created per each object of class
 * 
 * c.Class/Static variable:
 * Lifetime: Created when the program starts(loaded by JVM) and destroyed when the program quits.
 * Scope:    Visible to all the methods in the class and created per class
 */
public class VariablesDemo {
	//int a = 20; //Instance variable
	static int a = 20; //Class variable
	
	private void method1() {
		int a = 10; //Local variable
		/*System.out.println("Value of a in method1: " + a);
		System.out.println("Value of this.a in method1: " + this.a);*/
		this.a = 30;
	}
	
	private void method2() {
		System.out.println("Value of a in method2: " + a);
	}
	
	public static void main(String[] args) {
		VariablesDemo demo1 = new VariablesDemo();
		demo1.method1();
		demo1.method2();
		
		VariablesDemo demo2 = new VariablesDemo();
		demo2.method2();
	}	
}
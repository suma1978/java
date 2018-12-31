package Multithread.ex;

class Task
{
	void task()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(".....Task........"+ i);
		}
	}
}
class Mythread extends Thread
{
	public void run()
	{
	for(int i=0;i<10;i++) {
		System.out.println(".....Mythread........" + i);
		
	}
	}
}
public class threading {
	public static void main(String[] args)
	{
		Mythread mt=new Mythread();
		mt.start();
		//Task t= new Task();
		//t.task();
	
		System.out.println("Main thread started ");
		for(int i=0;i<10;i++) {
			System.out.println(".....Main........" + i);
			
		}
		System.out.println("Main Thread has ended");
	}
	

}

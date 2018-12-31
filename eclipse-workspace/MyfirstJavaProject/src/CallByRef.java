
public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj=new sample(5);
		increase(obj);
		obj.show();

	}
	static void increase(sample p)
	{
	p.data=p.data+1;	
	}

}

class sample
{
	int data;
	sample (int d)
	{
		data=d;
		System.out.println("Data in Sample: "+data);
		
	}
	void show()
	{
		System.out.println("Data : "+data);
	}
	public void area(int x,int y)
	{
		
	}
	public float area(int x,float y)
	{
		return 3;
	}
	public void area(float x,float y)
	{
		
	}
}


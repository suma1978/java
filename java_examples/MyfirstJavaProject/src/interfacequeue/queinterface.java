package interfacequeue;



public class queinterface implements queueinterface{
	
public int capacity;
public int qarray[];
int front=0;
int rear=-1;
int currentsize=0;
queinterface(int queuesize)
{
	this.capacity=queuesize;
qarray=new int[this.capacity];
}
@Override
public void enqueue(int element) {
	// TODO Auto-generated method stub
	if(isqueuefull())
	{
		System.out.println("Queue is Full can't insert");
	}
	else
	{
		rear++;
		if(rear==capacity-1)
		{
			rear=0;
		}
		qarray[rear]=element;
		currentsize++;
		System.out.println("Element is inserted");
		
	}
	   
	
}
@Override
public void dequeue() {
	// TODO Auto-generated method stub
	if(isqueueempty())
	{
		System.out.println("Queue is empty");
	}
	else
	{
		
		front++;
		if(front==capacity-1)
		{
			front=0;
		}
		System.out.println("Front value is :"+front);
		System.out.println("POP OPERATION IS DON ON ELEMENT :"+qarray[front-1]);
		
		currentsize--;
		//System.out.println("Current Size is:"+currentsize);
		
	}
	
}
@Override
public boolean isqueuefull() {
	// TODO Auto-generated method stub
	boolean status=false;
	if(currentsize==capacity)
	{
		status=true;
	}
	return status;
}
@Override
public boolean isqueueempty() {
	// TODO Auto-generated method stub
	boolean status=false;
	if(currentsize==0)
	{
		status=true;
	}
	return status;
}
public void display()
{
	for(int i=front;i<=rear;i++)
	{
		System.out.println("Element in array is:"+qarray[i]);
	}
}

public static void main(String[] args)
{
	queinterface Q=new queinterface(5);
	Q.enqueue(10);
	
	
	Q.display();
	Q.dequeue();
	Q.display();
	Q.enqueue(60);
	Q.display();
}

	
	

}


import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
class Linkedlist {
	
	 public static  Node insert(Node head,int data) {
	        //Complete this method
		
		 Node new_node=new Node(data);
		 if(head==null) {
	        
	        head=new_node;
	        
	        return head;
		 }
	        Node last = head;  
	        while (last.next != null) 
	            last = last.next; 
	  
	        /* 6. Change the next of last node */
	        last.next = new_node; ;
			 
		 
		 return head;
	    }
public static Node insertpos(Node head,int pos,int data)
{
	Node new_node=new Node(data);
	
	Node current=head;
	Node previous=null;
	while(pos>=0)
	{
		if(pos==0)
		{
			
			new_node.next =current;
			previous.next=new_node;
			
			System.out.println("reached here");
		}
		else
		{
			previous=current;
		current=current.next;
		}
		pos--;
		
	}
	
	
	return head;
}
public static Node DeleteNode (Node head,int pos)
{
	
	
	Node current=head;
	Node previous=null;
	while(pos>=0)
	{
		if(pos==0)
		{
			
			
			previous.next=current.next;
			
			
			System.out.println("reached here");
		}
		else
		{
			previous=current;
		current=current.next;
		if(current==null)
		{
			break;
			
		}
			
		}
		pos--;
		
	}
	
	
	return head;
}
		public static void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Node head = null;
	        int N = sc.nextInt();

	        while(N-- > 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	            
	        }
	        display(head);
	       // head=insertpos(head,3,8);
	        head=DeleteNode(head,7);
	        display(head);
	       sc.close();
	    }
	    
	    static int[] reverseArray(int[] a) {

            int[] returnArr=new int[a.length];
            int index=a.length-1;
            for(int i=0;i<a.length;i++)
            {
            	returnArr[index]=a[i];
            	index--;
            	
            }
			return returnArr;
            
   }   
	    public static void checkstr()
	    {
	    	}

}


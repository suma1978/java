package Newpackage;
import java.math.BigInteger;
import java.util.*;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class Binarysearch {
	
	static int leftdepth=1;
	 static int rightdepth=1;
	 static int depth=0;
	
	public static int getHeight(Node root){
	      //Write your code here
	      Node curr=root;
	      
	      if(root==null)
	      {
	          return -1;
	      }
	      else 
	           
	    	  
	    	
	    	  
	         
	      {
	      return 1+ Math.max(getHeight(root.left), getHeight(root.right));
	      }
	      
	    }
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
           // Scanner sc=new Scanner(System.in);
            //int T=sc.nextInt();
            //Node root=null;
            //while(T-->0){
             //   int data=sc.nextInt();
               // root=insert(root,data);
           // }
           // int height=getHeight(root);
            //System.out.println(height);
            
           // String s=twoStrings("hi","world");
            //
    	//System.out.println(s);
    	int[] arr= {2 ,3,4,5,6,7,8,9,10,1};
    	/*String[] res=bigSorting(arr);
    	for(int i=0;i<6;i++)
    	{
    		System.out.println(res[i]);
    	}*/
    	insertionSort1( 10, arr);
    	//insertionsort(5,arr);
        }	
    
    static String twoStrings(String s1, String s2) {
          char[] str1=new char[s1.length()];
          char[] str2=new char[s2.length()];
         str1= s1.toCharArray();
         str2=s2.toCharArray();
         for(int i=0;i<s1.length();i++)
         {
        	 for(int j=0;j<s2.length();j++)
        	 {
        		 if(str1[i]==str2[j])
        		 {
        			 return "YES";
        		 }
        		 else
        		 {
        			 continue;
        		 }
        	 }
         }
         return "NO";
    }
    static String twoStrings1(String s1, String s2) {

        char[] str1=new char[s1.length()];
      char[] str2=new char[s2.length()];
     str1= s1.toCharArray();
     str2=s2.toCharArray();
     
     for(char c:s1.toCharArray()){
         for(char d:s2.toCharArray()){
             if(c==d)
             {
                 return "YES";
             }
             else
             {
                 continue;
             }
         }
     }
     return "NO";
}
    static long repeatedString(String s, long n) {
     char[] str=new char[s.length()];
     str=s.toCharArray();
     int count=0;
     for(int i=0;i<n;i++) {
    	 str[i]=str[i];
     }
     for(char c:s.toCharArray())
     for(int i=0;i<str.length;i++)
     {
    	 if(str[i]=='a')
    	 {
    		 count++;
    	 }
     }
     while(s.length()<n) {
    	 
    	 s=s.concat(s);
     }
     return 0;
    }

    static String[] bigSorting(String[] unsorted) {

        long[] arr=new long[unsorted.length];
        
       /* String temp;
        for(int i=0;i<unsorted.length;i++) {
        	for(int j=0;j<unsorted.length-1;j++) {
        		
        		
        		
        		if(unsorted[j].length()>unsorted[j+1].length())
        				{
        					temp=unsorted[j];
        					unsorted[j]=unsorted[j+1];
        					unsorted[j+1]=temp;
        				}
        	}
        	
        }*/
        
        Arrays.sort(unsorted,new Comparator<String>() {
        	public int compare(String a ,String b)
        	{
        		if(a.length()==b.length())
        			return a.compareTo(b);
        		return a.length()-b.length();
        	}
		});
        
        return unsorted;
    }
    static void insertionSort1(int n, int[] arr) {
    			int lastval=arr[n-1];
    			for(int i=n-2;i>=0;i--)
    			{
    				if(arr[i]>lastval)
    				{
    					//System.out.println(i);
    					arr[i+1]=arr[i];
    					
    					
    				}
    				else if(arr[i]<lastval){
    					arr[i+1]=lastval;
    					
    					for(int j=0;j<n;j++)
        				{
        					System.out.print(arr[j]+" ");
        				}
    					break;
    				}
    				
    				for(int j=0;j<n;j++)
    				{
    					System.out.print(arr[j]+" ");
    				}
    				System.out.println();
    			}
    			if(arr[1]>lastval)
    			{
    				if(arr[0]>lastval)
    				{
    					arr[1]=arr[0];
    					
    					arr[0]=lastval;	
    				}
    				else
    				{
    					arr[1]=lastval;
    				
    				}
    				for(int j=0;j<n;j++)
    				{
    					System.out.print(arr[j]+" ");
    					
    				}
					//System.out.println();
    			}
    			

    }
    

}

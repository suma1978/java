package Newpackage;
import java.util.*;

public class prime {
	
	public static void main(String[] args) {
        /* Enter your code here. 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = sc.nextInt();
        }
        for(int j=0;j<intArray.length;j++)
        {
        for(int i=2;i<=intArray[j]/2;i++)
        {
            if(intArray[j]%i==0)
            {
             flag=false;
             
             break;
            }
            else
            { 
            	flag=true;
            	continue;
            }
            
        }
        if(flag==true)
        {
        	System.out.println("Prime");
        }
        else
        	System.out.println("Not prime");
        
    }*/
		int[] arr= {5,7,4,3,8};
		int[] result=new int[arr.length];
		result=quickSort(arr);

}
	
	static int[] quickSort(int[] arr) {
	      int p=arr[0];
	      
	      ArrayList<Integer> leftarr=new ArrayList<>();
	      int[] leftarr1=new int[arr.length/2];
	      List<Integer> rightarr=new ArrayList<Integer>();
	      List<Integer> equalarr=new ArrayList<Integer>();
	      List<Integer>  combined=new ArrayList<Integer>();
	      int[] rightarr1=new int[arr.length/2];
	      for(int i=0;i<arr.length;i++)
	      {
	    	  if(arr[i]<p)
	    	  {
	    		  leftarr.add(arr[i]);
	    		  leftarr.sort(null);
	    		  
	    	  }
	    	  else if(arr[i]>p)
	    	  {
	    		  rightarr.add(arr[i]);
	    		  rightarr.sort(null);
	    	  }
	    	  else if(arr[i]==p)
	    	  {
	    		  equalarr.add(arr[i]);
	    	  }
	      }
	      combined.addAll(leftarr);
	      combined.addAll(equalarr);
	      combined.addAll(rightarr);
	      int[] partitionarr=new int[combined.size()];
	      for(int j=0;j<combined.size();j++)
	      {
	    	  partitionarr[j]=combined.get(j);
	    	  System.out.println(partitionarr[j]);
	      }
	      return partitionarr;
	    }
	
	public void test() {
		
		List<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(40); 
  
        Integer[] arr = new Integer[al.size()]; 
        arr = al.toArray(arr); 
  
        for (Integer x : arr) 
            System.out.print(x + " "); 
		
	}
	 static int minimumSwaps(int[] arr) {
		 
		 int min=arr[0];
		 int max=arr[0];
		 int maxind=0,minind=0,count=0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 for(int j=0;j<arr.length;j++)
			 {
				 if(arr[j]>=max)
				 {
					 max=arr[j];
					 maxind=j;
				 }
				 else if(arr[j]<=min)
				 {
					 min=arr[j];
					 minind=j;
				 }
				 
			 }
			      arr[maxind]=max;
			      arr[minind]=min;
			      count++;
			 
		 }
		 return count;
		 
		 


	    }
}

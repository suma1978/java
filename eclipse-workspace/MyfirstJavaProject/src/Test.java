import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         int bal=100000 ;
         int amt;
         amt=90000;
         boolean withdraw;
       
       bal=bal-amt;
       if(bal<=5000)
       {
    	   IOException e=new IOException();
    	   throw(e);
       }
       else
    	   withdraw=true;
       System.out.println("Can i Withdraw money:" + withdraw);
       
	}

}

package interfaceexample;

public class interfaceclass implements Interface1{
	
 @Override
 public double area(double length,double breadth)
 {
	 return(length*breadth);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          interfaceclass area1=new interfaceclass();
          System.out.println(area1.area(10.5, 20.8));
          
          
          
	}

}

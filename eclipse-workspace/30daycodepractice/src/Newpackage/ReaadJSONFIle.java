package Newpackage;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;



public class ReaadJSONFIle {
	

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		Object obj=new JSONParser().parse(new FileReader("JSONExample.json"));
		JSONObject jo=(JSONObject)obj;
		String firstname=(String)jo.get("firstName");
		String lastname=(String)jo.get("lastname");
		System.out.println(firstname); 
        System.out.println(lastname); 
        long age=(long)jo.get("age");
        System.out.println(age);
        Map address=((Map)jo.get("address"));
        Iterator<Map.Entry> itr1=address.entrySet().iterator();
        while(itr1.hasNext())
        {
        	Map.Entry pair=itr1.next();
        	System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        
        //Phone no is in array
        JSONArray ja=(JSONArray) jo.get("phonenumber");
        //getting numbers
        Iterator itr2=ja.iterator();
        while (itr2.hasNext())  
        { 
            itr1 = ((Map) itr2.next()).entrySet().iterator(); 
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                System.out.println(pair.getKey() + " : " + pair.getValue()); 
            } 
        } 
        		
        

	}

}

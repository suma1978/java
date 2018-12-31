package Newpackage;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class JSONFileparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject jo=new JSONObject();
		jo.put("firstName", "John");
		jo.put("lastname", "Smith");
		jo.put("age", 25);
		
		Map m=new LinkedHashMap();
		
		
		m.put("Street Address","21 2nd Street" );
		m.put("city", "New York");
		m.put("State","NY");
		m.put("ZipCode",1748);
		
		jo.put("address", m);
		
		JSONArray ja=new JSONArray();
		
		m=new LinkedHashMap();
		m.put("type","home" );
		m.put("number","212 555-1234");
		ja.add(m);
		m=new LinkedHashMap();
		m.put("type", "fax"); 
        m.put("number", "212 555-1234");
        ja.add(m);
        
      jo.put("phonenumber", ja);
      
      try {
		FileWriter fw=new FileWriter("JSONExample.json");
		fw.write(jo.toJSONString());
		fw.flush();
		fw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      finally
      {
    	  
      }
		

	}

}

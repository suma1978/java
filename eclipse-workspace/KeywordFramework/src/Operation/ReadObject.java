package Operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	Properties p=new Properties();
	public Properties getobjectRepository() throws IOException
	{
		
		FileInputStream stream=new FileInputStream(new File(System.getProperty("user.dir") + "/src/Object/object.properties"));
	     p.load(stream);
	     return p;
	
	}
	

}

package propertyfiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperty {
	
	public static void main(String[] args) throws IOException
	{
		
	String s="src/test/resources/Prop/extent.prop";
	
	Properties p= new Properties();
	
	FileOutputStream fos=new FileOutputStream(s);
	
	p.setProperty("extent.reporter.spark.start","true");
	p.setProperty("extent.reporter.spark.out","SparkReport.html");
	
	p.store(fos, "File Created");
	
	fos.close();
	
	System.out.println("Check the Property file");
	
	
	}

}

package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class testData_properties {
	
	public Properties property = new Properties();
	File testfile = new File("testData_properties");
	
	public testData_properties() throws IOException {
		
		FileInputStream file = new FileInputStream(testfile);
		property.load(file);
		file.close();
		
	}

}

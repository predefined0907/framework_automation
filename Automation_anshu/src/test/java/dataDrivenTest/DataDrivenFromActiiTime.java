package dataDrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDrivenFromActiiTime {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("./src/test/resources/actitimedata.properties");
	Properties pobj = new Properties();
	pobj.load(file);
	
	String browserName = pobj.getProperty("browser");
    System.out.println("browserName: "+browserName);
	
	
	
}
}


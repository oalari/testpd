package timeEntryPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileread {
public static Properties prop;
	
	public static void file() throws IOException{
		
		String path = "C:\\Users\\Acer\\Desktop\\t1.properties";
		
		File f = new File(path);
		FileInputStream fs = new FileInputStream(f);
		 prop = new Properties();
	try {	prop.load(fs);	} catch (IOException e) {
	       // TODO Auto-generated catch block
	       e.printStackTrace();	}

}
}
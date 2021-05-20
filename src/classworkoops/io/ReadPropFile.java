package classworkoops.io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\GlobalProp.properties");
		
		Properties pro = new Properties();
		pro.load(in);
		
		System.out.println(" Url :" + pro.getProperty("URL"));
		System.out.println(" browser :" + pro.getProperty("browser"));
		System.out.println(" username :" + pro.getProperty("username"));
		System.out.println(" userpwd :" + pro.getProperty("userpwd"));
		System.out.println(" user :" + pro.getProperty("user"));//returns null if key not present
		System.out.println(" 1 :" + pro.getProperty("1"));
	}

}

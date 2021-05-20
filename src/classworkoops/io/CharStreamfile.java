package classworkoops.io;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamfile {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = null;
		String mystr = "This is my char stream file";
		try {
			fw = new FileWriter("CharStreamfile.txt");
			fw.write(mystr);
			fw.append("\nThis is second line ");//it will add the additional line (append and write does the same job)
			fw.write("\nLast line");
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			fw.close();
		}
		System.out.println("file created");
	}

}

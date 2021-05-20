package classworkoops.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamCopyFile {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("CharStreamfile.txt");
			fw = new FileWriter("CopiedCharStreamfile.txt");
			int c = fr.read();
			while(c!= -1) {
				fw.write(c);
				c= fr.read();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fr.close();
			fw.close();
		}
		System.out.println("file copied");
		
		
	}

}

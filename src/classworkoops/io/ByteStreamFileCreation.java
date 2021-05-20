package classworkoops.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFileCreation {

	public static void main(String[] args) throws Exception  {
		
		FileOutputStream fout = null;
	     String outText = "My first byte stream file";
		try {
			fout = new FileOutputStream("ByteStreamFile.txt");// generaly we use txt fromat/tat format. we dont use doc format.
			fout.write(outText.getBytes());
			fout.write("\nSecond line of byte stream".getBytes());
		    }catch (Exception e) {
				e.printStackTrace();		
		    }finally {
		    	fout.close();//close the stream
		    }
		  System.out.println("byte file created");
	}

}

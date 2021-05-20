package classworkoops.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyfile {

	public static void main(String[] args) throws Exception {
      FileInputStream fin= null;
      FileOutputStream fout = null;
      
      
      try {
    	  fin = new FileInputStream("ByteStreamFile.txt");
    	  fout = new FileOutputStream("CopiedBytestream.txt");
    	  
    	  int b = fin.read();
    	  while(b!=-1) {
    		  fout.write(b);
    		  b = fin.read();
    	  }
      } catch (Exception e ) {
    	  e.printStackTrace();
      }finally {
    	  fin.close();
    	  fout.close();
      }
      System.out.println("copied file");
      }
	}



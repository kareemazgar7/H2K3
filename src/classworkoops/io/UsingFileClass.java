package classworkoops.io;

import java.io.File;
import java.io.IOException;

public class UsingFileClass {

	public static void main(String[] args) throws Exception {
//		
//		File file = new File("ByteStreamFile2.txt");
//		System.out.println("is exist:  "  +file.exists());
//		System.out.println("is file created : "  +file.createNewFile());
//		System.out.println("absulate path : "  + file.getAbsolutePath());
//		System.out.println("getParent : "  + file.getParent());
//		System.out.println("getPath : "  + file.getPath());
//		System.out.println("getName : "  + file.getName());
//		System.out.println("file length : "  + file.length());
//		System.out.println("canRead : "  + file.canRead());
//		System.out.println("canWrite : "  + file.canWrite());
//		System.out.println("setReadOnly : "  + file.setReadOnly());
//		System.out.println("canWrite : "  + file.canWrite());
//		System.out.println("isFile : "  + file.isFile());
//		System.out.println("isDirectory : "  + file.isDirectory());
//		System.out.println("renameTo : "  + file.renameTo(new File("ByteStreamFile3.txt")));//rename/or move
		
//		File f = new File("ByteStreamFile3.txt");
//		System.out.println("file delete: "  +f.delete());
    	dirRelated();
		
		}
public static void dirRelated() throws Exception {
		File dir = new File("MyDirectory");
		System.out.println("exist : " + dir.exists());
		System.out.println("Created directory ? - > " + dir.mkdir());
		System.out.println("exist  : " + dir.exists());
		System.out.println("Is File : " + dir.isFile());
		System.out.println("Is Directory : " + dir.isDirectory());
		System.out.println("Absolute path : " + dir.getAbsolutePath());
		System.out.println("-----------------");
		File dir2 = new File(dir.getAbsolutePath() + "\\folder1\\folder2");
		System.out.println("exist : " + dir2.exists());
		System.out.println("Created directories ? - > " + dir2.mkdirs());
		System.out.println("exist  : " + dir2.exists());
		System.out.println("Is File : " + dir2.isFile());
		System.out.println("Is Directory : " + dir2.isDirectory());
		System.out.println("Absolute path : " + dir2.getAbsolutePath());
		dir2.renameTo(new File(dir.getAbsolutePath() + "\\folder1\\RenamedFolder"));
		
		File dir3 = new File( "C:\\Users\\karee\\eclipse-workspace\\H2k3\\MyDirectory\\folder1\\RenamedFolder");
		dir3.delete();
		
		File dir4 = new File( "C:\\\\Users\\\\karee\\\\eclipse-workspace\\\\H2k3\\\\MyDirectory\\\\folder1");
		File[] fileArr = dir4.listFiles();
		System.out.println("Files in the directory..");
		for(File tFile : fileArr) {
			System.out.println(tFile.getName());
		}
		
	}
}



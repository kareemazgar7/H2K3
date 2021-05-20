package classworkoops.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileNioDemo {

	public static void main(String[] args) throws Exception {
		//fileRelated();
		dirRelated();
	}
	
	public static void fileRelated() throws Exception {
		Path mypath = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\PathFile.txt");
		System.out.println("File exists-> " + Files.exists(mypath));
		if(!Files.exists(mypath)) {
			System.out.println("Creating file");
			Files.createFile(mypath);
		}
		System.out.println("File exists-> " + Files.exists(mypath));
		String content = " Hello there!";
		Files.write(mypath, content.getBytes());
		System.out.println("get Filename :" + mypath.getFileName());
		System.out.println("get name(0) :" + mypath.getName(0));
		System.out.println("get name(1) :" + mypath.getName(1));
		System.out.println("get parent :" + mypath.getParent());
		System.out.println("get root :" + mypath.getRoot());
		System.out.println("get subpath(0, 2) :" + mypath.subpath(0, 2));
		System.out.println("get filesystem :" + mypath.getFileSystem());
		System.out.println("get nameCount :" +mypath.getNameCount());
		System.out.println("is Absolute :" +mypath.isAbsolute());
		
		Path mypath2 = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\CopiedPathFile.txt");
		
		Files.copy(mypath, mypath2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Owner: " + Files.getOwner(mypath2));
		System.out.println("Is directory: " + Files.isDirectory(mypath));
		System.out.println("Is Executable: " + Files.isExecutable(mypath));
		System.out.println("Is Readable: " + Files.isReadable(mypath));
		System.out.println("Is Writable: " + Files.isWritable(mypath));
		
		System.out.println(" File comparison : " + Files.isSameFile(mypath, mypath2));
		System.out.println(" File comparison : " + Files.isSameFile(mypath, mypath));
		System.out.println(" Lines : " + Files.lines(mypath));
		System.out.println(" size : " + Files.size(mypath));
		Path myPath3 = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\MyDirectory\\MovedFile.txt");
		Files.move(mypath2, myPath3, StandardCopyOption.REPLACE_EXISTING) ;// Rename/Move (Cut and Paste)
		Files.delete(myPath3);
		
	}

	public static void dirRelated() throws Exception {
		Path mypath = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\niodir");
		System.out.println("Dir exists-> " + Files.exists(mypath));
		if(!Files.exists(mypath)) {
			System.out.println("Creating dir");
			Files.createDirectory(mypath);
		}
		System.out.println("Die exists-> " + Files.exists(mypath));
		System.out.println("get Dirname :" + mypath.getFileName());
		System.out.println("get name(0) :" + mypath.getName(0));
		System.out.println("get name(1) :" + mypath.getName(1));
		System.out.println("get parent :" + mypath.getParent());
		System.out.println("get root :" + mypath.getRoot());
		System.out.println("get subpath(0, 2) :" + mypath.subpath(0, 2));
		System.out.println("get filesystem :" + mypath.getFileSystem());
		System.out.println("get nameCount :" +mypath.getNameCount());
		System.out.println("is Absolute :" +mypath.isAbsolute());
		
		Path mypath2 = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\CopiedDir");
		
		Files.copy(mypath, mypath2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Owner: " + Files.getOwner(mypath2));
		System.out.println("Is directory: " + Files.isDirectory(mypath));
	
		Path myPath3 = Paths.get("D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\MyDirectory\\Movedfir");
		Files.move(mypath2, myPath3, StandardCopyOption.REPLACE_EXISTING) ;// Rename/Move (Cut and Paste)
		Files.delete(myPath3);
		
	}
	
}

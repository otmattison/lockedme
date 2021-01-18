package lockedme;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.*;
import java.util.*;

public class FileOp {
	
	String folderpath = "";
	
	public void showFilesInAscendingOrder(String input) {
		folderpath = input;
		System.out.println("------------");
		System.out.println("Showing files in ascending order");
		File[] files = new File(folderpath).listFiles();
		List<String> list = new ArrayList<String>();
		for(File file: files) {
			if(!file.isFile()) {
				continue;
			}
			list.add(file.getName());
		}
		list.forEach(System.out::println);
		System.out.println("--------");
		
	}
	
	
	
	
	
}

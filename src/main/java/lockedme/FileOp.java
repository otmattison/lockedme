package lockedme;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
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
		for (File file : files) {
			if (!file.isFile()) {
				continue;
			}
			list.add(file.getName());
		}
		list.forEach(System.out::println);
		System.out.println("--------");

	}

	public void addFile(String getFolder, String setFolder) {
		String filePath = getFolder;
		String appDirectory = setFolder;
		Path path = Paths.get(filePath);

		if (!Files.exists(path)) {
			System.out.println("Please provide a file path: ");
			return;
		}
		String newFilePath = appDirectory + "/" + path.getFileName();
		int inc = 0;
		while (Files.exists(Paths.get(newFilePath))) {
			inc++;
			newFilePath = appDirectory + "/" + inc + "_" + path.getFileName();
		}
		try {
			Files.copy(path, Paths.get(newFilePath));

		} catch (IOException e) {
			System.out.println("Unable to copy file to " + newFilePath);
		}

	}
	
	public void deleteFile(String input) {
		String deletePath = input;
		File f = new File(deletePath);
		try {
			boolean fstatus = f.delete();
			if(fstatus) {
				System.out.println("File is deleted");
			}else {
				System.out.println("Error file not deleted");
			}
		}catch(Exception e) {
			System.out.println("Exception has occured");
			e.printStackTrace();
		}
		
	}

}

package assignment;

import java.io.File;
import java.io.IOException;

public class FileAttributes {

	public static void main(String[] args) throws IOException {
		File f = new File("demo.txt");
		System.out.println("Absolute file: " + f.getAbsoluteFile());
		System.out.println("Absolute path: " + f.getAbsolutePath());
		System.out.println("Class: " + f.getClass());
		System.out.println("Name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Total space: " + f.getTotalSpace() + " Bytes");
		System.out.println("Free space: " + f.getFreeSpace() + " Bytes");
		System.out.println("Usable space: " + f.getUsableSpace() + " Bytes");
		System.out.println("Excutable: " + f.canExecute());
		System.out.println("Readable: " + f.canRead());
		System.out.println("Writable: " + f.canWrite());
		System.out.println("Exists: " + f.exists());

	}

}

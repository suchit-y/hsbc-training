package assignment;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		File f1 = new File(args[0]);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String line = "";
		try {
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
			}
			System.out.println("File copied...");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				System.out.println(e);
			}

		}
	}
}
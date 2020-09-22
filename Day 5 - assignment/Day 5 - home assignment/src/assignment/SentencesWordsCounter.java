package assignment;

import java.io.BufferedReader;
import java.io.FileReader;

public class SentencesWordsCounter {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		String[] words = null;
		int linesCount = 0, wordsCount = 0;
		try {
			fr = new FileReader("demo.txt");
			br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				linesCount++;
				words = line.split(" ");
				wordsCount += words.length;
			}
			System.out.println("Lines: " + linesCount);
			System.out.println("Words: " + wordsCount);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

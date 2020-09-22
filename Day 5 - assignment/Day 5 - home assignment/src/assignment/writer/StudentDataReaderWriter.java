package assignment.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import assignment.entity.Student;

public class StudentDataReaderWriter {
	public static Student[] StudentReader() throws Exception {
		FileReader fr = null;
		BufferedReader br = null;
		Student std[] = new Student[10];
		try {
			fr = new FileReader("StudentData.txt");
			br = new BufferedReader(fr);
			String line = "";
			String elements[] = null;
			int i = 0;
			while ((line = br.readLine()) != null) {
				elements = line.split(" ");
				// System.out.println(elements[1]);
				std[i] = new Student();
				std[i].setStdId(Integer.parseInt(elements[0]));
				std[i].setStdName(elements[1]);
				std[i].setStandard(Integer.parseInt(elements[2]));
				std[i].setSection(elements[3].charAt(0));
				i++;
			}
			return std;
		} catch (Exception e) {
			 System.out.println(e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				 System.out.println(e);
			}
		}
		return std;
	}

	public static void StudentWriter(Student[] std) throws Exception {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("StudentData.txt");
			bw = new BufferedWriter(fw);
			int i = 0;
			while (std[i] != null) {
				bw.write("" + std[i].getStdId() + " " + std[i].getStdName() + " " + std[i].getStandard() + " "
						+ std[i].getSection());
				bw.newLine();
				i++;
			}
		} catch (Exception e) {
			 System.out.println(e);
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception e) {
				 System.out.println(e);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Student std1[] = new Student[10];
		for (int i = 0; i < 5; i++) {
			std1[i] = new Student(i + 1, "Student" + (i + 1), 5, 'A');
		}

		StudentDataReaderWriter.StudentWriter(std1);
		Student[] std2 = StudentDataReaderWriter.StudentReader();

		for (int i = 0; std2[i] != null; i++)
			System.out.println(std2[i]);

	}

}

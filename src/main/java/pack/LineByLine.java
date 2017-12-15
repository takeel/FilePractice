package pack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class LineByLine {

	private static String fileRandom = "src/main/resources/pack/random";
	private static String fileWrite = "src/main/resources/pack/fileWrite.txt";
	private static BufferedReader br;
	private static BufferedWriter bw;

	/**
	 * to print textfiles line by line
	 */
	public static void printLine() {
		try {
			br = new BufferedReader(new FileReader(fileRandom));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	/**
	 * to print textfiles character by character
	 */
	public static void printChar() {
		try {
			br = new BufferedReader(new FileReader(fileRandom));
			int sCurrentLine;
			while ((sCurrentLine = br.read()) != -1) {
				System.out.print((char) sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	/**
	 * to write in textfiles
	 */
	public static void write() {
		try {
			bw = new BufferedWriter(new FileWriter(fileWrite));
			String content = "This is the content to write into file\n";
			bw.write(content);
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		write();
		printLine();
		printChar();
	}

}

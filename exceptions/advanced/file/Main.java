package exceptions.advanced.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	static void readFile(String filename) throws IOException, FileNotFoundException {
		FileReader reader = new FileReader(filename);
		int character;
		while((character = reader.read()) != -1) {
			System.out.print((char) character);
		}
		reader.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			readFile("sample.txt");
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found => " + e);
		}catch(IOException e) {
			System.out.println( e);
		}

	}

}

package exceptions.basic.file;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		String filename = "sample.txt";
		// for writing
		try {
			FileWriter writer = new FileWriter(filename);
			writer.write("Hello This is a sample text");
			writer.write(" Used to write Java sample text ");
			writer.close();
			System.out.println("File writing complete");
			
			
		}catch(IOException e) {
			System.out.println("An error occured writing to a file");
		}
		
		// for reading
		try {
			FileReader reader = new FileReader(filename);
			int character;
			System.out.println("Reading from a file");
			while((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
		}catch(IOException e) {
			System.out.println("An error occured reading from a file");
		}
		
		

	}

}

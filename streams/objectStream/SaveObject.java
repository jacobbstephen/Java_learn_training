package streams.objectStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObject {
	public static void main(String[] args) {
		StudentData  obj = new StudentData("Jacob", 22);
		try {
			ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("stddata.txt"));
			o.writeObject(obj);
			o.close();
			System.out.println("Done Serializing");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

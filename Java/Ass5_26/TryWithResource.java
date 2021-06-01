

import java.io.FileOutputStream;
import java.io.FileWriter;

public class TryWithResource {

	public static void main(String[] args) {
		try(FileWriter myFile=new FileWriter("Newfile.txt")){
			myFile.write("Welcome to India");
			myFile.close();
			System.out.println("Successfully File Writed");
		} catch (Exception e) {
			System.out.println("No File Found");
		}
	}
}

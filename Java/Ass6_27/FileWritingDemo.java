import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {
	public static void main(String[] args) {
		try {
			FileWriter myFile=new FileWriter("Newfile.txt");
			myFile.write("Welcome to India");
			myFile.close();
			System.out.println("Write Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

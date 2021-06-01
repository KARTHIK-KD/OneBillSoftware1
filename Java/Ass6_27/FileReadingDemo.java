import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingDemo {
	public static void main(String[] args) {
		File obj=new File("Newfile.txt");
		Scanner scan;
		try {
			scan = new Scanner(obj);
			while(scan.hasNextLine()) {
				String data=scan.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}

import java.io.File;
import java.io.IOException;

public class FileCreationDemo {
	public static void main(String[] args) {
		File file=new File("Newfile.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("file Successfully creater");
			}
			else {
				System.out.println("file already exits");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not creator");
			e.printStackTrace();
		}
	}

}

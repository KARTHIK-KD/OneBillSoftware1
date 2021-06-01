import java.io.File;

public class FileDeleteDemo {
	public static void main(String[] args) {
		File obj=new File("Newfile.txt");
		try {
			if(obj.delete()) {
				System.out.println("File Successfully deleted");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

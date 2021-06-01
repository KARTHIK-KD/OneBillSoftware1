import java.io.IOException;

public class ThrowsDemo2 {
	public static char promt(String str) throws IOException {
		System.out.print(str);
		return (char)System.in.read();
	}
	public static void main(String[] args) {
		char ch = 0;
		try {
			ch=promt("Enter the character : ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("your character is : "+ch);
	}

}

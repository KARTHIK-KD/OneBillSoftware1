
class generateDemo{
	public static void generate(int val) {
		int[] num=new int[2];
		try {
			switch(val) {
			case 0:System.out.println(20/val);break;
			case 1:num[3]=20;
					break;
			case 2:System.out.println("others");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("100% is working");
		}
	}
}

public class FinallyDemo2 {
	public static void main(String[] args) {
		for(int i=0;i<3;i++)
			generate(i);
	}

	private static void generate(int i) {
		// TODO Auto-generated method stub
		
	}

}

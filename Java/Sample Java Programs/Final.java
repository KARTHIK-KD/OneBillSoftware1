package sampe;

class ErrorMsg{
	final int OUTERR=0;
	final int INNERR=1;
	final int DISKERR=2;
	final int INDEXERR=3;
	String[] msgs= {"Output Error","Input Error","Disk Error","Index Error"};
	String getErrorMsg(int i) {
		if(i>=0 & i<msgs.length)
			return msgs[i];
		else
			return "Invalid code";
	}
}

public class Final {
	public static void main(String[] args) {
		ErrorMsg e=new ErrorMsg();
		System.out.println(e.getErrorMsg(0));
		
	}

}

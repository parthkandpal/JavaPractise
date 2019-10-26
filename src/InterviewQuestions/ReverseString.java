package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Selenium";
		int len=Str.length();  //8  (0-7)
		String reverse = "";
		for (int i=len-1;i>=0;i--) {
			
			reverse = reverse+ Str.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		
		//using StringBuffer
		StringBuffer sf=new StringBuffer(Str);
		System.out.println(sf.reverse());
	}

}

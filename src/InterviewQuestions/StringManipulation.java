package InterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="The Rains have started here selenium";
		
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("s")); //1st occurence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurence of s
		
		System.out.println(str.indexOf("s", str.indexOf("s")+str.indexOf("s")+1));
		
//		System.out.println(str.indexOf("s",str.indexOf("s", str.indexOf("s")+1)));//3rd occurence of s
		
		
	}

}

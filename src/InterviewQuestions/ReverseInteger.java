package InterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		int num=12345;
		int rev=0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num= num/10;
		}
		System.out.println("Reverse is "+ rev);
		
		//Using StringBuffer
		int num1=23456;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		System.out.println();
	}

}

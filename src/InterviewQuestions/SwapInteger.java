/**
 * 
 */
package InterviewQuestions;

/**
 * @author PARTH
 *
 */
public class SwapInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=3;
		int y = 5;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+" "+y);
		
		
		x=x*y;
		y=x/y;
		x=x/y;
		
		System.out.println(x+" "+y);
	
		//Using Xor
		x=x^y;
		y=y^x;
		x=x^y;
		System.out.println(x+" "+y);
		
		
	}

}

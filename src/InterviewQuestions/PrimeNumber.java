package InterviewQuestions;

//Prime Number is a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
//0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	public static void  getPrimeNumber(int num) {
		System.out.println("getting prime number upto"+ num);
		
		for (int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + " is a prime number");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("2 is prime number? " + isPrimeNumber(2));
		System.out.println("7 is prime number? " + isPrimeNumber(7));
		System.out.println("15 is prime number? " + isPrimeNumber(15));
		System.out.println("23 is prime number? " + isPrimeNumber(-23));
		
		getPrimeNumber(7);
	}

}

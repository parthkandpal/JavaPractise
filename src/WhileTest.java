
public class WhileTest {

	public static void main(String[] args) {

		StringBuffer string = new StringBuffer();
		char c;
		System.out.println("Enter a String");
		
		try {
			
			while((c=(char)System.in.read()) !='\n') {
				string.append(c);
			}
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
		
		System.out.println("You have entered....");
		System.out.println(string);

	}

}

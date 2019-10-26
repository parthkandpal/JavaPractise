package InterviewQuestions;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="String is";
		
		S= S.replaceAll(("[^a-zA-Z0-9]\\s"), "");
		System.out.println(S);
	}

}

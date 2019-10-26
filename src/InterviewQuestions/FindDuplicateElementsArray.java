package InterviewQuestions;

public class FindDuplicateElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"C","Java","Python","C","Ruby","Python","JS"};
		
		//1. compare each element
		for (int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;j++) {
				if(name[i]==name[j]) {
					
					System.out.println("Duplicate element " + name[i]);
				}
			}
		}
	}
}

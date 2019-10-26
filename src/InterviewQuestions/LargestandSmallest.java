package InterviewQuestions;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {-11,22,33,666,-84,9986};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest) {
				
				smallest=arr[i];
			}
		}
		
		System.out.println("Array "+ Arrays.toString(arr));
		System.out.println("largest number is "+largest);
		System.out.println("smallest number is "+smallest);
		
	}

}



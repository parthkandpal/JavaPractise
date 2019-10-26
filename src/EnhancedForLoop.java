import java.util.*;

public class EnhancedForLoop {

	public static void main(String[] args) {

		System.out.println();
		
		String states[]= {"Tamilnadu", "Andhra Pradesh", "Uttar Pradesh", "Rajasthan"};
		System.out.println(states);
		for(int i = 0; i<states.length;i++) {
			System.out.println("Standard for-loop : statename: "+ states[i]);
		}
		
		System.out.println();	
		for(String i:states) {
			System.out.println("Enhanced for loop: state name: " + i);
																			
	}
		System.out.println();
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Calcutta");
		cities.add("Chennai");
		System.out.println();
		
		for(int i=0;i<cities.size();i++) {
			System.out.println("Standard for-loop: city name :" + cities.get(i));
		}
		System.out.println();
		
		for(String city : cities) 
			System.out.println("Enhanced for loop: city name: "+ city);
			System.out.println();
			System.out.println("In Collections");
			System.out.println();
			printcollection(cities);
	}
			
	
	
	public static<AnyType> void printcollection(Collection<AnyType> c) {
				for (AnyType val:c)
					System.out.println(val);
			}
		
			
		
}


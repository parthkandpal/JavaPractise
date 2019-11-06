
public class FinalizeConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
//		garbage collector destroys all the object without reference to free space in memory
		
		System.gc();  // calling garbage collector
		
	}

		public void Finalize() {
			System.out.println("ran finalize");
		}
}

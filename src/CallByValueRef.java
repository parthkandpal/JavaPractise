
public class CallByValueRef {

	 int p;
	 int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueRef obj=new CallByValueRef();
		int x=20; int y=40;
		System.out.println(obj.testSum(x,y));
		
		
		
		
		obj.p=40;
		obj.q=50;
	}
	
	public int testSum(int a,int b) {
		
		
		a=30;
		b=40;
		int sum =a+b;
		return sum;
	}
	
	//call by ref  -- we are passing the value of object reference
	public void swap(CallByValueRef t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		

	}
	
}

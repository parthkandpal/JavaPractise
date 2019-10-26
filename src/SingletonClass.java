
public class SingletonClass {
	
	private static SingletonClass singletonInstance=null;
	public String str;
	
	private SingletonClass() {
		str="Hey! I am using Singleton Class";
	}
	
	public static SingletonClass getInstance() {
		if (singletonInstance==null) {
			singletonInstance=new SingletonClass();
		}
		return singletonInstance;
	}
	
	public static void main(String[] args) {
		SingletonClass a= new SingletonClass();
		
		System.out.println(a);
		SingletonClass x=SingletonClass.getInstance();
		SingletonClass y=SingletonClass.getInstance();
		SingletonClass z=SingletonClass.getInstance();
		
		
		x.str=(x.str).toUpperCase();
		z.str="modified for z";
		
		
		System.out.println(x.str + y.str+ z.str);
		
		System.out.flush();
		System.out.println("Flushed!");

	}

}

class Room {
	
	
	float length;
	float bredth;
	void getdata(float a, float b) {
		length = a;
		bredth = b;
	}
}
class RoomArea{
	public static void main(String[] args) {
		
		float area;
		Room room1= new Room();
		room1.getdata(14, 10);
		area= room1.length * room1.bredth;
		System.out.println("Area :" + area);

	}
	
}
/* Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.  */



public class Room {
	
		int roomNo;
		String roomType;
		float roomArea;
		boolean acMachine;
		void setData(int roomno, String roomt, float area, boolean acm) {
		roomNo = roomno;
		roomType = roomt;
		roomArea = area;
		acMachine = acm;
		}
		void displayData() {
		System.out.println("Room no : " +roomNo);
		System.out.println("Room Type : "+roomType);
		System.out.println("Room area : " +roomArea);
		String str = (acMachine) ? "yes" : "no";
		System.out.println("The ac machine needed:- " +str);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room01 = new Room();
		room01.setData(11, "Twin room", 249.0f, false);
		room01.displayData();
		
	}

}
/* Output:
 Room no : 11
Room Type : Twin room
Room area : 249.0
The ac machine needed:- no */

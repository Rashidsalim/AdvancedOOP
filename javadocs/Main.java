/**
 * <h1>Drivers Records</h1> The AddNum program implements an application that
 * This program simply displays drivers records
 * 
 * @author Rashid Salim
 * @version 1.0
 */
public class Main {
	public static void main(String[] args) {
		/**
		 * This method is used to display drivers details
		 * 
		 * @param driverName  This is the first paramter
		 * @param numberPlate This is the second parameter
		 * @return void This method returns nothing
		 */
		Car myCar = new Car();
		myCar.driverName = "Rashid";
		myCar.numberPlate = "KCP 108P";
		System.out.println("Drivers name is " + myCar.driverName + " and his number plate is " + myCar.numberPlate);
	}

}
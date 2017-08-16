package collections;

public class Parking {

	public static void main(String[] args) {
		ParkedCarOwnerList ownerList = new ParkedCarOwnerList();
		ParkedCar_OwnerDetails details = new ParkedCar_OwnerDetails("Basit", "Swift", "Camp", "1003", 841205111);
		ownerList.addNewCar(details);
	}

}

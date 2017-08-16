package collections;

class ParkedCar_OwnerDetails {
	private String ownerName, carModel, ownerAddress, carNo;
	private long ownerMobileNo;
	public ParkedCar_OwnerDetails(String ownerName, String carModel, String ownerAddress, String carNo,
			long ownerMobileNo) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.ownerAddress = ownerAddress;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	
}

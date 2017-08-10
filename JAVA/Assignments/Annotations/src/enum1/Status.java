package enum1;

public enum Status {
	
	NEW(1), REJECTED(2), ACCEPTED(3), COMPLETED(4);
	int value;
	private Status(int value){
		this.value=value;
	}
	public int getValue(){
		return this.value;
	}
}

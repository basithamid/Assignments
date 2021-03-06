package exception;

public class InsufficientBalanceException extends RuntimeException{
	private String message;
	public InsufficientBalanceException(){
		this.message="";
	}
	public InsufficientBalanceException(String message){
		this.message=message;
	}
	public String toString(){
		return "You do not have sufficient funds in your account"; 
	}
}

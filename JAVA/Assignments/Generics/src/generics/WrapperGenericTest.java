package generics;

class Example<T>{
	private T data;
	public void setData(T data){
		this.data=data;
	}
	public T getData(){
		return this.data;
	}
}

public class WrapperGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example<Integer> integerData = new Example<Integer>();
		integerData.setData(100);
		int x = integerData.getData();
		System.out.println(x);
		Example<String> stringData = new Example<String>();
		stringData.setData("Basit");
		System.out.println(stringData.getData());
	}

}

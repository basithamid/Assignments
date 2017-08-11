package exception;

public class AutoCloseableClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("File has been closed");
		
	}

}

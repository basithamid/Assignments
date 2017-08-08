abstract class Persistence{
	abstract public void persist();
}

class PersistenceFactory{
	public static Persistence getPersistence(){
		//return new FilePersistence();
		return new DataPersistence();
	}
}

class FilePersistence extends Persistence{
	public void persist(){
		System.out.println("Data is saved in file");
	}
}

class DataPersistence extends Persistence{
	public void persist(){
		System.out.println("Data is saved in database");
	}
}

public class PersistenceTest{
	public static void main(String args[]){
		Persistence p =  PersistenceFactory.getPersistence();
		p.persist();
	}
}
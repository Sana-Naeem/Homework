package hw6Q3Abstraction;

public interface College {
	//Interface can only define/declare abstract methods.
	
	public abstract void classSize();
	public abstract void playGround();
	public abstract void teacher();
	
	//College college = new College(); 
	//We cannot create a constructor inside the Interface because the Interface cannot instantiate thus, inhibiting it from creating any objects.
	
	

}

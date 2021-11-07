package hw6Q3Abstraction;

public abstract class EngineeringSchool {
	
	//This is an Abstract method-
	public abstract void mechanicalLab();
	
	//This is a Non-Abstract method-
	public void computerLab() {
		System.out.println("This is the Computer Lab.");
		
	}
	
	//EngineeringSchool engineeringSchool = new EngineeringSchool(); 
	//In an Abstract Class we cannot create a Constructor because it cannot instantiate thus, inhibiting it from creating any objects.
	
	

}

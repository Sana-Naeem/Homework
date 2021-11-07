package hw6Q3Abstraction;

public abstract class NursingSchool {
	
	//This is an Abstract method-
	 public abstract void hygiene();
	 
	 //This is a Non-Abstract method-
	 public void caring() {
		 System.out.println("Our Nursing School is Caring.");
		 
	 }


	 //NursingSchool nursingSchool = new NursingSchool();
	 //In an Abstract Class we cannot create a Constructor because it cannot instantiate thus, inhibiting it from creating any objects.

	 
}

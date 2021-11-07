package hw6Q3Abstraction;

public abstract class MedicalSchool {
	
	//This is an Abstract method-
	public abstract void anatomyLab();
	
	//This is a Non-Abstract method-
	public void biochemistryLab() {
		System.out.println("This is the Biochemistry Lab.");
		
	}
	
	//MedicalSchool medicalSchool = new MedicalSchool();
	//In an Abstract Class we cannot create a Constructor because it cannot instantiate thus, inhibiting it from creating any objects.


}

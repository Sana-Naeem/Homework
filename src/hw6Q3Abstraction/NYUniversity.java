package hw6Q3Abstraction;

public class NYUniversity {
	
	//This is an Abstract method-
	//public abstract void anthropology();
	//In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	
	public void physics() { 
		System.out.println("This is the Physic's Class.");	
	} //In a regular class we can only implement non-abstract methods.
	
	public NYUniversity() {
		System.out.println("This is the default constructor for NY University Class.\n");
	}

	
	public static void main(String[] args) {
		NYUniversity nyUniversity = new NYUniversity(); //Here the class is instantiated 
		nyUniversity.physics(); //Here the method is called from the object.
		
		
	}
	
	
}

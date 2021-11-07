package hw6Q2Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n");

		Birds birds = new Birds(); //Single Inheritance is shown here.
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog(); //Hierarchical Inheritance is shown here.
		bullDog.bullDogInfo();
		bullDog.dogInfo();	
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
		System.out.println("\n");

		Cobra cobra = new Cobra(); //Hierarchical Inheritance is shown here.
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
			
		System.out.println("\n");

		Dog dog = new Dog(); //Multiple Inheritance is shown here.
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
	
		System.out.println("\n");
		
		Mammal mammal = new Mammal(); //Single Inheritance is shown here.
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n");

		Reptile reptile = new Reptile(); //Single Inheritance is shown here.
		reptile.reptileInfo();
		reptile.animalInfo();
	
		System.out.println("\n");
	
		Robin robin = new Robin(); ////Multiple Inheritance is shown here.
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	
		System.out.println("\n");

		Snake snake = new Snake(); //Multiple Inheritance is shown here.
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		

	
		
		
		
	}

}

package hw6Q2Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n");

		Birds birds = new Birds(); //Single Inheritance is shown here.
		birds.birdsInfo();
		animal.animalInfo(); 

		System.out.println("\n");

		BullDog bullDog = new BullDog(); //Multiple Inheritance is shown here.
		bullDog.bullDogInfo();
		animal.animalInfo();
		birds.birdsInfo();
		
		System.out.println("\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		animal.animalInfo();
		birds.birdsInfo();
		bullDog.bullDogInfo();
	
		System.out.println("\n");

		Dog dog = new Dog();
		dog.dogInfo();
		animal.animalInfo();
		bullDog.bullDogInfo();
		birds.birdsInfo();
		cobra.cobraInfo();
	
		System.out.println("\n");
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		animal.animalInfo();
		birds.birdsInfo();
		bullDog.bullDogInfo();
		cobra.cobraInfo();
		dog.dogInfo();

		System.out.println("\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		animal.animalInfo();
		mammal.mammalInfo();
		birds.birdsInfo();
		bullDog.bullDogInfo();
		dog.dogInfo();
		cobra.cobraInfo();

		System.out.println("\n");
	
		Robin robin = new Robin();
		robin.robinInfo();
		animal.animalInfo();
		birds.birdsInfo();
		mammal.mammalInfo();
		bullDog.bullDogInfo();
		cobra.cobraInfo();
		dog.dogInfo();
		reptile.reptileInfo();
		
		System.out.println("\n");

		Snake snake = new Snake(); //Hierarchical Inheritance is shown here.
		snake.snakeInfo();
		cobra.cobraInfo();
		animal.animalInfo();
		mammal.mammalInfo();
		dog.dogInfo();
		bullDog.bullDogInfo();
		reptile.reptileInfo();
		robin.robinInfo();
		snake.snakeInfo();
		birds.birdsInfo();
		
		
		
	}

}

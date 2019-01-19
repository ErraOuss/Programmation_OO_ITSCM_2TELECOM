package cours01;

public class Animal {
	
	private String species;
	private int age;
	private double weight;
	
	public Animal(String species, int age, double weight) {
		this.species = species;
		this.age = age;
		this.weight = weight;
	}

	public Animal() {
	}

	public void sleep() {
		System.out.println("je dors");
	}
	public void move() {
		
	}
	
	public void heat() {
	}
	
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public static void main (String args[]) {
		Animal félix = new Animal();
		félix.age = 5;
		félix.species = "chien";
		félix.weight = 5;
		
		Animal milou = new Animal();
		milou.age = 7;
		milou.species = "chien";
		milou.weight = 8;
	}


	public String toString() {
		return "Animal [species=" + species + ", age=" + age +" ans, weight=" + weight + "kg]";
	}

}	

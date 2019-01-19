package cours01;

public class MainAnimal {

	public static void main(String[] args) {
		Animal félix = new Animal("chat",5,3);
		
		//Animal milou = new Animal("chat",7,8);
		Animal milou = new Animal();
		milou.setAge(7);
		milou.setSpecies("chien");
		milou.setWeight(8);
		System.out.println(milou.getSpecies()+" "+milou.getAge()+" "+milou.getWeight());
		System.out.println(félix);

	}

}

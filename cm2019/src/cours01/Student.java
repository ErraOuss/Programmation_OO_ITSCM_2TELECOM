package cours01;

public class Student {
	private String firstname;
	private String lastname;
	private int number;



	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.firstname = "Julien";
		student1.lastname = "Castiaux";
		student1.number = 42;
		
		Student student2 = new Student();
		student2.firstname = "Jérémy";
		student2.lastname = "Dupont";
		student2.number = 3;
		
	}
	
	public Student(String firstname, String lastname, int number) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.number = number;
	}
	
	public Student() {
	}

	public String toString() {
		return "Student [firstname=" + firstname + ", lastname=" + lastname + ", number=" + number + "]";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


}

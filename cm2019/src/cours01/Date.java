package cours01;

public class Date {
	
	private int jour;
	private int mois;
	private int ann�e;

	public static void main(String[] args) {
		Date naissance = new Date();
		naissance.jour = 19;
		naissance.mois = 12;
		naissance.ann�e = 1990;
		
	}
	
	public Date(int jour, int mois, int ann�e) {

		this.jour = jour;
		this.mois = mois;
		this.ann�e = ann�e;
	}


	public Date() {

	}

}

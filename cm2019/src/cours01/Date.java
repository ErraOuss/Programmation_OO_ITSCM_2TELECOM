package cours01;

public class Date {
	
	private int jour;
	private int mois;
	private int année;

	public static void main(String[] args) {
		Date naissance = new Date();
		naissance.jour = 19;
		naissance.mois = 12;
		naissance.année = 1990;
		
	}
	
	public Date(int jour, int mois, int année) {

		this.jour = jour;
		this.mois = mois;
		this.année = année;
	}


	public Date() {

	}

}

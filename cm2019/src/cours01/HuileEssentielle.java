package cours01;

public class HuileEssentielle {
	 
	private double contenance;
	private double prix;
	
	

	public static void main(String[] args) {
		HuileEssentielle huile1 = new HuileEssentielle();
		huile1.nom = "eucalyptus radié";
		huile1.contenance = 30.00;
		huile1.prix = 5.90;
		
	}

	public HuileEssentielle(String nom, double contenance, double prix) {

		this.nom = nom;
		this.contenance = contenance;
		this.prix = prix;
	}

	public HuileEssentielle() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getContenance() {
		return contenance;
	}

	public void setContenance(double contenance) {
		this.contenance = contenance;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String toString() {
		return "HuileEssentielle [nom=" + nom + ", contenance=" + contenance + " ml, prix=" + prix + " Euro]";
	}
	
	

}

package cours01;

public class MainHuileEssentielle {

	public static void main(String[] args) {
		//HuileEssentielle huile1 = new HuileEssentielle("eucalyptus radié",30.00,5.90);
		//System.out.println(huile1);
		
		HuileEssentielle huile1 = new HuileEssentielle();
		huile1.setNom("eucalyptus radié");
		huile1.setContenance(30.00);
		huile1.setPrix(5.90);
		System.out.println("Nom = "+huile1.getNom()+", Contenance : "+huile1.getContenance()+" ml, Prix = "+huile1.getPrix()+" Euro");
	}

}

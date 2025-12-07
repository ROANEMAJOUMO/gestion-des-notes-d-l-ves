package tp1_poo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
    Promotion promo=new Promotion("I1");
    Etudiant Karim=new Etudiant("chengan","Karim");
    Karim.addResultat("POO",new Note());
    Karim.addResultat("mathematiques",new Note(18.0));
    promo.addEtudiant(Karim);

    promo.afficherEtudiantsResultats();
	}

}

package tp1_poo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Promotion promo=new Promotion("I1");
    Etudiant Karim=new Etudiant("chengan","Karim");
    Karim.addResultat("POO",new Note());
    Karim.addResultat("Reseaux",new Note(18.0));
    promo.addEtudiant(Karim);

    promo.afficherEtudiantsResultats();
	}

}

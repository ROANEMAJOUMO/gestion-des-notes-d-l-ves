package tp1_poo;

public class Promotion {
private String name;
private Etudiant[] etudiants;
public Promotion (String name) {
	this.name=name;
	this.etudiants=new Etudiant[100];
}
public void addEtudiant(Etudiant Etudiant) {
	for(int i=0;i<etudiants.length;i++) {
		if(etudiants[i]==null) {
			etudiants[i]=Etudiant;
			return;
		}
	}
	System.out.println("la liste est pleine");
}
public void afficherResultats() {
	System.out.println("Promotion" +name);
	for(Etudiant e:etudiants) {
		if(e!=null) {
			afficherResultats();	
			System.out.println();
		}
	}
}
public int nbEtudiantsValides() {
	int count=0;
	for(Etudiant e:etudiants) {
		if(e != null) {
			Note moyenne=e.moyenneNotes();
			if(moyenne.isAbsent() && moyenne.getValeur()>=11) {
				count ++;
			}
		}
	}
	return count;
}
public void afficherEtudiantsResultats() {
    System.out.println("Promotion " + name);
    for (Etudiant e : etudiants) {
        if (e != null) {
            e.afficherResultats();
            System.out.println();
        }
    }
    System.out.println("Nombre d'étudiants valides : " + nbEtudiantsValides());
}
}


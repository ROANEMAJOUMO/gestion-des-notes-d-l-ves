package tp1_poo;

public class Etudiant {
private String nom;
private String prenom;
private ResultatsUniteEnseignement[]resultats;
public Etudiant(String nom,String prenom) {
	this.nom=nom;
	this.prenom=prenom;
	this.resultats=new ResultatsUniteEnseignement[30];
}
public void addResultat(String nomUniteEnseignement,Note note) {
	for(int i=0;i<resultats.length;i++) {
		if(resultats[i]==null) {
			resultats[i]=new ResultatsUniteEnseignement(nomUniteEnseignement, note);
			return;
		}
	}
	System.out.println("le tableau est plein");
}
public Note[] getNotes() {
	int count=0;
	for(int i=0 ; i<resultats.length;i++) {
		if(resultats[i] != null) {
			count ++;
		}
	}
		Note[] notes=new Note[count];
		int index=0;
		for(int i=0;i<resultats.length;i++) {
			if(resultats[i] !=null) {
				notes[index]=resultats[i].getNote();
				index ++;
			}
	}
		return notes;
}
public Note moyenneNotes() {
	return Note.moyenneNotes(getNotes());
}
public void afficherResultats() {
	System.out.println(nom+ ""+prenom);
	for(ResultatsUniteEnseignement r:resultats) {
		if(r!=null) {
			System.out.println(""+r.toString());
		}
	}
	System.out.println("Moyenne:"+moyenneNotes());
}
}


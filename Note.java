package tp1_poo;

public class Note {
private static final int NOTE_MAXIMUM=20;
private double valeur;
private boolean estAbsent;
public Note(double valeur,boolean estAbsent) {
	if(valeur<0 || valeur>NOTE_MAXIMUM) {
		System.out.println("la note ");
	}
	this.valeur=valeur;
	this.estAbsent=estAbsent;
}
public Note() {
	this.valeur=0;
	this.estAbsent=true;
}
public Note(double Valeur) {
	this.valeur=Valeur;
	this.estAbsent=false;
}
public boolean isAbsent() {
		return estAbsent;
}
public double getValeur() {
	return valeur;
}
public String toString() {
if(estAbsent) {
	return "ABS";
}else {
	return String.format("%.1f/%d",valeur,NOTE_MAXIMUM);
}
}
public static Note moyenneNotes(Note[]notes) {
	double sum=0;
	for(int i=0;i<notes.length;i++) {
		if(notes[i].isAbsent()) {
		return new Note();
		}
			sum+=notes[i].getValeur();
			
	}
	double moyenne=sum/notes.length;
	return new Note(moyenne);
}
}


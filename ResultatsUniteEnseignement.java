package tp1_poo;

public class ResultatsUniteEnseignement {
private String NomUniteEnseignement;
private Note note;
public ResultatsUniteEnseignement(String NomUniteEnseignement, Note note) {
	this.NomUniteEnseignement=NomUniteEnseignement;
	this.note=note;
}
public Note getNote() {
	return note;
}
public String toString() {
	return NomUniteEnseignement + ":" + note.toString();
}
}
package Entity;

//5m pour implémenter la class
public class Client {

	private int ID;
	private String Nom;
	private String Prenom;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public Client() {
		super();
	}
	public Client(int iD, String nom, String prenom) {
		super();
		ID = iD;
		Nom = nom;
		Prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [ID=" + ID + ", Nom=" + Nom + ", Prenom=" + Prenom + "]";
	}
	
}

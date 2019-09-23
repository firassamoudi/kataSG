package Entity;

import java.util.Date;

// 5m pour implémenter la class
public class Compte extends Client {
	
	private String NumCompte;
	private double solde;
	private Date dateDebit;
	
	public Compte() {
		super();
	}
	
	public Compte(int iD, String nom, String prenom,
			String numCompte, double solde) {
		super(iD, nom, prenom);
		// TODO Auto-generated constructor stub
		NumCompte = numCompte;
		this.solde = solde;
	}
	public String getNumCompte() {
		return NumCompte;
	}
	public void setNumCompte(String numCompte) {
		NumCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateDebit() {
		return dateDebit;
	}
	public void setDateDebit(Date dateDebit) {
		this.dateDebit = dateDebit;
	}

	
}

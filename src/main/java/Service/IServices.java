package Service;

import java.util.List;

import Entity.Compte;

// 5m pour impl�menter la l'interface avec les 3 premiers m�thodes apr�s j'ai chang� selon le besoin

public interface IServices {	
	
	public List<Compte> AddComptes();
	public double verser(Compte c, double montant);
	public double retirer(Compte c, double montant);
	public Compte getComte(List<Compte> c,int i);
	public String releveBancaire(Compte c);
	public void generatePDF(String s,String nom);
	public void SoldeapresDebit(Compte c, double montant);
	public void SoldeapresCredit(Compte c, double montant);

}

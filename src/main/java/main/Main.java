package main;

import java.util.ArrayList;
import java.util.List;

import Entity.Compte;
import Service.Services;;

//30m pour implémenter la class et les méthodes avec les tests 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services s = new Services();
		List<Compte> liste = new ArrayList<Compte>();
		liste.add(new Compte(1,"Samoudi","firas","SG001",1000));
		liste.add(new Compte(2,"SERTIER","Nathalie ","SG002",2000));
		
	//	s.AddComptes().add(new Compte(1,"Samoudi","firas","SG001",1000));	
	//	s.AddComptes().add(new Compte(2,"SERTIER","Nathalie ","SG002",2000));
		
		//System.out.println("Votre solde apres le versement "+s.verser(s.getComte(liste, 0), -400));
		//System.out.println("Votre solde apres le versement "+s.verser(s.getComte(liste, 1), -600));
		
		//System.out.println("Votre solde apres le debit  "+s.retirer(s.getComte(liste, 0), -200));
		//System.out.println("Votre solde apres le debit  "+s.retirer(s.getComte(liste, 1), -400));
		
		s.SoldeapresDebit(s.getComte(liste, 0), -400); 
		s.SoldeapresDebit(s.getComte(liste, 1), 400);
		
		s.SoldeapresCredit(s.getComte(liste, 0), -400);
		s.SoldeapresCredit(s.getComte(liste, 1), 400);
		
		
		s.releveBancaire(s.getComte(liste, 0));
		System.out.println(s.releveBancaire(s.getComte(liste, 0)));
		System.out.println(s.releveBancaire(s.getComte(liste, 1)));
		
		s.generatePDF(s.releveBancaire(s.getComte(liste, 0)),s.getComte(liste, 0).getNom());
		s.generatePDF(s.releveBancaire(s.getComte(liste, 1)),s.getComte(liste, 1).getNom());

	}

}

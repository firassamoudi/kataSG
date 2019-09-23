package Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import Entity.Compte;

public class Services implements IServices {


	public List<Compte> AddComptes() {		
		List<Compte> liste = new ArrayList<Compte>();
		return liste;
	}
	//getCompte a pris 10m maximum 
	public double verser(Compte c, double montant) {
		if(montant>0){
		c.setDateDebit(new Date());
		c.setSolde(c.getSolde()+montant);
		return c.getSolde();}
		return 0;
	}
	//retirer  a pris 10m maximum 
	public double retirer(Compte c, double montant) {
		if(montant>0){
		c.setDateDebit(new Date());
		c.setSolde(c.getSolde()-montant);
		return c.getSolde();}
		return 0;
	}
	//releveBancaire a pris 5m maximum 
	public String releveBancaire(Compte c) {
		
		return "Relevé de Compte du M/Mme: "+c.getNom() + " "+c.getPrenom()+ " Solde du compte : "+c.getSolde() +" Date "+c.getDateDebit();
	}
//getCompte a pris 5m maximum 
	public Compte getComte(List<Compte> c,int i) {
		return c.get(i);
	}
//generatePDF m'a pris 15m avec la documentations
	public void generatePDF(String s,String nom) {
		// TODO Auto-generated method stub
		  Document document = new Document();
	      try
	      {
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Releve Bancaire du "+nom+".pdf"));
	         document.open();
	         document.add(new Paragraph(s));
	         document.close();
	         writer.close();
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	}
	//20m pour les méthodes 
	public void SoldeapresDebit(Compte c, double montant) {

			if(montant<0)	
			{
				
				System.out.println("Désolé il faut un montant > 0 ");
			}	
			else System.out.println("Votre solde apres le Debit "+retirer(c, montant));
	}
	public void SoldeapresCredit(Compte c, double montant) {
		// TODO Auto-generated method stub
			if(montant<0)	
			{
				
				System.out.println("Désolé il faut un montant > 0 ");
			}	
			else System.out.println("Votre solde apres le versement "+verser(c, montant));
	}
	

}

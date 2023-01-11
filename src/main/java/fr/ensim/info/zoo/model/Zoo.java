package fr.ensim.info.zoo.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.ensim.info.zoo.exception.LimiteVisiteurException;

public class Zoo {
	
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	private int nbvisteurMaxParSecteur ;
	
	
	public Zoo(int visiteurs) {
		this.visiteurs = visiteurs;
		this.secteursAnimaux = new ArrayList<>();
		this.nbvisteurMaxParSecteur = 15;
	}
	
	public void ajouterSecteur( TypeAnimal typeAnimal) {
		
		secteursAnimaux.add(new Secteur(typeAnimal));
	}
	
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		
		
		if(visiteurs > nbvisteurMaxParSecteur) throw new LimiteVisiteurException("nombre de visiteurs a exceder la capacite max");
		visiteurs++;
	}
	
	public int getLimiteVisiteur() {
		return nbvisteurMaxParSecteur;
	}
	
	public  void nouvelAnimal(Animal animal) {
		
		for(Secteur s: secteursAnimaux) {
			if(animal.getTypeAnimal() == s.obtenirType()) {
				s.ajouterAnimal(animal);
			}
			
		}
		
	}
	
	public int getVisiteurs() {
		return visiteurs;
	}

	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}

	public int nombreAnimaux() {
		int count=0;
		for(Secteur s: secteursAnimaux) {
			count = count + s.getNombreAnimaux();
			
		}
		
		return count;
		
	}
	
	
	

}

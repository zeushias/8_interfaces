package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import metier.Produit;

public class ServiceImpl implements Iservice {

	Collection<Produit> base = new ArrayList<Produit>();
	
	public void init() {
		base.add(new Produit(1, "Mangue", 125));
		base.add(new Produit(1, "Citron", 120));
		base.add(new Produit(1, "Banane", 155));
		base.add(new Produit(1, "Orange", 175));
	}
	
	@Override
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		base.add(p);
	}

	@Override
	public void modifiererProduit(Produit p, String libelle, double prix) {
		// TODO Auto-generated method stub
		
		for (Produit produit : base) {
			if(produit.getId() == p.getId()) {
				p.setLibelle(libelle);
				p.setPrix(prix);
				break;
			}
		} 
	}

	@Override
	public void supprimerProduit(int idProduit) {
		// TODO Auto-generated method stub
		for (Produit produit : base) {
			if(produit.getId() == idProduit) {
				base.remove(produit);
				break;
			}
		}
	}

	@Override
	public List<Produit> listerTousLesProduits() {
		// TODO Auto-generated method stub
		return (List<Produit>) base;
	}

	@Override
	public Produit listerUnProduit(int idProduit) {
		Produit prod = null;
		for (Produit produit : base) {
			if(idProduit == produit.getId()) {
				prod = (Produit) produit.clone();
			}
		}
		return prod;
	}

	@Override
	public void afficher(List<Produit> produits) {
		// TODO Auto-generated method stub
		System.out.println("Liste des Produits");
		System.out.println(produits);
		
	}

}

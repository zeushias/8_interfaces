package service;

import java.util.List;

import metier.Produit;

/**
 * L'interface du package service
 * @author zeushias
 *
 */
public interface Iservice {

	public void ajouterProduit(Produit p);
	public void modifiererProduit(Produit p, String libelle, double prix);
	public void supprimerProduit(int idProduit);
	public List<Produit> listerTousLesProduits();
	public Produit listerUnProduit(int idProduit);
	public void afficher(List<Produit> produits);
}

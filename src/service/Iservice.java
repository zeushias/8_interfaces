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
	public void modifiererProduit(Produit p);
	public void supprimerProduit(Produit p);
	public List<Produit> listerTousLesProduits();
	public Produit listerUnProduit(int idProduit);
}

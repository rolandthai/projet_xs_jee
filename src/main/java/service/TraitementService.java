package service;

import entite.LotCartons;

public interface TraitementService {
	
	/**
	 * Permet le traitement des Articles
	 * @param chaineArticles
	 * @return
	 */
	LotCartons traitementDesArticles(String chaineArticles, int tailleCartonMax) throws Exception; 
}
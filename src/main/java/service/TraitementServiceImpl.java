package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entite.LotCartons;

public class TraitementServiceImpl implements TraitementService {

	public LotCartons traitementDesArticles(String chaineArticles, int tailleCartonMax) throws Exception {

		LotCartons lotCartons = new LotCartons();
		
		//liste temporaire utilisée pour le traitement
		List<Integer> listArticlesTmpA = new ArrayList<Integer>();

		//initialisation de la liste temporaire de la taille des articles
		
		if(chaineArticles.contains(",") || tailleCartonMax > 10)
		{
			String[] listArticles = chaineArticles.split(",");		
			for(String str : listArticles)
			{
				listArticlesTmpA.add(Integer.valueOf(str.replaceAll(" ", "")));
			}
		}
		else
		{
			if(!isCorrect(chaineArticles))
			{
				Exception e = new Exception("Problème sur la chaine saisie");
				throw e;
			}
			
			for (int i = 0; i < chaineArticles.length(); i++) {
				String str = chaineArticles.substring(i, i + 1);
				listArticlesTmpA.add(Integer.valueOf(str));
			}
		}
		lotCartons = triEtTraitementlisteArticle(listArticlesTmpA, tailleCartonMax);
		
		return lotCartons;
	}

	/**
	 * Permet de voir si la valeur est bien numerique
	 * @param chaineArticles
	 * @return
	 */
	public boolean isCorrect(String chaineArticles)
	{
		try
		{
		     Long.decode(chaineArticles);
		     return true;  
		}
		catch(NumberFormatException  e)
		{
		    return false;
		}
	}


	/**
	 * permet le traitement et le tri de article
	 * @param listArticlesTmp
	 * @param tailleCartonMax
	 * @return
	 */
	public LotCartons triEtTraitementlisteArticle(List<Integer> listArticlesTmp, int tailleCartonMax) {

		LotCartons lotCartons = new LotCartons();
		//liste de résultat
		List<String> listLotCartons = new ArrayList<String>();

		//Tri decroissant de la liste temporaire de la taille des articles
		Collections.sort(listArticlesTmp);
		Collections.reverse(listArticlesTmp);

	

		System.out.println(listArticlesTmp.toString());

		//Algorithmique pour le traitement des cartons
		for(int i=0;i<listArticlesTmp.size();i++)
		{
			//carton contenant les articles
			String strCarton = "";

			//recuperation d'un article de la liste tempraire
			int tailleArticleA = listArticlesTmp.get(i);

			//ajout du paquet dans le lot
			strCarton = String.valueOf(tailleArticleA);

			//boucle pour optimiser l'espace du Carton
			for(int j=i+1;j<listArticlesTmp.size();j++)
			{
				//recupération de l'article suivant
				int tailleArticleB = listArticlesTmp.get(j);
				//verification que les paquets rentre dans le lot
				if((tailleArticleA + tailleArticleB)<=tailleCartonMax)
				{
					//si il rentre on l'ajoute
					String sep = "";
					if(tailleCartonMax>10)
						sep = " ";	
					strCarton += sep + tailleArticleB;
										
					tailleArticleA = tailleArticleA + tailleArticleB;
					//On retire l'article ajouté
					listArticlesTmp.remove(j);
					j--;
				}
				
			}
			//on enregistre le carton dans la liste du lot de carton
			listLotCartons.add(strCarton);
		}
		lotCartons.setLotDeCartons(listLotCartons);

		return lotCartons;
	}
}

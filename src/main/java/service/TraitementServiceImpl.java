package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entite.LotCartons;

public class TraitementServiceImpl implements TraitementService {

	public LotCartons traitementDesArticles(String numero) {
		
		LotCartons lotCartons = new LotCartons();
		
		//liste de résultat
		List<String> listLotCartons = new ArrayList<String>();
		
		//liste temporaire utilisée pour le traitement
		List<Integer> listArticlesTmpA = new ArrayList<Integer>();

		//initialisation de la liste temporaire de la taille des articles
		for(int i=0;i<numero.length();i++)
		{
			String str = numero.substring(i, i+1);
			listArticlesTmpA.add(Integer.valueOf(str));
		}

		//Tri decroissant de la liste temporaire de la taille des articles
		Collections.sort(listArticlesTmpA);
		Collections.reverse(listArticlesTmpA);
		
		//copie de la liste temporaire des articles
		List<Integer> listArticlesTmpB = new ArrayList<>();
		listArticlesTmpB = listArticlesTmpA;
		
		System.out.println(listArticlesTmpA.toString());
		
		//Algorithmique pour le traitement des cartons
		for(int i=0;i<listArticlesTmpA.size();i++)
		{
			//carton contenant les articles
			String strCarton = "";
			
			//recuperation d'un article de la liste tempraire
			int tailleArticle1 = listArticlesTmpA.get(i);
			
			//ajout du paquet dans le lot
			strCarton = String.valueOf(tailleArticle1);
			
			//boucle pour optimiser l'espace du Carton
			for(int j=i+1;j<listArticlesTmpB.size();j++)
			{
				//recupération de l'article suivant
				int tailleArticleB = listArticlesTmpB.get(j);
				//verification que les paquets rentre dans le lot
				if((tailleArticle1 + tailleArticleB)<=10)
				{
					//si il rentre on l'ajoute
					strCarton += tailleArticleB;
					tailleArticle1 = tailleArticle1 + tailleArticleB;
					//On retire l'article ajouté
					listArticlesTmpB.remove(j);
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

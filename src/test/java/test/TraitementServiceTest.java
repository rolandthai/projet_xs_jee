package test;

import org.junit.Test;

import entite.LotCartons;
import service.TraitementService;
import service.TraitementServiceImpl;



public class TraitementServiceTest {

	
//	private TraitementServices traitementService;

	@Test
	public void testTraitementDesArticles() {
		
		int tailleCartonMax = 10;
		String chaineArticles = "163841689525773";
//		String chaineArticles = "4857614221";
		
		TraitementService traitementService = new TraitementServiceImpl();
		
		
		LotCartons lotCartons = new LotCartons();
		
		try {
			lotCartons = traitementService.traitementDesArticles(chaineArticles, tailleCartonMax);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Résultat du Robot Optimisé :");
		System.out.println("Lot de cartons : " + lotCartons.getLotDeCartons().toString().replaceAll(", ", "/"));
		System.out.println("Nombres de cartons : " + lotCartons.getNombreDeCartons());
	}

}

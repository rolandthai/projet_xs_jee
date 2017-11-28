package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entite.LotCartons;
import service.TraitementService;

public class TraitementServiceTest {

	@Test
	public void testTraitementDesArticlesOK() {
		final int tailleCartonMax = 10;
		final String chaineArticles = "163841689525773";
		// String chaineArticles = "4857614221";
		testTraitementDesArticles(chaineArticles, tailleCartonMax);
	}

	@Test
	public void testTraitementDesArticlesKO() {
		final int tailleCartonMax = 10;
		final String chaineArticles = "1638416ert25773";
		testTraitementDesArticles(chaineArticles, tailleCartonMax);
	}

	public void testTraitementDesArticles(String chaineArticles, int tailleCartonMax) {

		// Injection de Dépendance Spring
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		TraitementService traitementService = (TraitementService) context.getBean("traitementService");

		LotCartons lotCartons = new LotCartons();
		try {
			lotCartons = traitementService.traitementDesArticles(chaineArticles, tailleCartonMax);
		} catch (Exception e) {
			//e.printStackTrace();
		}

		System.out.println("Résultat du Robot Optimisé :");
		System.out.println("Lot de cartons : " + lotCartons.getLotDeCartons().toString().replaceAll(", ", "/"));
		System.out.println("Nombres de cartons : " + lotCartons.getNombreDeCartons());
	}

}

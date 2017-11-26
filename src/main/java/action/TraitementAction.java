package action;

import com.opensymphony.xwork2.Action;

import entite.LotCartons;
import service.TraitementService;
import service.TraitementServiceImpl;

/**
 * Classe de gestion de controle du traitement des cartons
 * @author rthaison
 *
 */
public class TraitementAction implements Action {
	
	//Java Bean to hold the form parameters
		private String chaineArticles;
		private String resultat;
		private LotCartons lotCartons;
	
	@Override
	public String execute() throws Exception {
		if(getChaineArticles() != null && !getChaineArticles().equals(""))
		return "SUCCESS";
		else return "ERROR";
	}
	
	public String calcul() throws Exception {

//		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
//		
//		TraitementServices traitementService = (TraitementServices) context.getBean("traitementService");
		
		TraitementService traitementService = new TraitementServiceImpl();
		
		if(getChaineArticles() != null && !getChaineArticles().equals(""))
		{
			setResultat(getChaineArticles().substring(2));
			
			lotCartons = traitementService.traitementDesArticles(getChaineArticles());
			
			return "SUCCESS";
		}
		else
		{
			return "ERROR";
		}
	}
	
	
	
	public String getChaineArticles() {
		return chaineArticles;
	}

	public void setChaineArticles(String numero) {
		this.chaineArticles = numero;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public LotCartons getLotCartons() {
		return lotCartons;
	}

	public void setLotCartons(LotCartons lotCartons) {
		this.lotCartons = lotCartons;
	}
	
	
	
}

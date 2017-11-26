package entite;

import java.util.ArrayList;
import java.util.List;

public class LotCartons {

	List<String> lotDeCartons = new ArrayList<>();

	
	
	public List<String> getLotDeCartons() {
		return lotDeCartons;
	}



	public void setLotDeCartons(List<String> lotDeCartons) {
		this.lotDeCartons = lotDeCartons;
	}



	public int getNombreDeCartons() {
		return this.lotDeCartons.size();
	}
	
	public String getLotDeCartonsStr() {
		String strLot = this.lotDeCartons.toString().replaceAll(", ", "/");
		return strLot.substring(1, strLot.length()-1);
	}
	
	
	
}

package action;

import com.opensymphony.xwork2.Action;
/**
 * Action permettant la gestion du login
 * @author rthaison
 *
 */
public class LoginAction implements Action {
	
	@Override
	public String execute() throws Exception {
		if("toto".equals(getName()) && "tata".equals(getPwd()))
		return "SUCCESS";
		else return "ERROR";
	}
	
	//Java Bean to hold the form parameters
	private String name;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}

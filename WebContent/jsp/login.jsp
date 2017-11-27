<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="row">
	<div class="col-sm-4"></div>
	<div class="col-sm-4">

		<h2 class="text-center">Connexion</h2>
		<s:form action="login">
			<div class="form-group">
				<s:textfield name="name" label="Login" class="form-control"
					placeholder="Entrer le login"></s:textfield>
			</div>

			<div class="form-group">
				<s:textfield name="pwd" label="Mot de passe" type="password"
					placeholder="Entrer le mot de passe" class="form-control"></s:textfield>
			</div>
			<s:submit value="Valider" class="btn btn-default"></s:submit>
		</s:form>

		<div class="col-sm-4"></div>
	</div>
</div>

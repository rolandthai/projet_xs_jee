<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="row">
	<div class="col-sm-4"></div>
	<div class="col-sm-4 text-center">

		<h3>XSpeedIt Robot:</h3>

		<s:form action="traitement">
			<div class="form-group">
				<s:textfield name="tailleCartonMax" label="Taille max d\'un carton "
					placeholder="default : 10" default="10" class="form-control"></s:textfield>
			</div>
			<div class="form-group">
				<s:textfield name="chaineArticles" label="Chaine d'articles * "
					class="form-control" placeholder="Ex: 321434545"></s:textfield>
			</div>
			<s:submit value="Valider" class="btn btn-default"></s:submit>
		</s:form>
		<p class="info">*si la taille max de carton est >10 séparer la
			saisie avec des virgules.</p>
		<div class="col-sm-4"></div>
	</div>
</div>

<div class="row" style="background-color: #ABCD88;">
	<div class="col-sm-4">
		<h3>
			<s:text name=" Nombre de cartons : "></s:text>
			<s:property value="lotCartons.nombreDeCartons"></s:property>
		</h3>

		<h3>
			<s:text name="Robot Optimisé : "></s:text>
			<s:property value="lotCartons.lotDeCartonsStr"></s:property>
		</h3>
	</div>
</div>

<s:if test="<s:property value='resultat'/>!= null">
</s:if>


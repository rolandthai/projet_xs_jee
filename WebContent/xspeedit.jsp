<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>XSpeedIt Page</title>
</head>
<body>
<h3>Bienvenu sur l'application XSPeedIt <s:property value="name"></s:property></h3>
<h3>Veuillez saisir la suite de chaine d''articles :</h3>

<s:form action="traitement">
	<s:textfield name="chaineArticles" label="Suite de numero"></s:textfield>
	
	<s:submit value="Valider"></s:submit>
</s:form>




<s:text name="resultat : "></s:text>
 <s:property value="resultat"></s:property> 
 <br/>
 
 <s:text name=" resultat2 : "></s:text>
 
 <s:property value="lotCartons.nombreDeCartons"></s:property>

<s:text name="resultat : "></s:text>
 <s:property value="lotCartons.lotDeCartonsStr"></s:property>




<s:if test="resultat != null && !resultat.equal('')">
</s:if>


</body>
</html>
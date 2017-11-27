<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body>


<h3>Bienvenu dans le programme XSpeedIt</h3>
<div style="padding-top: 30px" class="panel-body">
<s:form action="login">
	<s:textfield name="name" label="Nom"></s:textfield>
	<s:textfield name="pwd" label="Mot de passe" type="password"></s:textfield>
	<s:submit value="Valider"></s:submit>
</s:form>
</div>
</html>
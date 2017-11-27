<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
<title><tiles:getAsString name="title" /></title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" href="/xspeeditjee/bootstrap/css/bootstrap.css" type="text/css">
<link href="/xspeeditjee/css/xspeedit.css" rel="stylesheet" type="text/css" media="all" />

<!-- <link href="/static/css/sigdca.css" rel="stylesheet" type="text/css"  /> -->
</head>
<body id="home">
	<s:div id="wrap">

		<!-- Debut de la navigation -->
		<tiles:insertAttribute name="menu" />

		<div id="left-content">
			<!-- Debut du contenu -->
			<tiles:insertAttribute name="header" />

			<s:div id="content">
				<s:div id="contentBody" class="">
					<div class="container" style="background-color: #ABCDEF;">
						<tiles:insertAttribute name="body" />
					</div>
				</s:div>
			</s:div>

			<!-- Debut de la bande du bas -->
			<s:div id="footer">
				<tiles:insertAttribute name="footer" />
			</s:div>
		</div>
	</s:div>


	<!-- Scripts complémentaires spécifique aux différentes vues -->
	<tiles:insertAttribute name="complementaryScripts" />

</body>
</html>
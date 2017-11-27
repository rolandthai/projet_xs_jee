<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<html>
<head>
	<title><tiles:getAsString name="title"/></title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<style type="text/css">
	@charset "UTF-8";
/* Thin */
html, body {
  height: 100%;
}

#wrap {
  display: -webkit-box;
  display: -moz-box;
  display: -ms-flexbox;
  display: -webkit-flex;
  display: flex;
  height: 100%;
  font-family: "roboto", 'MS Trebuchet', sans-serif;
  font-weight: normal;
}


#ouisncf {
  background: url("../../images/ouisncf.png") no-repeat left;
  background-size: 36%;
  width: 100px;
  padding-left: 30px;
}
body {
  font-family: Verdana, sans-serif;
  font-size: 12px;
  color: #222;
  line-height: 1.45em;
}


#wrap #left-content {
  flex: 1;
  height: calc(100% - 1px);
  /** #footer {  **/
}
#wrap #left-content #header {
  flex: 1 100%;
  height: 100px;
  border-bottom: solid 1px #C0C0C0;
}

#wrap #left-content #content #contentBody {
  height: 100%;
  overflow: auto;
}
	
</style>

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
				<s:div id="contentBody">
					<tiles:insertAttribute name="body" />
				</s:div>
				<s:div id="errorLine">
					<s:div id="errorContent">
						<s:actionmessage/>
					</s:div>
					<div id="closeError">x</div>
				</s:div>
			</s:div>
			
			<!-- Debut de la bande du bas -->
			<s:div id="footer">
				<tiles:insertAttribute name="footer" />
			</s:div>
		</div>
		
		<!-- Debut de la bande du haut -->
		
	</s:div>


	<!-- Scripts complémentaires spécifique aux différentes vues -->
	<tiles:insertAttribute name="complementaryScripts" />
			
</body>
</html>
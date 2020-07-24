<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>

<!-- These are for Globals.ERROR_KEY -->

<%@page import="org.apache.struts.Globals"%>

<HEAD>
	<LINK rel="stylesheet" href="/sbsToolBox/css/boxes.css" type="text/css">
</HEAD>


<logic:present name="<%=Globals.ERROR_KEY%>">
	<div style="padding-top: 6px;" id="masterErrorDiv">
		<div class="errorbox pop" align="center">
			<html:errors />
		</div>
	</div>
</logic:present>
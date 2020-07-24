<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<head>
	<link rel="stylesheet" href="/sbsToolBox/css/boxes.css" type="text/css">
</head>
<logic:present name="messages">
	<div class="successbox" align="center">
		<div class="successHeader">
			<bean:message key="heading.messages"/>
		</div>
		<logic:iterate id="msg" name="messages">
			<li>
				<bean:write name="msg"/>
			</li>
		</logic:iterate>
	</div>
</logic:present>
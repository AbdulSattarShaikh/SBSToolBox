<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<HEAD>
	<LINK rel="stylesheet" href="/sbsToolBox/css/boxes.css" type="text/css">
</HEAD>

<logic:present name="messages">
	<div class="messagebox" align="center">
		<div class="messageHeader">
			<bean:message key="heading.messages"/>
		</div>
		<logic:iterate id="msg" name="messages">
			<LI>
				<bean:write name="msg"/>
			</LI>
		</logic:iterate>
	</div>
</logic:present>
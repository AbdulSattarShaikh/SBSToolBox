<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>

<head>
<link rel="stylesheet" href="/sbsToolBox/css/boxes.css" type="text/css">
<link rel="stylesheet" href="/sbsToolBox/css/log.css" type="text/css">
</head>
<div id="topGrey800px"></div>
	<div class="contentGrey800px">
			<logic:equal name="balanceForm" property="showLogs" value="false">
			<span style='padding-left: 20px;font-weight: bolder;font-size: 13px;'>Log&nbsp;&nbsp;:&nbsp;&nbsp;</span> <html:submit styleId='showLogs' onclick="setWindowScrollShow();return validateBeforeSet('showLogs');">Show Log</html:submit>
		</logic:equal>
	</div>
	<logic:present name="logs">
		<logic:notEmpty name="logs">
			<div class="contentGrey800px">
				<div style="padding-left: 10px;">
				<b><bean:message key="label.additional"/>:</b> &nbsp; 
				<html:text  styleId='comment' styleClass="input250" property="userComments" maxlength="150"/>
				<table class="f11">
					<tr>
						<th class="boxLogHeader" colspan="7"><bean:message key="label.log"/></th>
					</tr>
					<tr>
						<td width="50"  class="boxLogHeader"><bean:message key="label.date"/></td>
						<td width="50"  class="boxLogHeader"><bean:message key="label.tid"/></td>
						<td width="410" class="boxLogHeader"><bean:message key="label.kommentar"/></td>					
						<td width="100" class="boxLogHeader"><bean:message key="label.cdsid"/></td>
						<td width="100" class="boxLogHeader"><bean:message key="label.ip"/></td>
						<td class="boxLogHeader"></td>
					</tr>
				</table>
			
			<%	String LIGHT_COLOR = "White";
				String DARK_COLOR = "lightyellow";
				String currentColor = DARK_COLOR;
				int i = 0; %>

			<div class="smallLogContent">
				<table class="logContent">
					<logic:iterate name="logs" id="row">
						<%
							if ( i % 2 == 0) {
								currentColor = LIGHT_COLOR;
							} else {
								currentColor = DARK_COLOR;
							}
							i++;
						%>

						<tr bgcolor="<%=currentColor%>">
							<td width="50" class="logContent">
								<bean:write name="row" property="datum" />
							</td>
							<td width="50" class="logContent">
								<bean:write name="row" property="tid" />
							</td>
							<td width="410" class="logContentText">
							<div style="word-wrap: break-word;  max-width:410px;">
								<bean:write name="row" property="header" />
								</div>
							</td>
							<td width="100" class="logContentText">
								<bean:write name="row" property="cdsid" />
							</td>
							<td width="100" class="logContentNumbers">
								<bean:write name="row" property="ip" />
							</td>
						</tr>
						<logic:notEmpty name="row" property="commentList"> 
							<logic:iterate name="row" property="commentList" id="id">
								<logic:notEmpty name="id">
									<tr bgcolor="<%=currentColor%>">
										<td colspan="2"></td>
										<td colspan="3" class="logContentText">
											<bean:write name="id" />
										</td>
									</tr>
								</logic:notEmpty>
							</logic:iterate>
						</logic:notEmpty>
					</logic:iterate>
				</table>
				</div>
			</div>
			</div>
		</logic:notEmpty>
	</logic:present>
	<div id="bottomGrey800px"></div>
	
	<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
	<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
	<div id="header">
		<a class="standardLink" href="/sbsToolBox/preViewCreateMessage.do"><bean:message key="label.home"/></a>
		|		
		<div class="dropdown">
	 	  <a class="standardLink dropbtn" href="/sbsToolBox/preBalanceChoice.do"><bean:message key="label.changeBalance"/></a>
		  <div class="dropdown-content">
		    <a class="standardLink" href="/sbsToolBox/preBalanceChoice.do"><bean:message key="label.openBalance"/></a>
			<a class="standardLink" href="/sbsToolBox/preModifyBalance.do?dispatch=newBalance"><bean:message key="label.openNewBalance"/></a>
			<a class="standardLink" href="/sbsToolBox/preModifyBalance.do?dispatch=preRefmixChoice"><bean:message key="label.refmix"/></a>
			<a class="standardLink" href="/sbsToolBox/preSimulate.do"><bean:message key="label.simulera"/></a>
			<a class="standardLink" href="/sbsToolBox/preChooseBalances.do"><bean:message key="label.flyttaBalanser"/></a>
			<a class="standardLink" href="/sbsToolBox/preModifyPace.do"><bean:message key="label.modifyPace"/></a>
			<a class="standardLink" href="/sbsToolBox/preBem.do"><bean:message key="label.balanceStat"/></a>
			<a class="standardLink" href="/sbsToolBox/searchCarsForSim.do?dispatch=searchCars"><bean:message key="label.skapaUrval"/></a>
			<a class="standardLink" href="/sbsToolBox/preManagePspec.do"><bean:message key="label.hpspec"/></a>
			<logic:present role="sendToSams">
			<a class="standardLink" href="/sbsToolBox/sendToSams.do?dispatch=start"><bean:message key="label.submitToSams"/></a>
			</logic:present>
			<div>
				<a class="standardLink" href="/sbsToolBox/wbbGraphs.do?dispatch=multiWBBGraphChoice"><bean:message key="label.wbbGraphMultiBalance"/></a>
			</div>
			<div>
				<a class="standardLink" href="/sbsToolBox/multiBalanceGraphs.do?dispatch=balanceSelection"><bean:message key="label.sharedBalancing" /></a>
			</div>
			<div>
				<a class="standardLink" href="/sbsToolBox/preMultiPrint.do"><bean:message key="label.multiPrintingOIS"/></a>
			</div>
		  </div>
	 	</div>
		|
		<div class="dropdown">
	 	  <a class="standardLink dropbtn" href="/sbsToolBox/preOperationChoice.do?param=init"><bean:message key="label.operationshantering" /></a>
		  <div class="dropdown-content">
		 	<a class="standardLink" href="/sbsToolBox/preOperationChoice.do?param=init"><bean:message key="label.operationshantering"/></a>
			<logic:present role="changeStdOperation">
				<a class="standardLink" href="/sbsToolBox/preModifyOperation.do?dispatch=listStdOp"><bean:message key="label.listStdOp" /></a>
				<a class="standardLink" href="/sbsToolBox/preModifyOperation.do?dispatch=createStdOp"><bean:message key="label.createStdOp" /></a>
			</logic:present>
			<a class="standardLink" href="/sbsToolBox/preModifyOperation.do?dispatch=createPkiOp"><bean:message key="button.createOperation" /></a>
			<a class="standardLink" href="/sbsToolBox/preListChoice.do"><bean:message key="label.generateLists"/></a>
			<a class="standardLink" href="/sbsToolBox/preManagePart.do"><bean:message key="label.artikelhantering"/></a>
			<a class="standardLink" href="/sbsToolBox/preChooseTool.do"><bean:message key="label.toolManage"/></a>
		  </div>
	 	</div>
		|
		<a class="standardLink" href="/sbsToolBox/preWesStart.do"><bean:message key="label.wes"/></a>
		|
		<a class="standardLink" href="/sbsToolBox/preBalanceChoiceBalanceAnalysis.do"><bean:message key="label.analyseraBalanser"/></a>
		|
		<a class="standardLink" href="/sbsToolBox/preWeekReport.do"><bean:message key="label.weekReport"/></a>
		|
		<a class="standardLink" href="/sbsToolBox/preSBSStopp.do"><bean:message key="label.sbsStopp.link"/></a>
		|
		<div class="dropdown">
	 	  <a class="standardLink dropbtn" href="/sbsToolBox/prePropertyHandler.do"><bean:message key="label.installningar" /></a>
		  <div class="dropdown-content">
				<div>
					<a class="standardLink" ><bean:message key="label.systemHygiene"/> <span class="rightDoubleArrow">&#187;</span> </a>
					<div class="expandable">
						<a class="standardLink" href="/sbsToolBox/prePropertyHandler.do"><bean:message key="label.egenskapshantering"/></a>
						<a class="standardLink" href="/sbsToolBox/ppaFilterSettings.do"><bean:message key="label.filter.ppa"/></a>
						<a class="standardLink" href="/sbsToolBox/ppaFilterSettingsParts.do"><bean:message key="label.filter.ppa.parts"/></a>
						<a class="standardLink" href="/sbsToolBox/mailListSettings.do"><bean:message key="label.mailinglistor"/></a>
						<a class="standardLink" href="/sbsToolBox/preVersion.do?dispatch=view"><bean:message key="link.version"/></a>
						<a class="standardLink" href="/sbsToolBox/manageArbplatsTyp.do?dispatch=pre"><bean:message key="label.skapaArbplatsTyp"/></a>
						<a class="standardLink" href="/sbsToolBox/manageArbetsTyp.do?dispatch=pre"><bean:message key="label.skapaArbTyp"/></a>
						<a class="standardLink" href="/sbsToolBox/manageProdverkstad.do?dispatch=pre"><bean:message key="label.fabriksdel"/></a>
						<a class="standardLink" href="/sbsToolBox/manageTeamAssociate.do?dispatch=pre"><bean:message key="label.produktverkstad"/></a>
						<a class="standardLink" href="/sbsToolBox/manageTeam.do?dispatch=pre"><bean:message key="label.produktverkstadassociate"/></a>
						<a class="standardLink" href="/sbsToolBox/manageCostCenter.do?dispatch=pre"><bean:message key="label.manageCostCenter"/></a>
						<a class="standardLink" href="/sbsToolBox/manageTeamCostCenter.do?dispatch=pre"><bean:message key="label.connectKstalleToProdverkstad"/></a>
						<a class="standardLink" href="/sbsToolBox/manageCartype.do?dispatch=pre"><bean:message key="label.biltypBilfamilj"/></a>
						<a class="standardLink" href="/sbsToolBox/personalSettings.do?dispatch=pre"><bean:message key="label.personalSettings"/></a>
					</div>
				</div>
				
		  		<div>
			 		<a class="standardLink" ><bean:message key="label.links"/> <span class="rightDoubleArrow">&#187;</span> </a>
			 		<div class="expandable">
						<a class="standardLink" href="/sbsToolBox/preLogs.do?dispatch=pre"><bean:message key="label.log"/></a>
						<a class="standardLink" href="/sbsToolBox/preCreateMessage.do"><bean:message key="label.createMessage"/></a>
						<a class="standardLink" href="/sbsToolBox/reloadProperty.do"><bean:message key="label.reloadProperty" /></a>
					</div>
				</div>
				
				<div>
		 		<a class="standardLink"><bean:message key="label.behorighetshantering"/> <span class="rightDoubleArrow">&#187;</span> </a>	
		 		<div class="expandable">	 		
				<logic:present role="access">
					<a class="standardLink" href="/sbsToolBox/preAssignGroups.do"><bean:message key="label.assignGroups"/></a>
					<a class="standardLink" href="/sbsToolBox/preCreateGroup.do"><bean:message key="label.createGroup"/></a>
				</logic:present>
				<logic:present role="createRole">
					<a class="standardLink" href="/sbsToolBox/preCreateRole.do"><bean:message key="label.createRole"/></a>
				</logic:present>
				</div>
				</div>
				
				<div>
					<a class="standardLink" ><bean:message key="label.weekReport"/> <span class="rightDoubleArrow">&#187;</span> </a>
					<div class="expandable">
						<a class="standardLink" href="/sbsToolBox/preChooseKStalle.do"><bean:message key="button.createTeam"/></a>
						<a class="standardLink" href="/sbsToolBox/preCleanTeams.do"><bean:message key="label.showTeam"/></a>
					</div>
				</div>
	 		</div>
	 	</div>
		|
		<div class="dropdown">
	 	  <a class="standardLink dropbtn" href='<bean:message key="label.sharepointHelpDocumentURL"/>' target="_blank"><bean:message key="label.help" /></a>
		  <div class="dropdown-content">
			<a class="standardLink" href='<bean:message key="label.sharepointHelpDocumentURL"/>' target="_blank"><bean:message key="label.userInformation"/></a>
			<a class="standardLink" href='<bean:message key="label.sharepointReleaseContentURL"/>' target="_blank"><bean:message key="label.Release"/></a>
		  </div>
	 	</div>
		|
		<a class="standardLink" href="/sbsToolBox/logout.do"><bean:message key="label.logout"/></a>
	</div>

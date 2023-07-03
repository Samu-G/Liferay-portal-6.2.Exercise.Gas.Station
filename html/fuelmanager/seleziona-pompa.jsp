<%@ include file="/html/fuelmanager/setup.jsp"%>

<portlet:renderURL var="PumpURL">
	<portlet:param name="mvcPath"
		value="/html/fuelmanager/seleziona-pompa.jsp" />
</portlet:renderURL>

<aui:form name="<portlet:namespace />fm">

	<aui:row>
		<aui:fieldset label="Seleziona la pompa">

			<aui:button-row cssClass="aui:buttons">
				<aui:button cssClass="aui:button" value="Pompa 1" />
				<!-- aggiungere onClick setta rifornimento corrente a pompa selezionata -->
				<aui:button cssClass="aui:button" value="Pompa 2" />
				<aui:button cssClass="aui:button" value="Pompa 3" />

			</aui:button-row>
			<aui:button-row cssClass="aui:button">
				<aui:button cssClass="aui:button" value="Pompa 4" />
				<aui:button cssClass="aui:button" value="Pompa 5" />
				<aui:button cssClass="aui:button" value="Pompa 6" />
			</aui:button-row>

		</aui:fieldset>
	</aui:row>

	<aui:row>
		<aui:button-row cssClass="aui-buttons">

			<aui:button value="Annnulla il rifornimento!" primary="true"
				onClick="ViewURL" />

			<aui:button value="Seleziona un altra pompa" primary="true"
				onClick="PumpURL" />


			<aui:button value="Inizia il rifornimento" primary="true"
				onClick="ErogazioneURL" />

		</aui:button-row>
	</aui:row>
</aui:form>
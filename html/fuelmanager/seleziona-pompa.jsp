<%@ include file="/html/fuelmanager/setup.jsp"%>

<portlet:renderURL var="ViewURL">
	<portlet:param name="mvcPath" value="/html/fuelmanager/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="ErogazioneURL">
	<portlet:param name="mvcPath" value="/html/fuelmanager/erogazione.jsp" />
</portlet:renderURL>

<portlet:renderURL var="PumpURL">
	<portlet:param name="mvcPath"
		value="/html/fuelmanager/seleziona-pompa.jsp" />
</portlet:renderURL>

<portlet:actionURL name="selezionaPompa" var="selezionaPompaURL"></portlet:actionURL>

<aui:form action="<%=selezionaPompaURL%>" name="<portlet:namespace />fm">

	<aui:fieldset label="Seleziona la pompa">

		<aui:button-row cssClass="aui:button">
			<aui:button cssClass="aui:button" value="Pompa 1"></aui:button>
			<!-- aggiungere onClick setta rifornimento corrente a pompa selezionata -->
			<aui:button cssClass="aui:button" value="Pompa 2"></aui:button>
			<aui:button cssClass="aui:button" value="Pompa 3"></aui:button>

		</aui:button-row>
		<aui:button-row cssClass="aui:button">
			<aui:button cssClass="aui:button" value="Pompa 4"></aui:button>
			<aui:button cssClass="aui:button" value="Pompa 5"></aui:button>
			<aui:button cssClass="aui:button" value="Pompa 6"></aui:button>
		</aui:button-row>

	</aui:fieldset>

</aui:form>

<aui:button-row cssClass="aui-buttons">

	<aui:row>
		<aui:button value="Annnulla il rifornimento!" primary="true"
			onClick="ViewURL" />
	</aui:row>

	<aui:row>
		<aui:button value="Seleziona un altra pompa" primary="true"
			onClick="PumpURL" />
	</aui:row>

	<aui:row>
		<aui:button value="Inizia il rifornimento" primary="true"
			onClick="ErogazioneURL" />
	</aui:row>

</aui:button-row>

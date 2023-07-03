<%@ include file="/html/fuelmanager/setup.jsp"%>

<portlet:renderURL var="PumpURL">
	<portlet:param name="mvcPath"
		value="/html/fuelmanager/seleziona-pompa.jsp" />
</portlet:renderURL>

<portlet:actionURL name="faiRifornimento" var="faiRifornimentoURL"></portlet:actionURL>


<aui:form action="<%=faiRifornimentoURL%>" name="<portlet:namespace />fm">

	<aui:fieldset label="Rifornimento">

		<aui:row>
			<p>Inserisci Qui Il Denaro:</p>
			<p>Sono accettate solo banconote da 5, 10, 20, 50, 100 Euro</p>
		</aui:row>

		<aui:row>
			<aui:input name="input numero">
				<aui:validator name="digit" />
			</aui:input>
			<aui:input id="mnyInserted" disabled="true" name="valore inserito"
				readonly="true" onchange="checkDigit(this.value)" />
		</aui:row>

		<aui:button-row cssClass="aui-buttons">
			<aui:row>
				<aui:button
					onclick="checkDigit(parseInt(document.getElementsById('mnyInserted')[0].value))"
					value="Aggiungi la cifra" />
				<aui:button onclick="azzera()" value="Azzera e restituisci denaro" />
			
				<aui:input onclick="faiRifornimentoURL" name="Prosegui con la selezione della pompa" type="submit" />
			</aui:row>
		</aui:button-row>

	</aui:fieldset>
</aui:form>

<!-- logic FE -->

<script type="text/javascript">
	
</script>

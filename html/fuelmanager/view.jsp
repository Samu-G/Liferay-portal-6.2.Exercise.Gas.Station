<%@ include file="/html/fuelmanager/setup.jsp"%>

<%@ page
	import="com.reply.liferay.exercise.model.service.StazioneDiRifornimentoServiceUtil"%>

<portlet:renderURL var="PumpURL">
	<portlet:param name="mvcPath"
		value="/html/fuelmanager/seleziona-pompa.jsp" />

</portlet:renderURL>

<aui:form name="<portlet:namespace />fm">

	<aui:fieldset label="Rifornimento">

		<aui:column>
			<aui:row>
				<p>Inserisci Qui Il Denaro:</p>
				<p>Sono accettate solo banconote da 5, 10, 20, 50, 100 Euro</p>
			</aui:row>


			<aui:row>
				<aui:input name="Inserisci il denaro" id="moneyInserted">
					<aui:button value="Aggiungi la cifra" />
					<!-- ATTENZIONE TEST DA RIMUOVERE -->
					<aui:validator name="digit" />
				</aui:input>

				<aui:input id="mnyInserted" disabled="true" name="valore inserito"
					type="number">
					<aui:validator name="digit" />
				</aui:input>
			</aui:row>

			<aui:button-row cssClass="aui-buttons">
				<aui:row>
					<aui:button value="Azzera e restituisci denaro" />
				</aui:row>
			</aui:button-row>
		</aui:column>

		<aui:column>
			<aui:row>
				<aui:input id="prezzoBenzina" disabled="true" name="Prezzo Benzina" />
			</aui:row>

			<aui:row>
				<aui:input id="prezzoDiesel" disabled="true" name="Prezzo Diesel" />
			</aui:row>

			<aui:row>
				<aui:button onclick="<%=PumpURL.toString()%>"
					value="Prosegui con la selezione della pompa" type="primary" />
			</aui:row>
		</aui:column>

	</aui:fieldset>

</aui:form>

<!-- logic FE -->

<script type="text/javascript">
	
</script>

<%@ include file="/html/fuelmanager/setup.jsp"%>

<%
	int contatore = 0; // Dichiarazione e inizializzazione del contatore
%>

<script>

	function increment(n) {
		counter = counter + n;
	}

	function azzera() {
		counter = 0;
	}

	function checkDigit(m) {
		if(m == 5) {
			counter += 5;
			contatore = counter;
			break;
		}
		if(m == 10) {
			counter += 10;
			contatore = counter;
			break;
		}
		if(m == 20) {
			counter += 20;
			contatore = counter;
			break;
		}
		if(m == 50){
			counter += 50;
			contatore = counter;
			break;
		}
		if (m == 100) {
			counter += 100;
			contatore = counter;
			break;
		}
		else {
			counter += 0;
		    alert("Sono accettate solo banconote da 5 10 20 50 100");
		    break;
		}
	}
	
	function getConter() {
		return conuter;
	}
</script>
</body>

<aui:form name="fm">
	<aui:fieldset label="Rifornimento">
		<aui:row>
			<aui:col width="33">
				<aui:input name="inserisci la cifra">
					<aui:validator name="digit">
						<aui:input name="inserisci qui il denaro" onChange="checkDigit(m)"></aui:input>
					</aui:validator>
				</aui:input>


			</aui:col>
			<aui:col width="33">


				<portlet:renderURL var="PumpURL">
					<portlet:param name="mvcPath"
						value="/html/fuelmanager/seleziona-pompa.jsp" />
				</portlet:renderURL>

				<aui:button onClick="<%=PumpURL.toString()%>"
					value="AGGIUNGI LA CIFRA" />
					
					
				<aui:button onClick="<%=PumpURL.toString()%>"
					value="Prosegui con la selezione della pompa" />

			</aui:col>
		</aui:row>


		<aui:col width="33">
			<aui:input disabled="true" name="valore inserito"
				value='returnCounter()' readonly='true'></aui:input>

		</aui:col>
	</aui:fieldset>
</aui:form>
</body>


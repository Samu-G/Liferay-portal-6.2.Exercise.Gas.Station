<%@ include file="/html/fuelmanager/setup.jsp" %>

<portlet:renderURL var="selezionaPompa">
    <portlet:param name="mvcPath" value="/html/fuelmanager/seleziona-pompa.jsp"></portlet:param>
</portlet:renderURL>


<aui:form name="fm">
<aui:fieldset label="Seleziona la pompa">
<aui:button-row cssClass="aui:button">
<aui:button cssClass="aui:button" value="Pompa 1"></aui:button>
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

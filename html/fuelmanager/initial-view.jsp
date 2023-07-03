<%@ include file="/html/fuelmanager/setup.jsp"%>


<portlet:renderURL var="PumpURL">
	<portlet:param name="mvcPath"
		value="/html/fuelmanager/view.jsp" />
</portlet:renderURL>

<aui:button class="aui:button" onclick="<%=PumpURL.toString()%>" value="Rifornisciti" />

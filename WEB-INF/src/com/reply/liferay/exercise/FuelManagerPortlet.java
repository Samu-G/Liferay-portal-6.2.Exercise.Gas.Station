package com.reply.liferay.exercise;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

//legal?
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.reply.liferay.exercise.model.model.Rifornimento;
import com.reply.liferay.exercise.model.service.RifornimentoLocalServiceUtil;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class FuelManagerPortlet
 */
public class FuelManagerPortlet extends MVCPortlet {

	private static int[] banconoteAccettate = new int[] { 5, 10, 20, 50, 100 };
	private int soldiInseriti = 0;

	public boolean aggiungiSoldi(ActionRequest request, ActionResponse response) {
		
		int inseriti = ParamUtil.getInteger(request, "soldiInseriti");
		
		try {
			if(Arrays.asList(soldiInseriti).contains(inseriti)) {
				soldiInseriti += inseriti;
				SessionMessages.add(request, "inseriti " + inseriti + " Euro.");
				return true;
			} else {
				SessionMessages.add(request, "inseriti " + (-0) + " Euro.");
				return false;
			}
		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/fuelmanager/initial-view.jsp");
		}
		return false;
	}

	public int annullaRifornimento() {
		int rimborso = soldiInseriti;
		this.soldiInseriti = 0;
		return rimborso;
	}
	
	public void faiRifornimento(ActionRequest request, ActionResponse response) {
		
	}

	/**
	 * Qui viene creata una nuova entry che memorizzerà il rifornimento fatto con la specifica pompa
	 */
	/*
	 * public void iniziaRifornimento() { if(soldiInseriti>=5) {
	 * RifornimentoLocalServiceImpl } }
	 */

}

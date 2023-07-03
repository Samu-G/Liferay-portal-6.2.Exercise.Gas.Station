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
<<<<<<< HEAD
import java.lang.reflect.Array;
import java.util.Arrays;
=======
>>>>>>> 57d62af87a7cb366c4a3ccfc5ecdd86fe645dbc4

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

/**
 * Portlet implementation class FuelManagerPortlet
 */
public class FuelManagerPortlet extends MVCPortlet {

	private static int[] banconoteAccettate = new int[] { 5, 10, 20, 50, 100 };
	private int soldiInseriti = 0;

<<<<<<< HEAD
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
=======
	public void aggiungiSoldi(ActionRequest request, ActionResponse response) {
		int inseriti = ParamUtil.getInteger(request, "soldiInseriti");
		try {
			soldiInseriti += inseriti;
			SessionMessages.add(request, "inseriti " + inseriti + " Euro.");
		} catch (Exception e) {
			SessionErrors.add(request, e.getClass().getName());
			response.setRenderParameter("mvcPath", "/html/fuelmanager/view.jsp");
		}
	}

	public int annullaRichiesta() {
		int rimborso = soldiInseriti;
		soldiInseriti = 0;
		return rimborso;
	}

	/**
	 * Qui viene creata una nuova entry che memorizzerà il rifornimento fatto con la specifica pompa
	 */
	public void procediConRifornimento(ActionRequest request, ActionResponse response) throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Rifornimento.class.getName(), request);
		
		String tipologiaDiCarburante = ParamUtil.getString(request, "tipologiaCarburante");
		
		try {
			//RifornimentoLocalServiceUtil.aggiungiRifornimento(serviceContext.getUserId(), tipologiaDiCarburante, soldiInseriti, serviceContext);

			SessionMessages.add(request, "Hai deciso di rifornirti! Inserisci il denaro");
		
		} catch (Exception ex) {
			SessionErrors.add(request, ex.getClass().getName());

			response.setRenderParameter("mvcPath", "/html/fuelmanager/initial-view.jsp");
		}

	}
	
	public void faiRifornimento(ActionRequest request, ActionResponse response) {
	    // Codice per il rifornimento del carburante
	    
	    // Esempio di reindirizzamento a una pagina dopo il rifornimento
	    String redirectURL = "/html/fuelmanager/seleziona-pompa.jsp";
	    
	    // Ottieni l'istanza di LiferayPortletResponse
	    LiferayPortletResponse liferayResponse = (LiferayPortletResponse) response;
	    
	    // Creazione dell'URL di reindirizzamento
	    LiferayPortletURL renderURL = (LiferayPortletURL) liferayResponse.createRenderURL();
	    renderURL.setParameter("mvcPath", redirectURL);
	    
	    // Reindirizzamento alla pagina di destinazione
	    try {
	        response.sendRedirect(renderURL.toString());
	    } catch (IOException e) {
	        // Gestione dell'eventuale eccezione
	    }
	}



>>>>>>> 57d62af87a7cb366c4a3ccfc5ecdd86fe645dbc4

}

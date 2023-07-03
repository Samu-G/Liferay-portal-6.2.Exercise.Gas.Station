/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.reply.liferay.exercise.model.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StazioneDiRifornimentoService}.
 *
 * @author s.girardello
 * @see StazioneDiRifornimentoService
 * @generated
 */
public class StazioneDiRifornimentoServiceWrapper
	implements StazioneDiRifornimentoService,
		ServiceWrapper<StazioneDiRifornimentoService> {
	public StazioneDiRifornimentoServiceWrapper(
		StazioneDiRifornimentoService stazioneDiRifornimentoService) {
		_stazioneDiRifornimentoService = stazioneDiRifornimentoService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stazioneDiRifornimentoService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stazioneDiRifornimentoService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stazioneDiRifornimentoService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.lang.String getPrezzoBenzina() {
		return _stazioneDiRifornimentoService.getPrezzoBenzina();
	}

	@Override
	public java.lang.String getPrezzoDiesel() {
		return _stazioneDiRifornimentoService.getPrezzoDiesel();
	}

	@Override
	public void aggiungiDenaro(int denaroDaAggiungere) {
		_stazioneDiRifornimentoService.aggiungiDenaro(denaroDaAggiungere);
	}

	@Override
	public java.lang.String getDenaro() {
		return _stazioneDiRifornimentoService.getDenaro();
	}

	@Override
	public void reset() {
		_stazioneDiRifornimentoService.reset();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StazioneDiRifornimentoService getWrappedStazioneDiRifornimentoService() {
		return _stazioneDiRifornimentoService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStazioneDiRifornimentoService(
		StazioneDiRifornimentoService stazioneDiRifornimentoService) {
		_stazioneDiRifornimentoService = stazioneDiRifornimentoService;
	}

	@Override
	public StazioneDiRifornimentoService getWrappedService() {
		return _stazioneDiRifornimentoService;
	}

	@Override
	public void setWrappedService(
		StazioneDiRifornimentoService stazioneDiRifornimentoService) {
		_stazioneDiRifornimentoService = stazioneDiRifornimentoService;
	}

	private StazioneDiRifornimentoService _stazioneDiRifornimentoService;
}
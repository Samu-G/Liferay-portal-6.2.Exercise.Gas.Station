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
 * Provides a wrapper for {@link StazioneDiRifornimentoLocalService}.
 *
 * @author s.girardello
 * @see StazioneDiRifornimentoLocalService
 * @generated
 */
public class StazioneDiRifornimentoLocalServiceWrapper
	implements StazioneDiRifornimentoLocalService,
		ServiceWrapper<StazioneDiRifornimentoLocalService> {
	public StazioneDiRifornimentoLocalServiceWrapper(
		StazioneDiRifornimentoLocalService stazioneDiRifornimentoLocalService) {
		_stazioneDiRifornimentoLocalService = stazioneDiRifornimentoLocalService;
	}

	/**
	* Adds the stazione di rifornimento to the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento addStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.addStazioneDiRifornimento(stazioneDiRifornimento);
	}

	/**
	* Creates a new stazione di rifornimento with the primary key. Does not add the stazione di rifornimento to the database.
	*
	* @param stazioneDiRifornimentoId the primary key for the new stazione di rifornimento
	* @return the new stazione di rifornimento
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento createStazioneDiRifornimento(
		long stazioneDiRifornimentoId) {
		return _stazioneDiRifornimentoLocalService.createStazioneDiRifornimento(stazioneDiRifornimentoId);
	}

	/**
	* Deletes the stazione di rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento that was removed
	* @throws PortalException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento deleteStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.deleteStazioneDiRifornimento(stazioneDiRifornimentoId);
	}

	/**
	* Deletes the stazione di rifornimento from the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento deleteStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.deleteStazioneDiRifornimento(stazioneDiRifornimento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _stazioneDiRifornimentoLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.fetchStazioneDiRifornimento(stazioneDiRifornimentoId);
	}

	/**
	* Returns the stazione di rifornimento with the matching UUID and company.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param companyId the primary key of the company
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimentoByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.fetchStazioneDiRifornimentoByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the stazione di rifornimento matching the UUID and group.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param groupId the primary key of the group
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimentoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.fetchStazioneDiRifornimentoByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the stazione di rifornimento with the primary key.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento
	* @throws PortalException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getStazioneDiRifornimento(stazioneDiRifornimentoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the stazione di rifornimento with the matching UUID and company.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param companyId the primary key of the company
	* @return the matching stazione di rifornimento
	* @throws PortalException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimentoByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getStazioneDiRifornimentoByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the stazione di rifornimento matching the UUID and group.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param groupId the primary key of the group
	* @return the matching stazione di rifornimento
	* @throws PortalException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimentoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getStazioneDiRifornimentoByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns a range of all the stazione di rifornimentos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @return the range of stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> getStazioneDiRifornimentos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getStazioneDiRifornimentos(start,
			end);
	}

	/**
	* Returns the number of stazione di rifornimentos.
	*
	* @return the number of stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStazioneDiRifornimentosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.getStazioneDiRifornimentosCount();
	}

	/**
	* Updates the stazione di rifornimento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento updateStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimentoLocalService.updateStazioneDiRifornimento(stazioneDiRifornimento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _stazioneDiRifornimentoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_stazioneDiRifornimentoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _stazioneDiRifornimentoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.lang.String getPrezzoBenzina() {
		return _stazioneDiRifornimentoLocalService.getPrezzoBenzina();
	}

	@Override
	public java.lang.String getPrezzoDiesel() {
		return _stazioneDiRifornimentoLocalService.getPrezzoDiesel();
	}

	@Override
	public void aggiungiDenaro(int denaroDaAggiungere) {
		_stazioneDiRifornimentoLocalService.aggiungiDenaro(denaroDaAggiungere);
	}

	@Override
	public java.lang.String getDenaro() {
		return _stazioneDiRifornimentoLocalService.getDenaro();
	}

	@Override
	public void reset() {
		_stazioneDiRifornimentoLocalService.reset();
	}

	@Override
	public void aggiuntaPompaDallAmministratore() {
		_stazioneDiRifornimentoLocalService.aggiuntaPompaDallAmministratore();
	}

	@Override
	public boolean isStationUpAndRunning() {
		return _stazioneDiRifornimentoLocalService.isStationUpAndRunning();
	}

	@Override
	public void setStationUpAndRunning(boolean stationUpAndRunning) {
		_stazioneDiRifornimentoLocalService.setStationUpAndRunning(stationUpAndRunning);
	}

	@Override
	public void setPrezzoBenzina(float prezzoBenzina) {
		_stazioneDiRifornimentoLocalService.setPrezzoBenzina(prezzoBenzina);
	}

	@Override
	public void setPrezzoDiesel(float prezzoDiesel) {
		_stazioneDiRifornimentoLocalService.setPrezzoDiesel(prezzoDiesel);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StazioneDiRifornimentoLocalService getWrappedStazioneDiRifornimentoLocalService() {
		return _stazioneDiRifornimentoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStazioneDiRifornimentoLocalService(
		StazioneDiRifornimentoLocalService stazioneDiRifornimentoLocalService) {
		_stazioneDiRifornimentoLocalService = stazioneDiRifornimentoLocalService;
	}

	@Override
	public StazioneDiRifornimentoLocalService getWrappedService() {
		return _stazioneDiRifornimentoLocalService;
	}

	@Override
	public void setWrappedService(
		StazioneDiRifornimentoLocalService stazioneDiRifornimentoLocalService) {
		_stazioneDiRifornimentoLocalService = stazioneDiRifornimentoLocalService;
	}

	private StazioneDiRifornimentoLocalService _stazioneDiRifornimentoLocalService;
}
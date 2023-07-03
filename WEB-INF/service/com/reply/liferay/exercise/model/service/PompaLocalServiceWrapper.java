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
 * Provides a wrapper for {@link PompaLocalService}.
 *
 * @author s.girardello
 * @see PompaLocalService
 * @generated
 */
public class PompaLocalServiceWrapper implements PompaLocalService,
	ServiceWrapper<PompaLocalService> {
	public PompaLocalServiceWrapper(PompaLocalService pompaLocalService) {
		_pompaLocalService = pompaLocalService;
	}

	/**
	* Adds the pompa to the database. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa addPompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.addPompa(pompa);
	}

	/**
	* Creates a new pompa with the primary key. Does not add the pompa to the database.
	*
	* @param pompaId the primary key for the new pompa
	* @return the new pompa
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa createPompa(
		long pompaId) {
		return _pompaLocalService.createPompa(pompaId);
	}

	/**
	* Deletes the pompa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa that was removed
	* @throws PortalException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa deletePompa(
		long pompaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.deletePompa(pompaId);
	}

	/**
	* Deletes the pompa from the database. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa deletePompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.deletePompa(pompa);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pompaLocalService.dynamicQuery();
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
		return _pompaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pompaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pompaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _pompaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _pompaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.reply.liferay.exercise.model.model.Pompa fetchPompa(long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.fetchPompa(pompaId);
	}

	/**
	* Returns the pompa with the matching UUID and company.
	*
	* @param uuid the pompa's UUID
	* @param companyId the primary key of the company
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa fetchPompaByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.fetchPompaByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the pompa matching the UUID and group.
	*
	* @param uuid the pompa's UUID
	* @param groupId the primary key of the group
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa fetchPompaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.fetchPompaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the pompa with the primary key.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa
	* @throws PortalException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa getPompa(long pompaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPompa(pompaId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the pompa with the matching UUID and company.
	*
	* @param uuid the pompa's UUID
	* @param companyId the primary key of the company
	* @return the matching pompa
	* @throws PortalException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa getPompaByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPompaByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the pompa matching the UUID and group.
	*
	* @param uuid the pompa's UUID
	* @param groupId the primary key of the group
	* @return the matching pompa
	* @throws PortalException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa getPompaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPompaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the pompas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @return the range of pompas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> getPompas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPompas(start, end);
	}

	/**
	* Returns the number of pompas.
	*
	* @return the number of pompas
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPompasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.getPompasCount();
	}

	/**
	* Updates the pompa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Pompa updatePompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompaLocalService.updatePompa(pompa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _pompaLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_pompaLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _pompaLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public int getQuantitaDiesel() {
		return _pompaLocalService.getQuantitaDiesel();
	}

	@Override
	public int getQuantitaBenzina() {
		return _pompaLocalService.getQuantitaBenzina();
	}

	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> getListaRifornimenti() {
		return _pompaLocalService.getListaRifornimenti();
	}

	@Override
	public void setGiacenzaAttiva(boolean b) {
		_pompaLocalService.setGiacenzaAttiva(b);
	}

	@Override
	public void aggiungiDiesel(int quantitaCarburante) {
		_pompaLocalService.aggiungiDiesel(quantitaCarburante);
	}

	@Override
	public void aggiungiBenzina(int quantitaCarburante) {
		_pompaLocalService.aggiungiBenzina(quantitaCarburante);
	}

	@Override
	public int getIntroitoTotale() {
		return _pompaLocalService.getIntroitoTotale();
	}

	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> getTotalitaRifornimento() {
		return _pompaLocalService.getTotalitaRifornimento();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PompaLocalService getWrappedPompaLocalService() {
		return _pompaLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPompaLocalService(PompaLocalService pompaLocalService) {
		_pompaLocalService = pompaLocalService;
	}

	@Override
	public PompaLocalService getWrappedService() {
		return _pompaLocalService;
	}

	@Override
	public void setWrappedService(PompaLocalService pompaLocalService) {
		_pompaLocalService = pompaLocalService;
	}

	private PompaLocalService _pompaLocalService;
}
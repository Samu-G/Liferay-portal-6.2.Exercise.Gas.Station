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
 * Provides a wrapper for {@link RifornimentoLocalService}.
 *
 * @author s.girardello
 * @see RifornimentoLocalService
 * @generated
 */
public class RifornimentoLocalServiceWrapper implements RifornimentoLocalService,
	ServiceWrapper<RifornimentoLocalService> {
	public RifornimentoLocalServiceWrapper(
		RifornimentoLocalService rifornimentoLocalService) {
		_rifornimentoLocalService = rifornimentoLocalService;
	}

	/**
	* Adds the rifornimento to the database. Also notifies the appropriate model listeners.
	*
	* @param rifornimento the rifornimento
	* @return the rifornimento that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento addRifornimento(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.addRifornimento(rifornimento);
	}

	/**
	* Creates a new rifornimento with the primary key. Does not add the rifornimento to the database.
	*
	* @param rifornimentoId the primary key for the new rifornimento
	* @return the new rifornimento
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento createRifornimento(
		long rifornimentoId) {
		return _rifornimentoLocalService.createRifornimento(rifornimentoId);
	}

	/**
	* Deletes the rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento that was removed
	* @throws PortalException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento deleteRifornimento(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.deleteRifornimento(rifornimentoId);
	}

	/**
	* Deletes the rifornimento from the database. Also notifies the appropriate model listeners.
	*
	* @param rifornimento the rifornimento
	* @return the rifornimento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento deleteRifornimento(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.deleteRifornimento(rifornimento);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rifornimentoLocalService.dynamicQuery();
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
		return _rifornimentoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rifornimentoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rifornimentoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _rifornimentoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rifornimentoLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento fetchRifornimento(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.fetchRifornimento(rifornimentoId);
	}

	/**
	* Returns the rifornimento with the primary key.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento
	* @throws PortalException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento getRifornimento(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.getRifornimento(rifornimentoId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the rifornimentos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rifornimentos
	* @param end the upper bound of the range of rifornimentos (not inclusive)
	* @return the range of rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> getRifornimentos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.getRifornimentos(start, end);
	}

	/**
	* Returns the number of rifornimentos.
	*
	* @return the number of rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getRifornimentosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.getRifornimentosCount();
	}

	/**
	* Updates the rifornimento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rifornimento the rifornimento
	* @return the rifornimento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento updateRifornimento(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimentoLocalService.updateRifornimento(rifornimento);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _rifornimentoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_rifornimentoLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _rifornimentoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public boolean sbloccaRifornimento() {
		return _rifornimentoLocalService.sbloccaRifornimento();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public RifornimentoLocalService getWrappedRifornimentoLocalService() {
		return _rifornimentoLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedRifornimentoLocalService(
		RifornimentoLocalService rifornimentoLocalService) {
		_rifornimentoLocalService = rifornimentoLocalService;
	}

	@Override
	public RifornimentoLocalService getWrappedService() {
		return _rifornimentoLocalService;
	}

	@Override
	public void setWrappedService(
		RifornimentoLocalService rifornimentoLocalService) {
		_rifornimentoLocalService = rifornimentoLocalService;
	}

	private RifornimentoLocalService _rifornimentoLocalService;
}
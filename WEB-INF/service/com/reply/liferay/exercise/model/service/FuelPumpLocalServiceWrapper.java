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
 * Provides a wrapper for {@link FuelPumpLocalService}.
 *
 * @author s.girardello
 * @see FuelPumpLocalService
 * @generated
 */
public class FuelPumpLocalServiceWrapper implements FuelPumpLocalService,
	ServiceWrapper<FuelPumpLocalService> {
	public FuelPumpLocalServiceWrapper(
		FuelPumpLocalService fuelPumpLocalService) {
		_fuelPumpLocalService = fuelPumpLocalService;
	}

	/**
	* Adds the fuel pump to the database. Also notifies the appropriate model listeners.
	*
	* @param fuelPump the fuel pump
	* @return the fuel pump that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump addFuelPump(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.addFuelPump(fuelPump);
	}

	/**
	* Creates a new fuel pump with the primary key. Does not add the fuel pump to the database.
	*
	* @param fuelPumpId the primary key for the new fuel pump
	* @return the new fuel pump
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump createFuelPump(
		long fuelPumpId) {
		return _fuelPumpLocalService.createFuelPump(fuelPumpId);
	}

	/**
	* Deletes the fuel pump with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fuelPumpId the primary key of the fuel pump
	* @return the fuel pump that was removed
	* @throws PortalException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump deleteFuelPump(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.deleteFuelPump(fuelPumpId);
	}

	/**
	* Deletes the fuel pump from the database. Also notifies the appropriate model listeners.
	*
	* @param fuelPump the fuel pump
	* @return the fuel pump that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump deleteFuelPump(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.deleteFuelPump(fuelPump);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fuelPumpLocalService.dynamicQuery();
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
		return _fuelPumpLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fuelPumpLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _fuelPumpLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _fuelPumpLocalService.dynamicQueryCount(dynamicQuery);
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
		return _fuelPumpLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.reply.liferay.exercise.model.model.FuelPump fetchFuelPump(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.fetchFuelPump(fuelPumpId);
	}

	/**
	* Returns the fuel pump with the matching UUID and company.
	*
	* @param uuid the fuel pump's UUID
	* @param companyId the primary key of the company
	* @return the matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump fetchFuelPumpByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.fetchFuelPumpByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the fuel pump matching the UUID and group.
	*
	* @param uuid the fuel pump's UUID
	* @param groupId the primary key of the group
	* @return the matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump fetchFuelPumpByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.fetchFuelPumpByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the fuel pump with the primary key.
	*
	* @param fuelPumpId the primary key of the fuel pump
	* @return the fuel pump
	* @throws PortalException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump getFuelPump(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getFuelPump(fuelPumpId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the fuel pump with the matching UUID and company.
	*
	* @param uuid the fuel pump's UUID
	* @param companyId the primary key of the company
	* @return the matching fuel pump
	* @throws PortalException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump getFuelPumpByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getFuelPumpByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the fuel pump matching the UUID and group.
	*
	* @param uuid the fuel pump's UUID
	* @param groupId the primary key of the group
	* @return the matching fuel pump
	* @throws PortalException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump getFuelPumpByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getFuelPumpByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the fuel pumps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @return the range of fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.reply.liferay.exercise.model.model.FuelPump> getFuelPumps(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getFuelPumps(start, end);
	}

	/**
	* Returns the number of fuel pumps.
	*
	* @return the number of fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getFuelPumpsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.getFuelPumpsCount();
	}

	/**
	* Updates the fuel pump in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param fuelPump the fuel pump
	* @return the fuel pump that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.reply.liferay.exercise.model.model.FuelPump updateFuelPump(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPumpLocalService.updateFuelPump(fuelPump);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _fuelPumpLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_fuelPumpLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _fuelPumpLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public FuelPumpLocalService getWrappedFuelPumpLocalService() {
		return _fuelPumpLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedFuelPumpLocalService(
		FuelPumpLocalService fuelPumpLocalService) {
		_fuelPumpLocalService = fuelPumpLocalService;
	}

	@Override
	public FuelPumpLocalService getWrappedService() {
		return _fuelPumpLocalService;
	}

	@Override
	public void setWrappedService(FuelPumpLocalService fuelPumpLocalService) {
		_fuelPumpLocalService = fuelPumpLocalService;
	}

	private FuelPumpLocalService _fuelPumpLocalService;
}
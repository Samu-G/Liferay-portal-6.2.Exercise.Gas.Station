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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for StazioneDiRifornimento. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author s.girardello
 * @see StazioneDiRifornimentoLocalServiceUtil
 * @see com.reply.liferay.exercise.model.service.base.StazioneDiRifornimentoLocalServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.impl.StazioneDiRifornimentoLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface StazioneDiRifornimentoLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StazioneDiRifornimentoLocalServiceUtil} to access the stazione di rifornimento local service. Add custom service methods to {@link com.reply.liferay.exercise.model.service.impl.StazioneDiRifornimentoLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the stazione di rifornimento to the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was added
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento addStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new stazione di rifornimento with the primary key. Does not add the stazione di rifornimento to the database.
	*
	* @param stazioneDiRifornimentoId the primary key for the new stazione di rifornimento
	* @return the new stazione di rifornimento
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento createStazioneDiRifornimento(
		long stazioneDiRifornimentoId);

	/**
	* Deletes the stazione di rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento that was removed
	* @throws PortalException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento deleteStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the stazione di rifornimento from the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was removed
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.DELETE)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento deleteStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento with the matching UUID and company.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param companyId the primary key of the company
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimentoByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento matching the UUID and group.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param groupId the primary key of the group
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchStazioneDiRifornimentoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento with the primary key.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento
	* @throws PortalException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimento(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento with the matching UUID and company.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param companyId the primary key of the company
	* @return the matching stazione di rifornimento
	* @throws PortalException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimentoByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento matching the UUID and group.
	*
	* @param uuid the stazione di rifornimento's UUID
	* @param groupId the primary key of the group
	* @return the matching stazione di rifornimento
	* @throws PortalException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento getStazioneDiRifornimentoByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> getStazioneDiRifornimentos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stazione di rifornimentos.
	*
	* @return the number of stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getStazioneDiRifornimentosCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the stazione di rifornimento in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	* @return the stazione di rifornimento that was updated
	* @throws SystemException if a system exception occurred
	*/
	@com.liferay.portal.kernel.search.Indexable(type = IndexableType.REINDEX)
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento updateStazioneDiRifornimento(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getPrezzoBenzina();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getPrezzoDiesel();

	public void aggiungiDenaro(int denaroDaAggiungere);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getDenaro();

	public void reset();

	public void aggiuntaPompaDallAmministratore();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isStationUpAndRunning();

	public void setStationUpAndRunning(boolean stationUpAndRunning);

	public void setPrezzoBenzina(float prezzoBenzina);

	public void setPrezzoDiesel(float prezzoDiesel);
}
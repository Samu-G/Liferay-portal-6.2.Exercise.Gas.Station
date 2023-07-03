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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Pompa. This utility wraps
 * {@link com.reply.liferay.exercise.model.service.impl.PompaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author s.girardello
 * @see PompaLocalService
 * @see com.reply.liferay.exercise.model.service.base.PompaLocalServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.impl.PompaLocalServiceImpl
 * @generated
 */
public class PompaLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.reply.liferay.exercise.model.service.impl.PompaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the pompa to the database. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa addPompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPompa(pompa);
	}

	/**
	* Creates a new pompa with the primary key. Does not add the pompa to the database.
	*
	* @param pompaId the primary key for the new pompa
	* @return the new pompa
	*/
	public static com.reply.liferay.exercise.model.model.Pompa createPompa(
		long pompaId) {
		return getService().createPompa(pompaId);
	}

	/**
	* Deletes the pompa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa that was removed
	* @throws PortalException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa deletePompa(
		long pompaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePompa(pompaId);
	}

	/**
	* Deletes the pompa from the database. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa deletePompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePompa(pompa);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.reply.liferay.exercise.model.model.Pompa fetchPompa(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPompa(pompaId);
	}

	/**
	* Returns the pompa with the matching UUID and company.
	*
	* @param uuid the pompa's UUID
	* @param companyId the primary key of the company
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchPompaByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPompaByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the pompa matching the UUID and group.
	*
	* @param uuid the pompa's UUID
	* @param groupId the primary key of the group
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchPompaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPompaByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the pompa with the primary key.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa
	* @throws PortalException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa getPompa(
		long pompaId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPompa(pompaId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static com.reply.liferay.exercise.model.model.Pompa getPompaByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPompaByUuidAndCompanyId(uuid, companyId);
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
	public static com.reply.liferay.exercise.model.model.Pompa getPompaByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPompaByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> getPompas(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPompas(start, end);
	}

	/**
	* Returns the number of pompas.
	*
	* @return the number of pompas
	* @throws SystemException if a system exception occurred
	*/
	public static int getPompasCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPompasCount();
	}

	/**
	* Updates the pompa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pompa the pompa
	* @return the pompa that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa updatePompa(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePompa(pompa);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static int getQuantitaDiesel() {
		return getService().getQuantitaDiesel();
	}

	public static int getQuantitaBenzina() {
		return getService().getQuantitaBenzina();
	}

	public static java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> getListaRifornimenti() {
		return getService().getListaRifornimenti();
	}

	public static void setGiacenzaAttiva(boolean b) {
		getService().setGiacenzaAttiva(b);
	}

	public static void aggiungiDiesel(int quantitaCarburante) {
		getService().aggiungiDiesel(quantitaCarburante);
	}

	public static void aggiungiBenzina(int quantitaCarburante) {
		getService().aggiungiBenzina(quantitaCarburante);
	}

	public static int getIntroitoTotale() {
		return getService().getIntroitoTotale();
	}

	public static java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> getTotalitaRifornimento() {
		return getService().getTotalitaRifornimento();
	}

	public static void clearService() {
		_service = null;
	}

	public static PompaLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PompaLocalService.class.getName());

			if (invokableLocalService instanceof PompaLocalService) {
				_service = (PompaLocalService)invokableLocalService;
			}
			else {
				_service = new PompaLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PompaLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PompaLocalService service) {
	}

	private static PompaLocalService _service;
}
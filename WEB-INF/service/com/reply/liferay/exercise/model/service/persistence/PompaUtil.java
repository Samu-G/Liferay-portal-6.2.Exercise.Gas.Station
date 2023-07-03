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

package com.reply.liferay.exercise.model.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.reply.liferay.exercise.model.model.Pompa;

import java.util.List;

/**
 * The persistence utility for the pompa service. This utility wraps {@link PompaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see PompaPersistence
 * @see PompaPersistenceImpl
 * @generated
 */
public class PompaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Pompa pompa) {
		getPersistence().clearCache(pompa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Pompa> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pompa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pompa> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Pompa update(Pompa pompa) throws SystemException {
		return getPersistence().update(pompa);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Pompa update(Pompa pompa, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(pompa, serviceContext);
	}

	/**
	* Returns all the pompas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the pompas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @return the range of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the pompas where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the pompas before and after the current pompa in the ordered set where uuid = &#63;.
	*
	* @param pompaId the primary key of the current pompa
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa[] findByUuid_PrevAndNext(
		long pompaId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence()
				   .findByUuid_PrevAndNext(pompaId, uuid, orderByComparator);
	}

	/**
	* Removes all the pompas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of pompas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchPompaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the pompa where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the pompa that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of pompas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the pompas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the pompas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @return the range of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the pompas where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the pompas before and after the current pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param pompaId the primary key of the current pompa
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa[] findByUuid_C_PrevAndNext(
		long pompaId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(pompaId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the pompas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of pompas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the pompa in the entity cache if it is enabled.
	*
	* @param pompa the pompa
	*/
	public static void cacheResult(
		com.reply.liferay.exercise.model.model.Pompa pompa) {
		getPersistence().cacheResult(pompa);
	}

	/**
	* Caches the pompas in the entity cache if it is enabled.
	*
	* @param pompas the pompas
	*/
	public static void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.Pompa> pompas) {
		getPersistence().cacheResult(pompas);
	}

	/**
	* Creates a new pompa with the primary key. Does not add the pompa to the database.
	*
	* @param pompaId the primary key for the new pompa
	* @return the new pompa
	*/
	public static com.reply.liferay.exercise.model.model.Pompa create(
		long pompaId) {
		return getPersistence().create(pompaId);
	}

	/**
	* Removes the pompa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa remove(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().remove(pompaId);
	}

	public static com.reply.liferay.exercise.model.model.Pompa updateImpl(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(pompa);
	}

	/**
	* Returns the pompa with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchPompaException} if it could not be found.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa findByPrimaryKey(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException {
		return getPersistence().findByPrimaryKey(pompaId);
	}

	/**
	* Returns the pompa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa, or <code>null</code> if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Pompa fetchByPrimaryKey(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(pompaId);
	}

	/**
	* Returns all the pompas.
	*
	* @return the pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the pompas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.PompaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pompas
	* @param end the upper bound of the range of pompas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of pompas
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the pompas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of pompas.
	*
	* @return the number of pompas
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PompaPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PompaPersistence)PortletBeanLocatorUtil.locate(com.reply.liferay.exercise.model.service.ClpSerializer.getServletContextName(),
					PompaPersistence.class.getName());

			ReferenceRegistry.registerReference(PompaUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PompaPersistence persistence) {
	}

	private static PompaPersistence _persistence;
}
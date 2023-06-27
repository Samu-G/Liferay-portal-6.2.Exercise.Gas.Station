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

import com.reply.liferay.exercise.model.model.FuelPump;

import java.util.List;

/**
 * The persistence utility for the fuel pump service. This utility wraps {@link FuelPumpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see FuelPumpPersistence
 * @see FuelPumpPersistenceImpl
 * @generated
 */
public class FuelPumpUtil {
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
	public static void clearCache(FuelPump fuelPump) {
		getPersistence().clearCache(fuelPump);
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
	public static List<FuelPump> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FuelPump> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FuelPump> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static FuelPump update(FuelPump fuelPump) throws SystemException {
		return getPersistence().update(fuelPump);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static FuelPump update(FuelPump fuelPump,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(fuelPump, serviceContext);
	}

	/**
	* Returns all the fuel pumps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the fuel pumps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @return the range of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the fuel pumps where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first fuel pump in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first fuel pump in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last fuel pump in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last fuel pump in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the fuel pumps before and after the current fuel pump in the ordered set where uuid = &#63;.
	*
	* @param fuelPumpId the primary key of the current fuel pump
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump[] findByUuid_PrevAndNext(
		long fuelPumpId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence()
				   .findByUuid_PrevAndNext(fuelPumpId, uuid, orderByComparator);
	}

	/**
	* Removes all the fuel pumps where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of fuel pumps where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the fuel pump where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchFuelPumpException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the fuel pump where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the fuel pump where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the fuel pump where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the fuel pump that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of fuel pumps where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the fuel pumps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the fuel pumps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @return the range of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the fuel pumps where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first fuel pump in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first fuel pump in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last fuel pump in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last fuel pump in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the fuel pumps before and after the current fuel pump in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param fuelPumpId the primary key of the current fuel pump
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump[] findByUuid_C_PrevAndNext(
		long fuelPumpId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(fuelPumpId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the fuel pumps where uuid = &#63; and companyId = &#63; from the database.
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
	* Returns the number of fuel pumps where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Caches the fuel pump in the entity cache if it is enabled.
	*
	* @param fuelPump the fuel pump
	*/
	public static void cacheResult(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump) {
		getPersistence().cacheResult(fuelPump);
	}

	/**
	* Caches the fuel pumps in the entity cache if it is enabled.
	*
	* @param fuelPumps the fuel pumps
	*/
	public static void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.FuelPump> fuelPumps) {
		getPersistence().cacheResult(fuelPumps);
	}

	/**
	* Creates a new fuel pump with the primary key. Does not add the fuel pump to the database.
	*
	* @param fuelPumpId the primary key for the new fuel pump
	* @return the new fuel pump
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump create(
		long fuelPumpId) {
		return getPersistence().create(fuelPumpId);
	}

	/**
	* Removes the fuel pump with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fuelPumpId the primary key of the fuel pump
	* @return the fuel pump that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump remove(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().remove(fuelPumpId);
	}

	public static com.reply.liferay.exercise.model.model.FuelPump updateImpl(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(fuelPump);
	}

	/**
	* Returns the fuel pump with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchFuelPumpException} if it could not be found.
	*
	* @param fuelPumpId the primary key of the fuel pump
	* @return the fuel pump
	* @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump findByPrimaryKey(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchFuelPumpException {
		return getPersistence().findByPrimaryKey(fuelPumpId);
	}

	/**
	* Returns the fuel pump with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fuelPumpId the primary key of the fuel pump
	* @return the fuel pump, or <code>null</code> if a fuel pump with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.FuelPump fetchByPrimaryKey(
		long fuelPumpId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(fuelPumpId);
	}

	/**
	* Returns all the fuel pumps.
	*
	* @return the fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the fuel pumps.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of fuel pumps
	* @param end the upper bound of the range of fuel pumps (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.FuelPump> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the fuel pumps from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of fuel pumps.
	*
	* @return the number of fuel pumps
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FuelPumpPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FuelPumpPersistence)PortletBeanLocatorUtil.locate(com.reply.liferay.exercise.model.service.ClpSerializer.getServletContextName(),
					FuelPumpPersistence.class.getName());

			ReferenceRegistry.registerReference(FuelPumpUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(FuelPumpPersistence persistence) {
	}

	private static FuelPumpPersistence _persistence;
}
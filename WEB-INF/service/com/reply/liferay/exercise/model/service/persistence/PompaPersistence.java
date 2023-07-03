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

import com.liferay.portal.service.persistence.BasePersistence;

import com.reply.liferay.exercise.model.model.Pompa;

/**
 * The persistence interface for the pompa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see PompaPersistenceImpl
 * @see PompaUtil
 * @generated
 */
public interface PompaPersistence extends BasePersistence<Pompa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PompaUtil} to access the pompa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the pompas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the first pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the last pompa in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.reply.liferay.exercise.model.model.Pompa[] findByUuid_PrevAndNext(
		long pompaId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Removes all the pompas where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pompas where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchPompaException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pompa where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the pompa where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the pompa that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the number of pompas where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pompas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.reply.liferay.exercise.model.model.Pompa findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the first pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.reply.liferay.exercise.model.model.Pompa findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the last pompa in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching pompa, or <code>null</code> if a matching pompa could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.reply.liferay.exercise.model.model.Pompa[] findByUuid_C_PrevAndNext(
		long pompaId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Removes all the pompas where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pompas where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching pompas
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the pompa in the entity cache if it is enabled.
	*
	* @param pompa the pompa
	*/
	public void cacheResult(com.reply.liferay.exercise.model.model.Pompa pompa);

	/**
	* Caches the pompas in the entity cache if it is enabled.
	*
	* @param pompas the pompas
	*/
	public void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.Pompa> pompas);

	/**
	* Creates a new pompa with the primary key. Does not add the pompa to the database.
	*
	* @param pompaId the primary key for the new pompa
	* @return the new pompa
	*/
	public com.reply.liferay.exercise.model.model.Pompa create(long pompaId);

	/**
	* Removes the pompa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa remove(long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	public com.reply.liferay.exercise.model.model.Pompa updateImpl(
		com.reply.liferay.exercise.model.model.Pompa pompa)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the pompa with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchPompaException} if it could not be found.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa
	* @throws com.reply.liferay.exercise.model.NoSuchPompaException if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa findByPrimaryKey(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchPompaException;

	/**
	* Returns the pompa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pompaId the primary key of the pompa
	* @return the pompa, or <code>null</code> if a pompa with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Pompa fetchByPrimaryKey(
		long pompaId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the pompas.
	*
	* @return the pompas
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Pompa> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the pompas from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of pompas.
	*
	* @return the number of pompas
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
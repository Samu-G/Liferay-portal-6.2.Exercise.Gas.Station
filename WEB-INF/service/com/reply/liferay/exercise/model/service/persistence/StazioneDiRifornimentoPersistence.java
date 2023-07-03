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

import com.reply.liferay.exercise.model.model.StazioneDiRifornimento;

/**
 * The persistence interface for the stazione di rifornimento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see StazioneDiRifornimentoPersistenceImpl
 * @see StazioneDiRifornimentoUtil
 * @generated
 */
public interface StazioneDiRifornimentoPersistence extends BasePersistence<StazioneDiRifornimento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StazioneDiRifornimentoUtil} to access the stazione di rifornimento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the stazione di rifornimentos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stazione di rifornimentos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @return the range of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stazione di rifornimentos where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first stazione di rifornimento in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the first stazione di rifornimento in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last stazione di rifornimento in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the last stazione di rifornimento in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimentos before and after the current stazione di rifornimento in the ordered set where uuid = &#63;.
	*
	* @param stazioneDiRifornimentoId the primary key of the current stazione di rifornimento
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento[] findByUuid_PrevAndNext(
		long stazioneDiRifornimentoId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Removes all the stazione di rifornimentos where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stazione di rifornimentos where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the stazione di rifornimento where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the stazione di rifornimento that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the number of stazione di rifornimentos where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @return the range of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the first stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the last stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimentos before and after the current stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param stazioneDiRifornimentoId the primary key of the current stazione di rifornimento
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento[] findByUuid_C_PrevAndNext(
		long stazioneDiRifornimentoId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Removes all the stazione di rifornimentos where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the stazione di rifornimento in the entity cache if it is enabled.
	*
	* @param stazioneDiRifornimento the stazione di rifornimento
	*/
	public void cacheResult(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento);

	/**
	* Caches the stazione di rifornimentos in the entity cache if it is enabled.
	*
	* @param stazioneDiRifornimentos the stazione di rifornimentos
	*/
	public void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> stazioneDiRifornimentos);

	/**
	* Creates a new stazione di rifornimento with the primary key. Does not add the stazione di rifornimento to the database.
	*
	* @param stazioneDiRifornimentoId the primary key for the new stazione di rifornimento
	* @return the new stazione di rifornimento
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento create(
		long stazioneDiRifornimentoId);

	/**
	* Removes the stazione di rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento remove(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento updateImpl(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the stazione di rifornimento with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException} if it could not be found.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento findByPrimaryKey(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;

	/**
	* Returns the stazione di rifornimento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	* @return the stazione di rifornimento, or <code>null</code> if a stazione di rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento fetchByPrimaryKey(
		long stazioneDiRifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the stazione di rifornimentos.
	*
	* @return the stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the stazione di rifornimentos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stazione di rifornimentos
	* @param end the upper bound of the range of stazione di rifornimentos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the stazione di rifornimentos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of stazione di rifornimentos.
	*
	* @return the number of stazione di rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
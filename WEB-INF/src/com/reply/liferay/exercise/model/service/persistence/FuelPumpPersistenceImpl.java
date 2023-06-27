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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.reply.liferay.exercise.model.NoSuchFuelPumpException;
import com.reply.liferay.exercise.model.model.FuelPump;
import com.reply.liferay.exercise.model.model.impl.FuelPumpImpl;
import com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the fuel pump service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see FuelPumpPersistence
 * @see FuelPumpUtil
 * @generated
 */
public class FuelPumpPersistenceImpl extends BasePersistenceImpl<FuelPump>
	implements FuelPumpPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FuelPumpUtil} to access the fuel pump persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FuelPumpImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			FuelPumpModelImpl.UUID_COLUMN_BITMASK |
			FuelPumpModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the fuel pumps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuelPump> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<FuelPump> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<FuelPump> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<FuelPump> list = (List<FuelPump>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FuelPump fuelPump : list) {
				if (!Validator.equals(uuid, fuelPump.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FuelPumpModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FuelPump>(list);
				}
				else {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public FuelPump findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByUuid_First(uuid, orderByComparator);

		if (fuelPump != null) {
			return fuelPump;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuelPumpException(msg.toString());
	}

	/**
	 * Returns the first fuel pump in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<FuelPump> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FuelPump findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByUuid_Last(uuid, orderByComparator);

		if (fuelPump != null) {
			return fuelPump;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuelPumpException(msg.toString());
	}

	/**
	 * Returns the last fuel pump in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FuelPump> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FuelPump[] findByUuid_PrevAndNext(long fuelPumpId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = findByPrimaryKey(fuelPumpId);

		Session session = null;

		try {
			session = openSession();

			FuelPump[] array = new FuelPumpImpl[3];

			array[0] = getByUuid_PrevAndNext(session, fuelPump, uuid,
					orderByComparator, true);

			array[1] = fuelPump;

			array[2] = getByUuid_PrevAndNext(session, fuelPump, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FuelPump getByUuid_PrevAndNext(Session session,
		FuelPump fuelPump, String uuid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FUELPUMP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FuelPumpModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fuelPump);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FuelPump> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fuel pumps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (FuelPump fuelPump : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(fuelPump);
		}
	}

	/**
	 * Returns the number of fuel pumps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "fuelPump.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "fuelPump.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(fuelPump.uuid IS NULL OR fuelPump.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			FuelPumpModelImpl.UUID_COLUMN_BITMASK |
			FuelPumpModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the fuel pump where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchFuelPumpException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fuel pump
	 * @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a matching fuel pump could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump findByUUID_G(String uuid, long groupId)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByUUID_G(uuid, groupId);

		if (fuelPump == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchFuelPumpException(msg.toString());
		}

		return fuelPump;
	}

	/**
	 * Returns the fuel pump where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fuel pump, or <code>null</code> if a matching fuel pump could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public FuelPump fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof FuelPump) {
			FuelPump fuelPump = (FuelPump)result;

			if (!Validator.equals(uuid, fuelPump.getUuid()) ||
					(groupId != fuelPump.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<FuelPump> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					FuelPump fuelPump = list.get(0);

					result = fuelPump;

					cacheResult(fuelPump);

					if ((fuelPump.getUuid() == null) ||
							!fuelPump.getUuid().equals(uuid) ||
							(fuelPump.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, fuelPump);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FuelPump)result;
		}
	}

	/**
	 * Removes the fuel pump where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fuel pump that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump removeByUUID_G(String uuid, long groupId)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = findByUUID_G(uuid, groupId);

		return remove(fuelPump);
	}

	/**
	 * Returns the number of fuel pumps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "fuelPump.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "fuelPump.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(fuelPump.uuid IS NULL OR fuelPump.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "fuelPump.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, FuelPumpImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			FuelPumpModelImpl.UUID_COLUMN_BITMASK |
			FuelPumpModelImpl.COMPANYID_COLUMN_BITMASK |
			FuelPumpModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the fuel pumps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuelPump> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<FuelPump> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<FuelPump> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<FuelPump> list = (List<FuelPump>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FuelPump fuelPump : list) {
				if (!Validator.equals(uuid, fuelPump.getUuid()) ||
						(companyId != fuelPump.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(FuelPumpModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FuelPump>(list);
				}
				else {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public FuelPump findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (fuelPump != null) {
			return fuelPump;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuelPumpException(msg.toString());
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
	@Override
	public FuelPump fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FuelPump> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FuelPump findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (fuelPump != null) {
			return fuelPump;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFuelPumpException(msg.toString());
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
	@Override
	public FuelPump fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FuelPump> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public FuelPump[] findByUuid_C_PrevAndNext(long fuelPumpId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = findByPrimaryKey(fuelPumpId);

		Session session = null;

		try {
			session = openSession();

			FuelPump[] array = new FuelPumpImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, fuelPump, uuid,
					companyId, orderByComparator, true);

			array[1] = fuelPump;

			array[2] = getByUuid_C_PrevAndNext(session, fuelPump, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FuelPump getByUuid_C_PrevAndNext(Session session,
		FuelPump fuelPump, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FUELPUMP_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(FuelPumpModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(fuelPump);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FuelPump> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fuel pumps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (FuelPump fuelPump : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(fuelPump);
		}
	}

	/**
	 * Returns the number of fuel pumps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FUELPUMP_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "fuelPump.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "fuelPump.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(fuelPump.uuid IS NULL OR fuelPump.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "fuelPump.companyId = ?";

	public FuelPumpPersistenceImpl() {
		setModelClass(FuelPump.class);
	}

	/**
	 * Caches the fuel pump in the entity cache if it is enabled.
	 *
	 * @param fuelPump the fuel pump
	 */
	@Override
	public void cacheResult(FuelPump fuelPump) {
		EntityCacheUtil.putResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpImpl.class, fuelPump.getPrimaryKey(), fuelPump);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { fuelPump.getUuid(), fuelPump.getGroupId() }, fuelPump);

		fuelPump.resetOriginalValues();
	}

	/**
	 * Caches the fuel pumps in the entity cache if it is enabled.
	 *
	 * @param fuelPumps the fuel pumps
	 */
	@Override
	public void cacheResult(List<FuelPump> fuelPumps) {
		for (FuelPump fuelPump : fuelPumps) {
			if (EntityCacheUtil.getResult(
						FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
						FuelPumpImpl.class, fuelPump.getPrimaryKey()) == null) {
				cacheResult(fuelPump);
			}
			else {
				fuelPump.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all fuel pumps.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FuelPumpImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FuelPumpImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the fuel pump.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FuelPump fuelPump) {
		EntityCacheUtil.removeResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpImpl.class, fuelPump.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(fuelPump);
	}

	@Override
	public void clearCache(List<FuelPump> fuelPumps) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FuelPump fuelPump : fuelPumps) {
			EntityCacheUtil.removeResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
				FuelPumpImpl.class, fuelPump.getPrimaryKey());

			clearUniqueFindersCache(fuelPump);
		}
	}

	protected void cacheUniqueFindersCache(FuelPump fuelPump) {
		if (fuelPump.isNew()) {
			Object[] args = new Object[] {
					fuelPump.getUuid(), fuelPump.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				fuelPump);
		}
		else {
			FuelPumpModelImpl fuelPumpModelImpl = (FuelPumpModelImpl)fuelPump;

			if ((fuelPumpModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fuelPump.getUuid(), fuelPump.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					fuelPump);
			}
		}
	}

	protected void clearUniqueFindersCache(FuelPump fuelPump) {
		FuelPumpModelImpl fuelPumpModelImpl = (FuelPumpModelImpl)fuelPump;

		Object[] args = new Object[] { fuelPump.getUuid(), fuelPump.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((fuelPumpModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					fuelPumpModelImpl.getOriginalUuid(),
					fuelPumpModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new fuel pump with the primary key. Does not add the fuel pump to the database.
	 *
	 * @param fuelPumpId the primary key for the new fuel pump
	 * @return the new fuel pump
	 */
	@Override
	public FuelPump create(long fuelPumpId) {
		FuelPump fuelPump = new FuelPumpImpl();

		fuelPump.setNew(true);
		fuelPump.setPrimaryKey(fuelPumpId);

		String uuid = PortalUUIDUtil.generate();

		fuelPump.setUuid(uuid);

		return fuelPump;
	}

	/**
	 * Removes the fuel pump with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fuelPumpId the primary key of the fuel pump
	 * @return the fuel pump that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump remove(long fuelPumpId)
		throws NoSuchFuelPumpException, SystemException {
		return remove((Serializable)fuelPumpId);
	}

	/**
	 * Removes the fuel pump with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fuel pump
	 * @return the fuel pump that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump remove(Serializable primaryKey)
		throws NoSuchFuelPumpException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FuelPump fuelPump = (FuelPump)session.get(FuelPumpImpl.class,
					primaryKey);

			if (fuelPump == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFuelPumpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(fuelPump);
		}
		catch (NoSuchFuelPumpException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FuelPump removeImpl(FuelPump fuelPump) throws SystemException {
		fuelPump = toUnwrappedModel(fuelPump);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fuelPump)) {
				fuelPump = (FuelPump)session.get(FuelPumpImpl.class,
						fuelPump.getPrimaryKeyObj());
			}

			if (fuelPump != null) {
				session.delete(fuelPump);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (fuelPump != null) {
			clearCache(fuelPump);
		}

		return fuelPump;
	}

	@Override
	public FuelPump updateImpl(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump)
		throws SystemException {
		fuelPump = toUnwrappedModel(fuelPump);

		boolean isNew = fuelPump.isNew();

		FuelPumpModelImpl fuelPumpModelImpl = (FuelPumpModelImpl)fuelPump;

		if (Validator.isNull(fuelPump.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			fuelPump.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (fuelPump.isNew()) {
				session.save(fuelPump);

				fuelPump.setNew(false);
			}
			else {
				session.merge(fuelPump);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FuelPumpModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((fuelPumpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { fuelPumpModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { fuelPumpModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((fuelPumpModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						fuelPumpModelImpl.getOriginalUuid(),
						fuelPumpModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						fuelPumpModelImpl.getUuid(),
						fuelPumpModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
			FuelPumpImpl.class, fuelPump.getPrimaryKey(), fuelPump);

		clearUniqueFindersCache(fuelPump);
		cacheUniqueFindersCache(fuelPump);

		return fuelPump;
	}

	protected FuelPump toUnwrappedModel(FuelPump fuelPump) {
		if (fuelPump instanceof FuelPumpImpl) {
			return fuelPump;
		}

		FuelPumpImpl fuelPumpImpl = new FuelPumpImpl();

		fuelPumpImpl.setNew(fuelPump.isNew());
		fuelPumpImpl.setPrimaryKey(fuelPump.getPrimaryKey());

		fuelPumpImpl.setUuid(fuelPump.getUuid());
		fuelPumpImpl.setFuelPumpId(fuelPump.getFuelPumpId());
		fuelPumpImpl.setGroupId(fuelPump.getGroupId());
		fuelPumpImpl.setCompanyId(fuelPump.getCompanyId());
		fuelPumpImpl.setUserId(fuelPump.getUserId());
		fuelPumpImpl.setUserName(fuelPump.getUserName());
		fuelPumpImpl.setCreateDate(fuelPump.getCreateDate());
		fuelPumpImpl.setModifiedDate(fuelPump.getModifiedDate());
		fuelPumpImpl.setGasolineCapacity(fuelPump.getGasolineCapacity());
		fuelPumpImpl.setDieselCapacity(fuelPump.getDieselCapacity());
		fuelPumpImpl.setCashInserted(fuelPump.getCashInserted());
		fuelPumpImpl.setInactivityTime(fuelPump.getInactivityTime());

		return fuelPumpImpl;
	}

	/**
	 * Returns the fuel pump with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the fuel pump
	 * @return the fuel pump
	 * @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFuelPumpException, SystemException {
		FuelPump fuelPump = fetchByPrimaryKey(primaryKey);

		if (fuelPump == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFuelPumpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return fuelPump;
	}

	/**
	 * Returns the fuel pump with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchFuelPumpException} if it could not be found.
	 *
	 * @param fuelPumpId the primary key of the fuel pump
	 * @return the fuel pump
	 * @throws com.reply.liferay.exercise.model.NoSuchFuelPumpException if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump findByPrimaryKey(long fuelPumpId)
		throws NoSuchFuelPumpException, SystemException {
		return findByPrimaryKey((Serializable)fuelPumpId);
	}

	/**
	 * Returns the fuel pump with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fuel pump
	 * @return the fuel pump, or <code>null</code> if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		FuelPump fuelPump = (FuelPump)EntityCacheUtil.getResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
				FuelPumpImpl.class, primaryKey);

		if (fuelPump == _nullFuelPump) {
			return null;
		}

		if (fuelPump == null) {
			Session session = null;

			try {
				session = openSession();

				fuelPump = (FuelPump)session.get(FuelPumpImpl.class, primaryKey);

				if (fuelPump != null) {
					cacheResult(fuelPump);
				}
				else {
					EntityCacheUtil.putResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
						FuelPumpImpl.class, primaryKey, _nullFuelPump);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(FuelPumpModelImpl.ENTITY_CACHE_ENABLED,
					FuelPumpImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return fuelPump;
	}

	/**
	 * Returns the fuel pump with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fuelPumpId the primary key of the fuel pump
	 * @return the fuel pump, or <code>null</code> if a fuel pump with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FuelPump fetchByPrimaryKey(long fuelPumpId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)fuelPumpId);
	}

	/**
	 * Returns all the fuel pumps.
	 *
	 * @return the fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<FuelPump> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FuelPump> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<FuelPump> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<FuelPump> list = (List<FuelPump>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FUELPUMP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FUELPUMP;

				if (pagination) {
					sql = sql.concat(FuelPumpModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<FuelPump>(list);
				}
				else {
					list = (List<FuelPump>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the fuel pumps from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (FuelPump fuelPump : findAll()) {
			remove(fuelPump);
		}
	}

	/**
	 * Returns the number of fuel pumps.
	 *
	 * @return the number of fuel pumps
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FUELPUMP);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the fuel pump persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.reply.liferay.exercise.model.model.FuelPump")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FuelPump>> listenersList = new ArrayList<ModelListener<FuelPump>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<FuelPump>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FuelPumpImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_FUELPUMP = "SELECT fuelPump FROM FuelPump fuelPump";
	private static final String _SQL_SELECT_FUELPUMP_WHERE = "SELECT fuelPump FROM FuelPump fuelPump WHERE ";
	private static final String _SQL_COUNT_FUELPUMP = "SELECT COUNT(fuelPump) FROM FuelPump fuelPump";
	private static final String _SQL_COUNT_FUELPUMP_WHERE = "SELECT COUNT(fuelPump) FROM FuelPump fuelPump WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "fuelPump.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FuelPump exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FuelPump exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FuelPumpPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static FuelPump _nullFuelPump = new FuelPumpImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FuelPump> toCacheModel() {
				return _nullFuelPumpCacheModel;
			}
		};

	private static CacheModel<FuelPump> _nullFuelPumpCacheModel = new CacheModel<FuelPump>() {
			@Override
			public FuelPump toEntityModel() {
				return _nullFuelPump;
			}
		};
}
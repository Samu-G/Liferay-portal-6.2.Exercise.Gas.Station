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

import com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException;
import com.reply.liferay.exercise.model.model.StazioneDiRifornimento;
import com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoImpl;
import com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the stazione di rifornimento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see StazioneDiRifornimentoPersistence
 * @see StazioneDiRifornimentoUtil
 * @generated
 */
public class StazioneDiRifornimentoPersistenceImpl extends BasePersistenceImpl<StazioneDiRifornimento>
	implements StazioneDiRifornimentoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link StazioneDiRifornimentoUtil} to access the stazione di rifornimento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = StazioneDiRifornimentoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			StazioneDiRifornimentoModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the stazione di rifornimentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching stazione di rifornimentos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StazioneDiRifornimento> findByUuid(String uuid)
		throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findByUuid(String uuid, int start,
		int end) throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findByUuid(String uuid, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
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

		List<StazioneDiRifornimento> list = (List<StazioneDiRifornimento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StazioneDiRifornimento stazioneDiRifornimento : list) {
				if (!Validator.equals(uuid, stazioneDiRifornimento.getUuid())) {
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

			query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE);

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
				query.append(StazioneDiRifornimentoModelImpl.ORDER_BY_JPQL);
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
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StazioneDiRifornimento>(list);
				}
				else {
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first stazione di rifornimento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByUuid_First(uuid,
				orderByComparator);

		if (stazioneDiRifornimento != null) {
			return stazioneDiRifornimento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStazioneDiRifornimentoException(msg.toString());
	}

	/**
	 * Returns the first stazione di rifornimento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<StazioneDiRifornimento> list = findByUuid(uuid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last stazione di rifornimento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByUuid_Last(uuid,
				orderByComparator);

		if (stazioneDiRifornimento != null) {
			return stazioneDiRifornimento;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStazioneDiRifornimentoException(msg.toString());
	}

	/**
	 * Returns the last stazione di rifornimento in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<StazioneDiRifornimento> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public StazioneDiRifornimento[] findByUuid_PrevAndNext(
		long stazioneDiRifornimentoId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = findByPrimaryKey(stazioneDiRifornimentoId);

		Session session = null;

		try {
			session = openSession();

			StazioneDiRifornimento[] array = new StazioneDiRifornimentoImpl[3];

			array[0] = getByUuid_PrevAndNext(session, stazioneDiRifornimento,
					uuid, orderByComparator, true);

			array[1] = stazioneDiRifornimento;

			array[2] = getByUuid_PrevAndNext(session, stazioneDiRifornimento,
					uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StazioneDiRifornimento getByUuid_PrevAndNext(Session session,
		StazioneDiRifornimento stazioneDiRifornimento, String uuid,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE);

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
			query.append(StazioneDiRifornimentoModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(stazioneDiRifornimento);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StazioneDiRifornimento> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the stazione di rifornimentos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (StazioneDiRifornimento stazioneDiRifornimento : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(stazioneDiRifornimento);
		}
	}

	/**
	 * Returns the number of stazione di rifornimentos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching stazione di rifornimentos
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

			query.append(_SQL_COUNT_STAZIONEDIRIFORNIMENTO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "stazioneDiRifornimento.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "stazioneDiRifornimento.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(stazioneDiRifornimento.uuid IS NULL OR stazioneDiRifornimento.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			StazioneDiRifornimentoModelImpl.UUID_COLUMN_BITMASK |
			StazioneDiRifornimentoModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or throws a {@link com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByUUID_G(String uuid, long groupId)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByUUID_G(uuid,
				groupId);

		if (stazioneDiRifornimento == null) {
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

			throw new NoSuchStazioneDiRifornimentoException(msg.toString());
		}

		return stazioneDiRifornimento;
	}

	/**
	 * Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the stazione di rifornimento where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof StazioneDiRifornimento) {
			StazioneDiRifornimento stazioneDiRifornimento = (StazioneDiRifornimento)result;

			if (!Validator.equals(uuid, stazioneDiRifornimento.getUuid()) ||
					(groupId != stazioneDiRifornimento.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE);

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

				List<StazioneDiRifornimento> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					StazioneDiRifornimento stazioneDiRifornimento = list.get(0);

					result = stazioneDiRifornimento;

					cacheResult(stazioneDiRifornimento);

					if ((stazioneDiRifornimento.getUuid() == null) ||
							!stazioneDiRifornimento.getUuid().equals(uuid) ||
							(stazioneDiRifornimento.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, stazioneDiRifornimento);
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
			return (StazioneDiRifornimento)result;
		}
	}

	/**
	 * Removes the stazione di rifornimento where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the stazione di rifornimento that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento removeByUUID_G(String uuid, long groupId)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = findByUUID_G(uuid,
				groupId);

		return remove(stazioneDiRifornimento);
	}

	/**
	 * Returns the number of stazione di rifornimentos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching stazione di rifornimentos
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

			query.append(_SQL_COUNT_STAZIONEDIRIFORNIMENTO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "stazioneDiRifornimento.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "stazioneDiRifornimento.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(stazioneDiRifornimento.uuid IS NULL OR stazioneDiRifornimento.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "stazioneDiRifornimento.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			StazioneDiRifornimentoModelImpl.UUID_COLUMN_BITMASK |
			StazioneDiRifornimentoModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching stazione di rifornimentos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StazioneDiRifornimento> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findByUuid_C(String uuid,
		long companyId, int start, int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findByUuid_C(String uuid,
		long companyId, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
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

		List<StazioneDiRifornimento> list = (List<StazioneDiRifornimento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (StazioneDiRifornimento stazioneDiRifornimento : list) {
				if (!Validator.equals(uuid, stazioneDiRifornimento.getUuid()) ||
						(companyId != stazioneDiRifornimento.getCompanyId())) {
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

			query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE);

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
				query.append(StazioneDiRifornimentoModelImpl.ORDER_BY_JPQL);
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
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StazioneDiRifornimento>(list);
				}
				else {
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByUuid_C_First(String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByUuid_C_First(uuid,
				companyId, orderByComparator);

		if (stazioneDiRifornimento != null) {
			return stazioneDiRifornimento;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStazioneDiRifornimentoException(msg.toString());
	}

	/**
	 * Returns the first stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUuid_C_First(String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		List<StazioneDiRifornimento> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public StazioneDiRifornimento findByUuid_C_Last(String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByUuid_C_Last(uuid,
				companyId, orderByComparator);

		if (stazioneDiRifornimento != null) {
			return stazioneDiRifornimento;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchStazioneDiRifornimentoException(msg.toString());
	}

	/**
	 * Returns the last stazione di rifornimento in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching stazione di rifornimento, or <code>null</code> if a matching stazione di rifornimento could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByUuid_C_Last(String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<StazioneDiRifornimento> list = findByUuid_C(uuid, companyId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public StazioneDiRifornimento[] findByUuid_C_PrevAndNext(
		long stazioneDiRifornimentoId, String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = findByPrimaryKey(stazioneDiRifornimentoId);

		Session session = null;

		try {
			session = openSession();

			StazioneDiRifornimento[] array = new StazioneDiRifornimentoImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, stazioneDiRifornimento,
					uuid, companyId, orderByComparator, true);

			array[1] = stazioneDiRifornimento;

			array[2] = getByUuid_C_PrevAndNext(session, stazioneDiRifornimento,
					uuid, companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected StazioneDiRifornimento getByUuid_C_PrevAndNext(Session session,
		StazioneDiRifornimento stazioneDiRifornimento, String uuid,
		long companyId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE);

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
			query.append(StazioneDiRifornimentoModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(stazioneDiRifornimento);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<StazioneDiRifornimento> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the stazione di rifornimentos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (StazioneDiRifornimento stazioneDiRifornimento : findByUuid_C(
				uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(stazioneDiRifornimento);
		}
	}

	/**
	 * Returns the number of stazione di rifornimentos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching stazione di rifornimentos
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

			query.append(_SQL_COUNT_STAZIONEDIRIFORNIMENTO_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "stazioneDiRifornimento.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "stazioneDiRifornimento.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(stazioneDiRifornimento.uuid IS NULL OR stazioneDiRifornimento.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "stazioneDiRifornimento.companyId = ?";

	public StazioneDiRifornimentoPersistenceImpl() {
		setModelClass(StazioneDiRifornimento.class);
	}

	/**
	 * Caches the stazione di rifornimento in the entity cache if it is enabled.
	 *
	 * @param stazioneDiRifornimento the stazione di rifornimento
	 */
	@Override
	public void cacheResult(StazioneDiRifornimento stazioneDiRifornimento) {
		EntityCacheUtil.putResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			stazioneDiRifornimento.getPrimaryKey(), stazioneDiRifornimento);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				stazioneDiRifornimento.getUuid(),
				stazioneDiRifornimento.getGroupId()
			}, stazioneDiRifornimento);

		stazioneDiRifornimento.resetOriginalValues();
	}

	/**
	 * Caches the stazione di rifornimentos in the entity cache if it is enabled.
	 *
	 * @param stazioneDiRifornimentos the stazione di rifornimentos
	 */
	@Override
	public void cacheResult(
		List<StazioneDiRifornimento> stazioneDiRifornimentos) {
		for (StazioneDiRifornimento stazioneDiRifornimento : stazioneDiRifornimentos) {
			if (EntityCacheUtil.getResult(
						StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
						StazioneDiRifornimentoImpl.class,
						stazioneDiRifornimento.getPrimaryKey()) == null) {
				cacheResult(stazioneDiRifornimento);
			}
			else {
				stazioneDiRifornimento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all stazione di rifornimentos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(StazioneDiRifornimentoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(StazioneDiRifornimentoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the stazione di rifornimento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(StazioneDiRifornimento stazioneDiRifornimento) {
		EntityCacheUtil.removeResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			stazioneDiRifornimento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(stazioneDiRifornimento);
	}

	@Override
	public void clearCache(List<StazioneDiRifornimento> stazioneDiRifornimentos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (StazioneDiRifornimento stazioneDiRifornimento : stazioneDiRifornimentos) {
			EntityCacheUtil.removeResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
				StazioneDiRifornimentoImpl.class,
				stazioneDiRifornimento.getPrimaryKey());

			clearUniqueFindersCache(stazioneDiRifornimento);
		}
	}

	protected void cacheUniqueFindersCache(
		StazioneDiRifornimento stazioneDiRifornimento) {
		if (stazioneDiRifornimento.isNew()) {
			Object[] args = new Object[] {
					stazioneDiRifornimento.getUuid(),
					stazioneDiRifornimento.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				stazioneDiRifornimento);
		}
		else {
			StazioneDiRifornimentoModelImpl stazioneDiRifornimentoModelImpl = (StazioneDiRifornimentoModelImpl)stazioneDiRifornimento;

			if ((stazioneDiRifornimentoModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stazioneDiRifornimento.getUuid(),
						stazioneDiRifornimento.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					stazioneDiRifornimento);
			}
		}
	}

	protected void clearUniqueFindersCache(
		StazioneDiRifornimento stazioneDiRifornimento) {
		StazioneDiRifornimentoModelImpl stazioneDiRifornimentoModelImpl = (StazioneDiRifornimentoModelImpl)stazioneDiRifornimento;

		Object[] args = new Object[] {
				stazioneDiRifornimento.getUuid(),
				stazioneDiRifornimento.getGroupId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((stazioneDiRifornimentoModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					stazioneDiRifornimentoModelImpl.getOriginalUuid(),
					stazioneDiRifornimentoModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new stazione di rifornimento with the primary key. Does not add the stazione di rifornimento to the database.
	 *
	 * @param stazioneDiRifornimentoId the primary key for the new stazione di rifornimento
	 * @return the new stazione di rifornimento
	 */
	@Override
	public StazioneDiRifornimento create(long stazioneDiRifornimentoId) {
		StazioneDiRifornimento stazioneDiRifornimento = new StazioneDiRifornimentoImpl();

		stazioneDiRifornimento.setNew(true);
		stazioneDiRifornimento.setPrimaryKey(stazioneDiRifornimentoId);

		String uuid = PortalUUIDUtil.generate();

		stazioneDiRifornimento.setUuid(uuid);

		return stazioneDiRifornimento;
	}

	/**
	 * Removes the stazione di rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento remove(long stazioneDiRifornimentoId)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		return remove((Serializable)stazioneDiRifornimentoId);
	}

	/**
	 * Removes the stazione di rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento remove(Serializable primaryKey)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			StazioneDiRifornimento stazioneDiRifornimento = (StazioneDiRifornimento)session.get(StazioneDiRifornimentoImpl.class,
					primaryKey);

			if (stazioneDiRifornimento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStazioneDiRifornimentoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(stazioneDiRifornimento);
		}
		catch (NoSuchStazioneDiRifornimentoException nsee) {
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
	protected StazioneDiRifornimento removeImpl(
		StazioneDiRifornimento stazioneDiRifornimento)
		throws SystemException {
		stazioneDiRifornimento = toUnwrappedModel(stazioneDiRifornimento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(stazioneDiRifornimento)) {
				stazioneDiRifornimento = (StazioneDiRifornimento)session.get(StazioneDiRifornimentoImpl.class,
						stazioneDiRifornimento.getPrimaryKeyObj());
			}

			if (stazioneDiRifornimento != null) {
				session.delete(stazioneDiRifornimento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (stazioneDiRifornimento != null) {
			clearCache(stazioneDiRifornimento);
		}

		return stazioneDiRifornimento;
	}

	@Override
	public StazioneDiRifornimento updateImpl(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento)
		throws SystemException {
		stazioneDiRifornimento = toUnwrappedModel(stazioneDiRifornimento);

		boolean isNew = stazioneDiRifornimento.isNew();

		StazioneDiRifornimentoModelImpl stazioneDiRifornimentoModelImpl = (StazioneDiRifornimentoModelImpl)stazioneDiRifornimento;

		if (Validator.isNull(stazioneDiRifornimento.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			stazioneDiRifornimento.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (stazioneDiRifornimento.isNew()) {
				session.save(stazioneDiRifornimento);

				stazioneDiRifornimento.setNew(false);
			}
			else {
				session.merge(stazioneDiRifornimento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !StazioneDiRifornimentoModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((stazioneDiRifornimentoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stazioneDiRifornimentoModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { stazioneDiRifornimentoModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((stazioneDiRifornimentoModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						stazioneDiRifornimentoModelImpl.getOriginalUuid(),
						stazioneDiRifornimentoModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						stazioneDiRifornimentoModelImpl.getUuid(),
						stazioneDiRifornimentoModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			StazioneDiRifornimentoImpl.class,
			stazioneDiRifornimento.getPrimaryKey(), stazioneDiRifornimento);

		clearUniqueFindersCache(stazioneDiRifornimento);
		cacheUniqueFindersCache(stazioneDiRifornimento);

		return stazioneDiRifornimento;
	}

	protected StazioneDiRifornimento toUnwrappedModel(
		StazioneDiRifornimento stazioneDiRifornimento) {
		if (stazioneDiRifornimento instanceof StazioneDiRifornimentoImpl) {
			return stazioneDiRifornimento;
		}

		StazioneDiRifornimentoImpl stazioneDiRifornimentoImpl = new StazioneDiRifornimentoImpl();

		stazioneDiRifornimentoImpl.setNew(stazioneDiRifornimento.isNew());
		stazioneDiRifornimentoImpl.setPrimaryKey(stazioneDiRifornimento.getPrimaryKey());

		stazioneDiRifornimentoImpl.setUuid(stazioneDiRifornimento.getUuid());
		stazioneDiRifornimentoImpl.setStazioneDiRifornimentoId(stazioneDiRifornimento.getStazioneDiRifornimentoId());
		stazioneDiRifornimentoImpl.setGroupId(stazioneDiRifornimento.getGroupId());
		stazioneDiRifornimentoImpl.setCompanyId(stazioneDiRifornimento.getCompanyId());
		stazioneDiRifornimentoImpl.setUserId(stazioneDiRifornimento.getUserId());
		stazioneDiRifornimentoImpl.setUserName(stazioneDiRifornimento.getUserName());
		stazioneDiRifornimentoImpl.setCreateDate(stazioneDiRifornimento.getCreateDate());
		stazioneDiRifornimentoImpl.setModifiedDate(stazioneDiRifornimento.getModifiedDate());

		return stazioneDiRifornimentoImpl;
	}

	/**
	 * Returns the stazione di rifornimento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = fetchByPrimaryKey(primaryKey);

		if (stazioneDiRifornimento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStazioneDiRifornimentoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return stazioneDiRifornimento;
	}

	/**
	 * Returns the stazione di rifornimento with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException} if it could not be found.
	 *
	 * @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchStazioneDiRifornimentoException if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento findByPrimaryKey(
		long stazioneDiRifornimentoId)
		throws NoSuchStazioneDiRifornimentoException, SystemException {
		return findByPrimaryKey((Serializable)stazioneDiRifornimentoId);
	}

	/**
	 * Returns the stazione di rifornimento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento, or <code>null</code> if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		StazioneDiRifornimento stazioneDiRifornimento = (StazioneDiRifornimento)EntityCacheUtil.getResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
				StazioneDiRifornimentoImpl.class, primaryKey);

		if (stazioneDiRifornimento == _nullStazioneDiRifornimento) {
			return null;
		}

		if (stazioneDiRifornimento == null) {
			Session session = null;

			try {
				session = openSession();

				stazioneDiRifornimento = (StazioneDiRifornimento)session.get(StazioneDiRifornimentoImpl.class,
						primaryKey);

				if (stazioneDiRifornimento != null) {
					cacheResult(stazioneDiRifornimento);
				}
				else {
					EntityCacheUtil.putResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
						StazioneDiRifornimentoImpl.class, primaryKey,
						_nullStazioneDiRifornimento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(StazioneDiRifornimentoModelImpl.ENTITY_CACHE_ENABLED,
					StazioneDiRifornimentoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return stazioneDiRifornimento;
	}

	/**
	 * Returns the stazione di rifornimento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param stazioneDiRifornimentoId the primary key of the stazione di rifornimento
	 * @return the stazione di rifornimento, or <code>null</code> if a stazione di rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public StazioneDiRifornimento fetchByPrimaryKey(
		long stazioneDiRifornimentoId) throws SystemException {
		return fetchByPrimaryKey((Serializable)stazioneDiRifornimentoId);
	}

	/**
	 * Returns all the stazione di rifornimentos.
	 *
	 * @return the stazione di rifornimentos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<StazioneDiRifornimento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<StazioneDiRifornimento> findAll(int start, int end,
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

		List<StazioneDiRifornimento> list = (List<StazioneDiRifornimento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_STAZIONEDIRIFORNIMENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_STAZIONEDIRIFORNIMENTO;

				if (pagination) {
					sql = sql.concat(StazioneDiRifornimentoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<StazioneDiRifornimento>(list);
				}
				else {
					list = (List<StazioneDiRifornimento>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the stazione di rifornimentos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (StazioneDiRifornimento stazioneDiRifornimento : findAll()) {
			remove(stazioneDiRifornimento);
		}
	}

	/**
	 * Returns the number of stazione di rifornimentos.
	 *
	 * @return the number of stazione di rifornimentos
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

				Query q = session.createQuery(_SQL_COUNT_STAZIONEDIRIFORNIMENTO);

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
	 * Initializes the stazione di rifornimento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.reply.liferay.exercise.model.model.StazioneDiRifornimento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<StazioneDiRifornimento>> listenersList = new ArrayList<ModelListener<StazioneDiRifornimento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<StazioneDiRifornimento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(StazioneDiRifornimentoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_STAZIONEDIRIFORNIMENTO = "SELECT stazioneDiRifornimento FROM StazioneDiRifornimento stazioneDiRifornimento";
	private static final String _SQL_SELECT_STAZIONEDIRIFORNIMENTO_WHERE = "SELECT stazioneDiRifornimento FROM StazioneDiRifornimento stazioneDiRifornimento WHERE ";
	private static final String _SQL_COUNT_STAZIONEDIRIFORNIMENTO = "SELECT COUNT(stazioneDiRifornimento) FROM StazioneDiRifornimento stazioneDiRifornimento";
	private static final String _SQL_COUNT_STAZIONEDIRIFORNIMENTO_WHERE = "SELECT COUNT(stazioneDiRifornimento) FROM StazioneDiRifornimento stazioneDiRifornimento WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "stazioneDiRifornimento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StazioneDiRifornimento exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No StazioneDiRifornimento exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(StazioneDiRifornimentoPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static StazioneDiRifornimento _nullStazioneDiRifornimento = new StazioneDiRifornimentoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<StazioneDiRifornimento> toCacheModel() {
				return _nullStazioneDiRifornimentoCacheModel;
			}
		};

	private static CacheModel<StazioneDiRifornimento> _nullStazioneDiRifornimentoCacheModel =
		new CacheModel<StazioneDiRifornimento>() {
			@Override
			public StazioneDiRifornimento toEntityModel() {
				return _nullStazioneDiRifornimento;
			}
		};
}
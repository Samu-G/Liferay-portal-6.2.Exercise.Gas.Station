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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.reply.liferay.exercise.model.NoSuchRifornimentoException;
import com.reply.liferay.exercise.model.model.Rifornimento;
import com.reply.liferay.exercise.model.model.impl.RifornimentoImpl;
import com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the rifornimento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see RifornimentoPersistence
 * @see RifornimentoUtil
 * @generated
 */
public class RifornimentoPersistenceImpl extends BasePersistenceImpl<Rifornimento>
	implements RifornimentoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RifornimentoUtil} to access the rifornimento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RifornimentoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoModelImpl.FINDER_CACHE_ENABLED, RifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoModelImpl.FINDER_CACHE_ENABLED, RifornimentoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RifornimentoPersistenceImpl() {
		setModelClass(Rifornimento.class);
	}

	/**
	 * Caches the rifornimento in the entity cache if it is enabled.
	 *
	 * @param rifornimento the rifornimento
	 */
	@Override
	public void cacheResult(Rifornimento rifornimento) {
		EntityCacheUtil.putResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoImpl.class, rifornimento.getPrimaryKey(), rifornimento);

		rifornimento.resetOriginalValues();
	}

	/**
	 * Caches the rifornimentos in the entity cache if it is enabled.
	 *
	 * @param rifornimentos the rifornimentos
	 */
	@Override
	public void cacheResult(List<Rifornimento> rifornimentos) {
		for (Rifornimento rifornimento : rifornimentos) {
			if (EntityCacheUtil.getResult(
						RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
						RifornimentoImpl.class, rifornimento.getPrimaryKey()) == null) {
				cacheResult(rifornimento);
			}
			else {
				rifornimento.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rifornimentos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RifornimentoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RifornimentoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rifornimento.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Rifornimento rifornimento) {
		EntityCacheUtil.removeResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoImpl.class, rifornimento.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Rifornimento> rifornimentos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Rifornimento rifornimento : rifornimentos) {
			EntityCacheUtil.removeResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
				RifornimentoImpl.class, rifornimento.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rifornimento with the primary key. Does not add the rifornimento to the database.
	 *
	 * @param rifornimentoId the primary key for the new rifornimento
	 * @return the new rifornimento
	 */
	@Override
	public Rifornimento create(long rifornimentoId) {
		Rifornimento rifornimento = new RifornimentoImpl();

		rifornimento.setNew(true);
		rifornimento.setPrimaryKey(rifornimentoId);

		return rifornimento;
	}

	/**
	 * Removes the rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param rifornimentoId the primary key of the rifornimento
	 * @return the rifornimento that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento remove(long rifornimentoId)
		throws NoSuchRifornimentoException, SystemException {
		return remove((Serializable)rifornimentoId);
	}

	/**
	 * Removes the rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rifornimento
	 * @return the rifornimento that was removed
	 * @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento remove(Serializable primaryKey)
		throws NoSuchRifornimentoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Rifornimento rifornimento = (Rifornimento)session.get(RifornimentoImpl.class,
					primaryKey);

			if (rifornimento == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRifornimentoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rifornimento);
		}
		catch (NoSuchRifornimentoException nsee) {
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
	protected Rifornimento removeImpl(Rifornimento rifornimento)
		throws SystemException {
		rifornimento = toUnwrappedModel(rifornimento);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rifornimento)) {
				rifornimento = (Rifornimento)session.get(RifornimentoImpl.class,
						rifornimento.getPrimaryKeyObj());
			}

			if (rifornimento != null) {
				session.delete(rifornimento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rifornimento != null) {
			clearCache(rifornimento);
		}

		return rifornimento;
	}

	@Override
	public Rifornimento updateImpl(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws SystemException {
		rifornimento = toUnwrappedModel(rifornimento);

		boolean isNew = rifornimento.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rifornimento.isNew()) {
				session.save(rifornimento);

				rifornimento.setNew(false);
			}
			else {
				session.merge(rifornimento);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
			RifornimentoImpl.class, rifornimento.getPrimaryKey(), rifornimento);

		return rifornimento;
	}

	protected Rifornimento toUnwrappedModel(Rifornimento rifornimento) {
		if (rifornimento instanceof RifornimentoImpl) {
			return rifornimento;
		}

		RifornimentoImpl rifornimentoImpl = new RifornimentoImpl();

		rifornimentoImpl.setNew(rifornimento.isNew());
		rifornimentoImpl.setPrimaryKey(rifornimento.getPrimaryKey());

		rifornimentoImpl.setRifornimentoId(rifornimento.getRifornimentoId());
		rifornimentoImpl.setGroupId(rifornimento.getGroupId());
		rifornimentoImpl.setCompanyId(rifornimento.getCompanyId());
		rifornimentoImpl.setUserId(rifornimento.getUserId());
		rifornimentoImpl.setUserName(rifornimento.getUserName());
		rifornimentoImpl.setCreateDate(rifornimento.getCreateDate());
		rifornimentoImpl.setModifiedDate(rifornimento.getModifiedDate());
		rifornimentoImpl.setTipoCarburante(rifornimento.getTipoCarburante());
		rifornimentoImpl.setDenaroInserito(rifornimento.getDenaroInserito());
		rifornimentoImpl.setPompaId(rifornimento.getPompaId());

		return rifornimentoImpl;
	}

	/**
	 * Returns the rifornimento with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rifornimento
	 * @return the rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRifornimentoException, SystemException {
		Rifornimento rifornimento = fetchByPrimaryKey(primaryKey);

		if (rifornimento == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRifornimentoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rifornimento;
	}

	/**
	 * Returns the rifornimento with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchRifornimentoException} if it could not be found.
	 *
	 * @param rifornimentoId the primary key of the rifornimento
	 * @return the rifornimento
	 * @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento findByPrimaryKey(long rifornimentoId)
		throws NoSuchRifornimentoException, SystemException {
		return findByPrimaryKey((Serializable)rifornimentoId);
	}

	/**
	 * Returns the rifornimento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rifornimento
	 * @return the rifornimento, or <code>null</code> if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Rifornimento rifornimento = (Rifornimento)EntityCacheUtil.getResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
				RifornimentoImpl.class, primaryKey);

		if (rifornimento == _nullRifornimento) {
			return null;
		}

		if (rifornimento == null) {
			Session session = null;

			try {
				session = openSession();

				rifornimento = (Rifornimento)session.get(RifornimentoImpl.class,
						primaryKey);

				if (rifornimento != null) {
					cacheResult(rifornimento);
				}
				else {
					EntityCacheUtil.putResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
						RifornimentoImpl.class, primaryKey, _nullRifornimento);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(RifornimentoModelImpl.ENTITY_CACHE_ENABLED,
					RifornimentoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rifornimento;
	}

	/**
	 * Returns the rifornimento with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param rifornimentoId the primary key of the rifornimento
	 * @return the rifornimento, or <code>null</code> if a rifornimento with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Rifornimento fetchByPrimaryKey(long rifornimentoId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)rifornimentoId);
	}

	/**
	 * Returns all the rifornimentos.
	 *
	 * @return the rifornimentos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rifornimento> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Rifornimento> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rifornimentos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rifornimentos
	 * @param end the upper bound of the range of rifornimentos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rifornimentos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Rifornimento> findAll(int start, int end,
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

		List<Rifornimento> list = (List<Rifornimento>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RIFORNIMENTO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RIFORNIMENTO;

				if (pagination) {
					sql = sql.concat(RifornimentoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Rifornimento>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Rifornimento>(list);
				}
				else {
					list = (List<Rifornimento>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the rifornimentos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Rifornimento rifornimento : findAll()) {
			remove(rifornimento);
		}
	}

	/**
	 * Returns the number of rifornimentos.
	 *
	 * @return the number of rifornimentos
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

				Query q = session.createQuery(_SQL_COUNT_RIFORNIMENTO);

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

	/**
	 * Initializes the rifornimento persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.reply.liferay.exercise.model.model.Rifornimento")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Rifornimento>> listenersList = new ArrayList<ModelListener<Rifornimento>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Rifornimento>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RifornimentoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_RIFORNIMENTO = "SELECT rifornimento FROM Rifornimento rifornimento";
	private static final String _SQL_COUNT_RIFORNIMENTO = "SELECT COUNT(rifornimento) FROM Rifornimento rifornimento";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rifornimento.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Rifornimento exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RifornimentoPersistenceImpl.class);
	private static Rifornimento _nullRifornimento = new RifornimentoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Rifornimento> toCacheModel() {
				return _nullRifornimentoCacheModel;
			}
		};

	private static CacheModel<Rifornimento> _nullRifornimentoCacheModel = new CacheModel<Rifornimento>() {
			@Override
			public Rifornimento toEntityModel() {
				return _nullRifornimento;
			}
		};
}
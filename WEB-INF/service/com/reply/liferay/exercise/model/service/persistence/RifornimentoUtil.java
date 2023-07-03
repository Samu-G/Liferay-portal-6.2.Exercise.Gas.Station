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

import com.reply.liferay.exercise.model.model.Rifornimento;

import java.util.List;

/**
 * The persistence utility for the rifornimento service. This utility wraps {@link RifornimentoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see RifornimentoPersistence
 * @see RifornimentoPersistenceImpl
 * @generated
 */
public class RifornimentoUtil {
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
	public static void clearCache(Rifornimento rifornimento) {
		getPersistence().clearCache(rifornimento);
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
	public static List<Rifornimento> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rifornimento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rifornimento> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Rifornimento update(Rifornimento rifornimento)
		throws SystemException {
		return getPersistence().update(rifornimento);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Rifornimento update(Rifornimento rifornimento,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(rifornimento, serviceContext);
	}

	/**
	* Caches the rifornimento in the entity cache if it is enabled.
	*
	* @param rifornimento the rifornimento
	*/
	public static void cacheResult(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento) {
		getPersistence().cacheResult(rifornimento);
	}

	/**
	* Caches the rifornimentos in the entity cache if it is enabled.
	*
	* @param rifornimentos the rifornimentos
	*/
	public static void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> rifornimentos) {
		getPersistence().cacheResult(rifornimentos);
	}

	/**
	* Creates a new rifornimento with the primary key. Does not add the rifornimento to the database.
	*
	* @param rifornimentoId the primary key for the new rifornimento
	* @return the new rifornimento
	*/
	public static com.reply.liferay.exercise.model.model.Rifornimento create(
		long rifornimentoId) {
		return getPersistence().create(rifornimentoId);
	}

	/**
	* Removes the rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Rifornimento remove(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchRifornimentoException {
		return getPersistence().remove(rifornimentoId);
	}

	public static com.reply.liferay.exercise.model.model.Rifornimento updateImpl(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(rifornimento);
	}

	/**
	* Returns the rifornimento with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchRifornimentoException} if it could not be found.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Rifornimento findByPrimaryKey(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchRifornimentoException {
		return getPersistence().findByPrimaryKey(rifornimentoId);
	}

	/**
	* Returns the rifornimento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento, or <code>null</code> if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.reply.liferay.exercise.model.model.Rifornimento fetchByPrimaryKey(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(rifornimentoId);
	}

	/**
	* Returns all the rifornimentos.
	*
	* @return the rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rifornimentos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rifornimentos.
	*
	* @return the number of rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RifornimentoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RifornimentoPersistence)PortletBeanLocatorUtil.locate(com.reply.liferay.exercise.model.service.ClpSerializer.getServletContextName(),
					RifornimentoPersistence.class.getName());

			ReferenceRegistry.registerReference(RifornimentoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(RifornimentoPersistence persistence) {
	}

	private static RifornimentoPersistence _persistence;
}
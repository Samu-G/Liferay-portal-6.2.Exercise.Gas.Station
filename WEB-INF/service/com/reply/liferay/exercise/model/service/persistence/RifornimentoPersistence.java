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

import com.reply.liferay.exercise.model.model.Rifornimento;

/**
 * The persistence interface for the rifornimento service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author s.girardello
 * @see RifornimentoPersistenceImpl
 * @see RifornimentoUtil
 * @generated
 */
public interface RifornimentoPersistence extends BasePersistence<Rifornimento> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RifornimentoUtil} to access the rifornimento persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rifornimento in the entity cache if it is enabled.
	*
	* @param rifornimento the rifornimento
	*/
	public void cacheResult(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento);

	/**
	* Caches the rifornimentos in the entity cache if it is enabled.
	*
	* @param rifornimentos the rifornimentos
	*/
	public void cacheResult(
		java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> rifornimentos);

	/**
	* Creates a new rifornimento with the primary key. Does not add the rifornimento to the database.
	*
	* @param rifornimentoId the primary key for the new rifornimento
	* @return the new rifornimento
	*/
	public com.reply.liferay.exercise.model.model.Rifornimento create(
		long rifornimentoId);

	/**
	* Removes the rifornimento with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento that was removed
	* @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Rifornimento remove(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchRifornimentoException;

	public com.reply.liferay.exercise.model.model.Rifornimento updateImpl(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the rifornimento with the primary key or throws a {@link com.reply.liferay.exercise.model.NoSuchRifornimentoException} if it could not be found.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento
	* @throws com.reply.liferay.exercise.model.NoSuchRifornimentoException if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Rifornimento findByPrimaryKey(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.reply.liferay.exercise.model.NoSuchRifornimentoException;

	/**
	* Returns the rifornimento with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rifornimentoId the primary key of the rifornimento
	* @return the rifornimento, or <code>null</code> if a rifornimento with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.reply.liferay.exercise.model.model.Rifornimento fetchByPrimaryKey(
		long rifornimentoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rifornimentos.
	*
	* @return the rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.reply.liferay.exercise.model.model.Rifornimento> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rifornimentos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rifornimentos.
	*
	* @return the number of rifornimentos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
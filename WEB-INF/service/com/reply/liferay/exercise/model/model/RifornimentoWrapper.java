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

package com.reply.liferay.exercise.model.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Rifornimento}.
 * </p>
 *
 * @author s.girardello
 * @see Rifornimento
 * @generated
 */
public class RifornimentoWrapper implements Rifornimento,
	ModelWrapper<Rifornimento> {
	public RifornimentoWrapper(Rifornimento rifornimento) {
		_rifornimento = rifornimento;
	}

	@Override
	public Class<?> getModelClass() {
		return Rifornimento.class;
	}

	@Override
	public String getModelClassName() {
		return Rifornimento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("rifornimentoId", getRifornimentoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tipoCarburante", getTipoCarburante());
		attributes.put("denaroInserito", getDenaroInserito());
		attributes.put("pompaId", getPompaId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long rifornimentoId = (Long)attributes.get("rifornimentoId");

		if (rifornimentoId != null) {
			setRifornimentoId(rifornimentoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String tipoCarburante = (String)attributes.get("tipoCarburante");

		if (tipoCarburante != null) {
			setTipoCarburante(tipoCarburante);
		}

		Integer denaroInserito = (Integer)attributes.get("denaroInserito");

		if (denaroInserito != null) {
			setDenaroInserito(denaroInserito);
		}

		Long pompaId = (Long)attributes.get("pompaId");

		if (pompaId != null) {
			setPompaId(pompaId);
		}
	}

	/**
	* Returns the primary key of this rifornimento.
	*
	* @return the primary key of this rifornimento
	*/
	@Override
	public long getPrimaryKey() {
		return _rifornimento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this rifornimento.
	*
	* @param primaryKey the primary key of this rifornimento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rifornimento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the rifornimento ID of this rifornimento.
	*
	* @return the rifornimento ID of this rifornimento
	*/
	@Override
	public long getRifornimentoId() {
		return _rifornimento.getRifornimentoId();
	}

	/**
	* Sets the rifornimento ID of this rifornimento.
	*
	* @param rifornimentoId the rifornimento ID of this rifornimento
	*/
	@Override
	public void setRifornimentoId(long rifornimentoId) {
		_rifornimento.setRifornimentoId(rifornimentoId);
	}

	/**
	* Returns the group ID of this rifornimento.
	*
	* @return the group ID of this rifornimento
	*/
	@Override
	public long getGroupId() {
		return _rifornimento.getGroupId();
	}

	/**
	* Sets the group ID of this rifornimento.
	*
	* @param groupId the group ID of this rifornimento
	*/
	@Override
	public void setGroupId(long groupId) {
		_rifornimento.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this rifornimento.
	*
	* @return the company ID of this rifornimento
	*/
	@Override
	public long getCompanyId() {
		return _rifornimento.getCompanyId();
	}

	/**
	* Sets the company ID of this rifornimento.
	*
	* @param companyId the company ID of this rifornimento
	*/
	@Override
	public void setCompanyId(long companyId) {
		_rifornimento.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this rifornimento.
	*
	* @return the user ID of this rifornimento
	*/
	@Override
	public long getUserId() {
		return _rifornimento.getUserId();
	}

	/**
	* Sets the user ID of this rifornimento.
	*
	* @param userId the user ID of this rifornimento
	*/
	@Override
	public void setUserId(long userId) {
		_rifornimento.setUserId(userId);
	}

	/**
	* Returns the user uuid of this rifornimento.
	*
	* @return the user uuid of this rifornimento
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _rifornimento.getUserUuid();
	}

	/**
	* Sets the user uuid of this rifornimento.
	*
	* @param userUuid the user uuid of this rifornimento
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_rifornimento.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this rifornimento.
	*
	* @return the user name of this rifornimento
	*/
	@Override
	public java.lang.String getUserName() {
		return _rifornimento.getUserName();
	}

	/**
	* Sets the user name of this rifornimento.
	*
	* @param userName the user name of this rifornimento
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_rifornimento.setUserName(userName);
	}

	/**
	* Returns the create date of this rifornimento.
	*
	* @return the create date of this rifornimento
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _rifornimento.getCreateDate();
	}

	/**
	* Sets the create date of this rifornimento.
	*
	* @param createDate the create date of this rifornimento
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_rifornimento.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this rifornimento.
	*
	* @return the modified date of this rifornimento
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _rifornimento.getModifiedDate();
	}

	/**
	* Sets the modified date of this rifornimento.
	*
	* @param modifiedDate the modified date of this rifornimento
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_rifornimento.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tipo carburante of this rifornimento.
	*
	* @return the tipo carburante of this rifornimento
	*/
	@Override
	public java.lang.String getTipoCarburante() {
		return _rifornimento.getTipoCarburante();
	}

	/**
	* Sets the tipo carburante of this rifornimento.
	*
	* @param tipoCarburante the tipo carburante of this rifornimento
	*/
	@Override
	public void setTipoCarburante(java.lang.String tipoCarburante) {
		_rifornimento.setTipoCarburante(tipoCarburante);
	}

	/**
	* Returns the denaro inserito of this rifornimento.
	*
	* @return the denaro inserito of this rifornimento
	*/
	@Override
	public int getDenaroInserito() {
		return _rifornimento.getDenaroInserito();
	}

	/**
	* Sets the denaro inserito of this rifornimento.
	*
	* @param denaroInserito the denaro inserito of this rifornimento
	*/
	@Override
	public void setDenaroInserito(int denaroInserito) {
		_rifornimento.setDenaroInserito(denaroInserito);
	}

	/**
	* Returns the pompa ID of this rifornimento.
	*
	* @return the pompa ID of this rifornimento
	*/
	@Override
	public long getPompaId() {
		return _rifornimento.getPompaId();
	}

	/**
	* Sets the pompa ID of this rifornimento.
	*
	* @param pompaId the pompa ID of this rifornimento
	*/
	@Override
	public void setPompaId(long pompaId) {
		_rifornimento.setPompaId(pompaId);
	}

	@Override
	public boolean isNew() {
		return _rifornimento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_rifornimento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _rifornimento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rifornimento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _rifornimento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _rifornimento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_rifornimento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _rifornimento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_rifornimento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_rifornimento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_rifornimento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RifornimentoWrapper((Rifornimento)_rifornimento.clone());
	}

	@Override
	public int compareTo(
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento) {
		return _rifornimento.compareTo(rifornimento);
	}

	@Override
	public int hashCode() {
		return _rifornimento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.reply.liferay.exercise.model.model.Rifornimento> toCacheModel() {
		return _rifornimento.toCacheModel();
	}

	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento toEscapedModel() {
		return new RifornimentoWrapper(_rifornimento.toEscapedModel());
	}

	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento toUnescapedModel() {
		return new RifornimentoWrapper(_rifornimento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _rifornimento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rifornimento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_rifornimento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RifornimentoWrapper)) {
			return false;
		}

		RifornimentoWrapper rifornimentoWrapper = (RifornimentoWrapper)obj;

		if (Validator.equals(_rifornimento, rifornimentoWrapper._rifornimento)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Rifornimento getWrappedRifornimento() {
		return _rifornimento;
	}

	@Override
	public Rifornimento getWrappedModel() {
		return _rifornimento;
	}

	@Override
	public void resetOriginalValues() {
		_rifornimento.resetOriginalValues();
	}

	private Rifornimento _rifornimento;
}
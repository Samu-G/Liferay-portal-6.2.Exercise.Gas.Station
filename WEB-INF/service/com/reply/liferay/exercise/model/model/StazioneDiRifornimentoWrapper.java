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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StazioneDiRifornimento}.
 * </p>
 *
 * @author s.girardello
 * @see StazioneDiRifornimento
 * @generated
 */
public class StazioneDiRifornimentoWrapper implements StazioneDiRifornimento,
	ModelWrapper<StazioneDiRifornimento> {
	public StazioneDiRifornimentoWrapper(
		StazioneDiRifornimento stazioneDiRifornimento) {
		_stazioneDiRifornimento = stazioneDiRifornimento;
	}

	@Override
	public Class<?> getModelClass() {
		return StazioneDiRifornimento.class;
	}

	@Override
	public String getModelClassName() {
		return StazioneDiRifornimento.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("stazioneDiRifornimentoId", getStazioneDiRifornimentoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("prezzoBenzina", getPrezzoBenzina());
		attributes.put("prezzoDiesel", getPrezzoDiesel());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long stazioneDiRifornimentoId = (Long)attributes.get(
				"stazioneDiRifornimentoId");

		if (stazioneDiRifornimentoId != null) {
			setStazioneDiRifornimentoId(stazioneDiRifornimentoId);
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

		Integer prezzoBenzina = (Integer)attributes.get("prezzoBenzina");

		if (prezzoBenzina != null) {
			setPrezzoBenzina(prezzoBenzina);
		}

		Integer prezzoDiesel = (Integer)attributes.get("prezzoDiesel");

		if (prezzoDiesel != null) {
			setPrezzoDiesel(prezzoDiesel);
		}
	}

	/**
	* Returns the primary key of this stazione di rifornimento.
	*
	* @return the primary key of this stazione di rifornimento
	*/
	@Override
	public long getPrimaryKey() {
		return _stazioneDiRifornimento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this stazione di rifornimento.
	*
	* @param primaryKey the primary key of this stazione di rifornimento
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_stazioneDiRifornimento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this stazione di rifornimento.
	*
	* @return the uuid of this stazione di rifornimento
	*/
	@Override
	public java.lang.String getUuid() {
		return _stazioneDiRifornimento.getUuid();
	}

	/**
	* Sets the uuid of this stazione di rifornimento.
	*
	* @param uuid the uuid of this stazione di rifornimento
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_stazioneDiRifornimento.setUuid(uuid);
	}

	/**
	* Returns the stazione di rifornimento ID of this stazione di rifornimento.
	*
	* @return the stazione di rifornimento ID of this stazione di rifornimento
	*/
	@Override
	public long getStazioneDiRifornimentoId() {
		return _stazioneDiRifornimento.getStazioneDiRifornimentoId();
	}

	/**
	* Sets the stazione di rifornimento ID of this stazione di rifornimento.
	*
	* @param stazioneDiRifornimentoId the stazione di rifornimento ID of this stazione di rifornimento
	*/
	@Override
	public void setStazioneDiRifornimentoId(long stazioneDiRifornimentoId) {
		_stazioneDiRifornimento.setStazioneDiRifornimentoId(stazioneDiRifornimentoId);
	}

	/**
	* Returns the group ID of this stazione di rifornimento.
	*
	* @return the group ID of this stazione di rifornimento
	*/
	@Override
	public long getGroupId() {
		return _stazioneDiRifornimento.getGroupId();
	}

	/**
	* Sets the group ID of this stazione di rifornimento.
	*
	* @param groupId the group ID of this stazione di rifornimento
	*/
	@Override
	public void setGroupId(long groupId) {
		_stazioneDiRifornimento.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this stazione di rifornimento.
	*
	* @return the company ID of this stazione di rifornimento
	*/
	@Override
	public long getCompanyId() {
		return _stazioneDiRifornimento.getCompanyId();
	}

	/**
	* Sets the company ID of this stazione di rifornimento.
	*
	* @param companyId the company ID of this stazione di rifornimento
	*/
	@Override
	public void setCompanyId(long companyId) {
		_stazioneDiRifornimento.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this stazione di rifornimento.
	*
	* @return the user ID of this stazione di rifornimento
	*/
	@Override
	public long getUserId() {
		return _stazioneDiRifornimento.getUserId();
	}

	/**
	* Sets the user ID of this stazione di rifornimento.
	*
	* @param userId the user ID of this stazione di rifornimento
	*/
	@Override
	public void setUserId(long userId) {
		_stazioneDiRifornimento.setUserId(userId);
	}

	/**
	* Returns the user uuid of this stazione di rifornimento.
	*
	* @return the user uuid of this stazione di rifornimento
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _stazioneDiRifornimento.getUserUuid();
	}

	/**
	* Sets the user uuid of this stazione di rifornimento.
	*
	* @param userUuid the user uuid of this stazione di rifornimento
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_stazioneDiRifornimento.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this stazione di rifornimento.
	*
	* @return the user name of this stazione di rifornimento
	*/
	@Override
	public java.lang.String getUserName() {
		return _stazioneDiRifornimento.getUserName();
	}

	/**
	* Sets the user name of this stazione di rifornimento.
	*
	* @param userName the user name of this stazione di rifornimento
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_stazioneDiRifornimento.setUserName(userName);
	}

	/**
	* Returns the create date of this stazione di rifornimento.
	*
	* @return the create date of this stazione di rifornimento
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _stazioneDiRifornimento.getCreateDate();
	}

	/**
	* Sets the create date of this stazione di rifornimento.
	*
	* @param createDate the create date of this stazione di rifornimento
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_stazioneDiRifornimento.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this stazione di rifornimento.
	*
	* @return the modified date of this stazione di rifornimento
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _stazioneDiRifornimento.getModifiedDate();
	}

	/**
	* Sets the modified date of this stazione di rifornimento.
	*
	* @param modifiedDate the modified date of this stazione di rifornimento
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_stazioneDiRifornimento.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the prezzo benzina of this stazione di rifornimento.
	*
	* @return the prezzo benzina of this stazione di rifornimento
	*/
	@Override
	public int getPrezzoBenzina() {
		return _stazioneDiRifornimento.getPrezzoBenzina();
	}

	/**
	* Sets the prezzo benzina of this stazione di rifornimento.
	*
	* @param prezzoBenzina the prezzo benzina of this stazione di rifornimento
	*/
	@Override
	public void setPrezzoBenzina(int prezzoBenzina) {
		_stazioneDiRifornimento.setPrezzoBenzina(prezzoBenzina);
	}

	/**
	* Returns the prezzo diesel of this stazione di rifornimento.
	*
	* @return the prezzo diesel of this stazione di rifornimento
	*/
	@Override
	public int getPrezzoDiesel() {
		return _stazioneDiRifornimento.getPrezzoDiesel();
	}

	/**
	* Sets the prezzo diesel of this stazione di rifornimento.
	*
	* @param prezzoDiesel the prezzo diesel of this stazione di rifornimento
	*/
	@Override
	public void setPrezzoDiesel(int prezzoDiesel) {
		_stazioneDiRifornimento.setPrezzoDiesel(prezzoDiesel);
	}

	@Override
	public boolean isNew() {
		return _stazioneDiRifornimento.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_stazioneDiRifornimento.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _stazioneDiRifornimento.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_stazioneDiRifornimento.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _stazioneDiRifornimento.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _stazioneDiRifornimento.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_stazioneDiRifornimento.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _stazioneDiRifornimento.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_stazioneDiRifornimento.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_stazioneDiRifornimento.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_stazioneDiRifornimento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StazioneDiRifornimentoWrapper((StazioneDiRifornimento)_stazioneDiRifornimento.clone());
	}

	@Override
	public int compareTo(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento) {
		return _stazioneDiRifornimento.compareTo(stazioneDiRifornimento);
	}

	@Override
	public int hashCode() {
		return _stazioneDiRifornimento.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> toCacheModel() {
		return _stazioneDiRifornimento.toCacheModel();
	}

	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento toEscapedModel() {
		return new StazioneDiRifornimentoWrapper(_stazioneDiRifornimento.toEscapedModel());
	}

	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento toUnescapedModel() {
		return new StazioneDiRifornimentoWrapper(_stazioneDiRifornimento.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _stazioneDiRifornimento.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _stazioneDiRifornimento.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_stazioneDiRifornimento.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StazioneDiRifornimentoWrapper)) {
			return false;
		}

		StazioneDiRifornimentoWrapper stazioneDiRifornimentoWrapper = (StazioneDiRifornimentoWrapper)obj;

		if (Validator.equals(_stazioneDiRifornimento,
					stazioneDiRifornimentoWrapper._stazioneDiRifornimento)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _stazioneDiRifornimento.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StazioneDiRifornimento getWrappedStazioneDiRifornimento() {
		return _stazioneDiRifornimento;
	}

	@Override
	public StazioneDiRifornimento getWrappedModel() {
		return _stazioneDiRifornimento;
	}

	@Override
	public void resetOriginalValues() {
		_stazioneDiRifornimento.resetOriginalValues();
	}

	private StazioneDiRifornimento _stazioneDiRifornimento;
}
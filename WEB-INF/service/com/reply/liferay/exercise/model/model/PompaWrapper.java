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
 * This class is a wrapper for {@link Pompa}.
 * </p>
 *
 * @author s.girardello
 * @see Pompa
 * @generated
 */
public class PompaWrapper implements Pompa, ModelWrapper<Pompa> {
	public PompaWrapper(Pompa pompa) {
		_pompa = pompa;
	}

	@Override
	public Class<?> getModelClass() {
		return Pompa.class;
	}

	@Override
	public String getModelClassName() {
		return Pompa.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("pompaId", getPompaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("quantitaDiesel", getQuantitaDiesel());
		attributes.put("quantitaBenzina", getQuantitaBenzina());
		attributes.put("tempoGiacenza", getTempoGiacenza());
		attributes.put("incassoTotalePompa", getIncassoTotalePompa());
		attributes.put("statoPompa", getStatoPompa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long pompaId = (Long)attributes.get("pompaId");

		if (pompaId != null) {
			setPompaId(pompaId);
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

		Integer quantitaDiesel = (Integer)attributes.get("quantitaDiesel");

		if (quantitaDiesel != null) {
			setQuantitaDiesel(quantitaDiesel);
		}

		Integer quantitaBenzina = (Integer)attributes.get("quantitaBenzina");

		if (quantitaBenzina != null) {
			setQuantitaBenzina(quantitaBenzina);
		}

		Integer tempoGiacenza = (Integer)attributes.get("tempoGiacenza");

		if (tempoGiacenza != null) {
			setTempoGiacenza(tempoGiacenza);
		}

		Integer incassoTotalePompa = (Integer)attributes.get(
				"incassoTotalePompa");

		if (incassoTotalePompa != null) {
			setIncassoTotalePompa(incassoTotalePompa);
		}

		Boolean statoPompa = (Boolean)attributes.get("statoPompa");

		if (statoPompa != null) {
			setStatoPompa(statoPompa);
		}
	}

	/**
	* Returns the primary key of this pompa.
	*
	* @return the primary key of this pompa
	*/
	@Override
	public long getPrimaryKey() {
		return _pompa.getPrimaryKey();
	}

	/**
	* Sets the primary key of this pompa.
	*
	* @param primaryKey the primary key of this pompa
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pompa.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this pompa.
	*
	* @return the uuid of this pompa
	*/
	@Override
	public java.lang.String getUuid() {
		return _pompa.getUuid();
	}

	/**
	* Sets the uuid of this pompa.
	*
	* @param uuid the uuid of this pompa
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_pompa.setUuid(uuid);
	}

	/**
	* Returns the pompa ID of this pompa.
	*
	* @return the pompa ID of this pompa
	*/
	@Override
	public long getPompaId() {
		return _pompa.getPompaId();
	}

	/**
	* Sets the pompa ID of this pompa.
	*
	* @param pompaId the pompa ID of this pompa
	*/
	@Override
	public void setPompaId(long pompaId) {
		_pompa.setPompaId(pompaId);
	}

	/**
	* Returns the group ID of this pompa.
	*
	* @return the group ID of this pompa
	*/
	@Override
	public long getGroupId() {
		return _pompa.getGroupId();
	}

	/**
	* Sets the group ID of this pompa.
	*
	* @param groupId the group ID of this pompa
	*/
	@Override
	public void setGroupId(long groupId) {
		_pompa.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this pompa.
	*
	* @return the company ID of this pompa
	*/
	@Override
	public long getCompanyId() {
		return _pompa.getCompanyId();
	}

	/**
	* Sets the company ID of this pompa.
	*
	* @param companyId the company ID of this pompa
	*/
	@Override
	public void setCompanyId(long companyId) {
		_pompa.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this pompa.
	*
	* @return the user ID of this pompa
	*/
	@Override
	public long getUserId() {
		return _pompa.getUserId();
	}

	/**
	* Sets the user ID of this pompa.
	*
	* @param userId the user ID of this pompa
	*/
	@Override
	public void setUserId(long userId) {
		_pompa.setUserId(userId);
	}

	/**
	* Returns the user uuid of this pompa.
	*
	* @return the user uuid of this pompa
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _pompa.getUserUuid();
	}

	/**
	* Sets the user uuid of this pompa.
	*
	* @param userUuid the user uuid of this pompa
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_pompa.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this pompa.
	*
	* @return the user name of this pompa
	*/
	@Override
	public java.lang.String getUserName() {
		return _pompa.getUserName();
	}

	/**
	* Sets the user name of this pompa.
	*
	* @param userName the user name of this pompa
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_pompa.setUserName(userName);
	}

	/**
	* Returns the create date of this pompa.
	*
	* @return the create date of this pompa
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _pompa.getCreateDate();
	}

	/**
	* Sets the create date of this pompa.
	*
	* @param createDate the create date of this pompa
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_pompa.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this pompa.
	*
	* @return the modified date of this pompa
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _pompa.getModifiedDate();
	}

	/**
	* Sets the modified date of this pompa.
	*
	* @param modifiedDate the modified date of this pompa
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_pompa.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the quantita diesel of this pompa.
	*
	* @return the quantita diesel of this pompa
	*/
	@Override
	public int getQuantitaDiesel() {
		return _pompa.getQuantitaDiesel();
	}

	/**
	* Sets the quantita diesel of this pompa.
	*
	* @param quantitaDiesel the quantita diesel of this pompa
	*/
	@Override
	public void setQuantitaDiesel(int quantitaDiesel) {
		_pompa.setQuantitaDiesel(quantitaDiesel);
	}

	/**
	* Returns the quantita benzina of this pompa.
	*
	* @return the quantita benzina of this pompa
	*/
	@Override
	public int getQuantitaBenzina() {
		return _pompa.getQuantitaBenzina();
	}

	/**
	* Sets the quantita benzina of this pompa.
	*
	* @param quantitaBenzina the quantita benzina of this pompa
	*/
	@Override
	public void setQuantitaBenzina(int quantitaBenzina) {
		_pompa.setQuantitaBenzina(quantitaBenzina);
	}

	/**
	* Returns the tempo giacenza of this pompa.
	*
	* @return the tempo giacenza of this pompa
	*/
	@Override
	public int getTempoGiacenza() {
		return _pompa.getTempoGiacenza();
	}

	/**
	* Sets the tempo giacenza of this pompa.
	*
	* @param tempoGiacenza the tempo giacenza of this pompa
	*/
	@Override
	public void setTempoGiacenza(int tempoGiacenza) {
		_pompa.setTempoGiacenza(tempoGiacenza);
	}

	/**
	* Returns the incasso totale pompa of this pompa.
	*
	* @return the incasso totale pompa of this pompa
	*/
	@Override
	public int getIncassoTotalePompa() {
		return _pompa.getIncassoTotalePompa();
	}

	/**
	* Sets the incasso totale pompa of this pompa.
	*
	* @param incassoTotalePompa the incasso totale pompa of this pompa
	*/
	@Override
	public void setIncassoTotalePompa(int incassoTotalePompa) {
		_pompa.setIncassoTotalePompa(incassoTotalePompa);
	}

	/**
	* Returns the stato pompa of this pompa.
	*
	* @return the stato pompa of this pompa
	*/
	@Override
	public boolean getStatoPompa() {
		return _pompa.getStatoPompa();
	}

	/**
	* Returns <code>true</code> if this pompa is stato pompa.
	*
	* @return <code>true</code> if this pompa is stato pompa; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatoPompa() {
		return _pompa.isStatoPompa();
	}

	/**
	* Sets whether this pompa is stato pompa.
	*
	* @param statoPompa the stato pompa of this pompa
	*/
	@Override
	public void setStatoPompa(boolean statoPompa) {
		_pompa.setStatoPompa(statoPompa);
	}

	@Override
	public boolean isNew() {
		return _pompa.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_pompa.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _pompa.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pompa.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _pompa.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _pompa.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_pompa.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _pompa.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_pompa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_pompa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_pompa.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PompaWrapper((Pompa)_pompa.clone());
	}

	@Override
	public int compareTo(com.reply.liferay.exercise.model.model.Pompa pompa) {
		return _pompa.compareTo(pompa);
	}

	@Override
	public int hashCode() {
		return _pompa.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.reply.liferay.exercise.model.model.Pompa> toCacheModel() {
		return _pompa.toCacheModel();
	}

	@Override
	public com.reply.liferay.exercise.model.model.Pompa toEscapedModel() {
		return new PompaWrapper(_pompa.toEscapedModel());
	}

	@Override
	public com.reply.liferay.exercise.model.model.Pompa toUnescapedModel() {
		return new PompaWrapper(_pompa.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _pompa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pompa.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_pompa.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PompaWrapper)) {
			return false;
		}

		PompaWrapper pompaWrapper = (PompaWrapper)obj;

		if (Validator.equals(_pompa, pompaWrapper._pompa)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _pompa.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Pompa getWrappedPompa() {
		return _pompa;
	}

	@Override
	public Pompa getWrappedModel() {
		return _pompa;
	}

	@Override
	public void resetOriginalValues() {
		_pompa.resetOriginalValues();
	}

	private Pompa _pompa;
}
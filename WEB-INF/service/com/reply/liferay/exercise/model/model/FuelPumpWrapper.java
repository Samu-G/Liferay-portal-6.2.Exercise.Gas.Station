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
 * This class is a wrapper for {@link FuelPump}.
 * </p>
 *
 * @author s.girardello
 * @see FuelPump
 * @generated
 */
public class FuelPumpWrapper implements FuelPump, ModelWrapper<FuelPump> {
	public FuelPumpWrapper(FuelPump fuelPump) {
		_fuelPump = fuelPump;
	}

	@Override
	public Class<?> getModelClass() {
		return FuelPump.class;
	}

	@Override
	public String getModelClassName() {
		return FuelPump.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fuelPumpId", getFuelPumpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("gasolineCapacity", getGasolineCapacity());
		attributes.put("dieselCapacity", getDieselCapacity());
		attributes.put("cashInserted", getCashInserted());
		attributes.put("inactivityTime", getInactivityTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fuelPumpId = (Long)attributes.get("fuelPumpId");

		if (fuelPumpId != null) {
			setFuelPumpId(fuelPumpId);
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

		Integer gasolineCapacity = (Integer)attributes.get("gasolineCapacity");

		if (gasolineCapacity != null) {
			setGasolineCapacity(gasolineCapacity);
		}

		Integer dieselCapacity = (Integer)attributes.get("dieselCapacity");

		if (dieselCapacity != null) {
			setDieselCapacity(dieselCapacity);
		}

		Integer cashInserted = (Integer)attributes.get("cashInserted");

		if (cashInserted != null) {
			setCashInserted(cashInserted);
		}

		Integer inactivityTime = (Integer)attributes.get("inactivityTime");

		if (inactivityTime != null) {
			setInactivityTime(inactivityTime);
		}
	}

	/**
	* Returns the primary key of this fuel pump.
	*
	* @return the primary key of this fuel pump
	*/
	@Override
	public long getPrimaryKey() {
		return _fuelPump.getPrimaryKey();
	}

	/**
	* Sets the primary key of this fuel pump.
	*
	* @param primaryKey the primary key of this fuel pump
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_fuelPump.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this fuel pump.
	*
	* @return the uuid of this fuel pump
	*/
	@Override
	public java.lang.String getUuid() {
		return _fuelPump.getUuid();
	}

	/**
	* Sets the uuid of this fuel pump.
	*
	* @param uuid the uuid of this fuel pump
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_fuelPump.setUuid(uuid);
	}

	/**
	* Returns the fuel pump ID of this fuel pump.
	*
	* @return the fuel pump ID of this fuel pump
	*/
	@Override
	public long getFuelPumpId() {
		return _fuelPump.getFuelPumpId();
	}

	/**
	* Sets the fuel pump ID of this fuel pump.
	*
	* @param fuelPumpId the fuel pump ID of this fuel pump
	*/
	@Override
	public void setFuelPumpId(long fuelPumpId) {
		_fuelPump.setFuelPumpId(fuelPumpId);
	}

	/**
	* Returns the group ID of this fuel pump.
	*
	* @return the group ID of this fuel pump
	*/
	@Override
	public long getGroupId() {
		return _fuelPump.getGroupId();
	}

	/**
	* Sets the group ID of this fuel pump.
	*
	* @param groupId the group ID of this fuel pump
	*/
	@Override
	public void setGroupId(long groupId) {
		_fuelPump.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this fuel pump.
	*
	* @return the company ID of this fuel pump
	*/
	@Override
	public long getCompanyId() {
		return _fuelPump.getCompanyId();
	}

	/**
	* Sets the company ID of this fuel pump.
	*
	* @param companyId the company ID of this fuel pump
	*/
	@Override
	public void setCompanyId(long companyId) {
		_fuelPump.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this fuel pump.
	*
	* @return the user ID of this fuel pump
	*/
	@Override
	public long getUserId() {
		return _fuelPump.getUserId();
	}

	/**
	* Sets the user ID of this fuel pump.
	*
	* @param userId the user ID of this fuel pump
	*/
	@Override
	public void setUserId(long userId) {
		_fuelPump.setUserId(userId);
	}

	/**
	* Returns the user uuid of this fuel pump.
	*
	* @return the user uuid of this fuel pump
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _fuelPump.getUserUuid();
	}

	/**
	* Sets the user uuid of this fuel pump.
	*
	* @param userUuid the user uuid of this fuel pump
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_fuelPump.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this fuel pump.
	*
	* @return the user name of this fuel pump
	*/
	@Override
	public java.lang.String getUserName() {
		return _fuelPump.getUserName();
	}

	/**
	* Sets the user name of this fuel pump.
	*
	* @param userName the user name of this fuel pump
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_fuelPump.setUserName(userName);
	}

	/**
	* Returns the create date of this fuel pump.
	*
	* @return the create date of this fuel pump
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _fuelPump.getCreateDate();
	}

	/**
	* Sets the create date of this fuel pump.
	*
	* @param createDate the create date of this fuel pump
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_fuelPump.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this fuel pump.
	*
	* @return the modified date of this fuel pump
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _fuelPump.getModifiedDate();
	}

	/**
	* Sets the modified date of this fuel pump.
	*
	* @param modifiedDate the modified date of this fuel pump
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_fuelPump.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the gasoline capacity of this fuel pump.
	*
	* @return the gasoline capacity of this fuel pump
	*/
	@Override
	public int getGasolineCapacity() {
		return _fuelPump.getGasolineCapacity();
	}

	/**
	* Sets the gasoline capacity of this fuel pump.
	*
	* @param gasolineCapacity the gasoline capacity of this fuel pump
	*/
	@Override
	public void setGasolineCapacity(int gasolineCapacity) {
		_fuelPump.setGasolineCapacity(gasolineCapacity);
	}

	/**
	* Returns the diesel capacity of this fuel pump.
	*
	* @return the diesel capacity of this fuel pump
	*/
	@Override
	public int getDieselCapacity() {
		return _fuelPump.getDieselCapacity();
	}

	/**
	* Sets the diesel capacity of this fuel pump.
	*
	* @param dieselCapacity the diesel capacity of this fuel pump
	*/
	@Override
	public void setDieselCapacity(int dieselCapacity) {
		_fuelPump.setDieselCapacity(dieselCapacity);
	}

	/**
	* Returns the cash inserted of this fuel pump.
	*
	* @return the cash inserted of this fuel pump
	*/
	@Override
	public int getCashInserted() {
		return _fuelPump.getCashInserted();
	}

	/**
	* Sets the cash inserted of this fuel pump.
	*
	* @param cashInserted the cash inserted of this fuel pump
	*/
	@Override
	public void setCashInserted(int cashInserted) {
		_fuelPump.setCashInserted(cashInserted);
	}

	/**
	* Returns the inactivity time of this fuel pump.
	*
	* @return the inactivity time of this fuel pump
	*/
	@Override
	public int getInactivityTime() {
		return _fuelPump.getInactivityTime();
	}

	/**
	* Sets the inactivity time of this fuel pump.
	*
	* @param inactivityTime the inactivity time of this fuel pump
	*/
	@Override
	public void setInactivityTime(int inactivityTime) {
		_fuelPump.setInactivityTime(inactivityTime);
	}

	@Override
	public boolean isNew() {
		return _fuelPump.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_fuelPump.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _fuelPump.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_fuelPump.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _fuelPump.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _fuelPump.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_fuelPump.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _fuelPump.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_fuelPump.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_fuelPump.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_fuelPump.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FuelPumpWrapper((FuelPump)_fuelPump.clone());
	}

	@Override
	public int compareTo(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump) {
		return _fuelPump.compareTo(fuelPump);
	}

	@Override
	public int hashCode() {
		return _fuelPump.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.reply.liferay.exercise.model.model.FuelPump> toCacheModel() {
		return _fuelPump.toCacheModel();
	}

	@Override
	public com.reply.liferay.exercise.model.model.FuelPump toEscapedModel() {
		return new FuelPumpWrapper(_fuelPump.toEscapedModel());
	}

	@Override
	public com.reply.liferay.exercise.model.model.FuelPump toUnescapedModel() {
		return new FuelPumpWrapper(_fuelPump.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _fuelPump.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _fuelPump.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_fuelPump.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuelPumpWrapper)) {
			return false;
		}

		FuelPumpWrapper fuelPumpWrapper = (FuelPumpWrapper)obj;

		if (Validator.equals(_fuelPump, fuelPumpWrapper._fuelPump)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _fuelPump.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public FuelPump getWrappedFuelPump() {
		return _fuelPump;
	}

	@Override
	public FuelPump getWrappedModel() {
		return _fuelPump;
	}

	@Override
	public void resetOriginalValues() {
		_fuelPump.resetOriginalValues();
	}

	private FuelPump _fuelPump;
}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the FuelPump service. Represents a row in the &quot;GB_FuelPump&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.reply.liferay.exercise.model.model.impl.FuelPumpImpl}.
 * </p>
 *
 * @author s.girardello
 * @see FuelPump
 * @see com.reply.liferay.exercise.model.model.impl.FuelPumpImpl
 * @see com.reply.liferay.exercise.model.model.impl.FuelPumpModelImpl
 * @generated
 */
public interface FuelPumpModel extends BaseModel<FuelPump>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fuel pump model instance should use the {@link FuelPump} interface instead.
	 */

	/**
	 * Returns the primary key of this fuel pump.
	 *
	 * @return the primary key of this fuel pump
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fuel pump.
	 *
	 * @param primaryKey the primary key of this fuel pump
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this fuel pump.
	 *
	 * @return the uuid of this fuel pump
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this fuel pump.
	 *
	 * @param uuid the uuid of this fuel pump
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the fuel pump ID of this fuel pump.
	 *
	 * @return the fuel pump ID of this fuel pump
	 */
	public long getFuelPumpId();

	/**
	 * Sets the fuel pump ID of this fuel pump.
	 *
	 * @param fuelPumpId the fuel pump ID of this fuel pump
	 */
	public void setFuelPumpId(long fuelPumpId);

	/**
	 * Returns the group ID of this fuel pump.
	 *
	 * @return the group ID of this fuel pump
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this fuel pump.
	 *
	 * @param groupId the group ID of this fuel pump
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this fuel pump.
	 *
	 * @return the company ID of this fuel pump
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fuel pump.
	 *
	 * @param companyId the company ID of this fuel pump
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fuel pump.
	 *
	 * @return the user ID of this fuel pump
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this fuel pump.
	 *
	 * @param userId the user ID of this fuel pump
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fuel pump.
	 *
	 * @return the user uuid of this fuel pump
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this fuel pump.
	 *
	 * @param userUuid the user uuid of this fuel pump
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fuel pump.
	 *
	 * @return the user name of this fuel pump
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this fuel pump.
	 *
	 * @param userName the user name of this fuel pump
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this fuel pump.
	 *
	 * @return the create date of this fuel pump
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this fuel pump.
	 *
	 * @param createDate the create date of this fuel pump
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this fuel pump.
	 *
	 * @return the modified date of this fuel pump
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this fuel pump.
	 *
	 * @param modifiedDate the modified date of this fuel pump
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the gasoline capacity of this fuel pump.
	 *
	 * @return the gasoline capacity of this fuel pump
	 */
	public int getGasolineCapacity();

	/**
	 * Sets the gasoline capacity of this fuel pump.
	 *
	 * @param gasolineCapacity the gasoline capacity of this fuel pump
	 */
	public void setGasolineCapacity(int gasolineCapacity);

	/**
	 * Returns the diesel capacity of this fuel pump.
	 *
	 * @return the diesel capacity of this fuel pump
	 */
	public int getDieselCapacity();

	/**
	 * Sets the diesel capacity of this fuel pump.
	 *
	 * @param dieselCapacity the diesel capacity of this fuel pump
	 */
	public void setDieselCapacity(int dieselCapacity);

	/**
	 * Returns the cash inserted of this fuel pump.
	 *
	 * @return the cash inserted of this fuel pump
	 */
	public int getCashInserted();

	/**
	 * Sets the cash inserted of this fuel pump.
	 *
	 * @param cashInserted the cash inserted of this fuel pump
	 */
	public void setCashInserted(int cashInserted);

	/**
	 * Returns the inactivity time of this fuel pump.
	 *
	 * @return the inactivity time of this fuel pump
	 */
	public int getInactivityTime();

	/**
	 * Sets the inactivity time of this fuel pump.
	 *
	 * @param inactivityTime the inactivity time of this fuel pump
	 */
	public void setInactivityTime(int inactivityTime);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.reply.liferay.exercise.model.model.FuelPump fuelPump);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.reply.liferay.exercise.model.model.FuelPump> toCacheModel();

	@Override
	public com.reply.liferay.exercise.model.model.FuelPump toEscapedModel();

	@Override
	public com.reply.liferay.exercise.model.model.FuelPump toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
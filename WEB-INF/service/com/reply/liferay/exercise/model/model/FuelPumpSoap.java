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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.reply.liferay.exercise.model.service.http.FuelPumpServiceSoap}.
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.http.FuelPumpServiceSoap
 * @generated
 */
public class FuelPumpSoap implements Serializable {
	public static FuelPumpSoap toSoapModel(FuelPump model) {
		FuelPumpSoap soapModel = new FuelPumpSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFuelPumpId(model.getFuelPumpId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setGasolineCapacity(model.getGasolineCapacity());
		soapModel.setDieselCapacity(model.getDieselCapacity());
		soapModel.setCashInserted(model.getCashInserted());
		soapModel.setInactivityTime(model.getInactivityTime());

		return soapModel;
	}

	public static FuelPumpSoap[] toSoapModels(FuelPump[] models) {
		FuelPumpSoap[] soapModels = new FuelPumpSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FuelPumpSoap[][] toSoapModels(FuelPump[][] models) {
		FuelPumpSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FuelPumpSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FuelPumpSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FuelPumpSoap[] toSoapModels(List<FuelPump> models) {
		List<FuelPumpSoap> soapModels = new ArrayList<FuelPumpSoap>(models.size());

		for (FuelPump model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FuelPumpSoap[soapModels.size()]);
	}

	public FuelPumpSoap() {
	}

	public long getPrimaryKey() {
		return _fuelPumpId;
	}

	public void setPrimaryKey(long pk) {
		setFuelPumpId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFuelPumpId() {
		return _fuelPumpId;
	}

	public void setFuelPumpId(long fuelPumpId) {
		_fuelPumpId = fuelPumpId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getGasolineCapacity() {
		return _gasolineCapacity;
	}

	public void setGasolineCapacity(int gasolineCapacity) {
		_gasolineCapacity = gasolineCapacity;
	}

	public int getDieselCapacity() {
		return _dieselCapacity;
	}

	public void setDieselCapacity(int dieselCapacity) {
		_dieselCapacity = dieselCapacity;
	}

	public int getCashInserted() {
		return _cashInserted;
	}

	public void setCashInserted(int cashInserted) {
		_cashInserted = cashInserted;
	}

	public int getInactivityTime() {
		return _inactivityTime;
	}

	public void setInactivityTime(int inactivityTime) {
		_inactivityTime = inactivityTime;
	}

	private String _uuid;
	private long _fuelPumpId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _gasolineCapacity;
	private int _dieselCapacity;
	private int _cashInserted;
	private int _inactivityTime;
}
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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.reply.liferay.exercise.model.service.ClpSerializer;
import com.reply.liferay.exercise.model.service.FuelPumpLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author s.girardello
 */
public class FuelPumpClp extends BaseModelImpl<FuelPump> implements FuelPump {
	public FuelPumpClp() {
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
	public long getPrimaryKey() {
		return _fuelPumpId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setFuelPumpId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _fuelPumpId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_fuelPumpRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getFuelPumpId() {
		return _fuelPumpId;
	}

	@Override
	public void setFuelPumpId(long fuelPumpId) {
		_fuelPumpId = fuelPumpId;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setFuelPumpId", long.class);

				method.invoke(_fuelPumpRemoteModel, fuelPumpId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_fuelPumpRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_fuelPumpRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_fuelPumpRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_fuelPumpRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_fuelPumpRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_fuelPumpRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGasolineCapacity() {
		return _gasolineCapacity;
	}

	@Override
	public void setGasolineCapacity(int gasolineCapacity) {
		_gasolineCapacity = gasolineCapacity;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setGasolineCapacity", int.class);

				method.invoke(_fuelPumpRemoteModel, gasolineCapacity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDieselCapacity() {
		return _dieselCapacity;
	}

	@Override
	public void setDieselCapacity(int dieselCapacity) {
		_dieselCapacity = dieselCapacity;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setDieselCapacity", int.class);

				method.invoke(_fuelPumpRemoteModel, dieselCapacity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCashInserted() {
		return _cashInserted;
	}

	@Override
	public void setCashInserted(int cashInserted) {
		_cashInserted = cashInserted;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setCashInserted", int.class);

				method.invoke(_fuelPumpRemoteModel, cashInserted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getInactivityTime() {
		return _inactivityTime;
	}

	@Override
	public void setInactivityTime(int inactivityTime) {
		_inactivityTime = inactivityTime;

		if (_fuelPumpRemoteModel != null) {
			try {
				Class<?> clazz = _fuelPumpRemoteModel.getClass();

				Method method = clazz.getMethod("setInactivityTime", int.class);

				method.invoke(_fuelPumpRemoteModel, inactivityTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				FuelPump.class.getName()));
	}

	public BaseModel<?> getFuelPumpRemoteModel() {
		return _fuelPumpRemoteModel;
	}

	public void setFuelPumpRemoteModel(BaseModel<?> fuelPumpRemoteModel) {
		_fuelPumpRemoteModel = fuelPumpRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _fuelPumpRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_fuelPumpRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			FuelPumpLocalServiceUtil.addFuelPump(this);
		}
		else {
			FuelPumpLocalServiceUtil.updateFuelPump(this);
		}
	}

	@Override
	public FuelPump toEscapedModel() {
		return (FuelPump)ProxyUtil.newProxyInstance(FuelPump.class.getClassLoader(),
			new Class[] { FuelPump.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		FuelPumpClp clone = new FuelPumpClp();

		clone.setUuid(getUuid());
		clone.setFuelPumpId(getFuelPumpId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setGasolineCapacity(getGasolineCapacity());
		clone.setDieselCapacity(getDieselCapacity());
		clone.setCashInserted(getCashInserted());
		clone.setInactivityTime(getInactivityTime());

		return clone;
	}

	@Override
	public int compareTo(FuelPump fuelPump) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), fuelPump.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FuelPumpClp)) {
			return false;
		}

		FuelPumpClp fuelPump = (FuelPumpClp)obj;

		long primaryKey = fuelPump.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", fuelPumpId=");
		sb.append(getFuelPumpId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", gasolineCapacity=");
		sb.append(getGasolineCapacity());
		sb.append(", dieselCapacity=");
		sb.append(getDieselCapacity());
		sb.append(", cashInserted=");
		sb.append(getCashInserted());
		sb.append(", inactivityTime=");
		sb.append(getInactivityTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.reply.liferay.exercise.model.model.FuelPump");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fuelPumpId</column-name><column-value><![CDATA[");
		sb.append(getFuelPumpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gasolineCapacity</column-name><column-value><![CDATA[");
		sb.append(getGasolineCapacity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dieselCapacity</column-name><column-value><![CDATA[");
		sb.append(getDieselCapacity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cashInserted</column-name><column-value><![CDATA[");
		sb.append(getCashInserted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inactivityTime</column-name><column-value><![CDATA[");
		sb.append(getInactivityTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _fuelPumpId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _gasolineCapacity;
	private int _dieselCapacity;
	private int _cashInserted;
	private int _inactivityTime;
	private BaseModel<?> _fuelPumpRemoteModel;
	private Class<?> _clpSerializerClass = com.reply.liferay.exercise.model.service.ClpSerializer.class;
}
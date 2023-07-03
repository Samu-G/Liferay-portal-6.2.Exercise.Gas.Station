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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.reply.liferay.exercise.model.service.ClpSerializer;
import com.reply.liferay.exercise.model.service.RifornimentoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author s.girardello
 */
public class RifornimentoClp extends BaseModelImpl<Rifornimento>
	implements Rifornimento {
	public RifornimentoClp() {
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
	public long getPrimaryKey() {
		return _rifornimentoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRifornimentoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rifornimentoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getRifornimentoId() {
		return _rifornimentoId;
	}

	@Override
	public void setRifornimentoId(long rifornimentoId) {
		_rifornimentoId = rifornimentoId;

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setRifornimentoId", long.class);

				method.invoke(_rifornimentoRemoteModel, rifornimentoId);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_rifornimentoRemoteModel, groupId);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_rifornimentoRemoteModel, companyId);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_rifornimentoRemoteModel, userId);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_rifornimentoRemoteModel, userName);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_rifornimentoRemoteModel, createDate);
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

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_rifornimentoRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTipoCarburante() {
		return _tipoCarburante;
	}

	@Override
	public void setTipoCarburante(String tipoCarburante) {
		_tipoCarburante = tipoCarburante;

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setTipoCarburante",
						String.class);

				method.invoke(_rifornimentoRemoteModel, tipoCarburante);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDenaroInserito() {
		return _denaroInserito;
	}

	@Override
	public void setDenaroInserito(int denaroInserito) {
		_denaroInserito = denaroInserito;

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setDenaroInserito", int.class);

				method.invoke(_rifornimentoRemoteModel, denaroInserito);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPompaId() {
		return _pompaId;
	}

	@Override
	public void setPompaId(long pompaId) {
		_pompaId = pompaId;

		if (_rifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _rifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setPompaId", long.class);

				method.invoke(_rifornimentoRemoteModel, pompaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getRifornimentoRemoteModel() {
		return _rifornimentoRemoteModel;
	}

	public void setRifornimentoRemoteModel(BaseModel<?> rifornimentoRemoteModel) {
		_rifornimentoRemoteModel = rifornimentoRemoteModel;
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

		Class<?> remoteModelClass = _rifornimentoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_rifornimentoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			RifornimentoLocalServiceUtil.addRifornimento(this);
		}
		else {
			RifornimentoLocalServiceUtil.updateRifornimento(this);
		}
	}

	@Override
	public Rifornimento toEscapedModel() {
		return (Rifornimento)ProxyUtil.newProxyInstance(Rifornimento.class.getClassLoader(),
			new Class[] { Rifornimento.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RifornimentoClp clone = new RifornimentoClp();

		clone.setRifornimentoId(getRifornimentoId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTipoCarburante(getTipoCarburante());
		clone.setDenaroInserito(getDenaroInserito());
		clone.setPompaId(getPompaId());

		return clone;
	}

	@Override
	public int compareTo(Rifornimento rifornimento) {
		long primaryKey = rifornimento.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RifornimentoClp)) {
			return false;
		}

		RifornimentoClp rifornimento = (RifornimentoClp)obj;

		long primaryKey = rifornimento.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{rifornimentoId=");
		sb.append(getRifornimentoId());
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
		sb.append(", tipoCarburante=");
		sb.append(getTipoCarburante());
		sb.append(", denaroInserito=");
		sb.append(getDenaroInserito());
		sb.append(", pompaId=");
		sb.append(getPompaId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.reply.liferay.exercise.model.model.Rifornimento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>rifornimentoId</column-name><column-value><![CDATA[");
		sb.append(getRifornimentoId());
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
			"<column><column-name>tipoCarburante</column-name><column-value><![CDATA[");
		sb.append(getTipoCarburante());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>denaroInserito</column-name><column-value><![CDATA[");
		sb.append(getDenaroInserito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pompaId</column-name><column-value><![CDATA[");
		sb.append(getPompaId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _rifornimentoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tipoCarburante;
	private int _denaroInserito;
	private long _pompaId;
	private BaseModel<?> _rifornimentoRemoteModel;
	private Class<?> _clpSerializerClass = com.reply.liferay.exercise.model.service.ClpSerializer.class;
}
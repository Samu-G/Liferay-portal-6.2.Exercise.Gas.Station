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
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.reply.liferay.exercise.model.service.ClpSerializer;
import com.reply.liferay.exercise.model.service.StazioneDiRifornimentoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author s.girardello
 */
public class StazioneDiRifornimentoClp extends BaseModelImpl<StazioneDiRifornimento>
	implements StazioneDiRifornimento {
	public StazioneDiRifornimentoClp() {
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
	public long getPrimaryKey() {
		return _stazioneDiRifornimentoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStazioneDiRifornimentoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stazioneDiRifornimentoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStazioneDiRifornimentoId() {
		return _stazioneDiRifornimentoId;
	}

	@Override
	public void setStazioneDiRifornimentoId(long stazioneDiRifornimentoId) {
		_stazioneDiRifornimentoId = stazioneDiRifornimentoId;

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setStazioneDiRifornimentoId",
						long.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel,
					stazioneDiRifornimentoId);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, groupId);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, companyId);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, userId);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, userName);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, createDate);
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

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPrezzoBenzina() {
		return _prezzoBenzina;
	}

	@Override
	public void setPrezzoBenzina(int prezzoBenzina) {
		_prezzoBenzina = prezzoBenzina;

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrezzoBenzina", int.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, prezzoBenzina);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getPrezzoDiesel() {
		return _prezzoDiesel;
	}

	@Override
	public void setPrezzoDiesel(int prezzoDiesel) {
		_prezzoDiesel = prezzoDiesel;

		if (_stazioneDiRifornimentoRemoteModel != null) {
			try {
				Class<?> clazz = _stazioneDiRifornimentoRemoteModel.getClass();

				Method method = clazz.getMethod("setPrezzoDiesel", int.class);

				method.invoke(_stazioneDiRifornimentoRemoteModel, prezzoDiesel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				StazioneDiRifornimento.class.getName()));
	}

	public BaseModel<?> getStazioneDiRifornimentoRemoteModel() {
		return _stazioneDiRifornimentoRemoteModel;
	}

	public void setStazioneDiRifornimentoRemoteModel(
		BaseModel<?> stazioneDiRifornimentoRemoteModel) {
		_stazioneDiRifornimentoRemoteModel = stazioneDiRifornimentoRemoteModel;
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

		Class<?> remoteModelClass = _stazioneDiRifornimentoRemoteModel.getClass();

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

		Object returnValue = method.invoke(_stazioneDiRifornimentoRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StazioneDiRifornimentoLocalServiceUtil.addStazioneDiRifornimento(this);
		}
		else {
			StazioneDiRifornimentoLocalServiceUtil.updateStazioneDiRifornimento(this);
		}
	}

	@Override
	public StazioneDiRifornimento toEscapedModel() {
		return (StazioneDiRifornimento)ProxyUtil.newProxyInstance(StazioneDiRifornimento.class.getClassLoader(),
			new Class[] { StazioneDiRifornimento.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StazioneDiRifornimentoClp clone = new StazioneDiRifornimentoClp();

		clone.setUuid(getUuid());
		clone.setStazioneDiRifornimentoId(getStazioneDiRifornimentoId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setPrezzoBenzina(getPrezzoBenzina());
		clone.setPrezzoDiesel(getPrezzoDiesel());

		return clone;
	}

	@Override
	public int compareTo(StazioneDiRifornimento stazioneDiRifornimento) {
		long primaryKey = stazioneDiRifornimento.getPrimaryKey();

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

		if (!(obj instanceof StazioneDiRifornimentoClp)) {
			return false;
		}

		StazioneDiRifornimentoClp stazioneDiRifornimento = (StazioneDiRifornimentoClp)obj;

		long primaryKey = stazioneDiRifornimento.getPrimaryKey();

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

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", stazioneDiRifornimentoId=");
		sb.append(getStazioneDiRifornimentoId());
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
		sb.append(", prezzoBenzina=");
		sb.append(getPrezzoBenzina());
		sb.append(", prezzoDiesel=");
		sb.append(getPrezzoDiesel());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append(
			"com.reply.liferay.exercise.model.model.StazioneDiRifornimento");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stazioneDiRifornimentoId</column-name><column-value><![CDATA[");
		sb.append(getStazioneDiRifornimentoId());
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
			"<column><column-name>prezzoBenzina</column-name><column-value><![CDATA[");
		sb.append(getPrezzoBenzina());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>prezzoDiesel</column-name><column-value><![CDATA[");
		sb.append(getPrezzoDiesel());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _stazioneDiRifornimentoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _prezzoBenzina;
	private int _prezzoDiesel;
	private BaseModel<?> _stazioneDiRifornimentoRemoteModel;
	private Class<?> _clpSerializerClass = com.reply.liferay.exercise.model.service.ClpSerializer.class;
}
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
import com.reply.liferay.exercise.model.service.PompaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author s.girardello
 */
public class PompaClp extends BaseModelImpl<Pompa> implements Pompa {
	public PompaClp() {
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
	public long getPrimaryKey() {
		return _pompaId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPompaId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pompaId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_pompaRemoteModel, uuid);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setPompaId", long.class);

				method.invoke(_pompaRemoteModel, pompaId);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_pompaRemoteModel, groupId);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_pompaRemoteModel, companyId);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_pompaRemoteModel, userId);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_pompaRemoteModel, userName);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_pompaRemoteModel, createDate);
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

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_pompaRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQuantitaDiesel() {
		return _quantitaDiesel;
	}

	@Override
	public void setQuantitaDiesel(int quantitaDiesel) {
		_quantitaDiesel = quantitaDiesel;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantitaDiesel", int.class);

				method.invoke(_pompaRemoteModel, quantitaDiesel);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQuantitaBenzina() {
		return _quantitaBenzina;
	}

	@Override
	public void setQuantitaBenzina(int quantitaBenzina) {
		_quantitaBenzina = quantitaBenzina;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantitaBenzina", int.class);

				method.invoke(_pompaRemoteModel, quantitaBenzina);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getTempoGiacenza() {
		return _tempoGiacenza;
	}

	@Override
	public void setTempoGiacenza(int tempoGiacenza) {
		_tempoGiacenza = tempoGiacenza;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setTempoGiacenza", int.class);

				method.invoke(_pompaRemoteModel, tempoGiacenza);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIncassoTotalePompa() {
		return _incassoTotalePompa;
	}

	@Override
	public void setIncassoTotalePompa(int incassoTotalePompa) {
		_incassoTotalePompa = incassoTotalePompa;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setIncassoTotalePompa",
						int.class);

				method.invoke(_pompaRemoteModel, incassoTotalePompa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getStatoPompa() {
		return _statoPompa;
	}

	@Override
	public boolean isStatoPompa() {
		return _statoPompa;
	}

	@Override
	public void setStatoPompa(boolean statoPompa) {
		_statoPompa = statoPompa;

		if (_pompaRemoteModel != null) {
			try {
				Class<?> clazz = _pompaRemoteModel.getClass();

				Method method = clazz.getMethod("setStatoPompa", boolean.class);

				method.invoke(_pompaRemoteModel, statoPompa);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Pompa.class.getName()));
	}

	public BaseModel<?> getPompaRemoteModel() {
		return _pompaRemoteModel;
	}

	public void setPompaRemoteModel(BaseModel<?> pompaRemoteModel) {
		_pompaRemoteModel = pompaRemoteModel;
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

		Class<?> remoteModelClass = _pompaRemoteModel.getClass();

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

		Object returnValue = method.invoke(_pompaRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PompaLocalServiceUtil.addPompa(this);
		}
		else {
			PompaLocalServiceUtil.updatePompa(this);
		}
	}

	@Override
	public Pompa toEscapedModel() {
		return (Pompa)ProxyUtil.newProxyInstance(Pompa.class.getClassLoader(),
			new Class[] { Pompa.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PompaClp clone = new PompaClp();

		clone.setUuid(getUuid());
		clone.setPompaId(getPompaId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setQuantitaDiesel(getQuantitaDiesel());
		clone.setQuantitaBenzina(getQuantitaBenzina());
		clone.setTempoGiacenza(getTempoGiacenza());
		clone.setIncassoTotalePompa(getIncassoTotalePompa());
		clone.setStatoPompa(getStatoPompa());

		return clone;
	}

	@Override
	public int compareTo(Pompa pompa) {
		long primaryKey = pompa.getPrimaryKey();

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

		if (!(obj instanceof PompaClp)) {
			return false;
		}

		PompaClp pompa = (PompaClp)obj;

		long primaryKey = pompa.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", pompaId=");
		sb.append(getPompaId());
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
		sb.append(", quantitaDiesel=");
		sb.append(getQuantitaDiesel());
		sb.append(", quantitaBenzina=");
		sb.append(getQuantitaBenzina());
		sb.append(", tempoGiacenza=");
		sb.append(getTempoGiacenza());
		sb.append(", incassoTotalePompa=");
		sb.append(getIncassoTotalePompa());
		sb.append(", statoPompa=");
		sb.append(getStatoPompa());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.reply.liferay.exercise.model.model.Pompa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pompaId</column-name><column-value><![CDATA[");
		sb.append(getPompaId());
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
			"<column><column-name>quantitaDiesel</column-name><column-value><![CDATA[");
		sb.append(getQuantitaDiesel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantitaBenzina</column-name><column-value><![CDATA[");
		sb.append(getQuantitaBenzina());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tempoGiacenza</column-name><column-value><![CDATA[");
		sb.append(getTempoGiacenza());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>incassoTotalePompa</column-name><column-value><![CDATA[");
		sb.append(getIncassoTotalePompa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statoPompa</column-name><column-value><![CDATA[");
		sb.append(getStatoPompa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _pompaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _quantitaDiesel;
	private int _quantitaBenzina;
	private int _tempoGiacenza;
	private int _incassoTotalePompa;
	private boolean _statoPompa;
	private BaseModel<?> _pompaRemoteModel;
	private Class<?> _clpSerializerClass = com.reply.liferay.exercise.model.service.ClpSerializer.class;
}
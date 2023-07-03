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
 * This class is used by SOAP remote services, specifically {@link com.reply.liferay.exercise.model.service.http.StazioneDiRifornimentoServiceSoap}.
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.http.StazioneDiRifornimentoServiceSoap
 * @generated
 */
public class StazioneDiRifornimentoSoap implements Serializable {
	public static StazioneDiRifornimentoSoap toSoapModel(
		StazioneDiRifornimento model) {
		StazioneDiRifornimentoSoap soapModel = new StazioneDiRifornimentoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setStazioneDiRifornimentoId(model.getStazioneDiRifornimentoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static StazioneDiRifornimentoSoap[] toSoapModels(
		StazioneDiRifornimento[] models) {
		StazioneDiRifornimentoSoap[] soapModels = new StazioneDiRifornimentoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StazioneDiRifornimentoSoap[][] toSoapModels(
		StazioneDiRifornimento[][] models) {
		StazioneDiRifornimentoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StazioneDiRifornimentoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StazioneDiRifornimentoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StazioneDiRifornimentoSoap[] toSoapModels(
		List<StazioneDiRifornimento> models) {
		List<StazioneDiRifornimentoSoap> soapModels = new ArrayList<StazioneDiRifornimentoSoap>(models.size());

		for (StazioneDiRifornimento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StazioneDiRifornimentoSoap[soapModels.size()]);
	}

	public StazioneDiRifornimentoSoap() {
	}

	public long getPrimaryKey() {
		return _stazioneDiRifornimentoId;
	}

	public void setPrimaryKey(long pk) {
		setStazioneDiRifornimentoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getStazioneDiRifornimentoId() {
		return _stazioneDiRifornimentoId;
	}

	public void setStazioneDiRifornimentoId(long stazioneDiRifornimentoId) {
		_stazioneDiRifornimentoId = stazioneDiRifornimentoId;
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

	private String _uuid;
	private long _stazioneDiRifornimentoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
}
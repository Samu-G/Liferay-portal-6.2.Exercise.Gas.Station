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
 * This class is used by SOAP remote services, specifically {@link com.reply.liferay.exercise.model.service.http.RifornimentoServiceSoap}.
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.http.RifornimentoServiceSoap
 * @generated
 */
public class RifornimentoSoap implements Serializable {
	public static RifornimentoSoap toSoapModel(Rifornimento model) {
		RifornimentoSoap soapModel = new RifornimentoSoap();

		soapModel.setRifornimentoId(model.getRifornimentoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTipoCarburante(model.getTipoCarburante());
		soapModel.setDenaroInserito(model.getDenaroInserito());
		soapModel.setPompaId(model.getPompaId());

		return soapModel;
	}

	public static RifornimentoSoap[] toSoapModels(Rifornimento[] models) {
		RifornimentoSoap[] soapModels = new RifornimentoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RifornimentoSoap[][] toSoapModels(Rifornimento[][] models) {
		RifornimentoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RifornimentoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RifornimentoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RifornimentoSoap[] toSoapModels(List<Rifornimento> models) {
		List<RifornimentoSoap> soapModels = new ArrayList<RifornimentoSoap>(models.size());

		for (Rifornimento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RifornimentoSoap[soapModels.size()]);
	}

	public RifornimentoSoap() {
	}

	public long getPrimaryKey() {
		return _rifornimentoId;
	}

	public void setPrimaryKey(long pk) {
		setRifornimentoId(pk);
	}

	public long getRifornimentoId() {
		return _rifornimentoId;
	}

	public void setRifornimentoId(long rifornimentoId) {
		_rifornimentoId = rifornimentoId;
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

	public String getTipoCarburante() {
		return _tipoCarburante;
	}

	public void setTipoCarburante(String tipoCarburante) {
		_tipoCarburante = tipoCarburante;
	}

	public int getDenaroInserito() {
		return _denaroInserito;
	}

	public void setDenaroInserito(int denaroInserito) {
		_denaroInserito = denaroInserito;
	}

	public long getPompaId() {
		return _pompaId;
	}

	public void setPompaId(long pompaId) {
		_pompaId = pompaId;
	}

	private long _rifornimentoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tipoCarburante;
	private int _denaroInserito;
	private long _pompaId;
}
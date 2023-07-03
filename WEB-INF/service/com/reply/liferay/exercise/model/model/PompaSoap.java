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
 * This class is used by SOAP remote services, specifically {@link com.reply.liferay.exercise.model.service.http.PompaServiceSoap}.
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.http.PompaServiceSoap
 * @generated
 */
public class PompaSoap implements Serializable {
	public static PompaSoap toSoapModel(Pompa model) {
		PompaSoap soapModel = new PompaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPompaId(model.getPompaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setQuantitaDiesel(model.getQuantitaDiesel());
		soapModel.setQuantitaBenzina(model.getQuantitaBenzina());
		soapModel.setTempoGiacenza(model.getTempoGiacenza());
		soapModel.setIncassoTotalePompa(model.getIncassoTotalePompa());
		soapModel.setStatoPompa(model.getStatoPompa());

		return soapModel;
	}

	public static PompaSoap[] toSoapModels(Pompa[] models) {
		PompaSoap[] soapModels = new PompaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PompaSoap[][] toSoapModels(Pompa[][] models) {
		PompaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PompaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PompaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PompaSoap[] toSoapModels(List<Pompa> models) {
		List<PompaSoap> soapModels = new ArrayList<PompaSoap>(models.size());

		for (Pompa model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PompaSoap[soapModels.size()]);
	}

	public PompaSoap() {
	}

	public long getPrimaryKey() {
		return _pompaId;
	}

	public void setPrimaryKey(long pk) {
		setPompaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPompaId() {
		return _pompaId;
	}

	public void setPompaId(long pompaId) {
		_pompaId = pompaId;
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

	public int getQuantitaDiesel() {
		return _quantitaDiesel;
	}

	public void setQuantitaDiesel(int quantitaDiesel) {
		_quantitaDiesel = quantitaDiesel;
	}

	public int getQuantitaBenzina() {
		return _quantitaBenzina;
	}

	public void setQuantitaBenzina(int quantitaBenzina) {
		_quantitaBenzina = quantitaBenzina;
	}

	public int getTempoGiacenza() {
		return _tempoGiacenza;
	}

	public void setTempoGiacenza(int tempoGiacenza) {
		_tempoGiacenza = tempoGiacenza;
	}

	public int getIncassoTotalePompa() {
		return _incassoTotalePompa;
	}

	public void setIncassoTotalePompa(int incassoTotalePompa) {
		_incassoTotalePompa = incassoTotalePompa;
	}

	public boolean getStatoPompa() {
		return _statoPompa;
	}

	public boolean isStatoPompa() {
		return _statoPompa;
	}

	public void setStatoPompa(boolean statoPompa) {
		_statoPompa = statoPompa;
	}

	private String _uuid;
	private long _pompaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _quantitaDiesel;
	private int _quantitaBenzina;
	private int _tempoGiacenza;
	private int _incassoTotalePompa;
	private boolean _statoPompa;
}
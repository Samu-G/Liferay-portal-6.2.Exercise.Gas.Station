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

package com.reply.liferay.exercise.model.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.reply.liferay.exercise.model.model.Rifornimento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Rifornimento in entity cache.
 *
 * @author s.girardello
 * @see Rifornimento
 * @generated
 */
public class RifornimentoCacheModel implements CacheModel<Rifornimento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{rifornimentoId=");
		sb.append(rifornimentoId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tipoCarburante=");
		sb.append(tipoCarburante);
		sb.append(", denaroInserito=");
		sb.append(denaroInserito);
		sb.append(", pompaId=");
		sb.append(pompaId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Rifornimento toEntityModel() {
		RifornimentoImpl rifornimentoImpl = new RifornimentoImpl();

		rifornimentoImpl.setRifornimentoId(rifornimentoId);
		rifornimentoImpl.setGroupId(groupId);
		rifornimentoImpl.setCompanyId(companyId);
		rifornimentoImpl.setUserId(userId);

		if (userName == null) {
			rifornimentoImpl.setUserName(StringPool.BLANK);
		}
		else {
			rifornimentoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			rifornimentoImpl.setCreateDate(null);
		}
		else {
			rifornimentoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			rifornimentoImpl.setModifiedDate(null);
		}
		else {
			rifornimentoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tipoCarburante == null) {
			rifornimentoImpl.setTipoCarburante(StringPool.BLANK);
		}
		else {
			rifornimentoImpl.setTipoCarburante(tipoCarburante);
		}

		rifornimentoImpl.setDenaroInserito(denaroInserito);
		rifornimentoImpl.setPompaId(pompaId);

		rifornimentoImpl.resetOriginalValues();

		return rifornimentoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		rifornimentoId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tipoCarburante = objectInput.readUTF();
		denaroInserito = objectInput.readInt();
		pompaId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(rifornimentoId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (tipoCarburante == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tipoCarburante);
		}

		objectOutput.writeInt(denaroInserito);
		objectOutput.writeLong(pompaId);
	}

	public long rifornimentoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tipoCarburante;
	public int denaroInserito;
	public long pompaId;
}
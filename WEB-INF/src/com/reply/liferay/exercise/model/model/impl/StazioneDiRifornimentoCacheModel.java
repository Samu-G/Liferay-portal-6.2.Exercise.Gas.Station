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

import com.reply.liferay.exercise.model.model.StazioneDiRifornimento;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StazioneDiRifornimento in entity cache.
 *
 * @author s.girardello
 * @see StazioneDiRifornimento
 * @generated
 */
public class StazioneDiRifornimentoCacheModel implements CacheModel<StazioneDiRifornimento>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", stazioneDiRifornimentoId=");
		sb.append(stazioneDiRifornimentoId);
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
		sb.append(", prezzoBenzina=");
		sb.append(prezzoBenzina);
		sb.append(", prezzoDiesel=");
		sb.append(prezzoDiesel);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public StazioneDiRifornimento toEntityModel() {
		StazioneDiRifornimentoImpl stazioneDiRifornimentoImpl = new StazioneDiRifornimentoImpl();

		if (uuid == null) {
			stazioneDiRifornimentoImpl.setUuid(StringPool.BLANK);
		}
		else {
			stazioneDiRifornimentoImpl.setUuid(uuid);
		}

		stazioneDiRifornimentoImpl.setStazioneDiRifornimentoId(stazioneDiRifornimentoId);
		stazioneDiRifornimentoImpl.setGroupId(groupId);
		stazioneDiRifornimentoImpl.setCompanyId(companyId);
		stazioneDiRifornimentoImpl.setUserId(userId);

		if (userName == null) {
			stazioneDiRifornimentoImpl.setUserName(StringPool.BLANK);
		}
		else {
			stazioneDiRifornimentoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			stazioneDiRifornimentoImpl.setCreateDate(null);
		}
		else {
			stazioneDiRifornimentoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			stazioneDiRifornimentoImpl.setModifiedDate(null);
		}
		else {
			stazioneDiRifornimentoImpl.setModifiedDate(new Date(modifiedDate));
		}

		stazioneDiRifornimentoImpl.setPrezzoBenzina(prezzoBenzina);
		stazioneDiRifornimentoImpl.setPrezzoDiesel(prezzoDiesel);

		stazioneDiRifornimentoImpl.resetOriginalValues();

		return stazioneDiRifornimentoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		stazioneDiRifornimentoId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		prezzoBenzina = objectInput.readInt();
		prezzoDiesel = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(stazioneDiRifornimentoId);
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
		objectOutput.writeInt(prezzoBenzina);
		objectOutput.writeInt(prezzoDiesel);
	}

	public String uuid;
	public long stazioneDiRifornimentoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int prezzoBenzina;
	public int prezzoDiesel;
}
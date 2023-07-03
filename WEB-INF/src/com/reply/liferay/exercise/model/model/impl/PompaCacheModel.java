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

import com.reply.liferay.exercise.model.model.Pompa;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Pompa in entity cache.
 *
 * @author s.girardello
 * @see Pompa
 * @generated
 */
public class PompaCacheModel implements CacheModel<Pompa>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", pompaId=");
		sb.append(pompaId);
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
		sb.append(", quantitaDiesel=");
		sb.append(quantitaDiesel);
		sb.append(", quantitaBenzina=");
		sb.append(quantitaBenzina);
		sb.append(", tempoGiacenza=");
		sb.append(tempoGiacenza);
		sb.append(", incassoTotalePompa=");
		sb.append(incassoTotalePompa);
		sb.append(", statoPompa=");
		sb.append(statoPompa);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pompa toEntityModel() {
		PompaImpl pompaImpl = new PompaImpl();

		if (uuid == null) {
			pompaImpl.setUuid(StringPool.BLANK);
		}
		else {
			pompaImpl.setUuid(uuid);
		}

		pompaImpl.setPompaId(pompaId);
		pompaImpl.setGroupId(groupId);
		pompaImpl.setCompanyId(companyId);
		pompaImpl.setUserId(userId);

		if (userName == null) {
			pompaImpl.setUserName(StringPool.BLANK);
		}
		else {
			pompaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			pompaImpl.setCreateDate(null);
		}
		else {
			pompaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			pompaImpl.setModifiedDate(null);
		}
		else {
			pompaImpl.setModifiedDate(new Date(modifiedDate));
		}

		pompaImpl.setQuantitaDiesel(quantitaDiesel);
		pompaImpl.setQuantitaBenzina(quantitaBenzina);
		pompaImpl.setTempoGiacenza(tempoGiacenza);
		pompaImpl.setIncassoTotalePompa(incassoTotalePompa);
		pompaImpl.setStatoPompa(statoPompa);

		pompaImpl.resetOriginalValues();

		return pompaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		pompaId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		quantitaDiesel = objectInput.readInt();
		quantitaBenzina = objectInput.readInt();
		tempoGiacenza = objectInput.readInt();
		incassoTotalePompa = objectInput.readInt();
		statoPompa = objectInput.readBoolean();
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

		objectOutput.writeLong(pompaId);
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
		objectOutput.writeInt(quantitaDiesel);
		objectOutput.writeInt(quantitaBenzina);
		objectOutput.writeInt(tempoGiacenza);
		objectOutput.writeInt(incassoTotalePompa);
		objectOutput.writeBoolean(statoPompa);
	}

	public String uuid;
	public long pompaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int quantitaDiesel;
	public int quantitaBenzina;
	public int tempoGiacenza;
	public int incassoTotalePompa;
	public boolean statoPompa;
}
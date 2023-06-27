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

import com.reply.liferay.exercise.model.model.FuelPump;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FuelPump in entity cache.
 *
 * @author s.girardello
 * @see FuelPump
 * @generated
 */
public class FuelPumpCacheModel implements CacheModel<FuelPump>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fuelPumpId=");
		sb.append(fuelPumpId);
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
		sb.append(", gasolineCapacity=");
		sb.append(gasolineCapacity);
		sb.append(", dieselCapacity=");
		sb.append(dieselCapacity);
		sb.append(", cashInserted=");
		sb.append(cashInserted);
		sb.append(", inactivityTime=");
		sb.append(inactivityTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FuelPump toEntityModel() {
		FuelPumpImpl fuelPumpImpl = new FuelPumpImpl();

		if (uuid == null) {
			fuelPumpImpl.setUuid(StringPool.BLANK);
		}
		else {
			fuelPumpImpl.setUuid(uuid);
		}

		fuelPumpImpl.setFuelPumpId(fuelPumpId);
		fuelPumpImpl.setGroupId(groupId);
		fuelPumpImpl.setCompanyId(companyId);
		fuelPumpImpl.setUserId(userId);

		if (userName == null) {
			fuelPumpImpl.setUserName(StringPool.BLANK);
		}
		else {
			fuelPumpImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			fuelPumpImpl.setCreateDate(null);
		}
		else {
			fuelPumpImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			fuelPumpImpl.setModifiedDate(null);
		}
		else {
			fuelPumpImpl.setModifiedDate(new Date(modifiedDate));
		}

		fuelPumpImpl.setGasolineCapacity(gasolineCapacity);
		fuelPumpImpl.setDieselCapacity(dieselCapacity);
		fuelPumpImpl.setCashInserted(cashInserted);
		fuelPumpImpl.setInactivityTime(inactivityTime);

		fuelPumpImpl.resetOriginalValues();

		return fuelPumpImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		fuelPumpId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		gasolineCapacity = objectInput.readInt();
		dieselCapacity = objectInput.readInt();
		cashInserted = objectInput.readInt();
		inactivityTime = objectInput.readInt();
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

		objectOutput.writeLong(fuelPumpId);
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
		objectOutput.writeInt(gasolineCapacity);
		objectOutput.writeInt(dieselCapacity);
		objectOutput.writeInt(cashInserted);
		objectOutput.writeInt(inactivityTime);
	}

	public String uuid;
	public long fuelPumpId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int gasolineCapacity;
	public int dieselCapacity;
	public int cashInserted;
	public int inactivityTime;
}
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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the StazioneDiRifornimento service. Represents a row in the &quot;SG_StazioneDiRifornimento&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoImpl}.
 * </p>
 *
 * @author s.girardello
 * @see StazioneDiRifornimento
 * @see com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoImpl
 * @see com.reply.liferay.exercise.model.model.impl.StazioneDiRifornimentoModelImpl
 * @generated
 */
public interface StazioneDiRifornimentoModel extends BaseModel<StazioneDiRifornimento>,
	StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a stazione di rifornimento model instance should use the {@link StazioneDiRifornimento} interface instead.
	 */

	/**
	 * Returns the primary key of this stazione di rifornimento.
	 *
	 * @return the primary key of this stazione di rifornimento
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this stazione di rifornimento.
	 *
	 * @param primaryKey the primary key of this stazione di rifornimento
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this stazione di rifornimento.
	 *
	 * @return the uuid of this stazione di rifornimento
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this stazione di rifornimento.
	 *
	 * @param uuid the uuid of this stazione di rifornimento
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the stazione di rifornimento ID of this stazione di rifornimento.
	 *
	 * @return the stazione di rifornimento ID of this stazione di rifornimento
	 */
	public long getStazioneDiRifornimentoId();

	/**
	 * Sets the stazione di rifornimento ID of this stazione di rifornimento.
	 *
	 * @param stazioneDiRifornimentoId the stazione di rifornimento ID of this stazione di rifornimento
	 */
	public void setStazioneDiRifornimentoId(long stazioneDiRifornimentoId);

	/**
	 * Returns the group ID of this stazione di rifornimento.
	 *
	 * @return the group ID of this stazione di rifornimento
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this stazione di rifornimento.
	 *
	 * @param groupId the group ID of this stazione di rifornimento
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this stazione di rifornimento.
	 *
	 * @return the company ID of this stazione di rifornimento
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this stazione di rifornimento.
	 *
	 * @param companyId the company ID of this stazione di rifornimento
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this stazione di rifornimento.
	 *
	 * @return the user ID of this stazione di rifornimento
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this stazione di rifornimento.
	 *
	 * @param userId the user ID of this stazione di rifornimento
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this stazione di rifornimento.
	 *
	 * @return the user uuid of this stazione di rifornimento
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this stazione di rifornimento.
	 *
	 * @param userUuid the user uuid of this stazione di rifornimento
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this stazione di rifornimento.
	 *
	 * @return the user name of this stazione di rifornimento
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this stazione di rifornimento.
	 *
	 * @param userName the user name of this stazione di rifornimento
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this stazione di rifornimento.
	 *
	 * @return the create date of this stazione di rifornimento
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this stazione di rifornimento.
	 *
	 * @param createDate the create date of this stazione di rifornimento
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this stazione di rifornimento.
	 *
	 * @return the modified date of this stazione di rifornimento
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this stazione di rifornimento.
	 *
	 * @param modifiedDate the modified date of this stazione di rifornimento
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the prezzo benzina of this stazione di rifornimento.
	 *
	 * @return the prezzo benzina of this stazione di rifornimento
	 */
	public int getPrezzoBenzina();

	/**
	 * Sets the prezzo benzina of this stazione di rifornimento.
	 *
	 * @param prezzoBenzina the prezzo benzina of this stazione di rifornimento
	 */
	public void setPrezzoBenzina(int prezzoBenzina);

	/**
	 * Returns the prezzo diesel of this stazione di rifornimento.
	 *
	 * @return the prezzo diesel of this stazione di rifornimento
	 */
	public int getPrezzoDiesel();

	/**
	 * Sets the prezzo diesel of this stazione di rifornimento.
	 *
	 * @param prezzoDiesel the prezzo diesel of this stazione di rifornimento
	 */
	public void setPrezzoDiesel(int prezzoDiesel);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.reply.liferay.exercise.model.model.StazioneDiRifornimento stazioneDiRifornimento);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.reply.liferay.exercise.model.model.StazioneDiRifornimento> toCacheModel();

	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento toEscapedModel();

	@Override
	public com.reply.liferay.exercise.model.model.StazioneDiRifornimento toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
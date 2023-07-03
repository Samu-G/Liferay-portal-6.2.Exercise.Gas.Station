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
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Rifornimento service. Represents a row in the &quot;SG_Rifornimento&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.reply.liferay.exercise.model.model.impl.RifornimentoImpl}.
 * </p>
 *
 * @author s.girardello
 * @see Rifornimento
 * @see com.reply.liferay.exercise.model.model.impl.RifornimentoImpl
 * @see com.reply.liferay.exercise.model.model.impl.RifornimentoModelImpl
 * @generated
 */
public interface RifornimentoModel extends BaseModel<Rifornimento>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rifornimento model instance should use the {@link Rifornimento} interface instead.
	 */

	/**
	 * Returns the primary key of this rifornimento.
	 *
	 * @return the primary key of this rifornimento
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rifornimento.
	 *
	 * @param primaryKey the primary key of this rifornimento
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the rifornimento ID of this rifornimento.
	 *
	 * @return the rifornimento ID of this rifornimento
	 */
	public long getRifornimentoId();

	/**
	 * Sets the rifornimento ID of this rifornimento.
	 *
	 * @param rifornimentoId the rifornimento ID of this rifornimento
	 */
	public void setRifornimentoId(long rifornimentoId);

	/**
	 * Returns the group ID of this rifornimento.
	 *
	 * @return the group ID of this rifornimento
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this rifornimento.
	 *
	 * @param groupId the group ID of this rifornimento
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this rifornimento.
	 *
	 * @return the company ID of this rifornimento
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this rifornimento.
	 *
	 * @param companyId the company ID of this rifornimento
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this rifornimento.
	 *
	 * @return the user ID of this rifornimento
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this rifornimento.
	 *
	 * @param userId the user ID of this rifornimento
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this rifornimento.
	 *
	 * @return the user uuid of this rifornimento
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this rifornimento.
	 *
	 * @param userUuid the user uuid of this rifornimento
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this rifornimento.
	 *
	 * @return the user name of this rifornimento
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this rifornimento.
	 *
	 * @param userName the user name of this rifornimento
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this rifornimento.
	 *
	 * @return the create date of this rifornimento
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this rifornimento.
	 *
	 * @param createDate the create date of this rifornimento
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this rifornimento.
	 *
	 * @return the modified date of this rifornimento
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this rifornimento.
	 *
	 * @param modifiedDate the modified date of this rifornimento
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the tipo carburante of this rifornimento.
	 *
	 * @return the tipo carburante of this rifornimento
	 */
	@AutoEscape
	public String getTipoCarburante();

	/**
	 * Sets the tipo carburante of this rifornimento.
	 *
	 * @param tipoCarburante the tipo carburante of this rifornimento
	 */
	public void setTipoCarburante(String tipoCarburante);

	/**
	 * Returns the denaro inserito of this rifornimento.
	 *
	 * @return the denaro inserito of this rifornimento
	 */
	public int getDenaroInserito();

	/**
	 * Sets the denaro inserito of this rifornimento.
	 *
	 * @param denaroInserito the denaro inserito of this rifornimento
	 */
	public void setDenaroInserito(int denaroInserito);

	/**
	 * Returns the pompa ID of this rifornimento.
	 *
	 * @return the pompa ID of this rifornimento
	 */
	public long getPompaId();

	/**
	 * Sets the pompa ID of this rifornimento.
	 *
	 * @param pompaId the pompa ID of this rifornimento
	 */
	public void setPompaId(long pompaId);

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
		com.reply.liferay.exercise.model.model.Rifornimento rifornimento);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.reply.liferay.exercise.model.model.Rifornimento> toCacheModel();

	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento toEscapedModel();

	@Override
	public com.reply.liferay.exercise.model.model.Rifornimento toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}
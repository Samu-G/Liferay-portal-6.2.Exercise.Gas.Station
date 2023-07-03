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

package com.reply.liferay.exercise.model.service.impl;

<<<<<<< HEAD
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.reply.liferay.exercise.model.model.Pompa;
import com.reply.liferay.exercise.model.model.Rifornimento;
import com.reply.liferay.exercise.model.service.PompaLocalService;
=======
>>>>>>> 57d62af87a7cb366c4a3ccfc5ecdd86fe645dbc4
import com.reply.liferay.exercise.model.service.base.RifornimentoLocalServiceBaseImpl;

/**
 * The implementation of the rifornimento local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.reply.liferay.exercise.model.service.RifornimentoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.base.RifornimentoLocalServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.RifornimentoLocalServiceUtil
 */
public class RifornimentoLocalServiceImpl
	extends RifornimentoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.reply.liferay.exercise.model.service.RifornimentoLocalServiceUtil} to access the rifornimento local service.
	 */
<<<<<<< HEAD
	
	private boolean test;
	
	@Override
	public Rifornimento addRifornimento(Rifornimento rifornimento) throws SystemException {
		// TODO Auto-generated method stub
		return super.addRifornimento(rifornimento);
	}

	@Override
	public Rifornimento deleteRifornimento(long rifornimentoId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		return super.deleteRifornimento(rifornimentoId);
	}


	@Override
	public PompaLocalService getPompaLocalService() {
		// TODO Auto-generated method stub
		return super.getPompaLocalService();
	}

	public boolean sbloccaRifornimento() {
		return test;
	}
	
=======
>>>>>>> 57d62af87a7cb366c4a3ccfc5ecdd86fe645dbc4
}
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
import com.reply.liferay.exercise.model.model.Pompa;
import com.reply.liferay.exercise.model.service.base.StazioneDiRifornimentoLocalServiceBaseImpl;

import java.util.LinkedList;
import java.util.List;

/**
 * The implementation of the stazione di rifornimento local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.reply.liferay.exercise.model.service.StazioneDiRifornimentoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.base.StazioneDiRifornimentoLocalServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.StazioneDiRifornimentoLocalServiceUtil
 */
public class StazioneDiRifornimentoLocalServiceImpl
	extends StazioneDiRifornimentoLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.reply.liferay.exercise.model.service.StazioneDiRifornimentoLocalServiceUtil} to access the stazione di rifornimento local service.
	 */
	
	private boolean stationUpAndRunning;
	private static int [] banconoteAccettate;
	private static List<Pompa> pompeInstallate; 
	
	public void aggiuntaPompaDallAmministratore () {
		
	}

	public boolean isStationUpAndRunning() {
		return stationUpAndRunning;
	}

	public void setStationUpAndRunning(boolean stationUpAndRunning) {
		this.stationUpAndRunning = stationUpAndRunning;
	}

	public static int[] getBanconoteAccettate() {
		return banconoteAccettate;
	}

	public static void setBanconoteAccettate(int[] banconoteAccettate) {
		StazioneDiRifornimentoLocalServiceImpl.banconoteAccettate = banconoteAccettate;
	}

	public static List<Pompa> getPompeInstallate() {
		return pompeInstallate;
	}

	public static void setPompeInstallate(List<Pompa> pompeInstallate) {
		StazioneDiRifornimentoLocalServiceImpl.pompeInstallate = pompeInstallate;
	}

	@Override
	public void setPrezzoBenzina(float prezzoBenzina) {
		StazioneDiRifornimentoPersistenceImpl.
	}

	@Override
	public void setPrezzoDiesel(float prezzoDiesel) {
		
	}
	
	
	
}
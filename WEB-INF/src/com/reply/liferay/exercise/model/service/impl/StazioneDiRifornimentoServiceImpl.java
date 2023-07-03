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

import com.reply.liferay.exercise.model.service.base.StazioneDiRifornimentoServiceBaseImpl;

import java.util.Arrays;

/**
 * The implementation of the stazione di rifornimento remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.reply.liferay.exercise.model.service.StazioneDiRifornimentoService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.base.StazioneDiRifornimentoServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.StazioneDiRifornimentoServiceUtil
 */
public class StazioneDiRifornimentoServiceImpl
	extends StazioneDiRifornimentoServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.reply.liferay.exercise.model.service.StazioneDiRifornimentoServiceUtil} to access the stazione di rifornimento remote service.
	 */
	private String prezzoBenzina = "2,145 euro"; 
	private String prezzoDiesel = "1,998 euro";
	private int denaroAggiunto;
	
	public String getPrezzoBenzina() {
		return prezzoBenzina;
	}
	
	public String getPrezzoDiesel() {
		return prezzoDiesel;
	}
	
	public void aggiungiDenaro(int denaroDaAggiungere) {
		int [] banconoteAccettate = new int [] {5, 10, 20, 50, 100};
		if(Arrays.asList(banconoteAccettate).contains(denaroDaAggiungere)) {
			
		} else {
			System.out.println("Banconota non supportata");
		}
		
	}
	
	public String getDenaro() {
		return Integer.toString(denaroAggiunto);
	}

	public void reset() {
		int denaro = denaroAggiunto;
		denaroAggiunto = 0;
		System.out.println(denaro + " - > Denaro restituito al cliente");
	}
}
	
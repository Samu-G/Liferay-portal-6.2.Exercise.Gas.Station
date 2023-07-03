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

import com.reply.liferay.exercise.model.model.Rifornimento;
import com.reply.liferay.exercise.model.service.base.PompaLocalServiceBaseImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * The implementation of the pompa local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.reply.liferay.exercise.model.service.PompaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author s.girardello
 * @see com.reply.liferay.exercise.model.service.base.PompaLocalServiceBaseImpl
 * @see com.reply.liferay.exercise.model.service.PompaLocalServiceUtil
 */
public class PompaLocalServiceImpl extends PompaLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.reply.liferay.exercise.model.service.PompaLocalServiceUtil} to access the pompa local service.
	 */
	private int quantitaDiesel;
	private int quantitaBenzina;
	private Date inizioGiacenza;
	private Date fineGiacenza;
	private int introitoTotale;
	private List<Rifornimento> totalitaRifornimento = new ArrayList<Rifornimento>();
	
	
	
	public int getQuantitaDiesel() {
		return quantitaDiesel;
	}
	
	public int getQuantitaBenzina() {
		return quantitaBenzina;
	}
	
	public List<Rifornimento> getListaRifornimenti() {
		return totalitaRifornimento;
	}
	
	public void setGiacenzaAttiva(boolean b) {
		if(b == true) {
			inizioGiacenza = new Date();
		} else {
			fineGiacenza = new Date();
		}
	}
	
	@SuppressWarnings("unused")
	private long calcolaGiacenza() {
		return fineGiacenza.getTime() - inizioGiacenza.getTime();
	}
	
	public void aggiungiDiesel(int quantitaCarburante) {
		quantitaBenzina += quantitaCarburante;
	}
	
	public void aggiungiBenzina(int quantitaCarburante) {
		quantitaBenzina += quantitaCarburante;
	}
	
	public int getIntroitoTotale() {
		return introitoTotale;
	}
	
	public List<Rifornimento> getTotalitaRifornimento() {
		List<Rifornimento> rifornimenti = new ArrayList<Rifornimento>();
		
		for(Rifornimento r : this.totalitaRifornimento) {
			rifornimenti.add(r);
		}
		
		return rifornimenti;
	}
	
	
}
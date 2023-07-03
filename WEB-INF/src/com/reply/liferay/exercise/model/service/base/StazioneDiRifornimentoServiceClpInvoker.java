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

package com.reply.liferay.exercise.model.service.base;

import com.reply.liferay.exercise.model.service.StazioneDiRifornimentoServiceUtil;

import java.util.Arrays;

/**
 * @author s.girardello
 * @generated
 */
public class StazioneDiRifornimentoServiceClpInvoker {
	public StazioneDiRifornimentoServiceClpInvoker() {
		_methodName30 = "getBeanIdentifier";

		_methodParameterTypes30 = new String[] {  };

		_methodName31 = "setBeanIdentifier";

		_methodParameterTypes31 = new String[] { "java.lang.String" };

		_methodName36 = "getPrezzoBenzina";

		_methodParameterTypes36 = new String[] {  };

		_methodName37 = "getPrezzoDiesel";

		_methodParameterTypes37 = new String[] {  };

		_methodName38 = "aggiungiDenaro";

		_methodParameterTypes38 = new String[] { "int" };

		_methodName39 = "getDenaro";

		_methodParameterTypes39 = new String[] {  };

		_methodName40 = "reset";

		_methodParameterTypes40 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return StazioneDiRifornimentoServiceUtil.getBeanIdentifier();
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			StazioneDiRifornimentoServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName36.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes36, parameterTypes)) {
			return StazioneDiRifornimentoServiceUtil.getPrezzoBenzina();
		}

		if (_methodName37.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes37, parameterTypes)) {
			return StazioneDiRifornimentoServiceUtil.getPrezzoDiesel();
		}

		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			StazioneDiRifornimentoServiceUtil.aggiungiDenaro(((Integer)arguments[0]).intValue());

			return null;
		}

		if (_methodName39.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes39, parameterTypes)) {
			return StazioneDiRifornimentoServiceUtil.getDenaro();
		}

		if (_methodName40.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
			StazioneDiRifornimentoServiceUtil.reset();

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
}
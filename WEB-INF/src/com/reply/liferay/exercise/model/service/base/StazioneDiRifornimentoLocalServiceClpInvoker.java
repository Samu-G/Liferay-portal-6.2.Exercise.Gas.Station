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

import com.reply.liferay.exercise.model.service.StazioneDiRifornimentoLocalServiceUtil;

import java.util.Arrays;

/**
 * @author s.girardello
 * @generated
 */
public class StazioneDiRifornimentoLocalServiceClpInvoker {
	public StazioneDiRifornimentoLocalServiceClpInvoker() {
		_methodName0 = "addStazioneDiRifornimento";

		_methodParameterTypes0 = new String[] {
				"com.reply.liferay.exercise.model.model.StazioneDiRifornimento"
			};

		_methodName1 = "createStazioneDiRifornimento";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteStazioneDiRifornimento";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteStazioneDiRifornimento";

		_methodParameterTypes3 = new String[] {
				"com.reply.liferay.exercise.model.model.StazioneDiRifornimento"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchStazioneDiRifornimento";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "fetchStazioneDiRifornimentoByUuidAndCompanyId";

		_methodParameterTypes11 = new String[] { "java.lang.String", "long" };

		_methodName12 = "fetchStazioneDiRifornimentoByUuidAndGroupId";

		_methodParameterTypes12 = new String[] { "java.lang.String", "long" };

		_methodName13 = "getStazioneDiRifornimento";

		_methodParameterTypes13 = new String[] { "long" };

		_methodName14 = "getPersistedModel";

		_methodParameterTypes14 = new String[] { "java.io.Serializable" };

		_methodName15 = "getStazioneDiRifornimentoByUuidAndCompanyId";

		_methodParameterTypes15 = new String[] { "java.lang.String", "long" };

		_methodName16 = "getStazioneDiRifornimentoByUuidAndGroupId";

		_methodParameterTypes16 = new String[] { "java.lang.String", "long" };

		_methodName17 = "getStazioneDiRifornimentos";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "getStazioneDiRifornimentosCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updateStazioneDiRifornimento";

		_methodParameterTypes19 = new String[] {
				"com.reply.liferay.exercise.model.model.StazioneDiRifornimento"
			};

		_methodName50 = "getBeanIdentifier";

		_methodParameterTypes50 = new String[] {  };

		_methodName51 = "setBeanIdentifier";

		_methodParameterTypes51 = new String[] { "java.lang.String" };

		_methodName57 = "aggiuntaPompaDallAmministratore";

		_methodParameterTypes57 = new String[] {  };

		_methodName58 = "isStationUpAndRunning";

		_methodParameterTypes58 = new String[] {  };

		_methodName59 = "setStationUpAndRunning";

		_methodParameterTypes59 = new String[] { "boolean" };

		_methodName60 = "getPrezzoBenzina";

		_methodParameterTypes60 = new String[] {  };

		_methodName61 = "setPrezzoBenzina";

		_methodParameterTypes61 = new String[] { "float" };

		_methodName62 = "getPrezzoDiesel";

		_methodParameterTypes62 = new String[] {  };

		_methodName63 = "setPrezzoDiesel";

		_methodParameterTypes63 = new String[] { "float" };

		_methodName64 = "getBanconoteAccettate";

		_methodParameterTypes64 = new String[] {  };

		_methodName65 = "setBanconoteAccettate";

		_methodParameterTypes65 = new String[] { "int[][]" };

		_methodName66 = "getPompeInstallate";

		_methodParameterTypes66 = new String[] {  };

		_methodName67 = "setPompeInstallate";

		_methodParameterTypes67 = new String[] { "java.util.List" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.addStazioneDiRifornimento((com.reply.liferay.exercise.model.model.StazioneDiRifornimento)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.createStazioneDiRifornimento(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.deleteStazioneDiRifornimento(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.deleteStazioneDiRifornimento((com.reply.liferay.exercise.model.model.StazioneDiRifornimento)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.fetchStazioneDiRifornimento(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.fetchStazioneDiRifornimentoByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.fetchStazioneDiRifornimentoByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getStazioneDiRifornimento(((Long)arguments[0]).longValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getStazioneDiRifornimentoByUuidAndCompanyId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getStazioneDiRifornimentoByUuidAndGroupId((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue());
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getStazioneDiRifornimentos(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getStazioneDiRifornimentosCount();
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.updateStazioneDiRifornimento((com.reply.liferay.exercise.model.model.StazioneDiRifornimento)arguments[0]);
		}

		if (_methodName50.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName51.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName57.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.aggiuntaPompaDallAmministratore();

			return null;
		}

		if (_methodName58.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.isStationUpAndRunning();
		}

		if (_methodName59.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes59, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setStationUpAndRunning(((Boolean)arguments[0]).booleanValue());

			return null;
		}

		if (_methodName60.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes60, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getPrezzoBenzina();
		}

		if (_methodName61.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes61, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setPrezzoBenzina(((Float)arguments[0]).floatValue());

			return null;
		}

		if (_methodName62.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getPrezzoDiesel();
		}

		if (_methodName63.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setPrezzoDiesel(((Float)arguments[0]).floatValue());

			return null;
		}

		if (_methodName64.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes64, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getBanconoteAccettate();
		}

		if (_methodName65.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes65, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setBanconoteAccettate((int[])arguments[0]);

			return null;
		}

		if (_methodName66.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes66, parameterTypes)) {
			return StazioneDiRifornimentoLocalServiceUtil.getPompeInstallate();
		}

		if (_methodName67.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes67, parameterTypes)) {
			StazioneDiRifornimentoLocalServiceUtil.setPompeInstallate((java.util.List<com.reply.liferay.exercise.model.model.Pompa>)arguments[0]);

			return null;
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName58;
	private String[] _methodParameterTypes58;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
}
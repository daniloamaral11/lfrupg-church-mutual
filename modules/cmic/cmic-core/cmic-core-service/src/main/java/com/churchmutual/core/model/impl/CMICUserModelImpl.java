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

package com.churchmutual.core.model.impl;

import com.churchmutual.core.model.CMICUser;
import com.churchmutual.core.model.CMICUserModel;
import com.churchmutual.core.model.CMICUserSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CMICUser service. Represents a row in the &quot;cmic_CMICUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CMICUserModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CMICUserImpl}.
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICUserImpl
 * @generated
 */
@JSON(strict = true)
public class CMICUserModelImpl
	extends BaseModelImpl<CMICUser> implements CMICUserModel {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cmic user model instance should use the <code>CMICUser</code> interface instead.
	 */
	public static final String TABLE_NAME = "cmic_CMICUser";

	public static final Object[][] TABLE_COLUMNS = {
		{"cmicUserId", Types.BIGINT}, {"userId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("cmicUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table cmic_CMICUser (cmicUserId LONG not null primary key,userId LONG)";

	public static final String TABLE_SQL_DROP = "drop table cmic_CMICUser";

	public static final String ORDER_BY_JPQL =
		" ORDER BY cmicUser.cmicUserId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY cmic_CMICUser.cmicUserId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long USERID_COLUMN_BITMASK = 1L;

	public static final long CMICUSERID_COLUMN_BITMASK = 2L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CMICUser toModel(CMICUserSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CMICUser model = new CMICUserImpl();

		model.setCmicUserId(soapModel.getCmicUserId());
		model.setUserId(soapModel.getUserId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CMICUser> toModels(CMICUserSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CMICUser> models = new ArrayList<CMICUser>(soapModels.length);

		for (CMICUserSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public CMICUserModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _cmicUserId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCmicUserId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _cmicUserId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CMICUser.class;
	}

	@Override
	public String getModelClassName() {
		return CMICUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CMICUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CMICUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CMICUser, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((CMICUser)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CMICUser, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CMICUser, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CMICUser)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CMICUser, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CMICUser, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CMICUser>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CMICUser.class.getClassLoader(), CMICUser.class,
			ModelWrapper.class);

		try {
			Constructor<CMICUser> constructor =
				(Constructor<CMICUser>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<CMICUser, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CMICUser, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CMICUser, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CMICUser, Object>>();
		Map<String, BiConsumer<CMICUser, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CMICUser, ?>>();

		attributeGetterFunctions.put("cmicUserId", CMICUser::getCmicUserId);
		attributeSetterBiConsumers.put(
			"cmicUserId", (BiConsumer<CMICUser, Long>)CMICUser::setCmicUserId);
		attributeGetterFunctions.put("userId", CMICUser::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<CMICUser, Long>)CMICUser::setUserId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCmicUserId() {
		return _cmicUserId;
	}

	@Override
	public void setCmicUserId(long cmicUserId) {
		_cmicUserId = cmicUserId;
	}

	@Override
	public String getCmicUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getCmicUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setCmicUserUuid(String cmicUserUuid) {
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, CMICUser.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CMICUser toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, CMICUser>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CMICUserImpl cmicUserImpl = new CMICUserImpl();

		cmicUserImpl.setCmicUserId(getCmicUserId());
		cmicUserImpl.setUserId(getUserId());

		cmicUserImpl.resetOriginalValues();

		return cmicUserImpl;
	}

	@Override
	public int compareTo(CMICUser cmicUser) {
		long primaryKey = cmicUser.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CMICUser)) {
			return false;
		}

		CMICUser cmicUser = (CMICUser)obj;

		long primaryKey = cmicUser.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		CMICUserModelImpl cmicUserModelImpl = this;

		cmicUserModelImpl._originalUserId = cmicUserModelImpl._userId;

		cmicUserModelImpl._setOriginalUserId = false;

		cmicUserModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CMICUser> toCacheModel() {
		CMICUserCacheModel cmicUserCacheModel = new CMICUserCacheModel();

		cmicUserCacheModel.cmicUserId = getCmicUserId();

		cmicUserCacheModel.userId = getUserId();

		return cmicUserCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CMICUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CMICUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CMICUser, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CMICUser)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CMICUser, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CMICUser, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CMICUser, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CMICUser)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, CMICUser>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _cmicUserId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _columnBitmask;
	private CMICUser _escapedModel;

}
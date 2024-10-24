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

package com.churchmutual.core.service.base;

import com.churchmutual.core.model.CMICPermission;
import com.churchmutual.core.service.CMICPermissionLocalService;
import com.churchmutual.core.service.persistence.CMICPermissionPK;
import com.churchmutual.core.service.persistence.CMICPermissionPersistence;
import com.churchmutual.core.service.persistence.CMICUserPersistence;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cmic permission local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.churchmutual.core.service.impl.CMICPermissionLocalServiceImpl}.
 * </p>
 *
 * @author Kayleen Lim
 * @see com.churchmutual.core.service.impl.CMICPermissionLocalServiceImpl
 * @generated
 */
public abstract class CMICPermissionLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements CMICPermissionLocalService, AopService, IdentifiableOSGiService {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>CMICPermissionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.churchmutual.core.service.CMICPermissionLocalServiceUtil</code>.
	 */

	/**
	 * Adds the cmic permission to the database. Also notifies the appropriate model listeners.
	 *
	 * @param cmicPermission the cmic permission
	 * @return the cmic permission that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CMICPermission addCMICPermission(CMICPermission cmicPermission) {
		cmicPermission.setNew(true);

		return cmicPermissionPersistence.update(cmicPermission);
	}

	/**
	 * Creates a new cmic permission with the primary key. Does not add the cmic permission to the database.
	 *
	 * @param cmicPermissionPK the primary key for the new cmic permission
	 * @return the new cmic permission
	 */
	@Override
	@Transactional(enabled = false)
	public CMICPermission createCMICPermission(
		CMICPermissionPK cmicPermissionPK) {

		return cmicPermissionPersistence.create(cmicPermissionPK);
	}

	/**
	 * Deletes the cmic permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cmicPermissionPK the primary key of the cmic permission
	 * @return the cmic permission that was removed
	 * @throws PortalException if a cmic permission with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CMICPermission deleteCMICPermission(
			CMICPermissionPK cmicPermissionPK)
		throws PortalException {

		return cmicPermissionPersistence.remove(cmicPermissionPK);
	}

	/**
	 * Deletes the cmic permission from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cmicPermission the cmic permission
	 * @return the cmic permission that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public CMICPermission deleteCMICPermission(CMICPermission cmicPermission) {
		return cmicPermissionPersistence.remove(cmicPermission);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			CMICPermission.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return cmicPermissionPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.churchmutual.core.model.impl.CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return cmicPermissionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.churchmutual.core.model.impl.CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return cmicPermissionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return cmicPermissionPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return cmicPermissionPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public CMICPermission fetchCMICPermission(
		CMICPermissionPK cmicPermissionPK) {

		return cmicPermissionPersistence.fetchByPrimaryKey(cmicPermissionPK);
	}

	/**
	 * Returns the cmic permission with the primary key.
	 *
	 * @param cmicPermissionPK the primary key of the cmic permission
	 * @return the cmic permission
	 * @throws PortalException if a cmic permission with the primary key could not be found
	 */
	@Override
	public CMICPermission getCMICPermission(CMICPermissionPK cmicPermissionPK)
		throws PortalException {

		return cmicPermissionPersistence.findByPrimaryKey(cmicPermissionPK);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(cmicPermissionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CMICPermission.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("primaryKey.userId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			cmicPermissionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(CMICPermission.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"primaryKey.userId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(cmicPermissionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(CMICPermission.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("primaryKey.userId");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return cmicPermissionLocalService.deleteCMICPermission(
			(CMICPermission)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return cmicPermissionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the cmic permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.churchmutual.core.model.impl.CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @return the range of cmic permissions
	 */
	@Override
	public List<CMICPermission> getCMICPermissions(int start, int end) {
		return cmicPermissionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of cmic permissions.
	 *
	 * @return the number of cmic permissions
	 */
	@Override
	public int getCMICPermissionsCount() {
		return cmicPermissionPersistence.countAll();
	}

	/**
	 * Updates the cmic permission in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param cmicPermission the cmic permission
	 * @return the cmic permission that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public CMICPermission updateCMICPermission(CMICPermission cmicPermission) {
		return cmicPermissionPersistence.update(cmicPermission);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			CMICPermissionLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		cmicPermissionLocalService = (CMICPermissionLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return CMICPermissionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return CMICPermission.class;
	}

	protected String getModelClassName() {
		return CMICPermission.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = cmicPermissionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	protected CMICPermissionLocalService cmicPermissionLocalService;

	@Reference
	protected CMICPermissionPersistence cmicPermissionPersistence;

	@Reference
	protected CMICUserPersistence cmicUserPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.GroupLocalService
		groupLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}
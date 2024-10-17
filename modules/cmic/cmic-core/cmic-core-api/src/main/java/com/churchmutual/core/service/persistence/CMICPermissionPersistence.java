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

package com.churchmutual.core.service.persistence;

import com.churchmutual.core.exception.NoSuchCMICPermissionException;
import com.churchmutual.core.model.CMICPermission;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cmic permission service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICPermissionUtil
 * @generated
 */
@ProviderType
public interface CMICPermissionPersistence
	extends BasePersistence<CMICPermission> {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CMICPermissionUtil} to access the cmic permission persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cmic permission where userId = &#63; and cmicBusinessKey = &#63; and actionId = &#63; or throws a <code>NoSuchCMICPermissionException</code> if it could not be found.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param actionId the action ID
	 * @return the matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByU_C_A(
			long userId, String cmicBusinessKey, String actionId)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the cmic permission where userId = &#63; and cmicBusinessKey = &#63; and actionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param actionId the action ID
	 * @return the matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_C_A(
		long userId, String cmicBusinessKey, String actionId);

	/**
	 * Returns the cmic permission where userId = &#63; and cmicBusinessKey = &#63; and actionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param actionId the action ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_C_A(
		long userId, String cmicBusinessKey, String actionId,
		boolean useFinderCache);

	/**
	 * Removes the cmic permission where userId = &#63; and cmicBusinessKey = &#63; and actionId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param actionId the action ID
	 * @return the cmic permission that was removed
	 */
	public CMICPermission removeByU_C_A(
			long userId, String cmicBusinessKey, String actionId)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the number of cmic permissions where userId = &#63; and cmicBusinessKey = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param actionId the action ID
	 * @return the number of matching cmic permissions
	 */
	public int countByU_C_A(
		long userId, String cmicBusinessKey, String actionId);

	/**
	 * Returns all the cmic permissions where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @return the matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_C(
		long userId, String cmicBusinessKey);

	/**
	 * Returns a range of all the cmic permissions where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @return the range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_C(
		long userId, String cmicBusinessKey, int start, int end);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_C(
		long userId, String cmicBusinessKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_C(
		long userId, String cmicBusinessKey, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByU_C_First(
			long userId, String cmicBusinessKey,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_C_First(
		long userId, String cmicBusinessKey,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByU_C_Last(
			long userId, String cmicBusinessKey,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_C_Last(
		long userId, String cmicBusinessKey,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the cmic permissions before and after the current cmic permission in the ordered set where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param cmicPermissionPK the primary key of the current cmic permission
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cmic permission
	 * @throws NoSuchCMICPermissionException if a cmic permission with the primary key could not be found
	 */
	public CMICPermission[] findByU_C_PrevAndNext(
			CMICPermissionPK cmicPermissionPK, long userId,
			String cmicBusinessKey,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Removes all the cmic permissions where userId = &#63; and cmicBusinessKey = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 */
	public void removeByU_C(long userId, String cmicBusinessKey);

	/**
	 * Returns the number of cmic permissions where userId = &#63; and cmicBusinessKey = &#63;.
	 *
	 * @param userId the user ID
	 * @param cmicBusinessKey the cmic business key
	 * @return the number of matching cmic permissions
	 */
	public int countByU_C(long userId, String cmicBusinessKey);

	/**
	 * Returns all the cmic permissions where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @return the matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_A(
		long userId, String actionId);

	/**
	 * Returns a range of all the cmic permissions where userId = &#63; and actionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @return the range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_A(
		long userId, String actionId, int start, int end);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63; and actionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_A(
		long userId, String actionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63; and actionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByU_A(
		long userId, String actionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByU_A_First(
			long userId, String actionId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_A_First(
		long userId, String actionId,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByU_A_Last(
			long userId, String actionId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByU_A_Last(
		long userId, String actionId,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the cmic permissions before and after the current cmic permission in the ordered set where userId = &#63; and actionId = &#63;.
	 *
	 * @param cmicPermissionPK the primary key of the current cmic permission
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cmic permission
	 * @throws NoSuchCMICPermissionException if a cmic permission with the primary key could not be found
	 */
	public CMICPermission[] findByU_A_PrevAndNext(
			CMICPermissionPK cmicPermissionPK, long userId, String actionId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Removes all the cmic permissions where userId = &#63; and actionId = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 */
	public void removeByU_A(long userId, String actionId);

	/**
	 * Returns the number of cmic permissions where userId = &#63; and actionId = &#63;.
	 *
	 * @param userId the user ID
	 * @param actionId the action ID
	 * @return the number of matching cmic permissions
	 */
	public int countByU_A(long userId, String actionId);

	/**
	 * Returns all the cmic permissions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByUserId(long userId);

	/**
	 * Returns a range of all the cmic permissions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @return the range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cmic permissions where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cmic permissions
	 */
	public java.util.List<CMICPermission> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the first cmic permission in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission
	 * @throws NoSuchCMICPermissionException if a matching cmic permission could not be found
	 */
	public CMICPermission findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the last cmic permission in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cmic permission, or <code>null</code> if a matching cmic permission could not be found
	 */
	public CMICPermission fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns the cmic permissions before and after the current cmic permission in the ordered set where userId = &#63;.
	 *
	 * @param cmicPermissionPK the primary key of the current cmic permission
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cmic permission
	 * @throws NoSuchCMICPermissionException if a cmic permission with the primary key could not be found
	 */
	public CMICPermission[] findByUserId_PrevAndNext(
			CMICPermissionPK cmicPermissionPK, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
				orderByComparator)
		throws NoSuchCMICPermissionException;

	/**
	 * Removes all the cmic permissions where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of cmic permissions where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cmic permissions
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the cmic permission in the entity cache if it is enabled.
	 *
	 * @param cmicPermission the cmic permission
	 */
	public void cacheResult(CMICPermission cmicPermission);

	/**
	 * Caches the cmic permissions in the entity cache if it is enabled.
	 *
	 * @param cmicPermissions the cmic permissions
	 */
	public void cacheResult(java.util.List<CMICPermission> cmicPermissions);

	/**
	 * Creates a new cmic permission with the primary key. Does not add the cmic permission to the database.
	 *
	 * @param cmicPermissionPK the primary key for the new cmic permission
	 * @return the new cmic permission
	 */
	public CMICPermission create(CMICPermissionPK cmicPermissionPK);

	/**
	 * Removes the cmic permission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cmicPermissionPK the primary key of the cmic permission
	 * @return the cmic permission that was removed
	 * @throws NoSuchCMICPermissionException if a cmic permission with the primary key could not be found
	 */
	public CMICPermission remove(CMICPermissionPK cmicPermissionPK)
		throws NoSuchCMICPermissionException;

	public CMICPermission updateImpl(CMICPermission cmicPermission);

	/**
	 * Returns the cmic permission with the primary key or throws a <code>NoSuchCMICPermissionException</code> if it could not be found.
	 *
	 * @param cmicPermissionPK the primary key of the cmic permission
	 * @return the cmic permission
	 * @throws NoSuchCMICPermissionException if a cmic permission with the primary key could not be found
	 */
	public CMICPermission findByPrimaryKey(CMICPermissionPK cmicPermissionPK)
		throws NoSuchCMICPermissionException;

	/**
	 * Returns the cmic permission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cmicPermissionPK the primary key of the cmic permission
	 * @return the cmic permission, or <code>null</code> if a cmic permission with the primary key could not be found
	 */
	public CMICPermission fetchByPrimaryKey(CMICPermissionPK cmicPermissionPK);

	/**
	 * Returns all the cmic permissions.
	 *
	 * @return the cmic permissions
	 */
	public java.util.List<CMICPermission> findAll();

	/**
	 * Returns a range of all the cmic permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @return the range of cmic permissions
	 */
	public java.util.List<CMICPermission> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cmic permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cmic permissions
	 */
	public java.util.List<CMICPermission> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator);

	/**
	 * Returns an ordered range of all the cmic permissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>CMICPermissionModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of cmic permissions
	 * @param end the upper bound of the range of cmic permissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cmic permissions
	 */
	public java.util.List<CMICPermission> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CMICPermission>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cmic permissions from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cmic permissions.
	 *
	 * @return the number of cmic permissions
	 */
	public int countAll();

	public Set<String> getCompoundPKColumnNames();

}
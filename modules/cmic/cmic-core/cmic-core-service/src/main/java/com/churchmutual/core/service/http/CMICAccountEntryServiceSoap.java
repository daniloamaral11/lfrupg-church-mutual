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

package com.churchmutual.core.service.http;

import com.churchmutual.core.service.CMICAccountEntryServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>CMICAccountEntryServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Kayleen Lim
 * @see CMICAccountEntryServiceHttp
 * @generated
 */
public class CMICAccountEntryServiceSoap {

	public static com.churchmutual.core.model.CMICAccountEntryDisplay
			getCMICAccountEntryDisplay(
				com.churchmutual.core.model.CMICBusinessKey cmicBusinessKey)
		throws RemoteException {

		try {
			com.churchmutual.core.model.CMICAccountEntryDisplay returnValue =
				CMICAccountEntryServiceUtil.getCMICAccountEntryDisplay(
					cmicBusinessKey);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.churchmutual.core.model.CMICAccountEntryDisplay[]
			getCMICAccountEntryDisplays()
		throws RemoteException {

		try {
			java.util.List<com.churchmutual.core.model.CMICAccountEntryDisplay>
				returnValue =
					CMICAccountEntryServiceUtil.getCMICAccountEntryDisplays();

			return returnValue.toArray(
				new com.churchmutual.core.model.CMICAccountEntryDisplay
					[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static String getCMICAccountEntryDisplaysCacheStatus()
		throws RemoteException {

		try {
			String returnValue =
				CMICAccountEntryServiceUtil.
					getCMICAccountEntryDisplaysCacheStatus();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.churchmutual.core.model.CMICAccountEntryDisplay[]
			getCMICAccountEntryDisplaysWithAddresses()
		throws RemoteException {

		try {
			java.util.List<com.churchmutual.core.model.CMICAccountEntryDisplay>
				returnValue =
					CMICAccountEntryServiceUtil.
						getCMICAccountEntryDisplaysWithAddresses();

			return returnValue.toArray(
				new com.churchmutual.core.model.CMICAccountEntryDisplay
					[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.churchmutual.core.model.CMICAccountEntryDisplay[]
			getCMICAccountEntryDisplaysWithPermission(String actionId)
		throws RemoteException {

		try {
			java.util.List<com.churchmutual.core.model.CMICAccountEntryDisplay>
				returnValue =
					CMICAccountEntryServiceUtil.
						getCMICAccountEntryDisplaysWithPermission(actionId);

			return returnValue.toArray(
				new com.churchmutual.core.model.CMICAccountEntryDisplay
					[returnValue.size()]);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void refreshCMICAccountEntryDisplaysCache()
		throws RemoteException {

		try {
			CMICAccountEntryServiceUtil.refreshCMICAccountEntryDisplaysCache();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(
		CMICAccountEntryServiceSoap.class);

}
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

package com.liferay.commerce.account.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.account.constants.CommerceAccountConstants;
import com.liferay.commerce.account.model.CommerceAccount;
import com.liferay.commerce.account.service.CommerceAccountLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;

/**
 * @author Marco Leo
 * @author Alessio Antonio Rendina
 */
@ProviderType
public class CommerceAccountImpl extends CommerceAccountBaseImpl {

	public CommerceAccountImpl() {
	}

	@Override
	public Group getCommerceAccountGroup() throws PortalException {
		return CommerceAccountLocalServiceUtil.getCommerceAccountGroup(
			getCommerceAccountId());
	}

	@Override
	public long getCommerceAccountGroupId() throws PortalException {
		Group group = CommerceAccountLocalServiceUtil.getCommerceAccountGroup(
			getCommerceAccountId());

		return group.getGroupId();
	}

	@Override
	public CommerceAccount getParentCommerceAccount() throws PortalException {
		if (getParentCommerceAccountId() ==
				CommerceAccountConstants.DEFAULT_PARENT_ACCOUNT_ID) {

			return null;
		}

		return CommerceAccountLocalServiceUtil.getCommerceAccount(
			getParentCommerceAccountId());
	}

	@Override
	public boolean isRoot() {
		if (getParentCommerceAccountId() ==
				CommerceAccountConstants.DEFAULT_PARENT_ACCOUNT_ID) {

			return true;
		}

		return false;
	}

}
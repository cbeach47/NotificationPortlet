/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portlet.notice.service;

import javax.portlet.PortletRequest;

import org.jasig.portlet.notice.response.NotificationResponse;

/**
 * This is the central interface of the Notifications API.  It is used to
 * retrieve notifications from data sources.
 */
public interface INotificationService {

	/**
	 * Returns the name of the service, which should be unique in the portlet app.
	 *
	 * @return A unique name for this service
	 */
	public String getName();

    /**
     * Provide the current collection of Notifications information for the user 
     * represented by the <code>PortletRequest</code>.
     *
     * @param req The <code>PortletRequest</code>
     * @param refresh If <code>true</code>, indicated that cached information 
     * should be invalidated
     * @return A collection of notifications and/or errors
     */
    public NotificationResponse getNotifications(PortletRequest req, boolean refresh);

}
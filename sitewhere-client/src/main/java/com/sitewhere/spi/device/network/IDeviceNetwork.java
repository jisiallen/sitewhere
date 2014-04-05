/*
 * IDeviceNetwork.java 
 * --------------------------------------------------------------------------------------
 * Copyright (c) Reveal Technologies, LLC. All rights reserved. http://www.reveal-tech.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.device.network;

import com.sitewhere.spi.common.IMetadataProviderEntity;

/**
 * Interface for a network of related devices.
 * 
 * @author Derek
 */
public interface IDeviceNetwork extends IMetadataProviderEntity {

	/**
	 * Get the unique network token.
	 * 
	 * @return
	 */
	public String getToken();

	/**
	 * Get the network name.
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * Get the network description.
	 * 
	 * @return
	 */
	public String getDescription();
}
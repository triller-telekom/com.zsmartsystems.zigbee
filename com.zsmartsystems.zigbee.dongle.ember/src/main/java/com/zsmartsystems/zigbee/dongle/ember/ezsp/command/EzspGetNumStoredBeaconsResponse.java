/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;

/**
 * Class to implement the Ember EZSP command <b>getNumStoredBeacons</b>.
 * <p>
 * Returns the number of cached beacons that have been collected from a scan.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetNumStoredBeaconsResponse extends EzspFrameResponse {
    public static final int FRAME_ID = 0x08;

    /**
     * The number of cached beacons that have been collected from a scan.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int numBeacons;

    /**
     * Response and Handler constructor
     */
    public EzspGetNumStoredBeaconsResponse(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        numBeacons = deserializer.deserializeUInt8();
    }

    /**
     * The number of cached beacons that have been collected from a scan.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current numBeacons as {@link int}
     */
    public int getNumBeacons() {
        return numBeacons;
    }

    /**
     * The number of cached beacons that have been collected from a scan.
     *
     * @param numBeacons the numBeacons to set as {@link int}
     */
    public void setNumBeacons(int numBeacons) {
        this.numBeacons = numBeacons;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(84);
        builder.append("EzspGetNumStoredBeaconsResponse [networkId=");
        builder.append(networkId);
        builder.append(", numBeacons=");
        builder.append(numBeacons);
        builder.append(']');
        return builder.toString();
    }
}

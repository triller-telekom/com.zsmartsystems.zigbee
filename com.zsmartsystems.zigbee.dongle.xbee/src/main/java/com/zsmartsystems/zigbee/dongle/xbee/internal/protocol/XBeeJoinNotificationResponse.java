/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import com.zsmartsystems.zigbee.dongle.xbee.internal.protocol.CommandStatus;

/**
 * Class to implement the XBee command <b>Join Notification</b>.
 * <p>
 * AT Command <b>JN</b></p>Set or read the join notification setting. If enabled, the device
 * transmits a broadcast node identification packet on power up and when joining. This action
 * blinks the Associate LED rapidly on all devices that receive the transmission, and sends an
 * API frame out the serial port of API devices. Digi recommends you disable this feature for
 * large networks to prevent excessive broadcasts.
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeJoinNotificationResponse extends XBeeFrame implements XBeeResponse {
    /**
     * Response field
     */
    private Integer frameId;

    /**
     * Response field
     */
    private CommandStatus commandStatus;

    /**
     * Response field
     */
    private Boolean enableNotification;

    /**
     *
     * @return the frameId as {@link Integer}
     */
    public Integer getFrameId() {
        return frameId;
    }

    /**
     *
     * @return the commandStatus as {@link CommandStatus}
     */
    public CommandStatus getCommandStatus() {
        return commandStatus;
    }

    /**
     *
     * @return the enableNotification as {@link Boolean}
     */
    public Boolean getEnableNotification() {
        return enableNotification;
    }


    @Override
    public void deserialize(int[] incomingData) {
        initialiseDeserializer(incomingData);

        // Deserialize the fields for the response

        // Deserialize field "Frame ID"
        frameId = deserializeInt8();
        deserializeAtCommand();

        // Deserialize field "Command Status"
        commandStatus = deserializeCommandStatus();
        if (commandStatus != CommandStatus.OK) {
            return;
        }

        // Deserialize field "Enable Notification"
        enableNotification = deserializeBoolean();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(478);
        builder.append("XBeeJoinNotificationResponse [frameId=");
        builder.append(frameId);
        builder.append(", commandStatus=");
        builder.append(commandStatus);
        if (commandStatus == CommandStatus.OK) {
            builder.append(", enableNotification=");
            builder.append(enableNotification);
        }
        builder.append(']');
        return builder.toString();
    }
}

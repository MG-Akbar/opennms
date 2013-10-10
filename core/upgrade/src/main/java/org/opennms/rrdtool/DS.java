/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/
package org.opennms.rrdtool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The Class DS.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class DS {

    /** The name. */
    private String name;

    /** The type. */
    private String type;

    /** The minimum heartbeat. */
    private Integer minHeartbeat = 0;

    /** The minimum. */
    private Double min = Double.NaN;

    /** The maximum. */
    private Double max = Double.NaN;

    /** The last data source. */
    private Long lastDs;

    /** The value. */
    private Double value = 0.0;

    /** The unknown seconds. */
    private Integer unknownSec = 0;

    /**
     * Gets the name.
     *
     * @return the name
     */
    @XmlElement
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    @XmlElement
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * Gets the min heartbeat.
     *
     * @return the min heartbeat
     */
    @XmlElement(name="minimal_heartbeat")
    public Integer getMinHeartbeat() {
        return minHeartbeat;
    }

    /**
     * Sets the min heartbeat.
     *
     * @param minHeartbeat the new min heartbeat
     */
    public void setMinHeartbeat(Integer minHeartbeat) {
        this.minHeartbeat = minHeartbeat;
    }

    /**
     * Gets the min.
     *
     * @return the min
     */
    @XmlElement
    public Double getMin() {
        return min;
    }

    /**
     * Sets the min.
     *
     * @param min the new min
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * Gets the max.
     *
     * @return the max
     */
    @XmlElement
    public Double getMax() {
        return max;
    }

    /**
     * Sets the max.
     *
     * @param max the new max
     */
    public void setMax(Double max) {
        this.max = max;
    }

    /**
     * Gets the last data source.
     *
     * @return the last data source
     */
    @XmlElement(name="last_ds")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public Long getLastDs() {
        return lastDs;
    }

    /**
     * Sets the last data source.
     *
     * @param lastDs the new last data source
     */
    public void setLastDs(Long lastDs) {
        this.lastDs = lastDs;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    @XmlElement
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the unknown seconds.
     *
     * @return the unknown seconds
     */
    @XmlElement(name="unknown_sec")
    public Integer getUnknownSec() {
        return unknownSec;
    }

    /**
     * Sets the unknown seconds.
     *
     * @param unknownSec the new unknown seconds
     */
    public void setUnknownSec(Integer unknownSec) {
        this.unknownSec = unknownSec;
    }

    /**
     * Format equals.
     *
     * @param ds the DS object
     * @return true, if successful
     */
    public boolean formatEquals(DS ds) {
        if (this.name != null) {
            if (ds.name == null) return false;
            else if (!(this.name.equals(ds.name))) 
                return false;
        }
        else if (ds.name != null)
            return false;

        if (this.type != null) {
            if (ds.type == null) return false;
            else if (!(this.type.equals(ds.type))) 
                return false;
        }
        else if (ds.type != null)
            return false;

        if (this.minHeartbeat != null) {
            if (ds.minHeartbeat == null) return false;
            else if (!(this.minHeartbeat.equals(ds.minHeartbeat))) 
                return false;
        }
        else if (ds.minHeartbeat != null)
            return false;

        if (this.min != null) {
            if (ds.min == null) return false;
            else if (!(this.min.equals(ds.min))) 
                return false;
        }
        else if (ds.min != null)
            return false;

        if (this.max != null) {
            if (ds.max == null) return false;
            else if (!(this.max.equals(ds.max))) 
                return false;
        }
        else if (ds.max != null)
            return false;

        return true;
    }
}
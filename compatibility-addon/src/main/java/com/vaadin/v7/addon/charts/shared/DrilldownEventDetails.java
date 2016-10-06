package com.vaadin.v7.addon.charts.shared;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 *
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 *
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import java.io.Serializable;

/**
 * Helper class to store and transfer drilldown event details.
 */
public class DrilldownEventDetails implements Serializable {

    private DrilldownPointDetails point;

    public DrilldownEventDetails() {
    }

    public DrilldownPointDetails getPoint() {
        return point;
    }

    public void setPoint(DrilldownPointDetails point) {
        this.point = point;
    }

}
package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class ElectronicHorizonOptions implements Serializable {
    private final AlertsServiceOptions alertsService;
    private final double branchLength;
    private final boolean doNotRecalculateInUncertainState;
    private final boolean enableEnhancedDataAlongEH;
    private final byte expansion;
    private final double length;
    private final Double minTimeDeltaBetweenUpdates;

    public AlertsServiceOptions getAlertsService() {
        return this.alertsService;
    }

    public double getBranchLength() {
        return this.branchLength;
    }

    public boolean getDoNotRecalculateInUncertainState() {
        return this.doNotRecalculateInUncertainState;
    }

    public boolean getEnableEnhancedDataAlongEH() {
        return this.enableEnhancedDataAlongEH;
    }

    public byte getExpansion() {
        return this.expansion;
    }

    public double getLength() {
        return this.length;
    }

    public Double getMinTimeDeltaBetweenUpdates() {
        return this.minTimeDeltaBetweenUpdates;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ElectronicHorizonOptions(double d, boolean z, Double d2, AlertsServiceOptions alertsServiceOptions) {
        this.length = d;
        this.doNotRecalculateInUncertainState = z;
        this.minTimeDeltaBetweenUpdates = d2;
        this.alertsService = alertsServiceOptions;
        this.expansion = (byte) 0;
        this.branchLength = 1.0d;
        this.enableEnhancedDataAlongEH = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[length: ");
        m1$$ExternalSyntheticOutline0.m(this.length, ", expansion: ", sb);
        MediaSessionCompatQueueItem.serializer(this.expansion, sb, ", branchLength: ");
        m1$$ExternalSyntheticOutline0.m(this.branchLength, ", doNotRecalculateInUncertainState: ", sb);
        MediaSessionCompatQueueItem.write(sb, this.doNotRecalculateInUncertainState, ", minTimeDeltaBetweenUpdates: ");
        af$$ExternalSyntheticOutline1.m(this.minTimeDeltaBetweenUpdates, sb, ", alertsService: ");
        sb.append(RecordUtils.fieldToString(this.alertsService));
        sb.append(", enableEnhancedDataAlongEH: ");
        return ff$$ExternalSyntheticOutline0.m(this.enableEnhancedDataAlongEH, sb, "]");
    }

    public int hashCode() {
        double d = this.length;
        byte b = this.expansion;
        double d2 = this.branchLength;
        boolean z = this.doNotRecalculateInUncertainState;
        return Objects.hash(Double.valueOf(d), Byte.valueOf(b), Double.valueOf(d2), Boolean.valueOf(z), this.minTimeDeltaBetweenUpdates, this.alertsService, Boolean.valueOf(this.enableEnhancedDataAlongEH));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElectronicHorizonOptions electronicHorizonOptions = (ElectronicHorizonOptions) obj;
        return PartialEq.compare(this.length, electronicHorizonOptions.length) && this.expansion == electronicHorizonOptions.expansion && PartialEq.compare(this.branchLength, electronicHorizonOptions.branchLength) && this.doNotRecalculateInUncertainState == electronicHorizonOptions.doNotRecalculateInUncertainState && Objects.equals(this.minTimeDeltaBetweenUpdates, electronicHorizonOptions.minTimeDeltaBetweenUpdates) && Objects.equals(this.alertsService, electronicHorizonOptions.alertsService) && this.enableEnhancedDataAlongEH == electronicHorizonOptions.enableEnhancedDataAlongEH;
    }

    public ElectronicHorizonOptions(double d, byte b, double d2, boolean z, Double d3, AlertsServiceOptions alertsServiceOptions, boolean z2) {
        this.length = d;
        this.expansion = b;
        this.branchLength = d2;
        this.doNotRecalculateInUncertainState = z;
        this.minTimeDeltaBetweenUpdates = d3;
        this.alertsService = alertsServiceOptions;
        this.enableEnhancedDataAlongEH = z2;
    }
}

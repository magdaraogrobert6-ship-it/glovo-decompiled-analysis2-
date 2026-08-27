package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigProfileshortTypeOptions implements Serializable {
    private final boolean curvature;
    private final boolean headingChange;
    private final boolean historyAverageSpeed;
    private final boolean roadCondition;
    private final boolean slopeLinear;
    private final boolean slopeStep;
    private final boolean variableSpeedSign;

    public boolean getCurvature() {
        return this.curvature;
    }

    public boolean getHeadingChange() {
        return this.headingChange;
    }

    public boolean getHistoryAverageSpeed() {
        return this.historyAverageSpeed;
    }

    public boolean getRoadCondition() {
        return this.roadCondition;
    }

    public boolean getSlopeLinear() {
        return this.slopeLinear;
    }

    public boolean getSlopeStep() {
        return this.slopeStep;
    }

    public boolean getVariableSpeedSign() {
        return this.variableSpeedSign;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfileshortTypeOptions() {
        this.slopeStep = true;
        this.slopeLinear = false;
        this.curvature = true;
        this.roadCondition = true;
        this.variableSpeedSign = true;
        this.headingChange = true;
        this.historyAverageSpeed = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[slopeStep: ");
        MediaSessionCompatQueueItem.write(sb, this.slopeStep, ", slopeLinear: ");
        MediaSessionCompatQueueItem.write(sb, this.slopeLinear, ", curvature: ");
        MediaSessionCompatQueueItem.write(sb, this.curvature, ", roadCondition: ");
        MediaSessionCompatQueueItem.write(sb, this.roadCondition, ", variableSpeedSign: ");
        MediaSessionCompatQueueItem.write(sb, this.variableSpeedSign, ", headingChange: ");
        MediaSessionCompatQueueItem.write(sb, this.headingChange, ", historyAverageSpeed: ");
        return ff$$ExternalSyntheticOutline0.m(this.historyAverageSpeed, sb, "]");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.slopeStep), Boolean.valueOf(this.slopeLinear), Boolean.valueOf(this.curvature), Boolean.valueOf(this.roadCondition), Boolean.valueOf(this.variableSpeedSign), Boolean.valueOf(this.headingChange), Boolean.valueOf(this.historyAverageSpeed));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions = (AdasisConfigProfileshortTypeOptions) obj;
        return this.slopeStep == adasisConfigProfileshortTypeOptions.slopeStep && this.slopeLinear == adasisConfigProfileshortTypeOptions.slopeLinear && this.curvature == adasisConfigProfileshortTypeOptions.curvature && this.roadCondition == adasisConfigProfileshortTypeOptions.roadCondition && this.variableSpeedSign == adasisConfigProfileshortTypeOptions.variableSpeedSign && this.headingChange == adasisConfigProfileshortTypeOptions.headingChange && this.historyAverageSpeed == adasisConfigProfileshortTypeOptions.historyAverageSpeed;
    }

    public AdasisConfigProfileshortTypeOptions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.slopeStep = z;
        this.slopeLinear = z2;
        this.curvature = z3;
        this.roadCondition = z4;
        this.variableSpeedSign = z5;
        this.headingChange = z6;
        this.historyAverageSpeed = z7;
    }
}

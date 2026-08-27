package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class PollingConfig implements Serializable {
    private Double lookAhead;
    private Double unconditionalInterval;
    private Double unconditionalPatience;

    public Double getLookAhead() {
        return this.lookAhead;
    }

    public Double getUnconditionalInterval() {
        return this.unconditionalInterval;
    }

    public Double getUnconditionalPatience() {
        return this.unconditionalPatience;
    }

    public void setLookAhead(Double d) {
        this.lookAhead = d;
    }

    public void setUnconditionalInterval(Double d) {
        this.unconditionalInterval = d;
    }

    public void setUnconditionalPatience(Double d) {
        this.unconditionalPatience = d;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.lookAhead, this.unconditionalPatience, this.unconditionalInterval);
    }

    public PollingConfig(Double d, Double d2, Double d3) {
        this.lookAhead = d;
        this.unconditionalPatience = d2;
        this.unconditionalInterval = d3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[lookAhead: ");
        af$$ExternalSyntheticOutline1.m(this.lookAhead, sb, ", unconditionalPatience: ");
        af$$ExternalSyntheticOutline1.m(this.unconditionalPatience, sb, ", unconditionalInterval: ");
        sb.append(RecordUtils.fieldToString(this.unconditionalInterval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PollingConfig pollingConfig = (PollingConfig) obj;
        return Objects.equals(this.lookAhead, pollingConfig.lookAhead) && Objects.equals(this.unconditionalPatience, pollingConfig.unconditionalPatience) && Objects.equals(this.unconditionalInterval, pollingConfig.unconditionalInterval);
    }
}

package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class RawGnssData implements Serializable {
    private final Double edop;
    private final Double gdop;
    private final Double hdop;
    private final long monotonicTimestampNanoseconds;
    private final Double ndop;
    private final Double pdop;
    private final List<RawGnssSatelliteData> satellites;
    private final Double tdop;
    private final Double vdop;

    public Double getEdop() {
        return this.edop;
    }

    public Double getGdop() {
        return this.gdop;
    }

    public Double getHdop() {
        return this.hdop;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public Double getNdop() {
        return this.ndop;
    }

    public Double getPdop() {
        return this.pdop;
    }

    public List<RawGnssSatelliteData> getSatellites() {
        return this.satellites;
    }

    public Double getTdop() {
        return this.tdop;
    }

    public Double getVdop() {
        return this.vdop;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.gdop, this.pdop, this.tdop, this.vdop, this.hdop, this.ndop, this.edop, this.satellites, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public RawGnssData(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, List<RawGnssSatelliteData> list, long j) {
        this.gdop = d;
        this.pdop = d2;
        this.tdop = d3;
        this.vdop = d4;
        this.hdop = d5;
        this.ndop = d6;
        this.edop = d7;
        this.satellites = list;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[gdop: ");
        af$$ExternalSyntheticOutline1.m(this.gdop, sb, ", pdop: ");
        af$$ExternalSyntheticOutline1.m(this.pdop, sb, ", tdop: ");
        af$$ExternalSyntheticOutline1.m(this.tdop, sb, ", vdop: ");
        af$$ExternalSyntheticOutline1.m(this.vdop, sb, ", hdop: ");
        af$$ExternalSyntheticOutline1.m(this.hdop, sb, ", ndop: ");
        af$$ExternalSyntheticOutline1.m(this.ndop, sb, ", edop: ");
        af$$ExternalSyntheticOutline1.m(this.edop, sb, ", satellites: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.satellites, ", monotonicTimestampNanoseconds: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGnssData rawGnssData = (RawGnssData) obj;
        return Objects.equals(this.gdop, rawGnssData.gdop) && Objects.equals(this.pdop, rawGnssData.pdop) && Objects.equals(this.tdop, rawGnssData.tdop) && Objects.equals(this.vdop, rawGnssData.vdop) && Objects.equals(this.hdop, rawGnssData.hdop) && Objects.equals(this.ndop, rawGnssData.ndop) && Objects.equals(this.edop, rawGnssData.edop) && Objects.equals(this.satellites, rawGnssData.satellites) && this.monotonicTimestampNanoseconds == rawGnssData.monotonicTimestampNanoseconds;
    }
}

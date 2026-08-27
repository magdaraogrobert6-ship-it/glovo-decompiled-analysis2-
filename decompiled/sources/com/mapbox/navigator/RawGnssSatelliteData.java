package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public class RawGnssSatelliteData implements Serializable {
    private final Float azimuthDegrees;
    private final Double basebandCn0DbHz;
    private final Float carrierFrequencyHz;
    private final Double cn0DbHz;
    private final ConstellationType constellationType;
    private final Float elevationDegrees;
    private final Boolean hasAlmanacData;
    private final Boolean hasEphemerisData;
    private final Double residual;
    private final int svid;
    private final Boolean usedInFix;

    public Float getAzimuthDegrees() {
        return this.azimuthDegrees;
    }

    public Double getBasebandCn0DbHz() {
        return this.basebandCn0DbHz;
    }

    public Float getCarrierFrequencyHz() {
        return this.carrierFrequencyHz;
    }

    public Double getCn0DbHz() {
        return this.cn0DbHz;
    }

    public ConstellationType getConstellationType() {
        return this.constellationType;
    }

    public Float getElevationDegrees() {
        return this.elevationDegrees;
    }

    public Boolean getHasAlmanacData() {
        return this.hasAlmanacData;
    }

    public Boolean getHasEphemerisData() {
        return this.hasEphemerisData;
    }

    public Double getResidual() {
        return this.residual;
    }

    public int getSvid() {
        return this.svid;
    }

    public Boolean getUsedInFix() {
        return this.usedInFix;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RawGnssSatelliteData(int i, Float f, Double d, Double d2, Boolean bool, Boolean bool2, Boolean bool3, ConstellationType constellationType, Float f2, Float f3, Double d3) {
        this.svid = i;
        this.carrierFrequencyHz = f;
        this.basebandCn0DbHz = d;
        this.cn0DbHz = d2;
        this.usedInFix = bool;
        this.hasEphemerisData = bool2;
        this.hasAlmanacData = bool3;
        this.constellationType = constellationType;
        this.azimuthDegrees = f2;
        this.elevationDegrees = f3;
        this.residual = d3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[svid: ");
        IconCompatParcelizer.write(this.svid, ", carrierFrequencyHz: ", sb);
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.carrierFrequencyHz, sb, ", basebandCn0DbHz: ");
        af$$ExternalSyntheticOutline1.m(this.basebandCn0DbHz, sb, ", cn0DbHz: ");
        af$$ExternalSyntheticOutline1.m(this.cn0DbHz, sb, ", usedInFix: ");
        getBitmapFromCache.write(sb, ", hasEphemerisData: ", this.usedInFix);
        getBitmapFromCache.write(sb, ", hasAlmanacData: ", this.hasEphemerisData);
        getBitmapFromCache.write(sb, ", constellationType: ", this.hasAlmanacData);
        sb.append(RecordUtils.fieldToString(this.constellationType));
        sb.append(", azimuthDegrees: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.azimuthDegrees, sb, ", elevationDegrees: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.elevationDegrees, sb, ", residual: ");
        sb.append(RecordUtils.fieldToString(this.residual));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int i = this.svid;
        return Objects.hash(Integer.valueOf(i), this.carrierFrequencyHz, this.basebandCn0DbHz, this.cn0DbHz, this.usedInFix, this.hasEphemerisData, this.hasAlmanacData, this.constellationType, this.azimuthDegrees, this.elevationDegrees, this.residual);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RawGnssSatelliteData rawGnssSatelliteData = (RawGnssSatelliteData) obj;
        return this.svid == rawGnssSatelliteData.svid && Objects.equals(this.carrierFrequencyHz, rawGnssSatelliteData.carrierFrequencyHz) && Objects.equals(this.basebandCn0DbHz, rawGnssSatelliteData.basebandCn0DbHz) && Objects.equals(this.cn0DbHz, rawGnssSatelliteData.cn0DbHz) && Objects.equals(this.usedInFix, rawGnssSatelliteData.usedInFix) && Objects.equals(this.hasEphemerisData, rawGnssSatelliteData.hasEphemerisData) && Objects.equals(this.hasAlmanacData, rawGnssSatelliteData.hasAlmanacData) && Objects.equals(this.constellationType, rawGnssSatelliteData.constellationType) && Objects.equals(this.azimuthDegrees, rawGnssSatelliteData.azimuthDegrees) && Objects.equals(this.elevationDegrees, rawGnssSatelliteData.elevationDegrees) && Objects.equals(this.residual, rawGnssSatelliteData.residual);
    }
}

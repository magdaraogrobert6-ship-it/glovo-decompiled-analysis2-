package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class Profileshort implements Serializable {
    private final boolean bandwidthEnabled;
    private final short minDistanceBetweenCurvatures;
    private final AdasisConfigMessageOptions options;
    private final AdasisConfigProfileshortTypeOptions types;

    public boolean getBandwidthEnabled() {
        return this.bandwidthEnabled;
    }

    public short getMinDistanceBetweenCurvatures() {
        return this.minDistanceBetweenCurvatures;
    }

    public AdasisConfigMessageOptions getOptions() {
        return this.options;
    }

    public AdasisConfigProfileshortTypeOptions getTypes() {
        return this.types;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.options, this.types, Short.valueOf(this.minDistanceBetweenCurvatures), Boolean.valueOf(this.bandwidthEnabled));
    }

    public Profileshort(AdasisConfigMessageOptions adasisConfigMessageOptions, AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions) {
        this.options = adasisConfigMessageOptions;
        this.types = adasisConfigProfileshortTypeOptions;
        this.minDistanceBetweenCurvatures = (short) 0;
        this.bandwidthEnabled = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[options: ");
        sb.append(RecordUtils.fieldToString(this.options));
        sb.append(", types: ");
        sb.append(RecordUtils.fieldToString(this.types));
        sb.append(", minDistanceBetweenCurvatures: ");
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.minDistanceBetweenCurvatures)));
        sb.append(", bandwidthEnabled: ");
        return ff$$ExternalSyntheticOutline0.m(this.bandwidthEnabled, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Profileshort profileshort = (Profileshort) obj;
        return Objects.equals(this.options, profileshort.options) && Objects.equals(this.types, profileshort.types) && this.minDistanceBetweenCurvatures == profileshort.minDistanceBetweenCurvatures && this.bandwidthEnabled == profileshort.bandwidthEnabled;
    }

    public Profileshort(AdasisConfigMessageOptions adasisConfigMessageOptions, AdasisConfigProfileshortTypeOptions adasisConfigProfileshortTypeOptions, short s, boolean z) {
        this.options = adasisConfigMessageOptions;
        this.types = adasisConfigProfileshortTypeOptions;
        this.minDistanceBetweenCurvatures = s;
        this.bandwidthEnabled = z;
    }
}

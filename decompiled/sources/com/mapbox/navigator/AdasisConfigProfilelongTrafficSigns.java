package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigProfilelongTrafficSigns implements Serializable {
    private final byte customConditionForTrailer;
    private final byte profileType;
    private final AdasisConfigProfilelongTrafficSignIds trafficSignIds;

    public byte getCustomConditionForTrailer() {
        return this.customConditionForTrailer;
    }

    public byte getProfileType() {
        return this.profileType;
    }

    public AdasisConfigProfilelongTrafficSignIds getTrafficSignIds() {
        return this.trafficSignIds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigProfilelongTrafficSigns(AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds) {
        this.trafficSignIds = adasisConfigProfilelongTrafficSignIds;
        this.profileType = (byte) 8;
        this.customConditionForTrailer = (byte) 14;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[profileType: ");
        MediaSessionCompatQueueItem.serializer(this.profileType, sb, ", trafficSignIds: ");
        sb.append(RecordUtils.fieldToString(this.trafficSignIds));
        sb.append(", customConditionForTrailer: ");
        sb.append(RecordUtils.fieldToString(Byte.valueOf(this.customConditionForTrailer)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        byte b = this.profileType;
        return Objects.hash(Byte.valueOf(b), this.trafficSignIds, Byte.valueOf(this.customConditionForTrailer));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTrafficSigns adasisConfigProfilelongTrafficSigns = (AdasisConfigProfilelongTrafficSigns) obj;
        return this.profileType == adasisConfigProfilelongTrafficSigns.profileType && Objects.equals(this.trafficSignIds, adasisConfigProfilelongTrafficSigns.trafficSignIds) && this.customConditionForTrailer == adasisConfigProfilelongTrafficSigns.customConditionForTrailer;
    }

    public AdasisConfigProfilelongTrafficSigns(byte b, AdasisConfigProfilelongTrafficSignIds adasisConfigProfilelongTrafficSignIds, byte b2) {
        this.profileType = b;
        this.trafficSignIds = adasisConfigProfilelongTrafficSignIds;
        this.customConditionForTrailer = b2;
    }
}

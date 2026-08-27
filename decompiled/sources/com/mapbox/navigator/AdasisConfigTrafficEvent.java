package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigTrafficEvent implements Serializable {
    private final byte profileType;
    private final int radius;
    private final AdasisConfigProfilelongTrafficEventIds trafficEventIds;

    public byte getProfileType() {
        return this.profileType;
    }

    public int getRadius() {
        return this.radius;
    }

    public AdasisConfigProfilelongTrafficEventIds getTrafficEventIds() {
        return this.trafficEventIds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AdasisConfigTrafficEvent(AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds) {
        this.trafficEventIds = adasisConfigProfilelongTrafficEventIds;
        this.profileType = (byte) 19;
        this.radius = 1000;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[profileType: ");
        MediaSessionCompatQueueItem.serializer(this.profileType, sb, ", trafficEventIds: ");
        sb.append(RecordUtils.fieldToString(this.trafficEventIds));
        sb.append(", radius: ");
        return SweepGradientShader9KIMszodefault.serializer(this.radius, "]", sb);
    }

    public int hashCode() {
        byte b = this.profileType;
        return Objects.hash(Byte.valueOf(b), this.trafficEventIds, Integer.valueOf(this.radius));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigTrafficEvent adasisConfigTrafficEvent = (AdasisConfigTrafficEvent) obj;
        return this.profileType == adasisConfigTrafficEvent.profileType && Objects.equals(this.trafficEventIds, adasisConfigTrafficEvent.trafficEventIds) && this.radius == adasisConfigTrafficEvent.radius;
    }

    public AdasisConfigTrafficEvent(byte b, AdasisConfigProfilelongTrafficEventIds adasisConfigProfilelongTrafficEventIds, int i) {
        this.profileType = b;
        this.trafficEventIds = adasisConfigProfilelongTrafficEventIds;
        this.radius = i;
    }
}

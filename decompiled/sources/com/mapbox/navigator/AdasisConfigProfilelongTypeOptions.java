package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigProfilelongTypeOptions implements Serializable {
    private final AdasisConfigCustomTrafficEvents customEvents;
    private final AdasisConfigLonLat lonLat;
    private final AdasisConfigProfilelongTrafficSigns trafficSigns;

    public AdasisConfigCustomTrafficEvents getCustomEvents() {
        return this.customEvents;
    }

    public AdasisConfigLonLat getLonLat() {
        return this.lonLat;
    }

    public AdasisConfigProfilelongTrafficSigns getTrafficSigns() {
        return this.trafficSigns;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.lonLat, this.trafficSigns, this.customEvents);
    }

    public AdasisConfigProfilelongTypeOptions(AdasisConfigLonLat adasisConfigLonLat, AdasisConfigProfilelongTrafficSigns adasisConfigProfilelongTrafficSigns, AdasisConfigCustomTrafficEvents adasisConfigCustomTrafficEvents) {
        this.lonLat = adasisConfigLonLat;
        this.trafficSigns = adasisConfigProfilelongTrafficSigns;
        this.customEvents = adasisConfigCustomTrafficEvents;
    }

    public String toString() {
        return "[lonLat: " + RecordUtils.fieldToString(this.lonLat) + ", trafficSigns: " + RecordUtils.fieldToString(this.trafficSigns) + ", customEvents: " + RecordUtils.fieldToString(this.customEvents) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigProfilelongTypeOptions adasisConfigProfilelongTypeOptions = (AdasisConfigProfilelongTypeOptions) obj;
        return Objects.equals(this.lonLat, adasisConfigProfilelongTypeOptions.lonLat) && Objects.equals(this.trafficSigns, adasisConfigProfilelongTypeOptions.trafficSigns) && Objects.equals(this.customEvents, adasisConfigProfilelongTypeOptions.customEvents);
    }
}

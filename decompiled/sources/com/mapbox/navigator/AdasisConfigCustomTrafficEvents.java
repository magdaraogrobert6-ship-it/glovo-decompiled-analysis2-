package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigCustomTrafficEvents implements Serializable {
    private final AdasisConfigTrafficEvent trafficEvent;
    private final AdasisConfigWeather weather;

    public AdasisConfigTrafficEvent getTrafficEvent() {
        return this.trafficEvent;
    }

    public AdasisConfigWeather getWeather() {
        return this.weather;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.trafficEvent, this.weather);
    }

    public AdasisConfigCustomTrafficEvents(AdasisConfigTrafficEvent adasisConfigTrafficEvent, AdasisConfigWeather adasisConfigWeather) {
        this.trafficEvent = adasisConfigTrafficEvent;
        this.weather = adasisConfigWeather;
    }

    public String toString() {
        return "[trafficEvent: " + RecordUtils.fieldToString(this.trafficEvent) + ", weather: " + RecordUtils.fieldToString(this.weather) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdasisConfigCustomTrafficEvents adasisConfigCustomTrafficEvents = (AdasisConfigCustomTrafficEvents) obj;
        return Objects.equals(this.trafficEvent, adasisConfigCustomTrafficEvents.trafficEvent) && Objects.equals(this.weather, adasisConfigCustomTrafficEvents.weather);
    }
}

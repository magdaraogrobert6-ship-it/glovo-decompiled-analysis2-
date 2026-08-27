package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class WeatherData implements Serializable {
    private final List<Weather> conditions;
    private final WeatherDetail detail;
    private final long monotonicTimestampNanoseconds;

    public List<Weather> getConditions() {
        return this.conditions;
    }

    public WeatherDetail getDetail() {
        return this.detail;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.conditions, this.detail, Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public WeatherData(List<Weather> list, WeatherDetail weatherDetail, long j) {
        this.conditions = list;
        this.detail = weatherDetail;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[conditions: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.conditions, ", detail: ");
        sb.append(RecordUtils.fieldToString(this.detail));
        sb.append(", monotonicTimestampNanoseconds: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WeatherData weatherData = (WeatherData) obj;
        return Objects.equals(this.conditions, weatherData.conditions) && Objects.equals(this.detail, weatherData.detail) && this.monotonicTimestampNanoseconds == weatherData.monotonicTimestampNanoseconds;
    }
}

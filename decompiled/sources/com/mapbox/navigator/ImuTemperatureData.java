package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class ImuTemperatureData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float temperature;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getTemperature() {
        return this.temperature;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public ImuTemperatureData(float f, long j) {
        this.temperature = f;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[temperature: ");
        getBitmapFromCache.write(this.temperature, ", monotonicTimestampNanoseconds: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.temperature), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImuTemperatureData imuTemperatureData = (ImuTemperatureData) obj;
        return PartialEq.compare(this.temperature, imuTemperatureData.temperature) && this.monotonicTimestampNanoseconds == imuTemperatureData.monotonicTimestampNanoseconds;
    }
}

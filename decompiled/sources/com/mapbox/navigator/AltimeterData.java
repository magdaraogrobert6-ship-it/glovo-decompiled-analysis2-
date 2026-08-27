package com.mapbox.navigator;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class AltimeterData implements Serializable {
    private final long monotonicTimestampNanoseconds;
    private final float pressure;

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    public float getPressure() {
        return this.pressure;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public AltimeterData(float f, long j) {
        this.pressure = f;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[pressure: ");
        getBitmapFromCache.write(this.pressure, ", monotonicTimestampNanoseconds: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.pressure), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AltimeterData altimeterData = (AltimeterData) obj;
        return PartialEq.compare(this.pressure, altimeterData.pressure) && this.monotonicTimestampNanoseconds == altimeterData.monotonicTimestampNanoseconds;
    }
}

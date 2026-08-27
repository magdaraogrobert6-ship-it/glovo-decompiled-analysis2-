package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class AdasisConfigWeather implements Serializable {
    private final byte profileType;

    public byte getProfileType() {
        return this.profileType;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public String toString() {
        return "[profileType: " + RecordUtils.fieldToString(Byte.valueOf(this.profileType)) + "]";
    }

    public AdasisConfigWeather() {
        this.profileType = (byte) 20;
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.profileType));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.profileType == ((AdasisConfigWeather) obj).profileType;
    }

    public AdasisConfigWeather(byte b) {
        this.profileType = b;
    }
}

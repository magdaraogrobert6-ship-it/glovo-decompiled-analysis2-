package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class PushHistoryRecord implements Serializable {
    private final String properties;
    private final String type;

    public String getProperties() {
        return this.properties;
    }

    public String getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.properties);
    }

    public PushHistoryRecord(String str, String str2) {
        this.type = str;
        this.properties = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        IconCompatParcelizer.read(sb, this.type, ", properties: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.properties, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushHistoryRecord pushHistoryRecord = (PushHistoryRecord) obj;
        return Objects.equals(this.type, pushHistoryRecord.type) && Objects.equals(this.properties, pushHistoryRecord.properties);
    }
}

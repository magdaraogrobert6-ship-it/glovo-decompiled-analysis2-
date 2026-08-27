package com.mapbox.navigator;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class UpdateLocationHistoryRecord implements Serializable {
    private final FixLocation location;
    private final boolean result;

    public FixLocation getLocation() {
        return this.location;
    }

    public boolean getResult() {
        return this.result;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.location, Boolean.valueOf(this.result));
    }

    public UpdateLocationHistoryRecord(FixLocation fixLocation, boolean z) {
        this.location = fixLocation;
        this.result = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[location: ");
        sb.append(RecordUtils.fieldToString(this.location));
        sb.append(", result: ");
        return ff$$ExternalSyntheticOutline0.m(this.result, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLocationHistoryRecord updateLocationHistoryRecord = (UpdateLocationHistoryRecord) obj;
        return Objects.equals(this.location, updateLocationHistoryRecord.location) && this.result == updateLocationHistoryRecord.result;
    }
}

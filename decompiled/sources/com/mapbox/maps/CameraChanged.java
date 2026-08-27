package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class CameraChanged implements Serializable {
    private final CameraState cameraState;
    private final Date timestamp;

    public CameraState getCameraState() {
        return this.cameraState;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.cameraState, this.timestamp);
    }

    public CameraChanged(CameraState cameraState, Date date) {
        this.cameraState = cameraState;
        this.timestamp = date;
    }

    public String toString() {
        return "[cameraState: " + RecordUtils.fieldToString(this.cameraState) + ", timestamp: " + RecordUtils.fieldToString(this.timestamp) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraChanged.class != obj.getClass()) {
            return false;
        }
        CameraChanged cameraChanged = (CameraChanged) obj;
        return Objects.equals(this.cameraState, cameraChanged.cameraState) && Objects.equals(this.timestamp, cameraChanged.timestamp);
    }
}

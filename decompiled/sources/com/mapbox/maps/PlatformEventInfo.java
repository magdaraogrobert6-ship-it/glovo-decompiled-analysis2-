package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class PlatformEventInfo implements Serializable {
    private final ScreenCoordinate screenCoordinate;
    private final PlatformEventType type;

    public ScreenCoordinate getScreenCoordinate() {
        return this.screenCoordinate;
    }

    public PlatformEventType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.screenCoordinate);
    }

    public PlatformEventInfo(PlatformEventType platformEventType, ScreenCoordinate screenCoordinate) {
        this.type = platformEventType;
        this.screenCoordinate = screenCoordinate;
    }

    public String toString() {
        return "[type: " + RecordUtils.fieldToString(this.type) + ", screenCoordinate: " + RecordUtils.fieldToString(this.screenCoordinate) + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlatformEventInfo platformEventInfo = (PlatformEventInfo) obj;
        return Objects.equals(this.type, platformEventInfo.type) && Objects.equals(this.screenCoordinate, platformEventInfo.screenCoordinate);
    }
}

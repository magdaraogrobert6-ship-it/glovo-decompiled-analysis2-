package com.mapbox.maps;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes5.dex */
public final class MapRecorderOptions implements Serializable {
    private final boolean compressed;
    private final boolean loggingEnabled;
    private final Long timeWindow;

    public static final class Builder {
        private Long timeWindow;
        private boolean loggingEnabled = false;
        private boolean compressed = true;

        public Builder compressed(boolean z) {
            this.compressed = z;
            return this;
        }

        public Builder loggingEnabled(boolean z) {
            this.loggingEnabled = z;
            return this;
        }

        public Builder timeWindow(Long l) {
            this.timeWindow = l;
            return this;
        }

        public MapRecorderOptions build() {
            return new MapRecorderOptions(this.timeWindow, this.loggingEnabled, this.compressed);
        }
    }

    public boolean getCompressed() {
        return this.compressed;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public Long getTimeWindow() {
        return this.timeWindow;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.timeWindow, Boolean.valueOf(this.loggingEnabled), Boolean.valueOf(this.compressed));
    }

    public Builder toBuilder() {
        return new Builder().timeWindow(this.timeWindow).loggingEnabled(this.loggingEnabled).compressed(this.compressed);
    }

    private MapRecorderOptions(Long l) {
        this.timeWindow = l;
        this.loggingEnabled = false;
        this.compressed = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[timeWindow: ");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(this.timeWindow, sb, ", loggingEnabled: ");
        MediaSessionCompatQueueItem.write(sb, this.loggingEnabled, ", compressed: ");
        return ff$$ExternalSyntheticOutline0.m(this.compressed, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapRecorderOptions.class != obj.getClass()) {
            return false;
        }
        MapRecorderOptions mapRecorderOptions = (MapRecorderOptions) obj;
        return Objects.equals(this.timeWindow, mapRecorderOptions.timeWindow) && this.loggingEnabled == mapRecorderOptions.loggingEnabled && this.compressed == mapRecorderOptions.compressed;
    }

    private MapRecorderOptions(Long l, boolean z, boolean z2) {
        this.timeWindow = l;
        this.loggingEnabled = z;
        this.compressed = z2;
    }
}

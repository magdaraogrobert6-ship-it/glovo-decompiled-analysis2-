package com.mapbox.navigator;

import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class LaneSensorInfo implements Serializable {
    private final byte currentLaneIndex;
    private final byte laneCount;
    private final long monotonicTimestampNanoseconds;

    public byte getCurrentLaneIndex() {
        return this.currentLaneIndex;
    }

    public byte getLaneCount() {
        return this.laneCount;
    }

    public long getMonotonicTimestampNanoseconds() {
        return this.monotonicTimestampNanoseconds;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public LaneSensorInfo(byte b, byte b2, long j) {
        this.currentLaneIndex = b;
        this.laneCount = b2;
        this.monotonicTimestampNanoseconds = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[currentLaneIndex: ");
        MediaSessionCompatQueueItem.serializer(this.currentLaneIndex, sb, ", laneCount: ");
        MediaSessionCompatQueueItem.serializer(this.laneCount, sb, ", monotonicTimestampNanoseconds: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.monotonicTimestampNanoseconds, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.currentLaneIndex), Byte.valueOf(this.laneCount), Long.valueOf(this.monotonicTimestampNanoseconds));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LaneSensorInfo laneSensorInfo = (LaneSensorInfo) obj;
        return this.currentLaneIndex == laneSensorInfo.currentLaneIndex && this.laneCount == laneSensorInfo.laneCount && this.monotonicTimestampNanoseconds == laneSensorInfo.monotonicTimestampNanoseconds;
    }
}

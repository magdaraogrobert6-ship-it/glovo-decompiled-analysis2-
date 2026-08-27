package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryMonitorStatus implements Serializable {
    private final MemoryMonitorState state;
    private final long totalMemory;
    private final long usedMemory;

    public MemoryMonitorState getState() {
        return this.state;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.state, Long.valueOf(this.totalMemory), Long.valueOf(this.usedMemory));
    }

    public MemoryMonitorStatus(MemoryMonitorState memoryMonitorState, long j, long j2) {
        this.state = memoryMonitorState;
        this.totalMemory = j;
        this.usedMemory = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[state: ");
        sb.append(RecordUtils.fieldToString(this.state));
        sb.append(", totalMemory: ");
        af$$ExternalSyntheticOutline1.m(this.totalMemory, ", usedMemory: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.usedMemory, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorStatus.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorStatus memoryMonitorStatus = (MemoryMonitorStatus) obj;
        return Objects.equals(this.state, memoryMonitorStatus.state) && this.totalMemory == memoryMonitorStatus.totalMemory && this.usedMemory == memoryMonitorStatus.usedMemory;
    }
}

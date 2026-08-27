package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import java.io.Serializable;
import java.util.Objects;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes5.dex */
public class TileRegionLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getLoadedResourceCount() {
        return this.loadedResourceCount;
    }

    public long getLoadedResourceSize() {
        return this.loadedResourceSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionLoadProgress(long j, long j2, long j3, long j4, long j5, long j6) {
        this.completedResourceCount = j;
        this.completedResourceSize = j2;
        this.erroredResourceCount = j3;
        this.requiredResourceCount = j4;
        this.loadedResourceCount = j5;
        this.loadedResourceSize = j6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[completedResourceCount: ");
        af$$ExternalSyntheticOutline1.m(this.completedResourceCount, ", completedResourceSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.completedResourceSize, ", erroredResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.erroredResourceCount, ", requiredResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.requiredResourceCount, ", loadedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.loadedResourceCount, ", loadedResourceSize: ", sb);
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.loadedResourceSize, "]", sb);
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.loadedResourceCount), Long.valueOf(this.loadedResourceSize));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionLoadProgress tileRegionLoadProgress = (TileRegionLoadProgress) obj;
        return this.completedResourceCount == tileRegionLoadProgress.completedResourceCount && this.completedResourceSize == tileRegionLoadProgress.completedResourceSize && this.erroredResourceCount == tileRegionLoadProgress.erroredResourceCount && this.requiredResourceCount == tileRegionLoadProgress.requiredResourceCount && this.loadedResourceCount == tileRegionLoadProgress.loadedResourceCount && this.loadedResourceSize == tileRegionLoadProgress.loadedResourceSize;
    }
}

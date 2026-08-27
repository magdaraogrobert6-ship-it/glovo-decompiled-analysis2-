package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class TileStoreImportProgress implements Serializable {
    private final long erroredResourceCount;
    private final long importedResourceCount;
    private final long importedResourceSize;
    private final HashMap<TileVariant, Double> maximumCoveredDistanceMeters;
    private final long requiredResourceBytes;
    private final long requiredResourceCount;
    private final long skippedResourceCount;
    private final long startTime;

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    @MapboxExperimental
    public long getImportedResourceCount() {
        return this.importedResourceCount;
    }

    @MapboxExperimental
    public long getImportedResourceSize() {
        return this.importedResourceSize;
    }

    @MapboxExperimental
    public HashMap<TileVariant, Double> getMaximumCoveredDistanceMeters() {
        return this.maximumCoveredDistanceMeters;
    }

    @MapboxExperimental
    public native double getProgressRate();

    @MapboxExperimental
    public long getRequiredResourceBytes() {
        return this.requiredResourceBytes;
    }

    @MapboxExperimental
    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    @MapboxExperimental
    public long getSkippedResourceCount() {
        return this.skippedResourceCount;
    }

    @MapboxExperimental
    public long getStartTime() {
        return this.startTime;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreImportProgress(long j, long j2, long j3, long j4, long j5, long j6, long j7, HashMap<TileVariant, Double> map) {
        this.startTime = j;
        this.erroredResourceCount = j2;
        this.skippedResourceCount = j3;
        this.importedResourceCount = j4;
        this.importedResourceSize = j5;
        this.requiredResourceCount = j6;
        this.requiredResourceBytes = j7;
        this.maximumCoveredDistanceMeters = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[startTime: ");
        af$$ExternalSyntheticOutline1.m(this.startTime, ", erroredResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.erroredResourceCount, ", skippedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.skippedResourceCount, ", importedResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.importedResourceCount, ", importedResourceSize: ", sb);
        af$$ExternalSyntheticOutline1.m(this.importedResourceSize, ", requiredResourceCount: ", sb);
        af$$ExternalSyntheticOutline1.m(this.requiredResourceCount, ", requiredResourceBytes: ", sb);
        af$$ExternalSyntheticOutline1.m(this.requiredResourceBytes, ", maximumCoveredDistanceMeters: ", sb);
        sb.append(RecordUtils.fieldToString(this.maximumCoveredDistanceMeters));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.startTime;
        long j2 = this.erroredResourceCount;
        long j3 = this.skippedResourceCount;
        long j4 = this.importedResourceCount;
        long j5 = this.importedResourceSize;
        long j6 = this.requiredResourceCount;
        long j7 = this.requiredResourceBytes;
        return Objects.hash(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), this.maximumCoveredDistanceMeters);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileStoreImportProgress tileStoreImportProgress = (TileStoreImportProgress) obj;
        return this.startTime == tileStoreImportProgress.startTime && this.erroredResourceCount == tileStoreImportProgress.erroredResourceCount && this.skippedResourceCount == tileStoreImportProgress.skippedResourceCount && this.importedResourceCount == tileStoreImportProgress.importedResourceCount && this.importedResourceSize == tileStoreImportProgress.importedResourceSize && this.requiredResourceCount == tileStoreImportProgress.requiredResourceCount && this.requiredResourceBytes == tileStoreImportProgress.requiredResourceBytes && Objects.equals(this.maximumCoveredDistanceMeters, tileStoreImportProgress.maximumCoveredDistanceMeters);
    }
}

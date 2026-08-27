package com.deliveryhero.fwf_tracking.model;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class Exposure {
    private final List<FwFEventValue> exposureValues;
    private final ExposureMetadata metadata;
    private final long timestamp;

    public final long component1() {
        return this.timestamp;
    }

    public final List<FwFEventValue> component2() {
        return this.exposureValues;
    }

    public final ExposureMetadata component3() {
        return this.metadata;
    }

    public final List<FwFEventValue> getExposureValues() {
        return this.exposureValues;
    }

    public final ExposureMetadata getMetadata() {
        return this.metadata;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.metadata.hashCode() + c8$$ExternalSyntheticOutline0.m(this.exposureValues, Long.hashCode(this.timestamp) * 31, 31);
    }

    public String toString() {
        return "Exposure(timestamp=" + this.timestamp + ", exposureValues=" + this.exposureValues + ", metadata=" + this.metadata + ")";
    }

    public Exposure(long j, List<FwFEventValue> list, ExposureMetadata exposureMetadata) {
        list.getClass();
        exposureMetadata.getClass();
        this.timestamp = j;
        this.exposureValues = list;
        this.metadata = exposureMetadata;
    }

    public final Exposure copy(long j, List<FwFEventValue> list, ExposureMetadata exposureMetadata) {
        list.getClass();
        exposureMetadata.getClass();
        return new Exposure(j, list, exposureMetadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Exposure copy$default(Exposure exposure, long j, List list, ExposureMetadata exposureMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            j = exposure.timestamp;
        }
        if ((i & 2) != 0) {
            list = exposure.exposureValues;
        }
        if ((i & 4) != 0) {
            exposureMetadata = exposure.metadata;
        }
        return exposure.copy(j, list, exposureMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Exposure)) {
            return false;
        }
        Exposure exposure = (Exposure) obj;
        if (this.timestamp != exposure.timestamp) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.exposureValues, exposure.exposureValues}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, exposure.metadata}, getCieXyz.write())).booleanValue();
    }
}

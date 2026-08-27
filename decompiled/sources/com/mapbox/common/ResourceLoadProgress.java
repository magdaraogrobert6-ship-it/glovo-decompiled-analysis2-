package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class ResourceLoadProgress implements Serializable {
    private final long bytes;
    private final Long totalBytes;

    public long getBytes() {
        return this.bytes;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadProgress(long j, Long l) {
        this.bytes = j;
        this.totalBytes = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[bytes: ");
        af$$ExternalSyntheticOutline1.m(this.bytes, ", totalBytes: ", sb);
        sb.append(RecordUtils.fieldToString(this.totalBytes));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.bytes;
        return Objects.hash(Long.valueOf(j), this.totalBytes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadProgress resourceLoadProgress = (ResourceLoadProgress) obj;
        return this.bytes == resourceLoadProgress.bytes && Objects.equals(this.totalBytes, resourceLoadProgress.totalBytes);
    }
}

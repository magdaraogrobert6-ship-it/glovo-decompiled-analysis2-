package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoadError implements Serializable {
    private final String message;
    private final long transferredBytes;
    private final ResourceLoadErrorType type;

    public String getMessage() {
        return this.message;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public ResourceLoadErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message, Long.valueOf(this.transferredBytes));
    }

    public ResourceLoadError(ResourceLoadErrorType resourceLoadErrorType, String str, long j) {
        this.type = resourceLoadErrorType;
        this.message = str;
        this.transferredBytes = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", message: ");
        IconCompatParcelizer.read(sb, this.message, ", transferredBytes: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.transferredBytes, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadError resourceLoadError = (ResourceLoadError) obj;
        return Objects.equals(this.type, resourceLoadError.type) && Objects.equals(this.message, resourceLoadError.message) && this.transferredBytes == resourceLoadError.transferredBytes;
    }
}

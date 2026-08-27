package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoadResult implements Serializable {
    private final boolean belongsToGroup;
    private final String contentType;
    private final ResourceData data;
    private final String etag;
    private final Date expires;
    private final boolean immutable;
    private final boolean mustRevalidate;
    private final ResourceLoadStatus status;
    private final long totalBytes;
    private final long transferredBytes;

    public boolean getBelongsToGroup() {
        return this.belongsToGroup;
    }

    public String getContentType() {
        return this.contentType;
    }

    public ResourceData getData() {
        return this.data;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public boolean getImmutable() {
        return this.immutable;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public ResourceLoadStatus getStatus() {
        return this.status;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        ResourceData resourceData = this.data;
        ResourceLoadStatus resourceLoadStatus = this.status;
        boolean z = this.immutable;
        boolean z2 = this.mustRevalidate;
        Date date = this.expires;
        long j = this.totalBytes;
        long j2 = this.transferredBytes;
        return Objects.hash(resourceData, resourceLoadStatus, Boolean.valueOf(z), Boolean.valueOf(z2), date, Long.valueOf(j), Long.valueOf(j2), this.contentType, this.etag, Boolean.valueOf(this.belongsToGroup));
    }

    public ResourceLoadResult(ResourceData resourceData, ResourceLoadStatus resourceLoadStatus, boolean z, boolean z2, Date date, long j, long j2, String str, String str2, boolean z3) {
        this.data = resourceData;
        this.status = resourceLoadStatus;
        this.immutable = z;
        this.mustRevalidate = z2;
        this.expires = date;
        this.totalBytes = j;
        this.transferredBytes = j2;
        this.contentType = str;
        this.etag = str2;
        this.belongsToGroup = z3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", status: ");
        sb.append(RecordUtils.fieldToString(this.status));
        sb.append(", immutable: ");
        MediaSessionCompatQueueItem.write(sb, this.immutable, ", mustRevalidate: ");
        MediaSessionCompatQueueItem.write(sb, this.mustRevalidate, ", expires: ");
        sb.append(RecordUtils.fieldToString(this.expires));
        sb.append(", totalBytes: ");
        af$$ExternalSyntheticOutline1.m(this.totalBytes, ", transferredBytes: ", sb);
        af$$ExternalSyntheticOutline1.m(this.transferredBytes, ", contentType: ", sb);
        IconCompatParcelizer.read(sb, this.contentType, ", etag: ");
        IconCompatParcelizer.read(sb, this.etag, ", belongsToGroup: ");
        return ff$$ExternalSyntheticOutline0.m(this.belongsToGroup, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadResult resourceLoadResult = (ResourceLoadResult) obj;
        return Objects.equals(this.data, resourceLoadResult.data) && Objects.equals(this.status, resourceLoadResult.status) && this.immutable == resourceLoadResult.immutable && this.mustRevalidate == resourceLoadResult.mustRevalidate && Objects.equals(this.expires, resourceLoadResult.expires) && this.totalBytes == resourceLoadResult.totalBytes && this.transferredBytes == resourceLoadResult.transferredBytes && Objects.equals(this.contentType, resourceLoadResult.contentType) && Objects.equals(this.etag, resourceLoadResult.etag) && this.belongsToGroup == resourceLoadResult.belongsToGroup;
    }
}

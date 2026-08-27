package com.mapbox.maps;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class ResponseInfo implements Serializable {
    private final ResourceRequestError error;
    private final String etag;
    private final Date expires;
    private final Date modified;
    private final boolean mustRevalidate;
    private final boolean noContent;
    private final boolean notModified;
    private final long size;
    private final ResponseSourceType source;

    public ResourceRequestError getError() {
        return this.error;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Date getModified() {
        return this.modified;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public boolean getNoContent() {
        return this.noContent;
    }

    public boolean getNotModified() {
        return this.notModified;
    }

    public long getSize() {
        return this.size;
    }

    public ResponseSourceType getSource() {
        return this.source;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public ResponseInfo(boolean z, boolean z2, boolean z3, ResponseSourceType responseSourceType, long j, Date date, Date date2, String str, ResourceRequestError resourceRequestError) {
        this.noContent = z;
        this.notModified = z2;
        this.mustRevalidate = z3;
        this.source = responseSourceType;
        this.size = j;
        this.modified = date;
        this.expires = date2;
        this.etag = str;
        this.error = resourceRequestError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[noContent: ");
        MediaSessionCompatQueueItem.write(sb, this.noContent, ", notModified: ");
        MediaSessionCompatQueueItem.write(sb, this.notModified, ", mustRevalidate: ");
        MediaSessionCompatQueueItem.write(sb, this.mustRevalidate, ", source: ");
        sb.append(RecordUtils.fieldToString(this.source));
        sb.append(", size: ");
        af$$ExternalSyntheticOutline1.m(this.size, ", modified: ", sb);
        sb.append(RecordUtils.fieldToString(this.modified));
        sb.append(", expires: ");
        sb.append(RecordUtils.fieldToString(this.expires));
        sb.append(", etag: ");
        IconCompatParcelizer.read(sb, this.etag, ", error: ");
        sb.append(RecordUtils.fieldToString(this.error));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        boolean z = this.noContent;
        boolean z2 = this.notModified;
        boolean z3 = this.mustRevalidate;
        ResponseSourceType responseSourceType = this.source;
        long j = this.size;
        return Objects.hash(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), responseSourceType, Long.valueOf(j), this.modified, this.expires, this.etag, this.error);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResponseInfo.class != obj.getClass()) {
            return false;
        }
        ResponseInfo responseInfo = (ResponseInfo) obj;
        return this.noContent == responseInfo.noContent && this.notModified == responseInfo.notModified && this.mustRevalidate == responseInfo.mustRevalidate && Objects.equals(this.source, responseInfo.source) && this.size == responseInfo.size && Objects.equals(this.modified, responseInfo.modified) && Objects.equals(this.expires, responseInfo.expires) && Objects.equals(this.etag, responseInfo.etag) && Objects.equals(this.error, responseInfo.error);
    }
}

package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class GetRouteSignature implements Serializable {
    private final String comment;
    private final Long operationId;
    private final GetRouteOrigin origin;
    private final GetRouteReason reason;

    public String getComment() {
        return this.comment;
    }

    public Long getOperationId() {
        return this.operationId;
    }

    public GetRouteOrigin getOrigin() {
        return this.origin;
    }

    public GetRouteReason getReason() {
        return this.reason;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.reason, this.origin, this.comment, this.operationId);
    }

    public GetRouteSignature(GetRouteReason getRouteReason, GetRouteOrigin getRouteOrigin, String str, Long l) {
        this.reason = getRouteReason;
        this.origin = getRouteOrigin;
        this.comment = str;
        this.operationId = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[reason: ");
        sb.append(RecordUtils.fieldToString(this.reason));
        sb.append(", origin: ");
        sb.append(RecordUtils.fieldToString(this.origin));
        sb.append(", comment: ");
        IconCompatParcelizer.read(sb, this.comment, ", operationId: ");
        sb.append(RecordUtils.fieldToString(this.operationId));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetRouteSignature getRouteSignature = (GetRouteSignature) obj;
        return Objects.equals(this.reason, getRouteSignature.reason) && Objects.equals(this.origin, getRouteSignature.origin) && Objects.equals(this.comment, getRouteSignature.comment) && Objects.equals(this.operationId, getRouteSignature.operationId);
    }
}

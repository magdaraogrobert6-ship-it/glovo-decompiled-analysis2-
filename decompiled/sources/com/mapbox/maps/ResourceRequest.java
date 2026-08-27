package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceRequest implements Serializable {
    private final boolean cancelled;
    private final RequestInfo request;
    private final ResponseInfo response;
    private final RequestDataSourceType source;
    private final EventTimeInterval timeInterval;

    public boolean getCancelled() {
        return this.cancelled;
    }

    public RequestInfo getRequest() {
        return this.request;
    }

    public ResponseInfo getResponse() {
        return this.response;
    }

    public RequestDataSourceType getSource() {
        return this.source;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        RequestDataSourceType requestDataSourceType = this.source;
        RequestInfo requestInfo = this.request;
        ResponseInfo responseInfo = this.response;
        boolean z = this.cancelled;
        return Objects.hash(requestDataSourceType, requestInfo, responseInfo, Boolean.valueOf(z), this.timeInterval);
    }

    public ResourceRequest(RequestDataSourceType requestDataSourceType, RequestInfo requestInfo, ResponseInfo responseInfo, boolean z, EventTimeInterval eventTimeInterval) {
        this.source = requestDataSourceType;
        this.request = requestInfo;
        this.response = responseInfo;
        this.cancelled = z;
        this.timeInterval = eventTimeInterval;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[source: ");
        sb.append(RecordUtils.fieldToString(this.source));
        sb.append(", request: ");
        sb.append(RecordUtils.fieldToString(this.request));
        sb.append(", response: ");
        sb.append(RecordUtils.fieldToString(this.response));
        sb.append(", cancelled: ");
        MediaSessionCompatQueueItem.write(sb, this.cancelled, ", timeInterval: ");
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequest.class != obj.getClass()) {
            return false;
        }
        ResourceRequest resourceRequest = (ResourceRequest) obj;
        return Objects.equals(this.source, resourceRequest.source) && Objects.equals(this.request, resourceRequest.request) && Objects.equals(this.response, resourceRequest.response) && this.cancelled == resourceRequest.cancelled && Objects.equals(this.timeInterval, resourceRequest.timeInterval);
    }
}

package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes5.dex */
public final class RequestInfo implements Serializable {
    private final List<RequestLoadingMethodType> loadingMethod;
    private final RequestPriorityType priority;
    private final RequestResourceType resource;
    private final String url;

    public List<RequestLoadingMethodType> getLoadingMethod() {
        return this.loadingMethod;
    }

    public RequestPriorityType getPriority() {
        return this.priority;
    }

    public RequestResourceType getResource() {
        return this.resource;
    }

    public String getUrl() {
        return this.url;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.url, this.resource, this.priority, this.loadingMethod);
    }

    public RequestInfo(String str, RequestResourceType requestResourceType, RequestPriorityType requestPriorityType, List<RequestLoadingMethodType> list) {
        this.url = str;
        this.resource = requestResourceType;
        this.priority = requestPriorityType;
        this.loadingMethod = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[url: ");
        IconCompatParcelizer.read(sb, this.url, ", resource: ");
        sb.append(RecordUtils.fieldToString(this.resource));
        sb.append(", priority: ");
        sb.append(RecordUtils.fieldToString(this.priority));
        sb.append(", loadingMethod: ");
        return MediaSessionCompatQueueItem.read(this.loadingMethod, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestInfo.class != obj.getClass()) {
            return false;
        }
        RequestInfo requestInfo = (RequestInfo) obj;
        return Objects.equals(this.url, requestInfo.url) && Objects.equals(this.resource, requestInfo.resource) && Objects.equals(this.priority, requestInfo.priority) && Objects.equals(this.loadingMethod, requestInfo.loadingMethod);
    }
}

package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class HttpResponse implements Serializable {
    private final HttpRequest request;
    private final long requestId;
    private final Expected<HttpRequestError, HttpResponseData> result;

    public HttpRequest getRequest() {
        return this.request;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public Expected<HttpRequestError, HttpResponseData> getResult() {
        return this.result;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public HttpResponse(long j, HttpRequest httpRequest, Expected<HttpRequestError, HttpResponseData> expected) {
        this.requestId = j;
        this.request = httpRequest;
        this.result = expected;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[requestId: ");
        af$$ExternalSyntheticOutline1.m(this.requestId, ", request: ", sb);
        sb.append(RecordUtils.fieldToString(this.request));
        sb.append(", result: ");
        sb.append(RecordUtils.fieldToString(this.result));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.requestId;
        return Objects.hash(Long.valueOf(j), this.request, this.result);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return this.requestId == httpResponse.requestId && Objects.equals(this.request, httpResponse.request) && Objects.equals(this.result, httpResponse.result);
    }
}

package com.mapbox.common;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes5.dex */
public class HttpRequestOrResponse {
    private Type type;
    private Object value;

    public enum Type {
        HTTP_REQUEST,
        HTTP_RESPONSE
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static HttpRequestOrResponse valueOf(HttpRequest httpRequest) {
        return new HttpRequestOrResponse(httpRequest);
    }

    public boolean isHttpRequest() {
        return this.type == Type.HTTP_REQUEST;
    }

    public boolean isHttpResponse() {
        return this.type == Type.HTTP_RESPONSE;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public HttpRequestOrResponse(HttpRequest httpRequest) {
        this.type = Type.HTTP_REQUEST;
        this.value = httpRequest;
    }

    public static HttpRequestOrResponse valueOf(HttpResponse httpResponse) {
        return new HttpRequestOrResponse(httpResponse);
    }

    public HttpRequest getHttpRequest() {
        if (isHttpRequest()) {
            return (HttpRequest) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (HttpRequest)");
        return null;
    }

    public HttpResponse getHttpResponse() {
        if (isHttpResponse()) {
            return (HttpResponse) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (HttpResponse)");
        return null;
    }

    public HttpRequestOrResponse(HttpResponse httpResponse) {
        this.type = Type.HTTP_RESPONSE;
        this.value = httpResponse;
    }
}

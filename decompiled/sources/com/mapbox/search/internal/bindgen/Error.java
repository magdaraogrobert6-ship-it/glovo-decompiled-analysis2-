package com.mapbox.search.internal.bindgen;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class Error {
    private Type type;
    private Object value;

    public enum Type {
        CONNECTION_ERROR,
        HTTP_ERROR,
        INTERNAL_ERROR,
        REQUEST_CANCELLED
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static Error valueOf(ConnectionError connectionError) {
        return new Error(connectionError);
    }

    public boolean isConnectionError() {
        return this.type == Type.CONNECTION_ERROR;
    }

    public boolean isHttpError() {
        return this.type == Type.HTTP_ERROR;
    }

    public boolean isInternalError() {
        return this.type == Type.INTERNAL_ERROR;
    }

    public boolean isRequestCancelled() {
        return this.type == Type.REQUEST_CANCELLED;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public Error(ConnectionError connectionError) {
        this.type = Type.CONNECTION_ERROR;
        this.value = connectionError;
    }

    public static Error valueOf(HttpError httpError) {
        return new Error(httpError);
    }

    public ConnectionError getConnectionError() {
        if (isConnectionError()) {
            return (ConnectionError) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ConnectionError)");
        return null;
    }

    public HttpError getHttpError() {
        if (isHttpError()) {
            return (HttpError) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (HttpError)");
        return null;
    }

    public InternalError getInternalError() {
        if (isInternalError()) {
            return (InternalError) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (InternalError)");
        return null;
    }

    public RequestCancelled getRequestCancelled() {
        if (isRequestCancelled()) {
            return (RequestCancelled) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (RequestCancelled)");
        return null;
    }

    public static Error valueOf(InternalError internalError) {
        return new Error(internalError);
    }

    public static Error valueOf(RequestCancelled requestCancelled) {
        return new Error(requestCancelled);
    }

    public Error(HttpError httpError) {
        this.type = Type.HTTP_ERROR;
        this.value = httpError;
    }

    public Error(InternalError internalError) {
        this.type = Type.INTERNAL_ERROR;
        this.value = internalError;
    }

    public Error(RequestCancelled requestCancelled) {
        this.type = Type.REQUEST_CANCELLED;
        this.value = requestCancelled;
    }
}

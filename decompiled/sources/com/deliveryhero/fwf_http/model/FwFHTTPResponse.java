package com.deliveryhero.fwf_http.model;

import com.deliveryhero.fwf_http.HTTPClient;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFHTTPResponse<T> {
    private final T body;
    private final String message;
    private final int statusCode;

    public final T getBody() {
        return this.body;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final boolean isSuccess$fwf_client_release() {
        return this.statusCode == HTTPClient.FwFStatusCode.OK.getCode();
    }

    public /* synthetic */ FwFHTTPResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : obj);
    }

    public FwFHTTPResponse(int i, String str, T t) {
        this.statusCode = i;
        this.message = str;
        this.body = t;
    }

    public FwFHTTPResponse() {
        this(0, null, null, 7, null);
    }
}

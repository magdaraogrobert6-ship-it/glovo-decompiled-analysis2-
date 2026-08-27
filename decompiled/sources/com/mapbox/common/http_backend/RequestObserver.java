package com.mapbox.common.http_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestObserver {
    void onData(long j);

    void onFailed(long j, HttpRequestError httpRequestError);

    void onResponse(long j, ResponseData responseData);

    void onSucceeded(long j);
}

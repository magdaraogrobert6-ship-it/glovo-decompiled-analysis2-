package com.mapbox.common.experimental.wss_backend;

import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes5.dex */
public interface RequestObserver {
    void onData(long j, WsOpCode wsOpCode, boolean z);

    void onFailed(long j, HttpRequestError httpRequestError, Integer num);

    void onResponse(long j, ResponseData responseData);

    void onSucceeded(long j);

    void onSwitchingProtocols(long j);
}

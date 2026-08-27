package com.mapbox.common.module.okhttp;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.module.RequestDetail;
import o.getMessageTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class OkHttpRequestDetail implements RequestDetail {
    private final getMessageTextView call;
    private final CallbackWrapper callback;

    public final getMessageTextView getCall() {
        return this.call;
    }

    public final CallbackWrapper getCallback() {
        return this.callback;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        FirebasePerfOkHttpClient.enqueue(this.call, this.callback);
    }

    public OkHttpRequestDetail(getMessageTextView getmessagetextview, CallbackWrapper callbackWrapper) {
        getmessagetextview.getClass();
        callbackWrapper.getClass();
        this.call = getmessagetextview;
        this.callback = callbackWrapper;
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError httpRequestError) {
        CallbackWrapper callbackWrapper = this.callback;
        if (httpRequestError == null) {
            callbackWrapper.cancel();
        } else {
            callbackWrapper.cancel(httpRequestError);
        }
    }
}

package com.mapbox.common.module;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.mapbox.common.HttpRequestError;

/* JADX INFO: loaded from: classes4.dex */
public interface RequestDetail {
    void cancel(HttpRequestError httpRequestError);

    void start();

    public static final class DefaultImpls {
        public static /* synthetic */ void cancel$default(RequestDetail requestDetail, HttpRequestError httpRequestError, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    httpRequestError = null;
                }
                requestDetail.cancel(httpRequestError);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: cancel");
        }
    }
}

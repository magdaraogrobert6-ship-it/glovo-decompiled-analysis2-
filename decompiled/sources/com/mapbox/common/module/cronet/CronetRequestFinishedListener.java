package com.mapbox.common.module.cronet;

import com.mapbox.common.NetworkUsageMetricsMeter;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class CronetRequestFinishedListener extends RequestFinishedInfo.Listener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetRequestFinishedListener(Executor executor) {
        super(executor);
        executor.getClass();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        requestFinishedInfo.getClass();
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        String url = requestFinishedInfo.getUrl();
        url.getClass();
        Long sentByteCount = metrics.getSentByteCount();
        sentByteCount.getClass();
        int iLongValue = (int) sentByteCount.longValue();
        Long receivedByteCount = metrics.getReceivedByteCount();
        receivedByteCount.getClass();
        NetworkUsageMetricsMeter.onBytesTransferred(url, iLongValue, (int) receivedByteCount.longValue());
    }
}

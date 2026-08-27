package com.mapbox.common.module.cronet;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.Scheduler;
import com.mapbox.common.Task;
import com.mapbox.common.module.RequestDetail;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.removeNodeAtDepth;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class CronetRequestDetail implements RequestDetail, UrlCallback.StatusCallback, Task {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_READ_TIMEOUT = 60;
    private final UrlCallback callback;
    private final UrlRequest request;
    private final Scheduler scheduler;
    private CronetTimeout timeout;
    private long timeoutSeconds;

    private final CronetTimeout createTimeout(long j) {
        return new CronetTimeout(this.scheduler, j, this);
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void cancel(HttpRequestError httpRequestError) {
        if (httpRequestError != null) {
            this.callback.setCancelReason(httpRequestError);
        }
        this.request.cancel();
    }

    @Override // com.mapbox.common.Task
    public void run() {
        if (this.request.isDone()) {
            return;
        }
        cancel(new HttpRequestError(HttpRequestErrorType.REQUEST_TIMED_OUT, c8$$ExternalSyntheticOutline0.m(this.timeoutSeconds, " seconds)", new StringBuilder("Request timed out ("))));
    }

    @Override // com.mapbox.common.module.RequestDetail
    public void start() {
        CronetTimeout cronetTimeoutCreateTimeout = createTimeout(this.timeoutSeconds);
        this.timeout = cronetTimeoutCreateTimeout;
        if (cronetTimeoutCreateTimeout == null) {
            removeNodeAtDepth.serializer("timeout");
            throw null;
        }
        cronetTimeoutCreateTimeout.start();
        this.callback.getStatus(this);
        this.request.start();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CronetRequestDetail(UrlRequest urlRequest, UrlCallback urlCallback, long j, Scheduler scheduler) {
        urlRequest.getClass();
        urlCallback.getClass();
        scheduler.getClass();
        this.request = urlRequest;
        this.callback = urlCallback;
        this.timeoutSeconds = j;
        this.scheduler = scheduler;
        if (j <= 0) {
            this.timeoutSeconds = 60L;
        }
    }

    @Override // com.mapbox.common.module.cronet.UrlCallback.StatusCallback
    public void onDone() {
        CronetTimeout cronetTimeout = this.timeout;
        if (cronetTimeout != null) {
            cronetTimeout.cancel();
        } else {
            removeNodeAtDepth.serializer("timeout");
            throw null;
        }
    }

    @Override // com.mapbox.common.module.cronet.UrlCallback.StatusCallback
    public void onRead() {
        CronetTimeout cronetTimeout = this.timeout;
        if (cronetTimeout != null) {
            cronetTimeout.resetDeadline();
        } else {
            removeNodeAtDepth.serializer("timeout");
            throw null;
        }
    }
}

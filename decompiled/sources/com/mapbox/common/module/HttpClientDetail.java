package com.mapbox.common.module;

import android.net.Network;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import java.util.concurrent.Executor;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpClientDetail {
    RequestDetail buildRequest(Request request, long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Network network);

    Executor executor();

    void setMaxRequestsPerHost(byte b);

    boolean supportsKeepCompression();
}

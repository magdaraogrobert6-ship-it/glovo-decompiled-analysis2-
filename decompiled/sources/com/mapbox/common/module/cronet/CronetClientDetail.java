package com.mapbox.common.module.cronet;

import android.net.Network;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.fwf_http.ConstantKt;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.Scheduler;
import com.mapbox.common.SchedulerExecutorDispatcherKt;
import com.mapbox.common.SchedulerFactory;
import com.mapbox.common.SizedReadStream;
import com.mapbox.common.ThreadServiceType;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class CronetClientDetail implements HttpClientDetail {
    private final LazyEngine cronetEngine;
    private final Executor executor;
    private final HttpClientDetail fallback;

    @Override // com.mapbox.common.module.HttpClientDetail
    public Executor executor() {
        return this.executor;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return false;
    }

    private final CronetRequestDetail buildRequestWithEngine(CronetEngine cronetEngine, Request request, long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Network network) {
        SizedReadStream body;
        Scheduler schedulerCreateSequenced = SchedulerFactory.createSequenced(ThreadServiceType.DEFAULT);
        schedulerCreateSequenced.getClass();
        Executor executorAsExecutor = SchedulerExecutorDispatcherKt.asExecutor(schedulerCreateSequenced);
        UrlCallback urlCallback = new UrlCallback(j, requestObserver, r8lambdaunavo3sxub_pc9xroryotnrlvsm, request.getMethod() == HttpMethod.HEAD);
        UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(request.getUrl(), urlCallback, executorAsExecutor);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            builderNewUrlRequestBuilder.addHeader(entry.getKey(), entry.getValue());
        }
        String string = request.getMethod().toString();
        string.getClass();
        String upperCase = string.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        builderNewUrlRequestBuilder.setHttpMethod(upperCase);
        if (request.getMethod() == HttpMethod.POST && (body = request.getBody()) != null) {
            if (!headers.containsKey("content-type") && !headers.containsKey(ConstantKt.CONTENT_TYPE_HEADER)) {
                builderNewUrlRequestBuilder.addHeader(ConstantKt.CONTENT_TYPE_HEADER, "application/octet-stream");
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(new ReadStreamUploadDataProvider(body, Fields.Clip), executorAsExecutor);
        }
        if (network != null) {
            builderNewUrlRequestBuilder.bindToNetwork(network.getNetworkHandle());
        }
        UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
        urlRequestBuild.getClass();
        return new CronetRequestDetail(urlRequestBuild, urlCallback, request.getTimeout(), schedulerCreateSequenced);
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte b) {
        this.fallback.setMaxRequestsPerHost(b);
    }

    public CronetClientDetail(HttpClientDetail httpClientDetail) {
        httpClientDetail.getClass();
        this.fallback = httpClientDetail;
        Scheduler schedulerThreadPool = SchedulerFactory.threadPool();
        schedulerThreadPool.getClass();
        this.executor = SchedulerExecutorDispatcherKt.asExecutor(schedulerThreadPool);
        this.cronetEngine = new LazyEngine(executor());
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Network network) {
        CronetRequestDetail cronetRequestDetailBuildRequestWithEngine;
        request.getClass();
        requestObserver.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        CronetEngine engine = this.cronetEngine.getEngine();
        return (engine == null || (cronetRequestDetailBuildRequestWithEngine = buildRequestWithEngine(engine, request, j, requestObserver, r8lambdaunavo3sxub_pc9xroryotnrlvsm, network)) == null) ? this.fallback.buildRequest(request, j, requestObserver, r8lambdaunavo3sxub_pc9xroryotnrlvsm, network) : cronetRequestDetailBuildRequestWithEngine;
    }
}

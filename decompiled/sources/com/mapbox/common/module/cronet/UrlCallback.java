package com.mapbox.common.module.cronet;

import com.mapbox.common.HttpHeaders;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.NetworkUsageMetricsMeter;
import com.mapbox.common.ResponseReadStream;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.http_backend.ResponseData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.RegistryMissingComponentException;
import o.createFromParcel;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class UrlCallback extends UrlRequest.Callback {
    private AtomicReference<HttpRequestError> cancelReason;
    private final int chunkSize;
    private long expectedContentLength;
    private boolean failed;
    private final long id;
    private final RegistryMissingComponentException intermediateBuffer;
    private final boolean isHeadRequest;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 notifyObserverOnData;
    private final RequestObserver observer;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onRequestFinished;
    private StatusCallback statusCallback;
    private long totalBytesReceived;

    public interface StatusCallback {
        void onDone();

        void onRead();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        final HttpRequestError httpRequestError = this.cancelReason.get();
        if (httpRequestError == null) {
            httpRequestError = new HttpRequestError(HttpRequestErrorType.REQUEST_CANCELLED, "Request cancelled");
        }
        runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onCanceled.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4577invoke() {
                UrlCallback.this.failed = true;
                UrlCallback.this.observer.onFailed(UrlCallback.this.id, httpRequestError);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4577invoke();
                return createFromParcel.INSTANCE;
            }
        });
        StatusCallback statusCallback = this.statusCallback;
        if (statusCallback != null) {
            statusCallback.onDone();
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        String message;
        HttpRequestErrorType httpRequestErrorType = HttpRequestErrorType.OTHER_ERROR;
        if (cronetException instanceof NetworkException) {
            HttpRequestErrorType httpRequestErrorType2 = HttpRequestErrorType.CONNECTION_ERROR;
            int errorCode = ((NetworkException) cronetException).getErrorCode();
            if (errorCode == 4 || errorCode == 6) {
                httpRequestErrorType = HttpRequestErrorType.REQUEST_TIMED_OUT;
            } else if (errorCode != 11) {
                httpRequestErrorType = httpRequestErrorType2;
            }
        }
        if (cronetException != null) {
            message = cronetException.getMessage();
            if (message == null) {
                message = "Exception of type ".concat(cronetException.getClass().getSimpleName());
            }
        } else {
            message = "No info";
        }
        final HttpRequestError httpRequestError = new HttpRequestError(httpRequestErrorType, "Couldn't connect to server: ".concat(message));
        runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4578invoke() {
                UrlCallback.this.failed = true;
                UrlCallback.this.observer.onFailed(UrlCallback.this.id, httpRequestError);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4578invoke();
                return createFromParcel.INSTANCE;
            }
        });
        StatusCallback statusCallback = this.statusCallback;
        if (statusCallback != null) {
            statusCallback.onDone();
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        if (urlRequest != null) {
            urlRequest.followRedirect();
        }
    }

    public UrlCallback(long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        requestObserver.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        this.id = j;
        this.observer = requestObserver;
        this.onRequestFinished = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.isHeadRequest = z;
        this.chunkSize = 65536;
        this.intermediateBuffer = new RegistryMissingComponentException();
        this.cancelReason = new AtomicReference<>(null);
        this.notifyObserverOnData = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback$notifyObserverOnData$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4576invoke() {
                this.this$0.observer.onData(this.this$0.id);
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4576invoke();
                return createFromParcel.INSTANCE;
            }
        };
    }

    public final void getStatus(StatusCallback statusCallback) {
        statusCallback.getClass();
        this.statusCallback = statusCallback;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        int i;
        int iWrite;
        byteBuffer.getClass();
        byteBuffer.flip();
        try {
            synchronized (this) {
                i = 0;
                do {
                    iWrite = this.intermediateBuffer.write(byteBuffer);
                    i += iWrite;
                } while (iWrite > 0);
            }
            byteBuffer.clear();
            urlRequest.getClass();
            urlRequest.read(byteBuffer);
            if (i > 0) {
                this.totalBytesReceived += (long) i;
                StatusCallback statusCallback = this.statusCallback;
                if (statusCallback != null) {
                    statusCallback.onRead();
                }
                runCallback(urlRequest, this.notifyObserverOnData);
            }
        } catch (IOException e) {
            setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Error reading network buffer: " + e));
            if (urlRequest != null) {
                urlRequest.cancel();
            }
        }
    }

    public final void setCancelReason(HttpRequestError httpRequestError) {
        httpRequestError.getClass();
        this.cancelReason.set(httpRequestError);
    }

    private final void runCallback(UrlRequest urlRequest, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        try {
            if (this.failed) {
                return;
            }
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        } catch (Exception e) {
            if (urlRequest == null || !urlRequest.isDone()) {
                setCancelReason(new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Exception during callback: " + e));
                if (urlRequest != null) {
                    urlRequest.cancel();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // org.chromium.net.UrlRequest.Callback
    public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        if (this.isHeadRequest) {
            runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onSucceeded.2
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m4581invoke() {
                    UrlCallback.this.observer.onSucceeded(UrlCallback.this.id);
                }

                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m4581invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        } else {
            long j = this.expectedContentLength;
            if (j <= 0 || this.totalBytesReceived >= j) {
                runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onSucceeded.2
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m4581invoke() {
                        UrlCallback.this.observer.onSucceeded(UrlCallback.this.id);
                    }

                    {
                        super(0);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m4581invoke();
                        return createFromParcel.INSTANCE;
                    }
                });
            } else {
                runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onSucceeded.1
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m4580invoke() {
                        UrlCallback.this.failed = true;
                        UrlCallback.this.observer.onFailed(UrlCallback.this.id, new HttpRequestError(HttpRequestErrorType.CONNECTION_ERROR, "Truncated response: expected " + UrlCallback.this.expectedContentLength + " bytes but received " + UrlCallback.this.totalBytesReceived));
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m4580invoke();
                        return createFromParcel.INSTANCE;
                    }
                });
            }
        }
        StatusCallback statusCallback = this.statusCallback;
        if (statusCallback != null) {
            statusCallback.onDone();
        }
        this.onRequestFinished.invoke(Long.valueOf(this.id));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onResponseStarted(UrlRequest urlRequest, final UrlResponseInfo urlResponseInfo) {
        Long lParcelableVolumeInfo;
        if (urlRequest == null || urlResponseInfo == null) {
            if (urlRequest != null) {
                urlRequest.cancel();
                return;
            }
            return;
        }
        Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
        allHeaders.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : allHeaders.entrySet()) {
            if (entry.getValue().size() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            key.getClass();
            String lowerCase = ((String) key).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            linkedHashMap2.put(lowerCase, entry2.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), (String) ((List) entry3.getValue()).get(0));
        }
        final HashMap map = new HashMap(linkedHashMap3);
        NetworkUsageMetricsMeter.onHttpCodeReceived(urlResponseInfo.getHttpStatusCode());
        boolean zContainsKey = map.containsKey(HttpHeaders.CONTENT_ENCODING);
        String str = (String) map.get("content-length");
        this.expectedContentLength = (zContainsKey || str == null || (lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str)) == null) ? 0L : lParcelableVolumeInfo.longValue();
        runCallback(urlRequest, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.mapbox.common.module.cronet.UrlCallback.onResponseStarted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m4579invoke() {
                UrlCallback.this.observer.onResponse(UrlCallback.this.id, new ResponseData(map, urlResponseInfo.getHttpStatusCode(), new ResponseReadStream(UrlCallback.this.intermediateBuffer)));
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m4579invoke();
                return createFromParcel.INSTANCE;
            }
        });
        urlRequest.read(ByteBuffer.allocateDirect(this.chunkSize));
    }

    public /* synthetic */ UrlCallback(long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, requestObserver, r8lambdaunavo3sxub_pc9xroryotnrlvsm, (i & 8) != 0 ? false : z);
    }
}

package com.mapbox.common.module.okhttp;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.mapbox.bindgen.Value;
import com.mapbox.common.HttpRequestError;
import com.mapbox.common.HttpRequestErrorType;
import com.mapbox.common.HttpSslConfig;
import com.mapbox.common.MapboxCommonLogger;
import com.mapbox.common.ResultCallback;
import com.mapbox.common.SettingsService;
import com.mapbox.common.SettingsServiceFactory;
import com.mapbox.common.SettingsServiceStorageType;
import com.mapbox.common.experimental.wss_backend.Data;
import com.mapbox.common.experimental.wss_backend.Request;
import com.mapbox.common.experimental.wss_backend.RequestObserver;
import com.mapbox.common.experimental.wss_backend.Service;
import com.mapbox.common.module.NetworkIdGenerator;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ImageHeaderParserImageType;
import o.RequestBuilder;
import o.ViewUtilsExternalSyntheticLambda1;
import o._get_messageWebView_lambda0;
import o.finishWebViewDisplay;
import o.getCieXyz;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.setWebViewContent;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class WssBackend implements Service {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "WssBackend";
    public static final String verboseSettingName = "com.mapbox.common.network.wss.enable_android_verbose_logging";
    private volatile int builtWithSslGeneration = -1;
    private long pingTimeoutMs = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;
    private long connectTimeoutMs = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    private final ReentrantReadWriteLock clientLock = new ReentrantReadWriteLock();
    private r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 wssClient = buildWssClient();
    private final ConcurrentHashMap<Long, WebsocketObserverWrapper> socketMap = new ConcurrentHashMap<>();
    private final SettingsService settings = SettingsServiceFactory.getInstance(SettingsServiceStorageType.NON_PERSISTENT);

    private final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 buildWssClient() {
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        long j = this.connectTimeoutMs;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(j, timeUnit);
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.ResultReceiver = setWebViewContent.read("interval", this.pingTimeoutMs, timeUnit);
        HttpSslConfig httpSslConfig = HttpSslConfig.INSTANCE;
        int generation = httpSslConfig.getGeneration();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = httpSslConfig.get();
        if (onviewattachedtowindowlambda0 != null) {
            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer((SSLSocketFactory) onviewattachedtowindowlambda0.serializer, (X509TrustManager) onviewattachedtowindowlambda0.write);
        }
        this.builtWithSslGeneration = generation;
        return new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
    }

    public final void setConnectionTimeout(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.clientLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.connectTimeoutMs = j;
            this.wssClient = buildWssClient();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void setPingTimeout(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.clientLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.pingTimeoutMs = j;
            this.wssClient = buildWssClient();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void cancelConnection(long j, ResultCallback resultCallback) {
        resultCallback.getClass();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true)}, getCieXyz.write())).booleanValue();
        if (zBooleanValue) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Cancel for id " + j);
        }
        WebsocketObserverWrapper websocketObserverWrapperRemove = this.socketMap.remove(Long.valueOf(j));
        if (websocketObserverWrapperRemove != null) {
            if (zBooleanValue) {
                MapboxCommonLogger.INSTANCE.logD$common_release(TAG, m1$$ExternalSyntheticOutline0.m(j, "Cancel for id ", ": connection exists, closing and removing from socket map"));
            }
            websocketObserverWrapperRemove.setOnClosedCallback(resultCallback);
            ((ViewUtilsExternalSyntheticLambda1) websocketObserverWrapperRemove.getWebSocket()).RemoteActionCompatParcelizer(WebsocketObserverWrapper.Companion.getWebsocketClosedNormalCode(), "Closed by client");
            return;
        }
        if (zBooleanValue) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, m1$$ExternalSyntheticOutline0.m(j, "Cancel for id ", ": connection does not exist"));
        }
        try {
            resultCallback.run(false);
        } catch (Throwable unused) {
            if (zBooleanValue) {
                MapboxCommonLogger.INSTANCE.logD$common_release(TAG, m1$$ExternalSyntheticOutline0.m(j, "Cancel for id ", ": connection does not exist, callback crashed or null"));
            }
        }
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public long connect(Request request, RequestObserver requestObserver) {
        request.getClass();
        requestObserver.getClass();
        long jNewId = NetworkIdGenerator.INSTANCE.newId();
        int i = 0;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        _get_messagewebview_lambda0.write("GET", (RequestBody) null);
        String url = request.getUrl();
        url.getClass();
        _get_messagewebview_lambda0.read(url);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            key.getClass();
            value.getClass();
            _get_messagewebview_lambda0.serializer(key, value);
        }
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true)}, getCieXyz.write())).booleanValue();
        WebsocketObserverWrapper websocketObserverWrapper = new WebsocketObserverWrapper(requestObserver, jNewId, zBooleanValue);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        if (HttpSslConfig.INSTANCE.getGeneration() != this.builtWithSslGeneration) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.clientLock;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                if (HttpSslConfig.INSTANCE.getGeneration() != this.builtWithSslGeneration) {
                    this.wssClient = buildWssClient();
                }
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        }
        ReentrantReadWriteLock.ReadLock lock2 = this.clientLock.readLock();
        lock2.lock();
        try {
            r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = this.wssClient;
            lock2.unlock();
            websocketObserverWrapper.setWebSocket(r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.serializer(r8lambday113fdftsr5e4pzj6xssxltpl60, websocketObserverWrapper));
            this.socketMap.put(Long.valueOf(jNewId), websocketObserverWrapper);
            if (zBooleanValue) {
                MapboxCommonLogger.INSTANCE.logD$common_release(TAG, "Connecting, id " + jNewId + ", request " + r8lambday113fdftsr5e4pzj6xssxltpl60);
            }
            return jNewId;
        } catch (Throwable th2) {
            lock2.unlock();
            throw th2;
        }
    }

    @Override // com.mapbox.common.experimental.wss_backend.Service
    public void write(long j, Data data) {
        RequestObserver requestObserver;
        boolean zRemoteActionCompatParcelizer;
        data.getClass();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.settings.get(verboseSettingName, new Value(false)).getValue(), new Value(true)}, getCieXyz.write())).booleanValue();
        if (zBooleanValue) {
            if (data.isByteArray()) {
                MapboxCommonLogger mapboxCommonLogger = MapboxCommonLogger.INSTANCE;
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Write for id ", ": ");
                sbM.append(data.getByteArray().length);
                sbM.append(" bytes");
                mapboxCommonLogger.logD$common_release(TAG, sbM.toString());
            } else {
                MapboxCommonLogger mapboxCommonLogger2 = MapboxCommonLogger.INSTANCE;
                StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(j, "Write for id ", ": ");
                sbM2.append(data.getString());
                mapboxCommonLogger2.logD$common_release(TAG, sbM2.toString());
            }
        }
        WebsocketObserverWrapper websocketObserverWrapper = this.socketMap.get(Long.valueOf(j));
        if (websocketObserverWrapper != null) {
            if (data.isByteArray()) {
                finishWebViewDisplay webSocket = websocketObserverWrapper.getWebSocket();
                RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(data.getByteArray());
                byteBufferWrap.getClass();
                byte[] bArr = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr);
                RequestBuilder requestBuilder2 = new RequestBuilder(bArr);
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) webSocket;
                viewUtilsExternalSyntheticLambda1.getClass();
                zRemoteActionCompatParcelizer = viewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(2, requestBuilder2);
            } else {
                finishWebViewDisplay webSocket2 = websocketObserverWrapper.getWebSocket();
                String string = data.getString();
                string.getClass();
                ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda2 = (ViewUtilsExternalSyntheticLambda1) webSocket2;
                viewUtilsExternalSyntheticLambda2.getClass();
                RequestBuilder requestBuilder3 = RequestBuilder.EMPTY;
                zRemoteActionCompatParcelizer = viewUtilsExternalSyntheticLambda2.RemoteActionCompatParcelizer(1, ImageHeaderParserImageType.serializer(string));
            }
            if (zRemoteActionCompatParcelizer) {
                return;
            }
        }
        if (zBooleanValue) {
            MapboxCommonLogger.INSTANCE.logD$common_release(TAG, m1$$ExternalSyntheticOutline0.m(j, "Write for id ", " failed"));
        }
        HttpRequestError httpRequestError = new HttpRequestError(HttpRequestErrorType.OTHER_ERROR, "Message would overflow buffer or shutdown in progress");
        if (websocketObserverWrapper == null || (requestObserver = websocketObserverWrapper.getRequestObserver()) == null) {
            return;
        }
        requestObserver.onFailed(j, httpRequestError, null);
    }
}

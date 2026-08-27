package com.mapbox.common.module.okhttp;

import android.net.Network;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.SizedReadStream;
import com.mapbox.common.http_backend.Request;
import com.mapbox.common.http_backend.RequestObserver;
import com.mapbox.common.module.HttpClientDetail;
import com.mapbox.common.module.RequestDetail;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o._get_messageWebView_lambda0;
import o.applyDisplayCutoutMarginsToCloseButtonlambda0;
import o.clipCanvasToPath;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE;
import o.removeNodeAtDepth;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public final class OkHttpClientDetail implements HttpClientDetail {
    private final LazyClient httpClient = new LazyClient(null, false);
    private volatile Byte maxRequests;
    private volatile LazyClient restrictedClient;
    private volatile Network restrictedNetwork;

    @Override // com.mapbox.common.module.HttpClientDetail
    public boolean supportsKeepCompression() {
        return true;
    }

    private final r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 getClient(Network network) {
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0;
        if (network == null) {
            r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1 = this.httpClient.get();
            r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1.getClass();
            return r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg1;
        }
        if (network.equals(this.restrictedNetwork)) {
            LazyClient lazyClient = this.restrictedClient;
            lazyClient.getClass();
            r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg2 = lazyClient.get();
            r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg2.getClass();
            return r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg2;
        }
        synchronized (this) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.restrictedNetwork, network}, getCieXyz.write())).booleanValue()) {
                LazyClient lazyClient2 = this.restrictedClient;
                if (lazyClient2 != null && (r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = lazyClient2.get()) != null && (applydisplaycutoutmarginstoclosebuttonlambda0 = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0.dispatcher) != null) {
                    applydisplaycutoutmarginstoclosebuttonlambda0.MediaSessionCompatQueueItem().shutdown();
                }
                this.restrictedClient = new LazyClient(network.getSocketFactory(), false);
                this.restrictedNetwork = network;
                Byte b = this.maxRequests;
                if (b != null) {
                    byte bByteValue = b.byteValue();
                    LazyClient lazyClient3 = this.restrictedClient;
                    lazyClient3.getClass();
                    lazyClient3.setMaxRequestsPerHost(bByteValue);
                }
            }
        }
        LazyClient lazyClient4 = this.restrictedClient;
        lazyClient4.getClass();
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg3 = lazyClient4.get();
        r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg3.getClass();
        return r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg3;
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public Executor executor() {
        return this.httpClient.get().dispatcher.MediaSessionCompatQueueItem();
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public void setMaxRequestsPerHost(byte b) {
        this.httpClient.setMaxRequestsPerHost(b);
        synchronized (this) {
            this.maxRequests = Byte.valueOf(b);
            LazyClient lazyClient = this.restrictedClient;
            if (lazyClient != null) {
                lazyClient.setMaxRequestsPerHost(b);
            }
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            try {
                iArr[HttpMethod.HEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpMethod.GET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.mapbox.common.module.HttpClientDetail
    public RequestDetail buildRequest(Request request, long j, RequestObserver requestObserver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Network network) {
        request.getClass();
        requestObserver.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        String url = request.getUrl();
        url.getClass();
        _get_messagewebview_lambda0.read(url);
        String lowerCase = url.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        _get_messagewebview_lambda0.write(displayInAppMessagelambda1.serializer(Object.class), lowerCase);
        HashMap<String, String> headers = request.getHeaders();
        headers.getClass();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            key.getClass();
            value.getClass();
            _get_messagewebview_lambda0.serializer(key, value);
        }
        if ((request.getFlags() & 1) != 0) {
            _get_messagewebview_lambda0.serializer("Accept-Encoding", "gzip, deflate");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[request.getMethod().ordinal()];
        if (i == 1) {
            _get_messagewebview_lambda0.write("HEAD", (RequestBody) null);
        } else if (i == 2) {
            _get_messagewebview_lambda0.write("GET", (RequestBody) null);
        } else if (i == 3) {
            SizedReadStream body = request.getBody();
            if (body == null) {
                _get_messagewebview_lambda0.write("POST", r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE.RemoteActionCompatParcelizer(RequestBody.Companion, new byte[0], null, 0, 7));
            } else {
                _get_messagewebview_lambda0.write("POST", new StreamingRequestBody(body, null));
            }
        }
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
        r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0 client = getClient(network);
        client.getClass();
        clipCanvasToPath clipcanvastopath = new clipCanvasToPath(client, r8lambday113fdftsr5e4pzj6xssxltpl60, false);
        clipcanvastopath.timeout.IconCompatParcelizer(request.getTimeout(), TimeUnit.SECONDS);
        return new OkHttpRequestDetail(clipcanvastopath, new CallbackWrapper(this, j, clipcanvastopath, new HttpCallback(j, requestObserver, r8lambdaunavo3sxub_pc9xroryotnrlvsm), r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}

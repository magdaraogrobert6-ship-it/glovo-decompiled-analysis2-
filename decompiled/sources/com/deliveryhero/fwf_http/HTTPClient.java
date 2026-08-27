package com.deliveryhero.fwf_http;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_customer_profile.CustomerProfileConfig;
import com.deliveryhero.fwf_http.model.CustomerProfileRequestBody;
import com.deliveryhero.fwf_http.model.FeaturesConfigRequestBody;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_tracking.model.PerseusBrand;
import com.deliveryhero.fwf_tracking.model.PerseusDataRequestApi;
import com.deliveryhero.fwf_util.FwFSerializer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClient implements IHTTPClient {
    private final HTTPClientConfig config;
    private final IFwFHTTPRequestClient httpRequest;
    private final ILogger logger;
    private final MetricProvider metricProvider;
    private final FwFSerializer serializer;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_http.HTTPClient$getCustomerProfile$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HTTPClient.this.getCustomerProfile(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_http.HTTPClient$getFeaturesInitialData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01101 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01101(ShortNewsContentCardView<? super C01101> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HTTPClient.this.getFeaturesInitialData(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_http.HTTPClient$insertHits$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01111 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01111(ShortNewsContentCardView<? super C01111> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HTTPClient.this.insertHits(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_http.HTTPClient$insertHitsEcon$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01121(ShortNewsContentCardView<? super C01121> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HTTPClient.this.insertHitsEcon(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_http.HTTPClient$performProtoRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01131(ShortNewsContentCardView<? super C01131> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HTTPClient.this.performProtoRequest(null, null, null, null, 0L, this);
        }
    }

    public final HTTPClientConfig getConfig$fwf_client_release() {
        return this.config;
    }

    public final IFwFHTTPRequestClient getHttpRequest$fwf_client_release() {
        return this.httpRequest;
    }

    public final ILogger getLogger$fwf_client_release() {
        return this.logger;
    }

    public final MetricProvider getMetricProvider$fwf_client_release() {
        return this.metricProvider;
    }

    public final FwFSerializer getSerializer$fwf_client_release() {
        return this.serializer;
    }

    public enum FwFHTTPMethod {
        PUT("PUT"),
        GET("GET"),
        POST("POST");

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final String value;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }

        FwFHTTPMethod(String str) {
            this.value = str;
        }
    }

    public enum FwFStatusCode {
        OK(200),
        UNAUTHORIZED(Constant.ERROR_ALGO_NULL_RESULT);

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        private final int code;

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final int getCode() {
            return this.code;
        }

        FwFStatusCode(int i) {
            this.code = i;
        }
    }

    private final <T> FwFHTTPResponse<T> onResult(FwFHTTPResponse<T> fwFHTTPResponse, String str) {
        onViewAttachedToWindowlambda0 urlTag = MetricUtilsKt.getUrlTag(str);
        if (fwFHTTPResponse == null) {
            FwFHTTPResponse<T> fwFHTTPResponse2 = new FwFHTTPResponse<>(0, "Unknown error", null, 5, null);
            this.logger.logD(ConstantKt.MODULE_NAME, "An error occurred while executing request to " + str);
            MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_NETWORK_REQUEST_ERROR, 0L, onMove.RemoteActionCompatParcelizer(MetricUtilsKt.getErrorTag(fwFHTTPResponse2.getMessage()), urlTag), 2, null);
            return fwFHTTPResponse2;
        }
        if (fwFHTTPResponse.getStatusCode() != FwFStatusCode.OK.getCode()) {
            this.logger.logE(ConstantKt.MODULE_NAME, "Request respond with status code " + fwFHTTPResponse.getStatusCode() + " and message " + fwFHTTPResponse.getMessage());
            MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_NETWORK_REQUEST_ERROR, 0L, onMove.RemoteActionCompatParcelizer(MetricUtilsKt.getErrorTag(fwFHTTPResponse.getMessage()), urlTag), 2, null);
        }
        return fwFHTTPResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object performProtoRequest(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView) {
        C01131 c01131;
        String str4;
        Object objMeasureExecutionTimeSuspend$fwf_client_release;
        HTTPClient hTTPClient;
        if (shortNewsContentCardView instanceof C01131) {
            c01131 = (C01131) shortNewsContentCardView;
            int i = c01131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01131.label = i - Integer.MIN_VALUE;
            } else {
                c01131 = new C01131(shortNewsContentCardView);
            }
        } else {
            c01131 = new C01131(shortNewsContentCardView);
        }
        C01131 c01132 = c01131;
        Object obj = c01132.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01132.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_NETWORK_REQUEST_COUNT, 0L, onMove.serializer(MetricUtilsKt.getUrlTag(str2)), 2, null);
            MetricProvider metricProvider = this.metricProvider;
            Map<String, String> mapSerializer = onMove.serializer(MetricUtilsKt.getUrlTag(str2));
            HTTPClient$performProtoRequest$result$1 hTTPClient$performProtoRequest$result$1 = new HTTPClient$performProtoRequest$result$1(this, str, str2, map, str3, j, null);
            c01132.L$0 = this;
            str4 = str2;
            c01132.L$1 = str4;
            c01132.label = 1;
            objMeasureExecutionTimeSuspend$fwf_client_release = metricProvider.measureExecutionTimeSuspend$fwf_client_release(MetricUtilsKt.METRIC_NETWORK_REQUEST_DURATION, mapSerializer, hTTPClient$performProtoRequest$result$1, c01132);
            if (objMeasureExecutionTimeSuspend$fwf_client_release == coroutineSingletons) {
                return coroutineSingletons;
            }
            hTTPClient = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str5 = (String) c01132.L$1;
            hTTPClient = (HTTPClient) c01132.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objMeasureExecutionTimeSuspend$fwf_client_release = obj;
            str4 = str5;
        }
        return hTTPClient.onResult((FwFHTTPResponse) objMeasureExecutionTimeSuspend$fwf_client_release, str4);
    }

    @Override // com.deliveryhero.fwf_http.IHTTPClient
    public Object getFeatures(Map<String, Long> map, Map<String, Long> map2, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView) {
        String strEncode = FeaturesConfigRequestBody.Companion.encode(map, map2);
        String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.config.getUrl(), "/features-config/latest");
        Map<String, String> headers$fwf_client_release$default = getHeaders$fwf_client_release$default(this, this.config.getAccessToken(), null, 2, null);
        this.logger.logD(ConstantKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Executing request to ", strRemoteActionCompatParcelizer, ", with request body ", strEncode));
        return performProtoRequest(FwFHTTPMethod.PUT.getValue(), strRemoteActionCompatParcelizer, headers$fwf_client_release$default, strEncode, this.config.getRequestTimeout(), shortNewsContentCardView);
    }

    public HTTPClient(HTTPClientConfig hTTPClientConfig, ILogger iLogger, IFwFHTTPRequestClient iFwFHTTPRequestClient, MetricProvider metricProvider, FwFSerializer fwFSerializer) {
        hTTPClientConfig.getClass();
        iLogger.getClass();
        iFwFHTTPRequestClient.getClass();
        metricProvider.getClass();
        fwFSerializer.getClass();
        this.config = hTTPClientConfig;
        this.logger = iLogger;
        this.httpRequest = iFwFHTTPRequestClient;
        this.metricProvider = metricProvider;
        this.serializer = fwFSerializer;
        iLogger.logD(ConstantKt.MODULE_NAME, "Initializing FwF HTTP Client with the following config: " + hTTPClientConfig);
    }

    public static /* synthetic */ Map getHeaders$fwf_client_release$default(HTTPClient hTTPClient, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return hTTPClient.getHeaders$fwf_client_release(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.deliveryhero.fwf_http.IHTTPClient
    public Object getCustomerProfile(String str, Set<String> set, CustomerProfileConfig customerProfileConfig, ShortNewsContentCardView<? super FwFHTTPResponse<byte[]>> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        String str2;
        CustomerProfileConfig customerProfileConfig2;
        Set<String> set2;
        HTTPClient hTTPClient;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object jwt = anonymousClass2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(jwt);
            CustomerProfileConfig.AuthProvider authProvider = customerProfileConfig.getAuthProvider();
            anonymousClass2.L$0 = this;
            str2 = str;
            anonymousClass2.L$1 = str2;
            anonymousClass2.L$2 = set;
            customerProfileConfig2 = customerProfileConfig;
            anonymousClass2.L$3 = customerProfileConfig2;
            anonymousClass2.label = 1;
            jwt = authProvider.getJWT(anonymousClass2);
            if (jwt != coroutineSingletons) {
                set2 = set;
                hTTPClient = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(jwt);
                return jwt;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        CustomerProfileConfig customerProfileConfig3 = (CustomerProfileConfig) anonymousClass2.L$3;
        set2 = (Set) anonymousClass2.L$2;
        String str3 = (String) anonymousClass2.L$1;
        HTTPClient hTTPClient2 = (HTTPClient) anonymousClass2.L$0;
        ExtrasKt.RemoteActionCompatParcelizer(jwt);
        customerProfileConfig2 = customerProfileConfig3;
        str2 = str3;
        hTTPClient = hTTPClient2;
        String str4 = (String) jwt;
        if (!customerProfileConfig2.isValidJWT$fwf_client_release(str4)) {
            hTTPClient.logger.logE(ConstantKt.MODULE_NAME, "JWT is invalid, customer profile won't be requested");
            return new FwFHTTPResponse(0, "Invalid JWT", null, 5, null);
        }
        String strEncode = CustomerProfileRequestBody.Companion.encode(set2);
        String strM = af$$ExternalSyntheticOutline0.m(hTTPClient.config.getUrl(), "/customer-profile/", str2);
        Map<String, String> headers$fwf_client_release = hTTPClient.getHeaders$fwf_client_release(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Bearer ", str4), customerProfileConfig2.getGlobalEntityId());
        hTTPClient.logger.logD(ConstantKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Executing request to ", strM, ", with request body ", strEncode));
        String value = FwFHTTPMethod.PUT.getValue();
        long requestTimeout = customerProfileConfig2.getRequestTimeout();
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.label = 2;
        Object objPerformProtoRequest = hTTPClient.performProtoRequest(value, strM, headers$fwf_client_release, strEncode, requestTimeout, anonymousClass2);
        return objPerformProtoRequest == coroutineSingletons ? coroutineSingletons : objPerformProtoRequest;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.deliveryhero.fwf_http.IHTTPClient
    public Object getFeaturesInitialData(Map<String, Long> map, boolean z, ShortNewsContentCardView<? super byte[]> shortNewsContentCardView) {
        C01101 c01101;
        if (shortNewsContentCardView instanceof C01101) {
            c01101 = (C01101) shortNewsContentCardView;
            int i = c01101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01101.label = i - Integer.MIN_VALUE;
            } else {
                c01101 = new C01101(shortNewsContentCardView);
            }
        } else {
            c01101 = new C01101(shortNewsContentCardView);
        }
        C01101 c01102 = c01101;
        Object objPerformProtoRequest = c01102.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01102.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerformProtoRequest);
            String strEncode = FeaturesConfigRequestBody.Companion.encode(map, SimpleItemTouchHelperCallback.serializer);
            String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.config.getUrl(), "/features-config/latest");
            Map<String, String> mapWrite = onMove.write(getHeaders$fwf_client_release$default(this, this.config.getAccessToken(), null, 2, null));
            mapWrite.put(ConstantKt.SERVER_SDK_HEADER, String.valueOf(z));
            ILogger iLogger = this.logger;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Executing initial data request to ", strRemoteActionCompatParcelizer, ", with request body ", strEncode, ", and bundleType isServer = ");
            sbM.append(z);
            iLogger.logD(ConstantKt.MODULE_NAME, sbM.toString());
            String value = FwFHTTPMethod.PUT.getValue();
            long requestTimeout = this.config.getRequestTimeout();
            c01102.label = 1;
            objPerformProtoRequest = performProtoRequest(value, strRemoteActionCompatParcelizer, mapWrite, strEncode, requestTimeout, c01102);
            if (objPerformProtoRequest == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerformProtoRequest);
        }
        return ((FwFHTTPResponse) objPerformProtoRequest).getBody();
    }

    public final Map<String, String> getHeaders$fwf_client_release(String str, String str2) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Authorization", str);
        linkedHashMap.put(ConstantKt.SDK_INFO_HEADER, "FwFMultiplatformSDK:7.0.1");
        linkedHashMap.put(ConstantKt.USER_AGENT_HEADER, PlatformKt.getPlatform().getDeviceOS().getValue() + ":" + PlatformKt.getPlatform().getDeviceVersion());
        linkedHashMap.put(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        linkedHashMap.put(ConstantKt.SERVER_SDK_HEADER, String.valueOf(PlatformKt.getPlatform().isServer()));
        if (str2 != null) {
            linkedHashMap.put(ConstantKt.GLOBAL_ENTITY_ID_HEADER, str2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.deliveryhero.fwf_http.IPerseusHTTPClient
    public Object insertHits(String str, PerseusBrand perseusBrand, long j, PerseusDataRequestApi perseusDataRequestApi, ShortNewsContentCardView<? super String> shortNewsContentCardView) {
        C01111 c01111;
        if (shortNewsContentCardView instanceof C01111) {
            c01111 = (C01111) shortNewsContentCardView;
            int i = c01111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01111.label = i - Integer.MIN_VALUE;
            } else {
                c01111 = new C01111(shortNewsContentCardView);
            }
        } else {
            c01111 = new C01111(shortNewsContentCardView);
        }
        C01111 c01112 = c01111;
        Object objPerformJsonRequest$fwf_client_release = c01112.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01112.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerformJsonRequest$fwf_client_release);
            String strEncode = perseusDataRequestApi.encode(this.logger, this.serializer);
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("https://", str, "/v1/insert/", perseusBrand.getValue$fwf_client_release(), "/hits");
            this.logger.logD(ConstantKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Executing request to ", strWrite, ", with request body ", strEncode));
            String value = FwFHTTPMethod.POST.getValue();
            Map<String, String> mapSingletonMap = Collections.singletonMap(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
            mapSingletonMap.getClass();
            c01112.label = 1;
            objPerformJsonRequest$fwf_client_release = performJsonRequest$fwf_client_release(value, strWrite, mapSingletonMap, strEncode, j, c01112);
            if (objPerformJsonRequest$fwf_client_release == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerformJsonRequest$fwf_client_release);
        }
        return ((FwFHTTPResponse) objPerformJsonRequest$fwf_client_release).getBody();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.deliveryhero.fwf_http.IPerseusHTTPClient
    public Object insertHitsEcon(String str, long j, PerseusDataRequestApi perseusDataRequestApi, ShortNewsContentCardView<? super String> shortNewsContentCardView) {
        C01121 c01121;
        if (shortNewsContentCardView instanceof C01121) {
            c01121 = (C01121) shortNewsContentCardView;
            int i = c01121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01121.label = i - Integer.MIN_VALUE;
            } else {
                c01121 = new C01121(shortNewsContentCardView);
            }
        } else {
            c01121 = new C01121(shortNewsContentCardView);
        }
        C01121 c01122 = c01121;
        Object objPerformJsonRequest$fwf_client_release = c01122.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01122.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objPerformJsonRequest$fwf_client_release);
            String strEncode = perseusDataRequestApi.encode(this.logger, this.serializer);
            String strM = ff$$ExternalSyntheticOutline0.m("https://", str, "/v1/econ/insert/global-service-experiments/hits");
            this.logger.logD(ConstantKt.MODULE_NAME, af$$ExternalSyntheticOutline0.m("Executing request to ", strM, ", with request body ", strEncode));
            String value = FwFHTTPMethod.POST.getValue();
            Map<String, String> mapSingletonMap = Collections.singletonMap(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
            mapSingletonMap.getClass();
            c01122.label = 1;
            objPerformJsonRequest$fwf_client_release = performJsonRequest$fwf_client_release(value, strM, mapSingletonMap, strEncode, j, c01122);
            if (objPerformJsonRequest$fwf_client_release == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objPerformJsonRequest$fwf_client_release);
        }
        return ((FwFHTTPResponse) objPerformJsonRequest$fwf_client_release).getBody();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object performJsonRequest$fwf_client_release(String str, String str2, Map<String, String> map, String str3, long j, ShortNewsContentCardView<? super FwFHTTPResponse<String>> shortNewsContentCardView) {
        HTTPClient$performJsonRequest$1 hTTPClient$performJsonRequest$1;
        HTTPClient hTTPClient;
        String str4 = str2;
        if (shortNewsContentCardView instanceof HTTPClient$performJsonRequest$1) {
            hTTPClient$performJsonRequest$1 = (HTTPClient$performJsonRequest$1) shortNewsContentCardView;
            int i = hTTPClient$performJsonRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hTTPClient$performJsonRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                hTTPClient$performJsonRequest$1 = new HTTPClient$performJsonRequest$1(this, shortNewsContentCardView);
            }
        } else {
            hTTPClient$performJsonRequest$1 = new HTTPClient$performJsonRequest$1(this, shortNewsContentCardView);
        }
        HTTPClient$performJsonRequest$1 hTTPClient$performJsonRequest$2 = hTTPClient$performJsonRequest$1;
        Object objMeasureExecutionTimeSuspend$fwf_client_release = hTTPClient$performJsonRequest$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = hTTPClient$performJsonRequest$2.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
            MetricProvider.incrementCounter$fwf_client_release$default(this.metricProvider, MetricUtilsKt.METRIC_NETWORK_REQUEST_COUNT, 0L, onMove.serializer(MetricUtilsKt.getUrlTag(str2)), 2, null);
            MetricProvider metricProvider = this.metricProvider;
            Map<String, String> mapSingletonMap = Collections.singletonMap("url", str4);
            mapSingletonMap.getClass();
            HTTPClient$performJsonRequest$result$1 hTTPClient$performJsonRequest$result$1 = new HTTPClient$performJsonRequest$result$1(this, str, str2, map, str3, j, null);
            hTTPClient$performJsonRequest$2.L$0 = this;
            hTTPClient$performJsonRequest$2.L$1 = str4;
            hTTPClient$performJsonRequest$2.label = 1;
            objMeasureExecutionTimeSuspend$fwf_client_release = metricProvider.measureExecutionTimeSuspend$fwf_client_release(MetricUtilsKt.METRIC_NETWORK_REQUEST_DURATION, mapSingletonMap, hTTPClient$performJsonRequest$result$1, hTTPClient$performJsonRequest$2);
            if (objMeasureExecutionTimeSuspend$fwf_client_release == coroutineSingletons) {
                return coroutineSingletons;
            }
            hTTPClient = this;
        } else if (i2 == 1) {
            String str5 = (String) hTTPClient$performJsonRequest$2.L$1;
            hTTPClient = (HTTPClient) hTTPClient$performJsonRequest$2.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
            str4 = str5;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        return hTTPClient.onResult((FwFHTTPResponse) objMeasureExecutionTimeSuspend$fwf_client_release, str4);
    }
}

package com.deliveryhero.fwf_client;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_cache.ICache;
import com.deliveryhero.fwf_cache.MemoryCache;
import com.deliveryhero.fwf_cache.sql.CacheDriverFactory;
import com.deliveryhero.fwf_cache.sql.FwFCacheSQL;
import com.deliveryhero.fwf_client.model.DecodeResult;
import com.deliveryhero.fwf_client.model.ProtoFeatureMsg;
import com.deliveryhero.fwf_client.model.ProtoParserKt;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.fwf_customer_profile.CustomerProfileClient;
import com.deliveryhero.fwf_customer_profile.CustomerProfileConfig;
import com.deliveryhero.fwf_evaluator.Evaluator;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.Feature;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.fwf_http.HTTPClient;
import com.deliveryhero.fwf_http.IHTTPClient;
import com.deliveryhero.fwf_http.PlatformKt;
import com.deliveryhero.fwf_http.model.FwFHTTPResponse;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_tracking.ExposureHandler;
import com.deliveryhero.fwf_tracking.FwFTrackingService;
import com.deliveryhero.fwf_tracking.model.FwFEventValueTransformer;
import com.deliveryhero.fwf_tracking.model.PerseusBrand;
import com.deliveryhero.fwf_util.FwFSerializer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onItemDismiss;
import o.onItemDismisslambda0;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClient {
    public static final Companion Companion = new Companion(null);
    private final setCustomInAppMessageAnimationFactorylambda0 bootstrapLock;
    private final onViewDetachedFromWindowlambda1 cache$delegate;
    private final CacheDriverFactory cacheDriverFactory;
    private final ICache cacheImplementation;
    private final FwFClientConfig config;
    private final onViewDetachedFromWindowlambda1 customerProfileClientDelegate;
    private final CustomerProfileConfig customerProfileConfig;
    private final Set<String> errorKeys;
    private final Evaluator evaluator;
    private final ExposureHandler exposureHandler;
    private final FwFEventValueTransformer fwfEventValueTransformer;
    private final IHTTPClient httpClient;
    private final ILogger logger;
    private final MetricProvider metricProvider;
    private byte[] pendingInitialData;
    private final MemoryCache providedCache;
    private final FwFSerializer serializer;
    private Timer timer;
    private final onViewDetachedFromWindowlambda1 trackingServiceDelegate;
    private final User user;

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFClient.this.addFeatureKeys(null, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClient$bootstrapIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01031(ShortNewsContentCardView<? super C01031> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFClient.this.bootstrapIfNeeded(this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClient$startUpdater$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C01041 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
            return ((FwFClient) this.MediaMetadataCompat).updateFeatures(shortNewsContentCardView);
        }

        public C01041(Object obj) {
            super(1, 0, FwFClient.class, obj, "updateFeatures", "updateFeatures(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClient$updateFeatures$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01051 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01051(ShortNewsContentCardView<? super C01051> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFClient.this.updateFeatures(this);
        }
    }

    public final CacheDriverFactory getCacheDriverFactory$fwf_client_release() {
        return this.cacheDriverFactory;
    }

    public final ICache getCacheImplementation$fwf_client_release() {
        return this.cacheImplementation;
    }

    public final FwFClientConfig getConfig$fwf_client_release() {
        return this.config;
    }

    public final CustomerProfileConfig getCustomerProfileConfig() {
        return this.customerProfileConfig;
    }

    public final CustomerProfileConfig getCustomerProfileConfig$fwf_client_release() {
        return this.customerProfileConfig;
    }

    public final ExposureHandler getExposureHandler$fwf_client_release() {
        return this.exposureHandler;
    }

    public final FwFEventValueTransformer getFwfEventValueTransformer$fwf_client_release() {
        return this.fwfEventValueTransformer;
    }

    public final IHTTPClient getHttpClient$fwf_client_release() {
        return this.httpClient;
    }

    public final ILogger getLogger$fwf_client_release() {
        return this.logger;
    }

    public final MetricProvider getMetricProvider$fwf_client_release() {
        return this.metricProvider;
    }

    public final MemoryCache getProvidedCache$fwf_client_release() {
        return this.providedCache;
    }

    public final FwFSerializer getSerializer$fwf_client_release() {
        return this.serializer;
    }

    public final Timer getTimer$fwf_client_release() {
        return this.timer;
    }

    public final User getUser$fwf_client_release() {
        return this.user;
    }

    public final void setTimer$fwf_client_release(Timer timer) {
        this.timer = timer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startUpdater() {
        if (!this.config.getUpdateFeatures$fwf_client_release()) {
            this.logger.logW(FwFClientKt.MODULE_NAME, "FwFClient automatic updates are disabled");
            return;
        }
        if (this.timer == null) {
            this.timer = new Timer(TimerKt.RESOURCE_FEATURES, this.logger, this.config.getFeaturesExpirationTime$fwf_client_release(), new C01041(this));
        }
        Timer timer = this.timer;
        if (timer != null) {
            timer.startTimer();
        }
    }

    public final MemoryCache getCache$fwf_client_release() {
        return (MemoryCache) this.cache$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final CustomerProfileClient getCustomerProfileClient$fwf_client_release() {
        return (CustomerProfileClient) this.customerProfileClientDelegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final Set<String> getFeatureKeys() {
        return RangesKt.RemoteActionCompatParcelizer((Set) this.config.getFeatureKeys$fwf_client_release(), (Iterable) this.errorKeys);
    }

    public final FwFTrackingService getTrackingService$fwf_client_release() {
        return (FwFTrackingService) this.trackingServiceDelegate.MediaSessionCompatResultReceiverWrapper();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FwFClient(FwFClientConfig fwFClientConfig, MetricProvider metricProvider, ILogger iLogger, IHTTPClient iHTTPClient, MemoryCache memoryCache, CacheDriverFactory cacheDriverFactory, ICache iCache, byte[] bArr, CustomerProfileConfig customerProfileConfig, FwFEventValueTransformer fwFEventValueTransformer, ExposureHandler exposureHandler, FwFSerializer fwFSerializer) {
        fwFClientConfig.getClass();
        metricProvider.getClass();
        iLogger.getClass();
        iHTTPClient.getClass();
        fwFSerializer.getClass();
        this.config = fwFClientConfig;
        this.metricProvider = metricProvider;
        this.logger = iLogger;
        this.httpClient = iHTTPClient;
        this.providedCache = memoryCache;
        this.cacheDriverFactory = cacheDriverFactory;
        this.cacheImplementation = iCache;
        this.customerProfileConfig = customerProfileConfig;
        this.fwfEventValueTransformer = fwFEventValueTransformer;
        this.exposureHandler = exposureHandler;
        this.serializer = fwFSerializer;
        this.errorKeys = new LinkedHashSet();
        this.evaluator = new Evaluator(metricProvider);
        this.bootstrapLock = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
        this.pendingInitialData = bArr;
        this.user = new User(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("fwfDeviceOS", PlatformKt.getPlatform().getDeviceOS()), new onViewAttachedToWindowlambda0("fwfOSVersion", PlatformKt.getPlatform().getDeviceVersion())));
        if (memoryCache == null && iCache == null && cacheDriverFactory == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("FwFClient requires either cache, cacheImplementation or cacheDriverFactory");
            throw null;
        }
        this.cache$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.FwFClient$cache$2
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final MemoryCache invoke() {
                return this.this$0.createCache();
            }

            {
                super(0);
            }
        });
        this.customerProfileClientDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.FwFClient$customerProfileClientDelegate$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final CustomerProfileClient invoke() {
                CustomerProfileConfig customerProfileConfig$fwf_client_release = this.this$0.getCustomerProfileConfig$fwf_client_release();
                if (customerProfileConfig$fwf_client_release == null) {
                    return null;
                }
                FwFClient fwFClient = this.this$0;
                return new CustomerProfileClient(customerProfileConfig$fwf_client_release, fwFClient.getHttpClient$fwf_client_release(), fwFClient.getCache$fwf_client_release(), fwFClient.getLogger$fwf_client_release(), fwFClient.getUser$fwf_client_release(), fwFClient.getMetricProvider$fwf_client_release(), fwFClient.getSerializer$fwf_client_release());
            }

            {
                super(0);
            }
        });
        this.trackingServiceDelegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.FwFClient$trackingServiceDelegate$1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final FwFTrackingService invoke() {
                ExposureHandler exposureHandler$fwf_client_release = this.this$0.getExposureHandler$fwf_client_release();
                if (exposureHandler$fwf_client_release == null) {
                    return null;
                }
                FwFClient fwFClient = this.this$0;
                return new FwFTrackingService(fwFClient.getCache$fwf_client_release(), fwFClient.getMetricProvider$fwf_client_release(), fwFClient.getLogger$fwf_client_release(), fwFClient.getHttpClient$fwf_client_release(), fwFClient.getFwfEventValueTransformer$fwf_client_release(), exposureHandler$fwf_client_release);
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemoryCache createCache() {
        MemoryCache memoryCache = this.providedCache;
        if (memoryCache != null) {
            return memoryCache;
        }
        ICache fwFCacheSQL = this.cacheImplementation;
        if (fwFCacheSQL == null) {
            CacheDriverFactory cacheDriverFactory = this.cacheDriverFactory;
            fwFCacheSQL = cacheDriverFactory != null ? new FwFCacheSQL(cacheDriverFactory, this.logger) : null;
            if (fwFCacheSQL == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("FwFClient requires either cacheImplementation or cacheDriverFactory");
                return null;
            }
        }
        return new MemoryCache(fwFCacheSQL, this.config.getAccessToken$fwf_client_release(), this.logger, this.metricProvider, this.serializer, this.config.getUseRuntimeKeys$fwf_client_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00c0 A[Catch: all -> 0x01c4, TRY_ENTER, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3 A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7 A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8 A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0113 A[Catch: all -> 0x01c4, TRY_LEAVE, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0135 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:14:0x0034, B:53:0x012d, B:55:0x0135, B:57:0x013c, B:58:0x014d, B:60:0x0153, B:62:0x0165, B:63:0x0171, B:65:0x0185, B:66:0x018c, B:31:0x00a4), top: B:82:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013c A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:14:0x0034, B:53:0x012d, B:55:0x0135, B:57:0x013c, B:58:0x014d, B:60:0x0153, B:62:0x0165, B:63:0x0171, B:65:0x0185, B:66:0x018c, B:31:0x00a4), top: B:82:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0153 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:14:0x0034, B:53:0x012d, B:55:0x0135, B:57:0x013c, B:58:0x014d, B:60:0x0153, B:62:0x0165, B:63:0x0171, B:65:0x0185, B:66:0x018c, B:31:0x00a4), top: B:82:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0185 A[Catch: all -> 0x01c7, TryCatch #1 {all -> 0x01c7, blocks: (B:14:0x0034, B:53:0x012d, B:55:0x0135, B:57:0x013c, B:58:0x014d, B:60:0x0153, B:62:0x0165, B:63:0x0171, B:65:0x0185, B:66:0x018c, B:31:0x00a4), top: B:82:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01a1 A[Catch: all -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x01c4, blocks: (B:35:0x00b6, B:38:0x00c0, B:40:0x00d3, B:42:0x00d7, B:43:0x00e1, B:45:0x00e8, B:47:0x010b, B:49:0x0113, B:68:0x01a1), top: B:81:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x014d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00e8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x01d4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.deliveryhero.fwf_client.FwFClient] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.deliveryhero.fwf_client.FwFClient] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.deliveryhero.fwf_client.FwFClient] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final Object updateFeatures(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        C01051 c01051;
        ?? r3;
        ?? r1;
        Throwable thSerializer;
        FwFClient fwFClient;
        ?? r9;
        FwFClient fwFClient2;
        FwFHTTPResponse fwFHTTPResponse;
        byte[] bArr;
        FwFClient fwFClient3;
        Timer timer;
        DecodeResult decodeResult;
        String error;
        LinkedHashMap linkedHashMap;
        Set<String> setKeySet;
        if (shortNewsContentCardView instanceof C01051) {
            c01051 = (C01051) shortNewsContentCardView;
            int i = c01051.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01051.label = i - Integer.MIN_VALUE;
            } else {
                c01051 = new C01051(shortNewsContentCardView);
            }
        } else {
            c01051 = new C01051(shortNewsContentCardView);
        }
        C01051 c01052 = c01051;
        Object featuresToUpdate$fwf_client_release = c01052.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r2 = c01052.label;
        try {
            if (r2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(featuresToUpdate$fwf_client_release);
                Set<String> setRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer((Set) this.config.getFeatureKeys$fwf_client_release(), (Iterable) this.errorKeys);
                MemoryCache cache$fwf_client_release = getCache$fwf_client_release();
                long featuresExpirationTime$fwf_client_release = this.config.getFeaturesExpirationTime$fwf_client_release();
                c01052.L$0 = this;
                c01052.label = 1;
                featuresToUpdate$fwf_client_release = cache$fwf_client_release.getFeaturesToUpdate$fwf_client_release(setRemoteActionCompatParcelizer, featuresExpirationTime$fwf_client_release, c01052);
                if (featuresToUpdate$fwf_client_release != coroutineSingletons) {
                    fwFClient = this;
                }
                return coroutineSingletons;
            }
            if (r2 == 1) {
                FwFClient fwFClient4 = (FwFClient) c01052.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(featuresToUpdate$fwf_client_release);
                fwFClient = fwFClient4;
            } else {
                if (r2 == 2) {
                    FwFClient fwFClient5 = (FwFClient) c01052.L$1;
                    r3 = (FwFClient) c01052.L$0;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(featuresToUpdate$fwf_client_release);
                        fwFClient2 = fwFClient5;
                        r9 = r3;
                        try {
                            fwFHTTPResponse = (FwFHTTPResponse) featuresToUpdate$fwf_client_release;
                            if (!fwFHTTPResponse.isSuccess$fwf_client_release()) {
                                fwFClient2.logger.logE(FwFClientKt.MODULE_NAME, "An error occurred while retrieving features from server, features may be outdated");
                                if (fwFHTTPResponse.getStatusCode() == HTTPClient.FwFStatusCode.UNAUTHORIZED.getCode()) {
                                    timer = fwFClient2.timer;
                                    if (timer != null) {
                                        fwFClient2.logger.logE(FwFClientKt.MODULE_NAME, "FwFClient request authorization failed, auto-updates will remain disabled.");
                                        timer.cancelTimer();
                                    }
                                    return SyncResult.Companion.unAuthorizedResult();
                                }
                                return SyncResult.Companion.errorResult("Status code: " + fwFHTTPResponse.getStatusCode() + " - " + fwFHTTPResponse.getMessage());
                            }
                            bArr = (byte[]) fwFHTTPResponse.getBody();
                            if (bArr != null) {
                                MemoryCache cache$fwf_client_release2 = fwFClient2.getCache$fwf_client_release();
                                ILogger iLogger = fwFClient2.logger;
                                FwFSerializer fwFSerializer = fwFClient2.serializer;
                                MetricProvider metricProvider = fwFClient2.metricProvider;
                                c01052.L$0 = r9;
                                c01052.L$1 = fwFClient2;
                                c01052.label = 3;
                                featuresToUpdate$fwf_client_release = ProtoParserKt.decodeProtoAndCache(bArr, cache$fwf_client_release2, iLogger, fwFSerializer, metricProvider, c01052);
                                if (featuresToUpdate$fwf_client_release != coroutineSingletons) {
                                    fwFClient3 = fwFClient2;
                                }
                                return coroutineSingletons;
                            }
                            return SyncResult.Companion.errorResult("Response body is null, status code: " + fwFHTTPResponse.getStatusCode() + " - " + fwFHTTPResponse.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            r3 = r9;
                            thSerializer = onItemDismiss.serializer(new isItemDismissable(th));
                            if (thSerializer != null) {
                                r1 = r3;
                                r1.logger.logD(FwFClientKt.MODULE_NAME, "Everything is up to date");
                                return SyncResult.Companion.successResult();
                            }
                            r3.logger.logE(FwFClientKt.MODULE_NAME, "Updating features result in error, " + thSerializer);
                            return SyncResult.Companion.errorResult(String.valueOf(thSerializer));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        thSerializer = onItemDismiss.serializer(new isItemDismissable(th));
                        if (thSerializer != null) {
                            r1 = r3;
                            r1.logger.logD(FwFClientKt.MODULE_NAME, "Everything is up to date");
                            return SyncResult.Companion.successResult();
                        }
                        r3.logger.logE(FwFClientKt.MODULE_NAME, "Updating features result in error, " + thSerializer);
                        return SyncResult.Companion.errorResult(String.valueOf(thSerializer));
                    }
                }
                if (r2 == 3) {
                    FwFClient fwFClient6 = (FwFClient) c01052.L$1;
                    ExtrasKt.RemoteActionCompatParcelizer(featuresToUpdate$fwf_client_release);
                    fwFClient3 = fwFClient6;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                decodeResult = (DecodeResult) featuresToUpdate$fwf_client_release;
                error = decodeResult.getError();
                if (error != null) {
                    return SyncResult.Companion.errorResult(error);
                }
                Map<String, Boolean> features = decodeResult.getFeatures();
                linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry : features.entrySet()) {
                    if (entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
                fwFClient3.errorKeys.addAll(setKeySet);
                if (fwFClient3.config.getUseRuntimeKeys$fwf_client_release()) {
                    fwFClient3.getCache$fwf_client_release().deleteRuntimeFeatureKeys$fwf_client_release(setKeySet);
                }
                fwFClient3.getCache$fwf_client_release().setFeaturesUpdateTime$fwf_client_release();
                fwFClient3.logger.logD(FwFClientKt.MODULE_NAME, "Features were updated successfully");
                return SyncResult.Companion.successResult();
            }
            Map<String, Long> map = (Map) featuresToUpdate$fwf_client_release;
            r1 = fwFClient;
            if (!map.isEmpty()) {
                Map<String, Long> holdoutKeys$fwf_client_release = fwFClient.getCache$fwf_client_release().getHoldoutKeys$fwf_client_release();
                fwFClient.logger.logD(FwFClientKt.MODULE_NAME, "Outdated or non-present features found: " + map);
                IHTTPClient iHTTPClient = fwFClient.httpClient;
                c01052.L$0 = fwFClient;
                c01052.L$1 = fwFClient;
                c01052.label = 2;
                featuresToUpdate$fwf_client_release = iHTTPClient.getFeatures(map, holdoutKeys$fwf_client_release, c01052);
                if (featuresToUpdate$fwf_client_release != coroutineSingletons) {
                    FwFClient fwFClient7 = fwFClient;
                    r9 = fwFClient7;
                    fwFClient2 = fwFClient7;
                    fwFHTTPResponse = (FwFHTTPResponse) featuresToUpdate$fwf_client_release;
                    if (!fwFHTTPResponse.isSuccess$fwf_client_release()) {
                        fwFClient2.logger.logE(FwFClientKt.MODULE_NAME, "An error occurred while retrieving features from server, features may be outdated");
                        if (fwFHTTPResponse.getStatusCode() == HTTPClient.FwFStatusCode.UNAUTHORIZED.getCode()) {
                            timer = fwFClient2.timer;
                            if (timer != null) {
                                fwFClient2.logger.logE(FwFClientKt.MODULE_NAME, "FwFClient request authorization failed, auto-updates will remain disabled.");
                                timer.cancelTimer();
                            }
                            return SyncResult.Companion.unAuthorizedResult();
                        }
                        return SyncResult.Companion.errorResult("Status code: " + fwFHTTPResponse.getStatusCode() + " - " + fwFHTTPResponse.getMessage());
                    }
                    bArr = (byte[]) fwFHTTPResponse.getBody();
                    if (bArr != null) {
                        MemoryCache cache$fwf_client_release3 = fwFClient2.getCache$fwf_client_release();
                        ILogger iLogger2 = fwFClient2.logger;
                        FwFSerializer fwFSerializer2 = fwFClient2.serializer;
                        MetricProvider metricProvider2 = fwFClient2.metricProvider;
                        c01052.L$0 = r9;
                        c01052.L$1 = fwFClient2;
                        c01052.label = 3;
                        featuresToUpdate$fwf_client_release = ProtoParserKt.decodeProtoAndCache(bArr, cache$fwf_client_release3, iLogger2, fwFSerializer2, metricProvider2, c01052);
                        if (featuresToUpdate$fwf_client_release != coroutineSingletons) {
                            fwFClient3 = fwFClient2;
                            decodeResult = (DecodeResult) featuresToUpdate$fwf_client_release;
                            error = decodeResult.getError();
                            if (error != null) {
                                return SyncResult.Companion.errorResult(error);
                            }
                            Map<String, Boolean> features2 = decodeResult.getFeatures();
                            linkedHashMap = new LinkedHashMap();
                            while (r11.hasNext()) {
                                if (entry.getValue().booleanValue()) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            setKeySet = linkedHashMap.keySet();
                            fwFClient3.errorKeys.addAll(setKeySet);
                            if (fwFClient3.config.getUseRuntimeKeys$fwf_client_release()) {
                                fwFClient3.getCache$fwf_client_release().deleteRuntimeFeatureKeys$fwf_client_release(setKeySet);
                            }
                            fwFClient3.getCache$fwf_client_release().setFeaturesUpdateTime$fwf_client_release();
                            fwFClient3.logger.logD(FwFClientKt.MODULE_NAME, "Features were updated successfully");
                            return SyncResult.Companion.successResult();
                        }
                    } else {
                        return SyncResult.Companion.errorResult("Response body is null, status code: " + fwFHTTPResponse.getStatusCode() + " - " + fwFHTTPResponse.getMessage());
                    }
                }
                return coroutineSingletons;
            }
        } catch (Throwable th3) {
            th = th3;
            r3 = r2;
        }
        r1.logger.logD(FwFClientKt.MODULE_NAME, "Everything is up to date");
        return SyncResult.Companion.successResult();
    }

    @onItemDismisslambda0
    public final void close() {
        FwFTrackingService trackingService$fwf_client_release;
        CustomerProfileClient customerProfileClient$fwf_client_release;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancelTimer();
        }
        if (this.customerProfileClientDelegate.MediaSessionCompatToken() && (customerProfileClient$fwf_client_release = getCustomerProfileClient$fwf_client_release()) != null) {
            customerProfileClient$fwf_client_release.cancelTimer$fwf_client_release();
        }
        if (!this.trackingServiceDelegate.MediaSessionCompatToken() || (trackingService$fwf_client_release = getTrackingService$fwf_client_release()) == null) {
            return;
        }
        BuildersKt.write(new FwFClient$close$1$1(trackingService$fwf_client_release, null));
    }

    public final Object closeAsync(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        FwFTrackingService fwFTrackingService;
        Object objShutdown$fwf_client_release;
        CustomerProfileClient customerProfileClient;
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancelTimer();
        }
        if (this.customerProfileClientDelegate.MediaSessionCompatToken() && (customerProfileClient = (CustomerProfileClient) this.customerProfileClientDelegate.MediaSessionCompatResultReceiverWrapper()) != null) {
            customerProfileClient.cancelTimer$fwf_client_release();
        }
        return (this.trackingServiceDelegate.MediaSessionCompatToken() && (fwFTrackingService = (FwFTrackingService) this.trackingServiceDelegate.MediaSessionCompatResultReceiverWrapper()) != null && (objShutdown$fwf_client_release = fwFTrackingService.shutdown$fwf_client_release(shortNewsContentCardView)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objShutdown$fwf_client_release : createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x013b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0155 A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:15:0x0053, B:38:0x0155, B:41:0x0174, B:20:0x0083), top: B:58:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0173  */
    /* JADX WARN: Code duplicated, block: B:41:0x0174 A[Catch: Exception -> 0x01a7, PHI: r0 r3 r4 r5 r6 r7 r8 r10 r14 r15
  0x0174: PHI (r0v8 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r3v3 ??) = (r3v21 ??), (r3v22 ??) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r4v3 ??) = (r4v15 ??), (r4v16 ??) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r5v4 ??) = (r5v26 ??), (r5v27 ??) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r6v2 ??) = (r6v23 ??), (r6v24 ??) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r7v2 java.util.Map) = (r7v3 java.util.Map), (r7v19 java.util.Map) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r8v2 com.deliveryhero.fwf_tracking.model.PerseusBrand) = (r8v3 com.deliveryhero.fwf_tracking.model.PerseusBrand), (r8v17 com.deliveryhero.fwf_tracking.model.PerseusBrand) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r10v3 ??) = (r10v20 ??), (r10v21 ??) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r14v2 java.util.Map<java.lang.String, java.lang.String>) = (r14v3 java.util.Map<java.lang.String, java.lang.String>), (r14v11 java.util.Map<java.lang.String, java.lang.String>) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x0174: PHI (r15v2 com.deliveryhero.fwf_evaluator.model.User) = (r15v3 com.deliveryhero.fwf_evaluator.model.User), (r15v11 com.deliveryhero.fwf_evaluator.model.User) binds: [B:39:0x0171, B:20:0x0083] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x01a7, blocks: (B:15:0x0053, B:38:0x0155, B:41:0x0174, B:20:0x0083), top: B:58:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.deliveryhero.fwf_client.FwFClient] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.deliveryhero.fwf_client.FwFClient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.deliveryhero.fwf_client.FwFClient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.deliveryhero.fwf_evaluator.model.EvalResult$Companion] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.deliveryhero.fwf_evaluator.Evaluator] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.deliveryhero.fwf_evaluator.model.EvalResult$Companion] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01a0 -> B:46:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x01c1 -> B:56:0x01d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object evaluateFeatures$fwf_client_release(java.util.Map<java.lang.String, ? extends java.lang.Object> r20, com.deliveryhero.fwf_evaluator.model.User r21, java.util.Map<java.lang.String, java.lang.String> r22, com.deliveryhero.fwf_tracking.model.PerseusBrand r23, o.ShortNewsContentCardView<? super java.util.Map<java.lang.String, com.deliveryhero.fwf_evaluator.model.EvalResult>> r24) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.FwFClient.evaluateFeatures$fwf_client_release(java.util.Map, com.deliveryhero.fwf_evaluator.model.User, java.util.Map, com.deliveryhero.fwf_tracking.model.PerseusBrand, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object bootstrapIfNeeded(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        C01031 c01031;
        FwFClient fwFClient;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        if (shortNewsContentCardView instanceof C01031) {
            c01031 = (C01031) shortNewsContentCardView;
            int i = c01031.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01031.label = i - Integer.MIN_VALUE;
            } else {
                c01031 = new C01031(shortNewsContentCardView);
            }
        } else {
            c01031 = new C01031(shortNewsContentCardView);
        }
        Object obj = c01031.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01031.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1 = this.bootstrapLock;
            c01031.L$0 = this;
            c01031.L$1 = setcustominappmessageanimationfactorylambda1;
            c01031.label = 1;
            if (setcustominappmessageanimationfactorylambda1.lock(c01031) == coroutineSingletons) {
                return coroutineSingletons;
            }
            fwFClient = this;
            setcustominappmessageanimationfactorylambda0 = setcustominappmessageanimationfactorylambda1;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            setcustominappmessageanimationfactorylambda0 = (setCustomInAppMessageAnimationFactorylambda0) c01031.L$1;
            fwFClient = (FwFClient) c01031.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        try {
            byte[] bArr = fwFClient.pendingInitialData;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (bArr == null) {
                return createfromparcel;
            }
            fwFClient.pendingInitialData = null;
            fwFClient.getCache$fwf_client_release().bootstrapInitialData$fwf_client_release(bArr);
            return createfromparcel;
        } finally {
            setcustominappmessageanimationfactorylambda0.write(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r8 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addFeatureKeys(java.util.Set<java.lang.String> r7, o.ShortNewsContentCardView<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.deliveryhero.fwf_client.FwFClient.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$1 r0 = (com.deliveryhero.fwf_client.FwFClient.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.label = r1
            goto L18
        L13:
            com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$1 r0 = new com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L64
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r5
        L31:
            java.lang.Object r7 = r0.L$1
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r2 = r0.L$0
            com.deliveryhero.fwf_client.FwFClient r2 = (com.deliveryhero.fwf_client.FwFClient) r2
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L4e
        L3d:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.bootstrapIfNeeded(r0)
            if (r8 != r1) goto L4d
            goto L63
        L4d:
            r2 = r6
        L4e:
            kotlinx.coroutines.scheduling.DefaultScheduler r8 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r8 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$featuresUpdated$1 r4 = new com.deliveryhero.fwf_client.FwFClient$addFeatureKeys$featuresUpdated$1
            r4.<init>(r2, r7, r5)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r4, r0)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.fwf_client.FwFClient.addFeatureKeys(java.util.Set, o.ShortNewsContentCardView):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d4 A[Catch: Exception -> 0x003b, TryCatch #1 {Exception -> 0x003b, blocks: (B:15:0x0037, B:43:0x00eb, B:38:0x00d0, B:40:0x00d4, B:47:0x010b), top: B:59:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #1 {Exception -> 0x003b, blocks: (B:15:0x0037, B:43:0x00eb, B:38:0x00d0, B:40:0x00d4, B:47:0x010b), top: B:59:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.deliveryhero.fwf_evaluator.model.EvalResult$Companion] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.deliveryhero.fwf_evaluator.model.User, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.deliveryhero.fwf_evaluator.model.User, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.deliveryhero.fwf_evaluator.model.User, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.deliveryhero.fwf_evaluator.model.User] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.deliveryhero.fwf_evaluator.model.Feature] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.deliveryhero.fwf_evaluator.Evaluator] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object evaluateFeature$fwf_client_release(String str, Object obj, User user, Map<String, String> map, PerseusBrand perseusBrand, ShortNewsContentCardView<? super EvalResult> shortNewsContentCardView) {
        FwFClient$evaluateFeature$1 fwFClient$evaluateFeature$1;
        String message;
        FwFClient fwFClient;
        FwFClient fwFClient2;
        ?? r13;
        Object obj2;
        ?? r11;
        PerseusBrand perseusBrand2;
        ?? r15;
        EvalResult evalResultEvaluateFeature;
        FwFTrackingService trackingService$fwf_client_release;
        ?? r14;
        ?? r12;
        ProtoFeatureMsg protoFeatureMsg;
        ?? r16;
        if (shortNewsContentCardView instanceof FwFClient$evaluateFeature$1) {
            fwFClient$evaluateFeature$1 = (FwFClient$evaluateFeature$1) shortNewsContentCardView;
            int i = fwFClient$evaluateFeature$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwFClient$evaluateFeature$1.label = i - Integer.MIN_VALUE;
            } else {
                fwFClient$evaluateFeature$1 = new FwFClient$evaluateFeature$1(this, shortNewsContentCardView);
            }
        } else {
            fwFClient$evaluateFeature$1 = new FwFClient$evaluateFeature$1(this, shortNewsContentCardView);
        }
        Object asFeature = fwFClient$evaluateFeature$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fwFClient$evaluateFeature$1.label;
        try {
            try {
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                    fwFClient$evaluateFeature$1.L$0 = this;
                    fwFClient$evaluateFeature$1.L$1 = str;
                    fwFClient$evaluateFeature$1.L$2 = obj;
                    fwFClient$evaluateFeature$1.L$3 = user;
                    fwFClient$evaluateFeature$1.L$4 = map;
                    fwFClient$evaluateFeature$1.L$5 = perseusBrand;
                    fwFClient$evaluateFeature$1.label = 1;
                    if (bootstrapIfNeeded(fwFClient$evaluateFeature$1) != coroutineSingletons) {
                        fwFClient = this;
                        user = user;
                        r16 = map;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    try {
                        if (i2 == 2) {
                            perseusBrand2 = (PerseusBrand) fwFClient$evaluateFeature$1.L$4;
                            Map map2 = (Map) fwFClient$evaluateFeature$1.L$3;
                            User user2 = (User) fwFClient$evaluateFeature$1.L$2;
                            Object obj3 = fwFClient$evaluateFeature$1.L$1;
                            fwFClient2 = (FwFClient) fwFClient$evaluateFeature$1.L$0;
                            ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                            r14 = map2;
                            r12 = user2;
                            obj2 = obj3;
                            protoFeatureMsg = (ProtoFeatureMsg) asFeature;
                            if (protoFeatureMsg != null) {
                                return EvalResult.Companion.getFallbackResult(User.getEvaluatedUserAttributes$fwf_client_release$default(r12, null, 1, null), obj2, "Feature was not found in cache");
                            }
                            MemoryCache cache$fwf_client_release = fwFClient2.getCache$fwf_client_release();
                            fwFClient$evaluateFeature$1.L$0 = fwFClient2;
                            fwFClient$evaluateFeature$1.L$1 = obj2;
                            fwFClient$evaluateFeature$1.L$2 = r12;
                            fwFClient$evaluateFeature$1.L$3 = r14;
                            fwFClient$evaluateFeature$1.L$4 = perseusBrand2;
                            fwFClient$evaluateFeature$1.label = 3;
                            asFeature = protoFeatureMsg.getAsFeature(cache$fwf_client_release, fwFClient$evaluateFeature$1);
                            if (asFeature == coroutineSingletons) {
                                r11 = r12;
                                r13 = r14;
                            }
                            return coroutineSingletons;
                        }
                        if (i2 != 3) {
                            if (i2 != 4) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            EvalResult evalResult = (EvalResult) fwFClient$evaluateFeature$1.L$2;
                            Object obj4 = fwFClient$evaluateFeature$1.L$0;
                            ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                            return evalResult;
                        }
                        perseusBrand2 = (PerseusBrand) fwFClient$evaluateFeature$1.L$4;
                        Map map3 = (Map) fwFClient$evaluateFeature$1.L$3;
                        User user3 = (User) fwFClient$evaluateFeature$1.L$2;
                        Object obj5 = fwFClient$evaluateFeature$1.L$1;
                        fwFClient2 = (FwFClient) fwFClient$evaluateFeature$1.L$0;
                        ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                        r13 = map3;
                        r11 = user3;
                        obj2 = obj5;
                    } catch (Exception e) {
                        e = e;
                        ?? r17 = EvalResult.Companion;
                        Map evaluatedUserAttributes$fwf_client_release$default = User.getEvaluatedUserAttributes$fwf_client_release$default(user, null, 1, null);
                        message = e.getMessage();
                        if (message == null) {
                            message = "Unknown error";
                        }
                        return r17.getFallbackResult(evaluatedUserAttributes$fwf_client_release$default, map, message);
                    }
                } else {
                    perseusBrand = (PerseusBrand) fwFClient$evaluateFeature$1.L$5;
                    Map map4 = (Map) fwFClient$evaluateFeature$1.L$4;
                    User user4 = (User) fwFClient$evaluateFeature$1.L$3;
                    obj = fwFClient$evaluateFeature$1.L$2;
                    str = (String) fwFClient$evaluateFeature$1.L$1;
                    fwFClient = (FwFClient) fwFClient$evaluateFeature$1.L$0;
                    ExtrasKt.RemoteActionCompatParcelizer(asFeature);
                    user = user4;
                    r16 = map4;
                }
                r11 = r12;
                r13 = r14;
                r15 = (Feature) asFeature;
                evalResultEvaluateFeature = fwFClient2.evaluator.evaluateFeature(r15, r11, obj2);
                trackingService$fwf_client_release = fwFClient2.getTrackingService$fwf_client_release();
                fwFClient$evaluateFeature$1.L$0 = obj2;
                fwFClient$evaluateFeature$1.L$1 = r11;
                fwFClient$evaluateFeature$1.L$2 = evalResultEvaluateFeature;
                fwFClient$evaluateFeature$1.L$3 = null;
                fwFClient$evaluateFeature$1.L$4 = null;
                fwFClient$evaluateFeature$1.label = 4;
                if (r15.trackEvent$fwf_client_release(trackingService$fwf_client_release, r13, perseusBrand2, fwFClient$evaluateFeature$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return evalResultEvaluateFeature;
                MemoryCache cache$fwf_client_release2 = fwFClient.getCache$fwf_client_release();
                fwFClient$evaluateFeature$1.L$0 = fwFClient;
                fwFClient$evaluateFeature$1.L$1 = obj;
                fwFClient$evaluateFeature$1.L$2 = user;
                fwFClient$evaluateFeature$1.L$3 = r16;
                fwFClient$evaluateFeature$1.L$4 = perseusBrand;
                fwFClient$evaluateFeature$1.L$5 = null;
                fwFClient$evaluateFeature$1.label = 2;
                asFeature = cache$fwf_client_release2.getFeature(str, fwFClient$evaluateFeature$1);
                if (asFeature != coroutineSingletons) {
                    perseusBrand2 = perseusBrand;
                    fwFClient2 = fwFClient;
                    ?? r8 = user;
                    obj2 = obj;
                    r12 = r8;
                    r14 = r16;
                    protoFeatureMsg = (ProtoFeatureMsg) asFeature;
                    if (protoFeatureMsg != null) {
                        return EvalResult.Companion.getFallbackResult(User.getEvaluatedUserAttributes$fwf_client_release$default(r12, null, 1, null), obj2, "Feature was not found in cache");
                    }
                    MemoryCache cache$fwf_client_release3 = fwFClient2.getCache$fwf_client_release();
                    fwFClient$evaluateFeature$1.L$0 = fwFClient2;
                    fwFClient$evaluateFeature$1.L$1 = obj2;
                    fwFClient$evaluateFeature$1.L$2 = r12;
                    fwFClient$evaluateFeature$1.L$3 = r14;
                    fwFClient$evaluateFeature$1.L$4 = perseusBrand2;
                    fwFClient$evaluateFeature$1.label = 3;
                    asFeature = protoFeatureMsg.getAsFeature(cache$fwf_client_release3, fwFClient$evaluateFeature$1);
                    if (asFeature == coroutineSingletons) {
                        r11 = r12;
                        r13 = r14;
                    } else {
                        r11 = r12;
                        r13 = r14;
                        r15 = (Feature) asFeature;
                        evalResultEvaluateFeature = fwFClient2.evaluator.evaluateFeature(r15, r11, obj2);
                        trackingService$fwf_client_release = fwFClient2.getTrackingService$fwf_client_release();
                        fwFClient$evaluateFeature$1.L$0 = obj2;
                        fwFClient$evaluateFeature$1.L$1 = r11;
                        fwFClient$evaluateFeature$1.L$2 = evalResultEvaluateFeature;
                        fwFClient$evaluateFeature$1.L$3 = null;
                        fwFClient$evaluateFeature$1.L$4 = null;
                        fwFClient$evaluateFeature$1.label = 4;
                        if (r15.trackEvent$fwf_client_release(trackingService$fwf_client_release, r13, perseusBrand2, fwFClient$evaluateFeature$1) != coroutineSingletons) {
                            return evalResultEvaluateFeature;
                        }
                    }
                }
                return coroutineSingletons;
            } catch (Exception e2) {
                e = e2;
                map = obj;
                ?? r18 = EvalResult.Companion;
                Map evaluatedUserAttributes$fwf_client_release$default2 = User.getEvaluatedUserAttributes$fwf_client_release$default(user, null, 1, null);
                message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return r18.getFallbackResult(evaluatedUserAttributes$fwf_client_release$default2, map, message);
            }
        } catch (Exception e3) {
            e = e3;
            map = user;
            user = obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getEvaluation$fwf_client_release(String str, Object obj, User user, Map<String, String> map, PerseusBrand perseusBrand, ShortNewsContentCardView<? super EvalResult> shortNewsContentCardView) {
        FwFClient$getEvaluation$1 fwFClient$getEvaluation$1;
        Object obj2;
        User user2;
        FwFClient fwFClient;
        Map<String, String> map2;
        String str2;
        PerseusBrand perseusBrand2;
        PerseusBrand perseusBrand3;
        FwFClient fwFClient2;
        Object obj3;
        String str3;
        Map<String, String> map3;
        User user3;
        EvalResult evalResult;
        String str4;
        FwFClient fwFClient3;
        EvalResult evalResult2;
        MemoryCache cache$fwf_client_release;
        if (shortNewsContentCardView instanceof FwFClient$getEvaluation$1) {
            fwFClient$getEvaluation$1 = (FwFClient$getEvaluation$1) shortNewsContentCardView;
            int i = fwFClient$getEvaluation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwFClient$getEvaluation$1.label = i - Integer.MIN_VALUE;
            } else {
                fwFClient$getEvaluation$1 = new FwFClient$getEvaluation$1(this, shortNewsContentCardView);
            }
        } else {
            fwFClient$getEvaluation$1 = new FwFClient$getEvaluation$1(this, shortNewsContentCardView);
        }
        Object objEvaluateFeature$fwf_client_release = fwFClient$getEvaluation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fwFClient$getEvaluation$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objEvaluateFeature$fwf_client_release);
            fwFClient$getEvaluation$1.L$0 = this;
            fwFClient$getEvaluation$1.L$1 = str;
            obj2 = obj;
            fwFClient$getEvaluation$1.L$2 = obj2;
            user2 = user;
            fwFClient$getEvaluation$1.L$3 = user2;
            fwFClient$getEvaluation$1.L$4 = map;
            fwFClient$getEvaluation$1.L$5 = perseusBrand;
            fwFClient$getEvaluation$1.label = 1;
            if (bootstrapIfNeeded(fwFClient$getEvaluation$1) != coroutineSingletons) {
                fwFClient = this;
                map2 = map;
                str2 = str;
                perseusBrand2 = perseusBrand;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            PerseusBrand perseusBrand4 = (PerseusBrand) fwFClient$getEvaluation$1.L$5;
            map2 = (Map) fwFClient$getEvaluation$1.L$4;
            user2 = (User) fwFClient$getEvaluation$1.L$3;
            Object obj4 = fwFClient$getEvaluation$1.L$2;
            str2 = (String) fwFClient$getEvaluation$1.L$1;
            fwFClient = (FwFClient) fwFClient$getEvaluation$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objEvaluateFeature$fwf_client_release);
            perseusBrand2 = perseusBrand4;
            obj2 = obj4;
        } else {
            if (i2 == 2) {
                PerseusBrand perseusBrand5 = (PerseusBrand) fwFClient$getEvaluation$1.L$5;
                Map<String, String> map4 = (Map) fwFClient$getEvaluation$1.L$4;
                user3 = (User) fwFClient$getEvaluation$1.L$3;
                Object obj5 = fwFClient$getEvaluation$1.L$2;
                String str5 = (String) fwFClient$getEvaluation$1.L$1;
                FwFClient fwFClient4 = (FwFClient) fwFClient$getEvaluation$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objEvaluateFeature$fwf_client_release);
                str3 = str5;
                fwFClient2 = fwFClient4;
                perseusBrand3 = perseusBrand5;
                map3 = map4;
                obj3 = obj5;
                evalResult = (EvalResult) objEvaluateFeature$fwf_client_release;
                if (evalResult != null) {
                    return evalResult;
                }
                fwFClient$getEvaluation$1.L$0 = fwFClient2;
                fwFClient$getEvaluation$1.L$1 = str3;
                fwFClient$getEvaluation$1.L$2 = null;
                fwFClient$getEvaluation$1.L$3 = null;
                fwFClient$getEvaluation$1.L$4 = null;
                fwFClient$getEvaluation$1.L$5 = null;
                fwFClient$getEvaluation$1.label = 3;
                objEvaluateFeature$fwf_client_release = fwFClient2.evaluateFeature$fwf_client_release(str3, obj3, user3, map3, perseusBrand3, fwFClient$getEvaluation$1);
                if (objEvaluateFeature$fwf_client_release != coroutineSingletons) {
                    str4 = str3;
                    fwFClient3 = fwFClient2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                EvalResult evalResult3 = (EvalResult) fwFClient$getEvaluation$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objEvaluateFeature$fwf_client_release);
                return evalResult3;
            }
            str4 = (String) fwFClient$getEvaluation$1.L$1;
            fwFClient3 = (FwFClient) fwFClient$getEvaluation$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objEvaluateFeature$fwf_client_release);
        }
        evalResult2 = (EvalResult) objEvaluateFeature$fwf_client_release;
        cache$fwf_client_release = fwFClient3.getCache$fwf_client_release();
        fwFClient$getEvaluation$1.L$0 = evalResult2;
        fwFClient$getEvaluation$1.L$1 = null;
        fwFClient$getEvaluation$1.label = 4;
        if (cache$fwf_client_release.setEvaluation$fwf_client_release(str4, evalResult2, fwFClient$getEvaluation$1) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return evalResult2;
        MemoryCache cache$fwf_client_release2 = fwFClient.getCache$fwf_client_release();
        fwFClient$getEvaluation$1.L$0 = fwFClient;
        fwFClient$getEvaluation$1.L$1 = str2;
        fwFClient$getEvaluation$1.L$2 = obj2;
        fwFClient$getEvaluation$1.L$3 = user2;
        fwFClient$getEvaluation$1.L$4 = map2;
        fwFClient$getEvaluation$1.L$5 = perseusBrand2;
        fwFClient$getEvaluation$1.label = 2;
        Object evaluation$fwf_client_release = cache$fwf_client_release2.getEvaluation$fwf_client_release(str2, fwFClient$getEvaluation$1);
        if (evaluation$fwf_client_release != coroutineSingletons) {
            perseusBrand3 = perseusBrand2;
            objEvaluateFeature$fwf_client_release = evaluation$fwf_client_release;
            fwFClient2 = fwFClient;
            obj3 = obj2;
            str3 = str2;
            User user4 = user2;
            map3 = map2;
            user3 = user4;
            evalResult = (EvalResult) objEvaluateFeature$fwf_client_release;
            if (evalResult != null) {
                return evalResult;
            }
            fwFClient$getEvaluation$1.L$0 = fwFClient2;
            fwFClient$getEvaluation$1.L$1 = str3;
            fwFClient$getEvaluation$1.L$2 = null;
            fwFClient$getEvaluation$1.L$3 = null;
            fwFClient$getEvaluation$1.L$4 = null;
            fwFClient$getEvaluation$1.L$5 = null;
            fwFClient$getEvaluation$1.label = 3;
            objEvaluateFeature$fwf_client_release = fwFClient2.evaluateFeature$fwf_client_release(str3, obj3, user3, map3, perseusBrand3, fwFClient$getEvaluation$1);
            if (objEvaluateFeature$fwf_client_release != coroutineSingletons) {
                str4 = str3;
                fwFClient3 = fwFClient2;
                evalResult2 = (EvalResult) objEvaluateFeature$fwf_client_release;
                cache$fwf_client_release = fwFClient3.getCache$fwf_client_release();
                fwFClient$getEvaluation$1.L$0 = evalResult2;
                fwFClient$getEvaluation$1.L$1 = null;
                fwFClient$getEvaluation$1.label = 4;
                if (cache$fwf_client_release.setEvaluation$fwf_client_release(str4, evalResult2, fwFClient$getEvaluation$1) != coroutineSingletons) {
                    return evalResult2;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getEvaluations$fwf_client_release(Map<String, ? extends Object> map, User user, Map<String, String> map2, PerseusBrand perseusBrand, ShortNewsContentCardView<? super Map<String, EvalResult>> shortNewsContentCardView) {
        FwFClient$getEvaluations$1 fwFClient$getEvaluations$1;
        FwFClient fwFClient;
        User user2;
        Map<String, String> map3;
        FwFClient fwFClient2;
        Map<String, ? extends Object> map4;
        PerseusBrand perseusBrand2;
        Map map5;
        Object objEvaluateFeatures$fwf_client_release;
        Map map6;
        Map<String, EvalResult> map7;
        MemoryCache cache$fwf_client_release;
        Map map8;
        Map<String, EvalResult> map9;
        if (shortNewsContentCardView instanceof FwFClient$getEvaluations$1) {
            fwFClient$getEvaluations$1 = (FwFClient$getEvaluations$1) shortNewsContentCardView;
            int i = fwFClient$getEvaluations$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwFClient$getEvaluations$1.label = i - Integer.MIN_VALUE;
            } else {
                fwFClient$getEvaluations$1 = new FwFClient$getEvaluations$1(this, shortNewsContentCardView);
            }
        } else {
            fwFClient$getEvaluations$1 = new FwFClient$getEvaluations$1(this, shortNewsContentCardView);
        }
        Object evaluations$fwf_client_release = fwFClient$getEvaluations$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fwFClient$getEvaluations$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(evaluations$fwf_client_release);
            fwFClient$getEvaluations$1.L$0 = this;
            fwFClient$getEvaluations$1.L$1 = map;
            fwFClient$getEvaluations$1.L$2 = user;
            fwFClient$getEvaluations$1.L$3 = map2;
            fwFClient$getEvaluations$1.L$4 = perseusBrand;
            fwFClient$getEvaluations$1.label = 1;
            if (bootstrapIfNeeded(fwFClient$getEvaluations$1) != coroutineSingletons) {
                fwFClient = this;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            perseusBrand = (PerseusBrand) fwFClient$getEvaluations$1.L$4;
            map2 = (Map) fwFClient$getEvaluations$1.L$3;
            user = (User) fwFClient$getEvaluations$1.L$2;
            map = (Map) fwFClient$getEvaluations$1.L$1;
            fwFClient = (FwFClient) fwFClient$getEvaluations$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(evaluations$fwf_client_release);
        } else {
            if (i2 == 2) {
                perseusBrand2 = (PerseusBrand) fwFClient$getEvaluations$1.L$4;
                Map<String, String> map10 = (Map) fwFClient$getEvaluations$1.L$3;
                User user3 = (User) fwFClient$getEvaluations$1.L$2;
                map4 = (Map) fwFClient$getEvaluations$1.L$1;
                FwFClient fwFClient3 = (FwFClient) fwFClient$getEvaluations$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(evaluations$fwf_client_release);
                map3 = map10;
                user2 = user3;
                fwFClient2 = fwFClient3;
                map5 = (Map) evaluations$fwf_client_release;
                Map<String, ? extends Object> mapIconCompatParcelizer = onMove.IconCompatParcelizer(map4, map5.keySet());
                fwFClient$getEvaluations$1.L$0 = fwFClient2;
                fwFClient$getEvaluations$1.L$1 = map5;
                fwFClient$getEvaluations$1.L$2 = null;
                fwFClient$getEvaluations$1.L$3 = null;
                fwFClient$getEvaluations$1.L$4 = null;
                fwFClient$getEvaluations$1.label = 3;
                objEvaluateFeatures$fwf_client_release = fwFClient2.evaluateFeatures$fwf_client_release(mapIconCompatParcelizer, user2, map3, perseusBrand2, fwFClient$getEvaluations$1);
                if (objEvaluateFeatures$fwf_client_release != coroutineSingletons) {
                    evaluations$fwf_client_release = objEvaluateFeatures$fwf_client_release;
                    map6 = map5;
                    map7 = (Map) evaluations$fwf_client_release;
                    cache$fwf_client_release = fwFClient2.getCache$fwf_client_release();
                    fwFClient$getEvaluations$1.L$0 = map6;
                    fwFClient$getEvaluations$1.L$1 = map7;
                    fwFClient$getEvaluations$1.label = 4;
                    if (cache$fwf_client_release.setEvaluations$fwf_client_release(map7, fwFClient$getEvaluations$1) != coroutineSingletons) {
                        map8 = map6;
                        map9 = map7;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                map6 = (Map) fwFClient$getEvaluations$1.L$1;
                fwFClient2 = (FwFClient) fwFClient$getEvaluations$1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(evaluations$fwf_client_release);
                map7 = (Map) evaluations$fwf_client_release;
                cache$fwf_client_release = fwFClient2.getCache$fwf_client_release();
                fwFClient$getEvaluations$1.L$0 = map6;
                fwFClient$getEvaluations$1.L$1 = map7;
                fwFClient$getEvaluations$1.label = 4;
                if (cache$fwf_client_release.setEvaluations$fwf_client_release(map7, fwFClient$getEvaluations$1) != coroutineSingletons) {
                    map8 = map6;
                    map9 = map7;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map9 = (Map) fwFClient$getEvaluations$1.L$1;
            map8 = (Map) fwFClient$getEvaluations$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(evaluations$fwf_client_release);
        }
        return onMove.RemoteActionCompatParcelizer(map8, map9);
        MemoryCache cache$fwf_client_release2 = fwFClient.getCache$fwf_client_release();
        Set<String> setKeySet = map.keySet();
        fwFClient$getEvaluations$1.L$0 = fwFClient;
        fwFClient$getEvaluations$1.L$1 = map;
        fwFClient$getEvaluations$1.L$2 = user;
        fwFClient$getEvaluations$1.L$3 = map2;
        fwFClient$getEvaluations$1.L$4 = perseusBrand;
        fwFClient$getEvaluations$1.label = 2;
        evaluations$fwf_client_release = cache$fwf_client_release2.getEvaluations$fwf_client_release(setKeySet, fwFClient$getEvaluations$1);
        if (evaluations$fwf_client_release != coroutineSingletons) {
            user2 = user;
            map3 = map2;
            fwFClient2 = fwFClient;
            PerseusBrand perseusBrand3 = perseusBrand;
            map4 = map;
            perseusBrand2 = perseusBrand3;
            map5 = (Map) evaluations$fwf_client_release;
            Map<String, ? extends Object> mapIconCompatParcelizer2 = onMove.IconCompatParcelizer(map4, map5.keySet());
            fwFClient$getEvaluations$1.L$0 = fwFClient2;
            fwFClient$getEvaluations$1.L$1 = map5;
            fwFClient$getEvaluations$1.L$2 = null;
            fwFClient$getEvaluations$1.L$3 = null;
            fwFClient$getEvaluations$1.L$4 = null;
            fwFClient$getEvaluations$1.label = 3;
            objEvaluateFeatures$fwf_client_release = fwFClient2.evaluateFeatures$fwf_client_release(mapIconCompatParcelizer2, user2, map3, perseusBrand2, fwFClient$getEvaluations$1);
            if (objEvaluateFeatures$fwf_client_release != coroutineSingletons) {
                evaluations$fwf_client_release = objEvaluateFeatures$fwf_client_release;
                map6 = map5;
                map7 = (Map) evaluations$fwf_client_release;
                cache$fwf_client_release = fwFClient2.getCache$fwf_client_release();
                fwFClient$getEvaluations$1.L$0 = map6;
                fwFClient$getEvaluations$1.L$1 = map7;
                fwFClient$getEvaluations$1.label = 4;
                if (cache$fwf_client_release.setEvaluations$fwf_client_release(map7, fwFClient$getEvaluations$1) != coroutineSingletons) {
                    map8 = map6;
                    map9 = map7;
                    return onMove.RemoteActionCompatParcelizer(map8, map9);
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncClient$fwf_client_release(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        FwFClient$syncClient$1 fwFClient$syncClient$1;
        FwFClient fwFClient;
        if (shortNewsContentCardView instanceof FwFClient$syncClient$1) {
            fwFClient$syncClient$1 = (FwFClient$syncClient$1) shortNewsContentCardView;
            int i = fwFClient$syncClient$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwFClient$syncClient$1.label = i - Integer.MIN_VALUE;
            } else {
                fwFClient$syncClient$1 = new FwFClient$syncClient$1(this, shortNewsContentCardView);
            }
        } else {
            fwFClient$syncClient$1 = new FwFClient$syncClient$1(this, shortNewsContentCardView);
        }
        Object objMeasureExecutionTimeSuspend$fwf_client_release = fwFClient$syncClient$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fwFClient$syncClient$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
            if (this.config.getOfflineMode$fwf_client_release()) {
                this.logger.logW(FwFClientKt.MODULE_NAME, "FwFClient is offline, no updates will be performed");
                return SyncResult.Companion.successResult();
            }
            MetricProvider metricProvider = this.metricProvider;
            Map<String, String> mapSingletonMap = Collections.singletonMap("features_count", String.valueOf(this.config.getFeatureKeys$fwf_client_release().size()));
            mapSingletonMap.getClass();
            FwFClient$syncClient$syncResult$1 fwFClient$syncClient$syncResult$1 = new FwFClient$syncClient$syncResult$1(this, null);
            fwFClient$syncClient$1.L$0 = this;
            fwFClient$syncClient$1.label = 1;
            objMeasureExecutionTimeSuspend$fwf_client_release = metricProvider.measureExecutionTimeSuspend$fwf_client_release(MetricUtilsKt.METRIC_FEATURES_SYNC_DURATION, mapSingletonMap, fwFClient$syncClient$syncResult$1, fwFClient$syncClient$1);
            if (objMeasureExecutionTimeSuspend$fwf_client_release == coroutineSingletons) {
                return coroutineSingletons;
            }
            fwFClient = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fwFClient = (FwFClient) fwFClient$syncClient$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
        }
        SyncResult syncResult = (SyncResult) objMeasureExecutionTimeSuspend$fwf_client_release;
        MetricProvider.incrementCounter$fwf_client_release$default(fwFClient.metricProvider, syncResult.getSuccess() ? MetricUtilsKt.METRIC_FEATURES_SYNC_SUCCESS : MetricUtilsKt.METRIC_FEATURES_SYNC_ERROR, 0L, onMove.serializer(MetricUtilsKt.getErrorTag(syncResult.getError())), 2, null);
        return syncResult;
    }

    public final void removeCustomerProfileAttributes$fwf_client_release() {
        CustomerProfileClient customerProfileClient$fwf_client_release = getCustomerProfileClient$fwf_client_release();
        if (customerProfileClient$fwf_client_release != null) {
            customerProfileClient$fwf_client_release.removeCustomerProfileAttributes$fwf_client_release();
        }
    }

    public final Object syncCustomerProfile$fwf_client_release(ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        CustomerProfileClient customerProfileClient$fwf_client_release = getCustomerProfileClient$fwf_client_release();
        if (customerProfileClient$fwf_client_release != null) {
            return customerProfileClient$fwf_client_release.syncUserProfile(shortNewsContentCardView);
        }
        this.logger.logE(FwFClientKt.MODULE_NAME, "The customer profile client must be initialized by providing the required configuration first");
        return SyncResult.Companion.errorResult("The customer profile client must be initialized by providing the required configuration first");
    }

    public /* synthetic */ FwFClient(FwFClientConfig fwFClientConfig, MetricProvider metricProvider, ILogger iLogger, IHTTPClient iHTTPClient, MemoryCache memoryCache, CacheDriverFactory cacheDriverFactory, ICache iCache, byte[] bArr, CustomerProfileConfig customerProfileConfig, FwFEventValueTransformer fwFEventValueTransformer, ExposureHandler exposureHandler, FwFSerializer fwFSerializer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fwFClientConfig, metricProvider, iLogger, iHTTPClient, (i & 16) != 0 ? null : memoryCache, (i & 32) != 0 ? null : cacheDriverFactory, (i & 64) != 0 ? null : iCache, (i & Fields.SpotShadowColor) != 0 ? null : bArr, (i & Fields.RotationX) != 0 ? null : customerProfileConfig, (i & Fields.RotationY) != 0 ? null : fwFEventValueTransformer, (i & Fields.RotationZ) != 0 ? null : exposureHandler, (i & Fields.CameraDistance) != 0 ? CommonDomain.Companion.serializer() : fwFSerializer);
    }
}

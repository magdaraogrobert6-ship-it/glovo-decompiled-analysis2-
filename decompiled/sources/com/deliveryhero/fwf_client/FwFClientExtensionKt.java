package com.deliveryhero.fwf_client;

import android.content.Context;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_cache.ICache;
import com.deliveryhero.fwf_cache.sql.CacheDriverFactory;
import com.deliveryhero.fwf_client.model.SyncResult;
import com.deliveryhero.fwf_customer_profile.CustomerProfileConfig;
import com.deliveryhero.fwf_evaluator.model.EvalResult;
import com.deliveryhero.fwf_evaluator.model.User;
import com.deliveryhero.fwf_http.HTTPClient;
import com.deliveryhero.fwf_http.IFwFHTTPRequestClient;
import com.deliveryhero.fwf_logger.IFwFLogging;
import com.deliveryhero.fwf_logger.Logger;
import com.deliveryhero.fwf_metrics.IMetricReporter;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_metrics.MetricUtilsKt;
import com.deliveryhero.fwf_tracking.AndroidDomain;
import com.deliveryhero.fwf_tracking.FwFEventValueTransformerImpl;
import com.deliveryhero.fwf_tracking.model.FwFTrackingConfig;
import com.deliveryhero.fwf_util.FwFSerializer;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClientExtensionKt {

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClientExtensionKt$getVariation$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01061 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01061(ShortNewsContentCardView<? super C01061> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFClientExtensionKt.getVariation(null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.deliveryhero.fwf_client.FwFClientExtensionKt$getVariations$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01071 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C01071(ShortNewsContentCardView<? super C01071> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FwFClientExtensionKt.getVariations(null, null, null, false, this);
        }
    }

    public static final Object sync(FwFClient fwFClient, ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        return fwFClient.syncClient$fwf_client_release(shortNewsContentCardView);
    }

    public static final Object syncCustomerProfile(FwFClient fwFClient, ShortNewsContentCardView<? super SyncResult> shortNewsContentCardView) {
        return fwFClient.syncCustomerProfile$fwf_client_release(shortNewsContentCardView);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object getVariation(FwFClient fwFClient, String str, Object obj, Map<String, String> map, boolean z, ShortNewsContentCardView<? super EvalResult> shortNewsContentCardView) {
        C01061 c01061;
        if (shortNewsContentCardView instanceof C01061) {
            c01061 = (C01061) shortNewsContentCardView;
            int i = c01061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01061.label = i - Integer.MIN_VALUE;
            } else {
                c01061 = new C01061(shortNewsContentCardView);
            }
        } else {
            c01061 = new C01061(shortNewsContentCardView);
        }
        Object objMeasureExecutionTimeSuspend$fwf_client_release = c01061.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01061.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
            MetricProvider metricProvider$fwf_client_release = fwFClient.getMetricProvider$fwf_client_release();
            Map<String, String> mapSerializer = onMove.serializer(MetricUtilsKt.getKeyTag(str));
            FwFClientExtensionKt$getVariation$evalResult$1 fwFClientExtensionKt$getVariation$evalResult$1 = new FwFClientExtensionKt$getVariation$evalResult$1(fwFClient, z, str, obj, map, null);
            c01061.label = 1;
            objMeasureExecutionTimeSuspend$fwf_client_release = metricProvider$fwf_client_release.measureExecutionTimeSuspend$fwf_client_release(MetricUtilsKt.METRIC_GET_VARIATION, mapSerializer, fwFClientExtensionKt$getVariation$evalResult$1, c01061);
            if (objMeasureExecutionTimeSuspend$fwf_client_release == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
        }
        return (EvalResult) objMeasureExecutionTimeSuspend$fwf_client_release;
    }

    public static final FwFClient create(FwFClient.Companion companion, final FwFClientConfig fwFClientConfig, final ICache iCache, final byte[] bArr, final CustomerProfileConfig customerProfileConfig, final IFwFHTTPRequestClient iFwFHTTPRequestClient, final IFwFLogging iFwFLogging, final FwFTrackingConfig fwFTrackingConfig, IMetricReporter iMetricReporter) {
        companion.getClass();
        fwFClientConfig.getClass();
        iCache.getClass();
        final MetricProvider metricProvider = CommonDomain.Companion.metricProvider(iMetricReporter);
        return (FwFClient) MetricProvider.measureExecutionTime$fwf_client_release$default(metricProvider, MetricUtilsKt.METRIC_CLIENT_INIT_DURATION, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.FwFClientExtensionKt.create.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final FwFClient invoke() {
                CommonDomain.Companion companion2 = CommonDomain.Companion;
                Logger logger = companion2.logger(fwFClientConfig, iFwFLogging);
                FwFSerializer fwFSerializerSerializer = companion2.serializer();
                HTTPClient httpClient = companion2.httpClient(fwFClientConfig, logger, iFwFHTTPRequestClient, metricProvider, fwFSerializerSerializer);
                AndroidDomain.Companion companion3 = AndroidDomain.Companion;
                FwFEventValueTransformerImpl fwFEventValueTransformerImplEventValueTransformer = companion3.eventValueTransformer(fwFTrackingConfig);
                FwFTrackingConfig fwFTrackingConfig2 = fwFTrackingConfig;
                return new FwFClient(fwFClientConfig, metricProvider, logger, httpClient, null, null, iCache, bArr, customerProfileConfig, fwFEventValueTransformerImplEventValueTransformer, companion3.exposureHandler(fwFSerializerSerializer, fwFTrackingConfig2 != null ? fwFTrackingConfig2.getCallback() : null), fwFSerializerSerializer, 48, null);
            }
        }, 2, null);
    }

    public static final User getUser(FwFClient fwFClient) {
        fwFClient.getClass();
        return fwFClient.getUser$fwf_client_release();
    }

    public static final void removeCustomerProfileAttributes(FwFClient fwFClient) {
        fwFClient.getClass();
        fwFClient.removeCustomerProfileAttributes$fwf_client_release();
    }

    public static final void useEvaluationsCache(FwFClient fwFClient, boolean z) {
        fwFClient.getClass();
        fwFClient.getConfig$fwf_client_release().setUseEvaluationsCache$fwf_client_release(z);
    }

    public static final Object clearEvaluationsCache(FwFClient fwFClient, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object objClearEvaluations$fwf_client_release = fwFClient.getCache$fwf_client_release().clearEvaluations$fwf_client_release(shortNewsContentCardView);
        return objClearEvaluations$fwf_client_release == CoroutineSingletons.COROUTINE_SUSPENDED ? objClearEvaluations$fwf_client_release : createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object getVariations(FwFClient fwFClient, Map<String, ? extends Object> map, Map<String, String> map2, boolean z, ShortNewsContentCardView<? super Map<String, EvalResult>> shortNewsContentCardView) {
        C01071 c01071;
        if (shortNewsContentCardView instanceof C01071) {
            c01071 = (C01071) shortNewsContentCardView;
            int i = c01071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c01071.label = i - Integer.MIN_VALUE;
            } else {
                c01071 = new C01071(shortNewsContentCardView);
            }
        } else {
            c01071 = new C01071(shortNewsContentCardView);
        }
        Object objMeasureExecutionTimeSuspend$fwf_client_release = c01071.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c01071.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
            MetricProvider metricProvider$fwf_client_release = fwFClient.getMetricProvider$fwf_client_release();
            Map<String, String> mapSingletonMap = Collections.singletonMap("keys", String.valueOf(map.keySet()));
            mapSingletonMap.getClass();
            FwFClientExtensionKt$getVariations$evalResults$1 fwFClientExtensionKt$getVariations$evalResults$1 = new FwFClientExtensionKt$getVariations$evalResults$1(fwFClient, z, map, map2, null);
            c01071.label = 1;
            objMeasureExecutionTimeSuspend$fwf_client_release = metricProvider$fwf_client_release.measureExecutionTimeSuspend$fwf_client_release(MetricUtilsKt.METRIC_GET_VARIATIONS, mapSingletonMap, fwFClientExtensionKt$getVariations$evalResults$1, c01071);
            if (objMeasureExecutionTimeSuspend$fwf_client_release == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objMeasureExecutionTimeSuspend$fwf_client_release);
        }
        return (Map) objMeasureExecutionTimeSuspend$fwf_client_release;
    }

    public static /* synthetic */ Object getVariations$default(FwFClient fwFClient, Map map, Map map2, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 2) != 0) {
            map2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return getVariations(fwFClient, map, map2, z, shortNewsContentCardView);
    }

    public static /* synthetic */ Object getVariation$default(FwFClient fwFClient, String str, Object obj, Map map, boolean z, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj2) {
        if ((i & 4) != 0) {
            map = null;
        }
        Map map2 = map;
        if ((i & 8) != 0) {
            z = false;
        }
        return getVariation(fwFClient, str, obj, map2, z, shortNewsContentCardView);
    }

    public static final FwFClient create(FwFClient.Companion companion, final Context context, final FwFClientConfig fwFClientConfig, final byte[] bArr, final CustomerProfileConfig customerProfileConfig, final IFwFHTTPRequestClient iFwFHTTPRequestClient, final IFwFLogging iFwFLogging, final FwFTrackingConfig fwFTrackingConfig, IMetricReporter iMetricReporter) {
        companion.getClass();
        context.getClass();
        fwFClientConfig.getClass();
        final MetricProvider metricProvider = CommonDomain.Companion.metricProvider(iMetricReporter);
        return (FwFClient) MetricProvider.measureExecutionTime$fwf_client_release$default(metricProvider, MetricUtilsKt.METRIC_CLIENT_INIT_DURATION, null, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.deliveryhero.fwf_client.FwFClientExtensionKt.create.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final FwFClient invoke() {
                CommonDomain.Companion companion2 = CommonDomain.Companion;
                Logger logger = companion2.logger(fwFClientConfig, iFwFLogging);
                FwFSerializer fwFSerializerSerializer = companion2.serializer();
                CacheDriverFactory cacheDriverFactory = new CacheDriverFactory(context);
                HTTPClient httpClient = companion2.httpClient(fwFClientConfig, logger, iFwFHTTPRequestClient, metricProvider, fwFSerializerSerializer);
                AndroidDomain.Companion companion3 = AndroidDomain.Companion;
                FwFEventValueTransformerImpl fwFEventValueTransformerImplEventValueTransformer = companion3.eventValueTransformer(fwFTrackingConfig);
                FwFTrackingConfig fwFTrackingConfig2 = fwFTrackingConfig;
                return new FwFClient(fwFClientConfig, metricProvider, logger, httpClient, null, cacheDriverFactory, null, bArr, customerProfileConfig, fwFEventValueTransformerImplEventValueTransformer, companion3.exposureHandler(fwFSerializerSerializer, fwFTrackingConfig2 != null ? fwFTrackingConfig2.getCallback() : null), fwFSerializerSerializer, 80, null);
            }
        }, 2, null);
    }
}

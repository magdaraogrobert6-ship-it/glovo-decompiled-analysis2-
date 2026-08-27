package com.deliveryhero.fwf_tracking;

import coil3.ExtrasKt;
import com.deliveryhero.fwf_cache.MemoryCache;
import com.deliveryhero.fwf_cache.UtilKt;
import com.deliveryhero.fwf_http.IPerseusHTTPClient;
import com.deliveryhero.fwf_logger.ILogger;
import com.deliveryhero.fwf_metrics.MetricProvider;
import com.deliveryhero.fwf_tracking.model.FwFEventValue;
import com.deliveryhero.fwf_tracking.model.FwFEventValueTransformer;
import com.deliveryhero.fwf_tracking.model.PerseusBrand;
import com.deliveryhero.fwf_tracking.model.PerseusHelperKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFTrackingService {
    private Map<String, String> accountConfig;
    private final MemoryCache cache;
    private final IPerseusHTTPClient client;
    private final FwFEventValueTransformer eventValueTransformer;
    private final ExposureHandler exposureHandler;
    private final ILogger logger;
    private final MetricProvider metricProvider;

    public final MemoryCache getCache() {
        return this.cache;
    }

    public final IPerseusHTTPClient getClient() {
        return this.client;
    }

    public final FwFEventValueTransformer getEventValueTransformer() {
        return this.eventValueTransformer;
    }

    public final ExposureHandler getExposureHandler() {
        return this.exposureHandler;
    }

    public final ILogger getLogger() {
        return this.logger;
    }

    public final MetricProvider getMetricProvider() {
        return this.metricProvider;
    }

    public FwFTrackingService(MemoryCache memoryCache, MetricProvider metricProvider, ILogger iLogger, IPerseusHTTPClient iPerseusHTTPClient, FwFEventValueTransformer fwFEventValueTransformer, ExposureHandler exposureHandler) {
        memoryCache.getClass();
        metricProvider.getClass();
        iLogger.getClass();
        iPerseusHTTPClient.getClass();
        exposureHandler.getClass();
        this.cache = memoryCache;
        this.metricProvider = metricProvider;
        this.logger = iLogger;
        this.client = iPerseusHTTPClient;
        this.eventValueTransformer = fwFEventValueTransformer;
        this.exposureHandler = exposureHandler;
        this.accountConfig = memoryCache.getAccountConfig$fwf_client_release();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object trackEvent$fwf_client_release(FwFEventValue fwFEventValue, Map<String, String> map, PerseusBrand perseusBrand, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        FwFTrackingService$trackEvent$1 fwFTrackingService$trackEvent$1;
        String str;
        String str2;
        FwFTrackingService fwFTrackingService;
        String str3;
        if (shortNewsContentCardView instanceof FwFTrackingService$trackEvent$1) {
            fwFTrackingService$trackEvent$1 = (FwFTrackingService$trackEvent$1) shortNewsContentCardView;
            int i = fwFTrackingService$trackEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwFTrackingService$trackEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                fwFTrackingService$trackEvent$1 = new FwFTrackingService$trackEvent$1(this, shortNewsContentCardView);
            }
        } else {
            fwFTrackingService$trackEvent$1 = new FwFTrackingService$trackEvent$1(this, shortNewsContentCardView);
        }
        Object obj = fwFTrackingService$trackEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fwFTrackingService$trackEvent$1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Map<String, String> map2 = this.accountConfig;
            if (map2 == null || map2.isEmpty()) {
                this.accountConfig = this.cache.getAccountConfig$fwf_client_release();
            }
            Map<String, String> map3 = this.accountConfig;
            String str4 = "";
            if (map3 == null || (str = map3.get(UtilKt.ACCOUNT_KEY)) == null) {
                str = "";
            }
            Map<String, String> map4 = this.accountConfig;
            if (map4 == null || (str2 = map4.get(UtilKt.PROJECT_KEY)) == null) {
                str2 = "";
            }
            Map<String, String> map5 = this.accountConfig;
            if (map5 != null && (str3 = map5.get(UtilKt.ENVIRONMENT_KEY)) != null) {
                str4 = str3;
            }
            fwFEventValue.setConfigurationValues(str, str2, str4);
            FwFEventValueTransformer fwFEventValueTransformer = this.eventValueTransformer;
            if (fwFEventValueTransformer != null) {
                fwFEventValueTransformer.transform(fwFEventValue);
            }
            enforceClientId(fwFEventValue);
            fwFEventValue.setExplanationMetadata(map);
            if (perseusBrand != null) {
                fwFEventValue.setBrand(perseusBrand);
            }
            ExposureHandler exposureHandler = this.exposureHandler;
            fwFTrackingService$trackEvent$1.L$0 = this;
            fwFTrackingService$trackEvent$1.L$1 = fwFEventValue;
            fwFTrackingService$trackEvent$1.label = 1;
            if (exposureHandler.sendExposureData(fwFEventValue, fwFTrackingService$trackEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            fwFTrackingService = this;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fwFEventValue = (FwFEventValue) fwFTrackingService$trackEvent$1.L$1;
            fwFTrackingService = (FwFTrackingService) fwFTrackingService$trackEvent$1.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        if (fwFEventValue.getGlobalEntityId().length() == 0) {
            fwFTrackingService.logger.logW(FwFTrackingServiceKt.MODULE_NAME, "Global entity id is missing for event " + fwFEventValue.getHitMatchId());
        }
        return createFromParcel.INSTANCE;
    }

    private final void enforceClientId(FwFEventValue fwFEventValue) {
        String clientId = fwFEventValue.getClientId();
        if (clientId == null || clientId.length() == 0) {
            this.logger.logW(FwFTrackingServiceKt.MODULE_NAME, "Client ID is missing for event " + fwFEventValue.getHitMatchId() + ". Generating random client ID.");
            fwFEventValue.setClientId(PerseusHelperKt.generateRandomTimeNumericAlphanumeric());
        }
    }

    public final Object shutdown$fwf_client_release(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        this.logger.logD(FwFTrackingServiceKt.MODULE_NAME, "Shutting down tracking service");
        Object objShutdown = this.exposureHandler.shutdown(shortNewsContentCardView);
        return objShutdown == CoroutineSingletons.COROUTINE_SUSPENDED ? objShutdown : createFromParcel.INSTANCE;
    }
}

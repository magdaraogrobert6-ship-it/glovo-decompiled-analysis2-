package com.deliveryhero.fwf_metrics;

import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.fwf_http.PlatformKt;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.util.Map;
import o.onMove;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricUtilsKt {
    public static final String METRIC_CACHE_STORAGE_HIT = "storage.hit";
    public static final String METRIC_CACHE_STORAGE_LATENCY = "storage.latency";
    public static final String METRIC_CACHE_STORAGE_MISS = "storage.miss";
    public static final String METRIC_CLIENT_INIT_DURATION = "client.init.duration";
    public static final String METRIC_CUSTOMER_PROFILE_SYNC_DURATION = "customer_profile.sync.duration";
    public static final String METRIC_CUSTOMER_PROFILE_SYNC_ERROR = "customer_profile.sync.error";
    public static final String METRIC_CUSTOMER_PROFILE_SYNC_SUCCESS = "customer_profile.sync.success";
    public static final String METRIC_DECODING_DURATION = "decoding.duration";
    public static final String METRIC_DECODING_ERROR = "decoding.error";
    public static final String METRIC_ENCODING_DURATION = "encoding.duration";
    public static final String METRIC_ENCODING_ERROR = "encoding.error";
    public static final String METRIC_EVALUATION_COUNT = "evaluation.total";
    public static final String METRIC_EVALUATION_DURATION = "evaluation.duration";
    public static final String METRIC_EVALUATION_ERROR = "evaluation.error";
    public static final String METRIC_FEATURES_SYNC_DURATION = "features.sync.duration";
    public static final String METRIC_FEATURES_SYNC_ERROR = "features.sync.error";
    public static final String METRIC_FEATURES_SYNC_SUCCESS = "features.sync.success";
    public static final String METRIC_GET_VARIATION = "get_variation.duration";
    public static final String METRIC_GET_VARIATIONS = "get_variations.duration";
    public static final String METRIC_INITIAL_DATA_DURATION = "client.initial_data.duration";
    public static final String METRIC_NETWORK_REQUEST_COUNT = "http_request.total";
    public static final String METRIC_NETWORK_REQUEST_DURATION = "http_request.duration";
    public static final String METRIC_NETWORK_REQUEST_ERROR = "http_request.error";
    public static final String METRIC_TRACKING_EXPOSURE_QUEUE_DROP = "exposure_queue.dropped_exposures";
    public static final String METRIC_TRACKING_EXPOSURE_QUEUE_REMAINING = "exposure_queue.remaining_items";
    public static final String METRIC_TRACKING_PERSEUS_AGG_LATENCY = "perseus_api.agg_latency";
    public static final String METRIC_TRACKING_PERSEUS_ERROR = "perseus_api.errors";
    public static final String METRIC_TRACKING_PERSEUS_LATENCY = "perseus_api.latency";
    private static final Map<String, String> defaultTags = onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(HianalyticsBaseData.SDK_VERSION, ConstantKt.SDK_VERSION), new onViewAttachedToWindowlambda0("platform", PlatformKt.getPlatform().getDeviceOS().getValue()));

    public static final Map<String, String> getDefaultTags() {
        return defaultTags;
    }

    public static final onViewAttachedToWindowlambda0 getErrorTag(String str) {
        if (str == null) {
            str = "";
        }
        return new onViewAttachedToWindowlambda0(FWFConstants.EXPLANATION_TYPE_ERROR, str);
    }

    public static final onViewAttachedToWindowlambda0 getResourceTag(TagResource tagResource) {
        tagResource.getClass();
        return new onViewAttachedToWindowlambda0("resource", tagResource.name());
    }

    public static final onViewAttachedToWindowlambda0 getCacheKeyTag(String str) {
        str.getClass();
        return new onViewAttachedToWindowlambda0("cache_key", str);
    }

    public static final onViewAttachedToWindowlambda0 getKeyTag(String str) {
        str.getClass();
        return new onViewAttachedToWindowlambda0("key", str);
    }

    public static final onViewAttachedToWindowlambda0 getUrlTag(String str) {
        str.getClass();
        return new onViewAttachedToWindowlambda0("url", str);
    }
}

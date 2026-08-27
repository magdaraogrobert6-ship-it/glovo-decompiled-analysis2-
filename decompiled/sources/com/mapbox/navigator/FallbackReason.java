package com.mapbox.navigator;

/* JADX INFO: loaded from: classes5.dex */
public enum FallbackReason {
    NONE("None"),
    CACHE_IS_NOT_READY("CacheIsNotReady"),
    NON_DRIVING_ACTIVE_GUIDANCE_MODE("NonDrivingActiveGuidanceMode"),
    CUSTOM_EXTERNAL_ROUTER_ORIGIN("CustomExternalRouterOrigin"),
    ALWAYS_FALLBACK_POLICY("AlwaysFallbackPolicy"),
    VITERBI_ROUTE_MATCHER_ERROR("ViterbiRouteMatcherError");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    FallbackReason(String str) {
        this.str = str;
    }
}

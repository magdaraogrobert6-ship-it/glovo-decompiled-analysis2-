package com.deliveryhero.fwf_cache;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilKt {
    public static final String ACCOUNT_CONFIG_PREFIX = "account-config";
    public static final String ACCOUNT_KEY = "account";
    public static final String CUSTOMER_PROFILE_PREFIX = "customer-profile";
    public static final String CUSTOMER_PROFILE_UPDATED_AT_PREFIX = "customer-profile-updated-at";
    public static final String ENVIRONMENT_KEY = "environment";
    public static final String FEATURES_UPDATED_AT_PREFIX = "updated-at";
    public static final String FEATURE_CACHE_KEY_PREFIX = "feature";
    public static final String HOLDOUTS_CONFIG_CACHE_KEY_PREFIX = "holdouts-config";
    public static final String HOLDOUT_CACHE_KEY_PREFIX = "holdout";
    public static final String MODULE_NAME = "FwFCache";
    public static final String PROFILE_ATTRIBUTES_PREFIX = "profile-attributes";
    public static final String PROJECT_KEY = "project";
    public static final String RUNTIME_FEATURE_KEYS_PREFIX = "runtime-keys";

    public static final String generateCustomerProfileKey(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "customer-profile:" + str + ":" + str2;
    }

    public static final String generateCustomerProfileUpdatedAtKey(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "customer-profile-updated-at:" + str + ":" + str2;
    }

    public static final String generateFeatureCacheKey(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "feature:" + str + ":" + str2;
    }

    public static final String generateHoldoutCacheKey(String str, String str2) {
        str.getClass();
        str2.getClass();
        return "holdout:" + str + ":" + str2;
    }

    public static final String generateAccountConfigKey(String str) {
        str.getClass();
        return "account-config:".concat(str);
    }

    public static final String generateHoldoutKeysConfigCacheKey(String str) {
        str.getClass();
        return "holdouts-config:".concat(str);
    }

    public static final String generateProfileAttributesKey(String str) {
        str.getClass();
        return "profile-attributes:".concat(str);
    }

    public static final String generateFeaturesUpdatedAtKey(String str) {
        str.getClass();
        return "updated-at:".concat(str);
    }

    public static final String generateRuntimeFeatureKeysKey(String str) {
        str.getClass();
        return "runtime-keys:".concat(str);
    }
}

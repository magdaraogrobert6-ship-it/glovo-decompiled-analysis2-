package com.deliveryhero.fwf_http;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantKt {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String CUSTOMER_PROFILE_ENDPOINT = "customer-profile";
    public static final long DEFAULT_REQUEST_TIMEOUT = 2000;
    public static final String FEATURES_CONFIG_ENDPOINT = "features-config/latest";
    public static final String FWF_SDK_NAME = "FwFMultiplatformSDK";
    public static final String GLOBAL_ENTITY_ID_HEADER = "X-Global-Entity-Id";
    public static final String MODULE_NAME = "FwFHTTPClient";
    public static final String SDK_INFO_HEADER = "Sdkinfo";
    public static final String SDK_VERSION = "7.0.1";
    public static final String SERVER_SDK_HEADER = "isServer";
    public static final String USER_AGENT_HEADER = "User-Agent";
    private static final Region DEFAULT_REGION = Region.GLB;
    private static final Version DEFAULT_VERSION = Version.V3;

    public static final Region getDEFAULT_REGION() {
        return DEFAULT_REGION;
    }

    public static final Version getDEFAULT_VERSION() {
        return DEFAULT_VERSION;
    }
}

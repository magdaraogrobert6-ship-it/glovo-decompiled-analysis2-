package fwfd.com.fwfsdk.constant;

import fwfd.com.fwfsdk.util.FWFLogger;

/* JADX INFO: loaded from: classes5.dex */
public class FWFConstants {
    public static final String EXPLANATION_BACKGROUND_UPDATE = "Flags updated in background";
    public static final String EXPLANATION_KIND_DB_FALLBACK = "LAST_VARIATION_FALLBACK";
    public static final String EXPLANATION_KIND_FALLBACK = "FALLBACK";
    public static final String EXPLANATION_KIND_NULL_FALLBACK = "NULL_FALLBACK";
    public static final String EXPLANATION_KIND_VALUE_FALLBACK = "VALUE_FALLBACK";
    public static final String EXPLANATION_MULTI_FLAG_UPDATE = "Multi flag updated";
    public static final String EXPLANATION_SINGLE_FLAG_UPDATE = "Single flag updated";
    public static final String EXPLANATION_TYPE_ERROR = "error";
    public static final String EXPLANATION_TYPE_KIND = "kind";
    public static final String SDK_VERSION = "8.1.0";
    public static final Integer SDK_VERSION_NUMBER = 37;
    public static final String USER_ATTRIBUTE_APP_VERSION = "appVersion";
    public static final String USER_ATTRIBUTE_IP_ADDRESS = "ipAddress";

    public enum Time {
        CONNECTIONTIMEOUT(10.0f),
        FEATUREEXPIRATIONTIME(900.0f);

        private Float value;

        public float getValue() {
            return this.value.floatValue();
        }

        Time(float f) {
            this.value = Float.valueOf(f);
        }
    }

    public enum API {
        API_VERSION_V2("v2"),
        API_VERSION_V3("v3");

        private String value;

        public String getValue() {
            return this.value;
        }

        API(String str) {
            this.value = str;
        }
    }

    public enum Defaults {
        LOG_LEVEL(FWFLogger.FWFLogLevel.info);

        private FWFLogger.FWFLogLevel value;

        public FWFLogger.FWFLogLevel getValue() {
            return this.value;
        }

        Defaults(FWFLogger.FWFLogLevel fWFLogLevel) {
            this.value = fWFLogLevel;
        }
    }

    public enum Region {
        SG("sg"),
        AP("ap"),
        EU("eu"),
        ME("me"),
        US("us"),
        STG("stg");

        private String value;

        public String getValue() {
            return this.value;
        }

        Region(String str) {
            this.value = str;
        }
    }
}

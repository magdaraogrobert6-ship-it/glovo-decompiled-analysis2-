package fwfd.com.fwfsdk.util;

import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes5.dex */
public class FWFHelper {
    static final String DATABASE_NAME = "FWF.db";
    static final int DATABASE_VERSION = 12;
    public static final String ENDPOINT_FEATURES = "features";
    public static final String ENDPOINT_FLAG_KEYS = "features-list/keys";
    public static final String FLAG_REQUEST_EMPTY = "FunWithFlags: No flags added to the request.";
    public static final String FROM_METHOD_GET_ALL_FLAGS = "getAllFlags";
    public static final String FROM_METHOD_GET_FLAG_KEYS = "getFlagKeys";
    public static final String FROM_METHOD_GET_VARIATION = "getVariationExpired";
    public static final String FROM_METHOD_GET_VARIATIONS = "getVariationsExpired";
    public static final String FROM_METHOD_GET_VARIATIONS_FORCED = "getVariationsForced";
    public static final String FROM_METHOD_GET_VARIATION_FORCED = "getVariationForced";
    public static final String FROM_METHOD_RELEVANT_CONTEXT = "relevantContextUpdate";
    public static final String FROM_METHOD_SUBSCRIBE_INIT = "subscribeInit";
    public static final String FROM_METHOD_SUBSCRIBE_UPDATE = "subscribeUpdate";
    public static final String FWF_DEVICE_OS_KEY = "fwfDeviceOS";
    public static final String FWF_OS_VERSION_KEY = "fwfOSVersion";
    public static final String SDK_NO_NEW_VERSION = "FunWithFlags: No new sdk version found.";
    public static final String SDK_UPDATED = "FunWithFlags: SDK was updated. Deleting previous version DB records.";
    public static final String fwfDeviceOS = "android";
    public static final String fwfOSVersion = af$$ExternalSyntheticOutline0.m(Build.VERSION.SDK_INT, "", new StringBuilder(""));
    static String ERROR_CONVERTER_OBJECT_VARIATION = "FunWithFlags: Cannot convert from Object to Blob.";
    static String ERROR_CONVERTER_BLOB_VARIATION = "FunWithFlags: Cannot convert from Blob to Object.";
    public static String ERROR_VARIATION_CAST = "FunWithFlags: Error casting variation to expected type.";

    public static String fwfErrorAPIResponse(String str, Integer num) {
        return "FunWithFlags: Error retrieving flags from API. Flag keys: " + str + ". Response not successful, error code: " + num;
    }

    public static String fwfErrorAllFlagsAPIResponse(String str, Integer num) {
        return "FunWithFlags: Error retrieving flags from API. Environment token: " + str + ". Response not successful, error code: " + num;
    }

    public static String fwfErrorFlagKeysAPIResponse(String str, Integer num) {
        return "FunWithFlags: Error retrieving flag keys from API. Environment token: " + str + ". Response not successful, error code: " + num;
    }

    public static String getVariationFromMethod(boolean z) {
        if (z) {
            return FROM_METHOD_GET_VARIATION_FORCED;
        }
        return FROM_METHOD_GET_VARIATION;
    }

    public static String getVariationsFromMethod(boolean z) {
        if (z) {
            return FROM_METHOD_GET_VARIATIONS_FORCED;
        }
        return FROM_METHOD_GET_VARIATIONS;
    }

    public static String fwfErrorAPIResponse(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("FunWithFlags: Error retrieving flags from API. Flag keys: ", str, ". Response not successful: ", str2);
    }

    public static String fwfErrorAllFlagsAPIResponse(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("FunWithFlags: Error retrieving flags from API. Environment token: ", str, ". Response not successful: ", str2);
    }

    public static String fwfErrorFlagKeysAPIResponse(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("FunWithFlags: Error retrieving flag keys from API. Environment token: ", str, ". Response not successful: ", str2);
    }
}

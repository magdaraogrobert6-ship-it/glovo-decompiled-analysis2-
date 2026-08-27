package com.deliveryhero.fwf_evaluator.util;

import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import java.util.Set;
import o.getInAppMessageEventMap;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantsKt {
    public static final String FWF_USER_ATTRIBUTE_DEVICE_OS = "fwfDeviceOS";
    public static final String FWF_USER_ATTRIBUTE_OS_VERSION = "fwfOSVersion";
    public static final String FWF_USER_ATTRIBUTE_STAFF = "isStaff";
    public static final String INVALID_USER_IDENTIFIER_MESSAGE = "Expected allocation identifier missing";
    public static final String INVALID_USER_MESSAGE = "Invalid user, user must have at least one identifier";
    public static final String INVALID_VARIATION_MESSAGE = "Invalid variation, variation is null";
    private static final getInAppMessageEventMap variationRegex = new getInAppMessageEventMap("^(Control|Variation\\d+)$");
    private static final Set<String> globalEntityIdKeys = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{"global_entity_id", "globalEntityId", "gei", "global-entity-id", "gid", "globalEntity", "geid", "ge_id", "global_entity", "entity_id"});
    private static final Set<String> countryKeys = onContentCardClicked.MediaSessionCompatQueueItem(new String[]{PushNotificationParserObj.COUNTRY_KEY, "country_code", "countryId", "countryCode", "country_id"});

    public static final Set<String> getCountryKeys() {
        return countryKeys;
    }

    public static final Set<String> getGlobalEntityIdKeys() {
        return globalEntityIdKeys;
    }

    public static final getInAppMessageEventMap getVariationRegex() {
        return variationRegex;
    }
}

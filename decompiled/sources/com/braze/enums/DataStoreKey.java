package com.braze.enums;

import androidx.compose.ui.graphics.Fields;
import bo.app.i4;
import coil3.util.UtilsKt;
import com.braze.support.StringUtils;
import com.braze.support.c$$ExternalSyntheticLambda7;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import java.util.LinkedHashMap;
import java.util.Map;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.onMove;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import org.joda.time.DateTimeConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GEOFENCES' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class DataStoreKey {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ DataStoreKey[] $VALUES;
    public static final DataStoreKey ADM_MESSAGING_REGISTRATION_ENABLED;
    public static final DataStoreKey AD_TRACKING_ENABLED;
    public static final DataStoreKey API_KEY;
    public static final DataStoreKey AUTOMATIC_LOCATION_COLLECTION;
    public static final DataStoreKey BANNERS;
    public static final DataStoreKey BANNERS_DISMISSALS_CACHE_SIZE;
    public static final DataStoreKey BANNERS_ENABLED;
    public static final DataStoreKey BANNERS_IMPRESSION_MAP;
    public static final DataStoreKey BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT;
    public static final DataStoreKey BANNERS_PENDING_DISMISSALS;
    public static final DataStoreKey BLOCKLISTED_ATTRIBUTES;
    public static final DataStoreKey BLOCKLISTED_EVENTS;
    public static final DataStoreKey BLOCKLISTED_PURCHASES;
    public static final DataStoreKey CACHED_DEVICE;
    public static final DataStoreKey CONFIG_TIME;
    public static final DataStoreKey CONTENT_CARDS;
    public static final DataStoreKey CONTENT_CARDS_ENABLED;
    public static final DataStoreKey CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED;
    public static final DataStoreKey CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey CURRENT_OPEN_SESSION_ID;
    public static final DataStoreKey CUSTOM_ENDPOINT;
    public static final DataStoreKey CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME;
    public static final DataStoreKey CUSTOM_LOCATION_PROVIDERS_LIST;
    public static final i4 Companion;
    public static final DataStoreKey DATA_SYNC_BAD_NETWORK_INTERVAL;
    public static final DataStoreKey DATA_SYNC_GOOD_NETWORK_INTERVAL;
    public static final DataStoreKey DATA_SYNC_GREAT_NETWORK_INTERVAL;
    public static final DataStoreKey DEFAULT_NOTIFICATION_ACCENT_COLOR;
    public static final DataStoreKey DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION;
    public static final DataStoreKey DEFAULT_NOTIFICATION_CHANNEL_NAME;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS;
    public static final DataStoreKey DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR;
    public static final DataStoreKey DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG;
    public static final DataStoreKey DELAYED_INIT_ENABLED;
    public static final DataStoreKey DELAYED_INIT_SET_DURING_RUNTIME_FLAG;
    public static final DataStoreKey DEVICE_CACHE_LAST_OS_VERSION;
    public static final DataStoreKey DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT;
    public static final DataStoreKey DEVICE_ID;
    public static final DataStoreKey DEVICE_OBJECT_ALLOWLIST;
    public static final DataStoreKey DEVICE_OBJECT_ALLOWLISTING_ENABLED;
    public static final DataStoreKey DISMISSED_CARDS;
    public static final DataStoreKey DOES_PUSH_STORY_DISMISS_ON_CLICK;
    public static final DataStoreKey DUST_AUTH;
    public static final DataStoreKey DUST_AUTH_EXPIRATION_SECONDS;
    public static final DataStoreKey DUST_ENABLED;
    public static final DataStoreKey DUST_HOST;
    public static final DataStoreKey DUST_RCS;
    public static final DataStoreKey DUST_SHOULD_BLOCK_CC_REFRESH;
    public static final DataStoreKey ENDPOINT_ATTEMPT_COUNT_MAP;
    public static final DataStoreKey ENDPOINT_LAST_REQUEST_MAP;
    public static final DataStoreKey EPHEMERAL_EVENTS_ENABLED;
    public static final DataStoreKey EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
    public static final DataStoreKey EVENT_STORAGE_MAP;
    public static final DataStoreKey EXPIRED_CARDS;
    public static final DataStoreKey FALLBACK_FCM_SERVICE_CLASSPATH;
    public static final DataStoreKey FALLBACK_FCM_SERVICE_ENABLED;
    public static final DataStoreKey FEATURE_FLAGS;
    public static final DataStoreKey FEATURE_FLAGS_ENABLED;
    public static final DataStoreKey FEATURE_FLAGS_IMPRESSIONS_MAP;
    public static final DataStoreKey FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT;
    public static final DataStoreKey FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED;
    public static final DataStoreKey FIREBASE_CLOUD_MESSAGING_SENDER_ID;
    public static final DataStoreKey FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN;
    public static final DataStoreKey GEOFENCES;
    public static final DataStoreKey GEOFENCES_AUTOMATIC_REQUESTS_ENABLED;
    public static final DataStoreKey GEOFENCES_ENABLED;
    public static final DataStoreKey GEOFENCES_ENABLED_CONFIG;
    public static final DataStoreKey GEOFENCES_ENABLED_SET;
    public static final DataStoreKey GEOFENCES_MAX_NUM_TO_REGISTER;
    public static final DataStoreKey GEOFENCES_MIN_TIME_REPORT;
    public static final DataStoreKey GEOFENCES_MIN_TIME_REQUEST;
    public static final DataStoreKey GLOBAL_LAST_REPORT;
    public static final DataStoreKey GLOBAL_LAST_REQUEST;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_CAPACITY;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_ENABLED;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE;
    public static final DataStoreKey GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES;
    public static final DataStoreKey GOOGLE_ADVERTISING_ID;
    public static final DataStoreKey HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY;
    public static final DataStoreKey HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS;
    public static final DataStoreKey HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET;
    public static final DataStoreKey INAPP_AUTO_SET_MANAGER_LISTENER;
    public static final DataStoreKey INAPP_INITIAL_DISPLAY_OPERATION;
    public static final DataStoreKey INAPP_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey INAPP_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY;
    public static final DataStoreKey INDIVIDUAL_REELIGIBILITY_MAP;
    public static final DataStoreKey IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED;
    public static final DataStoreKey IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING;
    public static final DataStoreKey IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY;
    public static final DataStoreKey IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT;
    public static final DataStoreKey LARGE_NOTIFICATION_ICON;
    public static final DataStoreKey LAST_ACCESSED_SDK_VERSION;
    public static final DataStoreKey LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
    public static final DataStoreKey LAST_CARD_UPDATED_AT;
    public static final DataStoreKey LAST_FULL_CARD_SYNC_AT;
    public static final DataStoreKey LAST_REFRESH_IN_SECONDS;
    public static final DataStoreKey LAST_USER_ID;
    public static final DataStoreKey LEGACY_DEVICE_ID;
    public static final DataStoreKey MAX_BANNER_PLACEMENTS;
    public static final DataStoreKey MESSAGING_SESSION_END_TIMESTAMP;
    public static final DataStoreKey MESSAGING_SESSION_TIMEOUT;
    public static final DataStoreKey MINIMUM_SESSION_TIMEOUT;
    public static final DataStoreKey MITE_KEY;
    public static final DataStoreKey OPTIN_WHEN_PUSH_AUTHORIZED;
    public static final DataStoreKey PERMISSION_REQUEST_COUNTS;
    public static final DataStoreKey PERSISTENT_DEVICE_ID;
    public static final DataStoreKey PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP;
    public static final DataStoreKey PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME;
    public static final DataStoreKey PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED;
    public static final DataStoreKey PUSH_DELETED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_DELETED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_DELIVERY_EVENTS;
    public static final DataStoreKey PUSH_ID_MAP;
    public static final DataStoreKey PUSH_MAX_CAMPAIGNS;
    public static final DataStoreKey PUSH_MAX_ENABLED;
    public static final DataStoreKey PUSH_MAX_LAST_UPDATE;
    public static final DataStoreKey PUSH_MAX_REDELIVER_BUFFER;
    public static final DataStoreKey PUSH_MAX_REDELIVER_DEDUPE_BUFFER;
    public static final DataStoreKey PUSH_NOTIFICATION_HTML_RENDERING_ENABLED;
    public static final DataStoreKey PUSH_OPENED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_OPENED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_RECEIVED_CALLBACK_METHOD_NAME;
    public static final DataStoreKey PUSH_RECEIVED_GAME_OBJECT_NAME;
    public static final DataStoreKey PUSH_REGISTRATION_ID_KEY;
    public static final DataStoreKey PUSH_REGISTRATION_PERSISTENT_DEVICE_ID;
    public static final DataStoreKey PUSH_REGISTRATION_VERSION_CODE;
    public static final DataStoreKey PUSH_TOKEN;
    public static final DataStoreKey PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED;
    public static final DataStoreKey REGISTERED_GEOFENCES;
    public static final DataStoreKey REQUIRE_TOUCH_MODE_FOR_HTML_IAMS;
    public static final DataStoreKey SDK_AUTH;
    public static final DataStoreKey SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME;
    public static final DataStoreKey SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME;
    public static final DataStoreKey SDK_AUTH_ENABLED;
    public static final DataStoreKey SDK_DEBUGGER_AUTHORIZATION_CODE;
    public static final DataStoreKey SDK_DEBUGGER_ENABLED;
    public static final DataStoreKey SDK_DEBUGGER_EXPIRATION_TIME;
    public static final DataStoreKey SDK_DEBUGGER_FLUSH_INTERVAL_BYTES;
    public static final DataStoreKey SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS;
    public static final DataStoreKey SDK_DEBUGGER_MAX_PAYLOAD_BYTES;
    public static final DataStoreKey SDK_ENABLEMENT;
    public static final DataStoreKey SDK_FLAVOR;
    public static final DataStoreKey SDK_METADATA;
    public static final DataStoreKey SDK_METADATA_CONFIG;
    public static final DataStoreKey SERIALIZED_USER_OBJECT;
    public static final DataStoreKey SERVER_TARGET;
    public static final DataStoreKey SESSION_START_BASED_TIMEOUT_ENABLED;
    public static final DataStoreKey SESSION_STORAGE_MAP;
    public static final DataStoreKey SESSION_TIMEOUT;
    public static final DataStoreKey SMALL_NOTIFICATION_ICON;
    public static final DataStoreKey SUFFIX_CACHE_USER_ID_HASH;
    public static final DataStoreKey SUFFIX_CACHE_USER_ID_KEY;
    public static final DataStoreKey TEST_BOOLEAN_KEY;
    public static final DataStoreKey TEST_BOOLEAN_KEY_2;
    public static final DataStoreKey TEST_CARDS;
    public static final DataStoreKey TEST_DOUBLE_KEY;
    public static final DataStoreKey TEST_ENUM_STRING_KEY;
    public static final DataStoreKey TEST_FLOAT_KEY;
    public static final DataStoreKey TEST_FLOAT_KEY_2;
    public static final DataStoreKey TEST_INT_KEY;
    public static final DataStoreKey TEST_INT_KEY_2;
    public static final DataStoreKey TEST_LIST_KEY;
    public static final DataStoreKey TEST_LONG_KEY;
    public static final DataStoreKey TEST_LONG_KEY_2;
    public static final DataStoreKey TEST_MAP_KEY;
    public static final DataStoreKey TEST_STRING_KEY;
    public static final DataStoreKey TEST_STRING_KEY_2;
    public static final DataStoreKey TEST_STRING_SET_KEY;
    public static final DataStoreKey TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
    public static final DataStoreKey TOKEN_BUCKET_LAST_CALL_AT_MS;
    public static final DataStoreKey TRIGGERED_ACTIONS;
    public static final DataStoreKey TRIGGERED_ACTIONS_IMPRESSION_MAP;
    public static final DataStoreKey TRIGGERS_CHECKSUM;
    public static final DataStoreKey TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS;
    public static final DataStoreKey USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES;
    private static final onViewDetachedFromWindowlambda1 keyMap$delegate;
    private final String key;
    private final DataStoreValueType type;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    public final DataStoreValueType getType() {
        return this.type;
    }

    private static final /* synthetic */ DataStoreKey[] $values() {
        return new DataStoreKey[]{GEOFENCES, REGISTERED_GEOFENCES, GLOBAL_LAST_REQUEST, GLOBAL_LAST_REPORT, INDIVIDUAL_REELIGIBILITY_MAP, FEATURE_FLAGS, LAST_REFRESH_IN_SECONDS, FEATURE_FLAGS_IMPRESSIONS_MAP, CONTENT_CARDS, DISMISSED_CARDS, EXPIRED_CARDS, TEST_CARDS, LAST_CARD_UPDATED_AT, LAST_FULL_CARD_SYNC_AT, LAST_CARD_STORAGE_UPDATE_TIMESTAMP, LAST_ACCESSED_SDK_VERSION, TRIGGERED_ACTIONS, TRIGGERED_ACTIONS_IMPRESSION_MAP, TRIGGERS_CHECKSUM, BANNERS, BANNERS_IMPRESSION_MAP, BANNERS_PENDING_DISMISSALS, BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT, MITE_KEY, DUST_HOST, DUST_AUTH, DUST_RCS, DUST_AUTH_EXPIRATION_SECONDS, SDK_METADATA, PUSH_MAX_LAST_UPDATE, PUSH_MAX_CAMPAIGNS, PUSH_DELIVERY_EVENTS, SDK_AUTH, SDK_ENABLEMENT, CONFIG_TIME, EPHEMERAL_EVENTS_ENABLED, GEOFENCES_ENABLED_SET, GEOFENCES_ENABLED, GEOFENCES_MIN_TIME_REQUEST, GEOFENCES_MIN_TIME_REPORT, GEOFENCES_MAX_NUM_TO_REGISTER, MESSAGING_SESSION_TIMEOUT, MINIMUM_SESSION_TIMEOUT, DUST_ENABLED, DUST_SHOULD_BLOCK_CC_REFRESH, BLOCKLISTED_EVENTS, BLOCKLISTED_ATTRIBUTES, BLOCKLISTED_PURCHASES, CONTENT_CARDS_ENABLED, FEATURE_FLAGS_ENABLED, FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT, PUSH_MAX_ENABLED, PUSH_MAX_REDELIVER_BUFFER, PUSH_MAX_REDELIVER_DEDUPE_BUFFER, GLOBAL_REQUEST_RATE_LIMITING_ENABLED, GLOBAL_REQUEST_RATE_LIMITING_CAPACITY, GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE, GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES, DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS, DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS, DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR, SDK_DEBUGGER_ENABLED, SDK_DEBUGGER_EXPIRATION_TIME, SDK_DEBUGGER_AUTHORIZATION_CODE, SDK_DEBUGGER_FLUSH_INTERVAL_BYTES, SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS, SDK_DEBUGGER_MAX_PAYLOAD_BYTES, BANNERS_ENABLED, MAX_BANNER_PLACEMENTS, BANNERS_DISMISSALS_CACHE_SIZE, PUSH_REGISTRATION_VERSION_CODE, PUSH_REGISTRATION_PERSISTENT_DEVICE_ID, PUSH_REGISTRATION_ID_KEY, CURRENT_OPEN_SESSION_ID, SESSION_STORAGE_MAP, DELAYED_INIT_ENABLED, DELAYED_INIT_SET_DURING_RUNTIME_FLAG, DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG, MESSAGING_SESSION_END_TIMESTAMP, EVENT_STORAGE_MAP, PUSH_ID_MAP, SERIALIZED_USER_OBJECT, PUSH_TOKEN, EVENT_DUPLICATION_VALIDATION_STORAGE_MAP, API_KEY, SERVER_TARGET, SDK_FLAVOR, CUSTOM_ENDPOINT, SMALL_NOTIFICATION_ICON, LARGE_NOTIFICATION_ICON, SESSION_TIMEOUT, DEFAULT_NOTIFICATION_ACCENT_COLOR, TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS, ADM_MESSAGING_REGISTRATION_ENABLED, HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, AUTOMATIC_LOCATION_COLLECTION, DATA_SYNC_BAD_NETWORK_INTERVAL, DATA_SYNC_GOOD_NETWORK_INTERVAL, DATA_SYNC_GREAT_NETWORK_INTERVAL, DEFAULT_NOTIFICATION_CHANNEL_NAME, DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED, PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME, SESSION_START_BASED_TIMEOUT_ENABLED, FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED, FIREBASE_CLOUD_MESSAGING_SENDER_ID, CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, DEVICE_OBJECT_ALLOWLISTING_ENABLED, IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, DOES_PUSH_STORY_DISMISS_ON_CLICK, GEOFENCES_ENABLED_CONFIG, IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME, GEOFENCES_AUTOMATIC_REQUESTS_ENABLED, IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT, FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN, SDK_AUTH_ENABLED, REQUIRE_TOUCH_MODE_FOR_HTML_IAMS, HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS, HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET, DEVICE_OBJECT_ALLOWLIST, CUSTOM_LOCATION_PROVIDERS_LIST, SDK_METADATA_CONFIG, FALLBACK_FCM_SERVICE_ENABLED, FALLBACK_FCM_SERVICE_CLASSPATH, OPTIN_WHEN_PUSH_AUTHORIZED, USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES, PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP, IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING, INAPP_LISTENER_GAME_OBJECT_NAME, INAPP_LISTENER_CALLBACK_METHOD_NAME, INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY, PUSH_RECEIVED_GAME_OBJECT_NAME, PUSH_RECEIVED_CALLBACK_METHOD_NAME, PUSH_OPENED_GAME_OBJECT_NAME, PUSH_OPENED_CALLBACK_METHOD_NAME, PUSH_DELETED_GAME_OBJECT_NAME, PUSH_DELETED_CALLBACK_METHOD_NAME, CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME, CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME, FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME, FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME, SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME, SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME, INAPP_AUTO_SET_MANAGER_LISTENER, INAPP_INITIAL_DISPLAY_OPERATION, LAST_USER_ID, SUFFIX_CACHE_USER_ID_HASH, SUFFIX_CACHE_USER_ID_KEY, DEVICE_ID, LEGACY_DEVICE_ID, PERSISTENT_DEVICE_ID, CACHED_DEVICE, DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, DEVICE_CACHE_LAST_OS_VERSION, PERMISSION_REQUEST_COUNTS, GOOGLE_ADVERTISING_ID, AD_TRACKING_ENABLED, ENDPOINT_LAST_REQUEST_MAP, ENDPOINT_ATTEMPT_COUNT_MAP, TOKEN_BUCKET_CURRENT_TOKEN_COUNT, TOKEN_BUCKET_LAST_CALL_AT_MS, TEST_STRING_KEY, TEST_STRING_KEY_2, TEST_LONG_KEY, TEST_LONG_KEY_2, TEST_INT_KEY, TEST_INT_KEY_2, TEST_DOUBLE_KEY, TEST_FLOAT_KEY, TEST_FLOAT_KEY_2, TEST_BOOLEAN_KEY, TEST_BOOLEAN_KEY_2, TEST_MAP_KEY, TEST_LIST_KEY, TEST_ENUM_STRING_KEY, TEST_STRING_SET_KEY};
    }

    static {
        DataStoreValueType dataStoreValueType = DataStoreValueType.LIST;
        GEOFENCES = new DataStoreKey("GEOFENCES", 0, "geofences", dataStoreValueType);
        REGISTERED_GEOFENCES = new DataStoreKey("REGISTERED_GEOFENCES", 1, "registered_geofences", dataStoreValueType);
        DataStoreValueType dataStoreValueType2 = DataStoreValueType.LONG;
        GLOBAL_LAST_REQUEST = new DataStoreKey("GLOBAL_LAST_REQUEST", 2, "last_request_global", dataStoreValueType2);
        GLOBAL_LAST_REPORT = new DataStoreKey("GLOBAL_LAST_REPORT", 3, "last_report_global", dataStoreValueType2);
        DataStoreValueType dataStoreValueType3 = DataStoreValueType.MAP;
        INDIVIDUAL_REELIGIBILITY_MAP = new DataStoreKey("INDIVIDUAL_REELIGIBILITY_MAP", 4, "individual_reeligibility_map", dataStoreValueType3);
        FEATURE_FLAGS = new DataStoreKey("FEATURE_FLAGS", 5, "feature_flags", dataStoreValueType);
        LAST_REFRESH_IN_SECONDS = new DataStoreKey("LAST_REFRESH_IN_SECONDS", 6, "last_refresh", dataStoreValueType2);
        FEATURE_FLAGS_IMPRESSIONS_MAP = new DataStoreKey("FEATURE_FLAGS_IMPRESSIONS_MAP", 7, "ff_impressions_map", dataStoreValueType3);
        CONTENT_CARDS = new DataStoreKey("CONTENT_CARDS", 8, "content_cards", dataStoreValueType);
        DISMISSED_CARDS = new DataStoreKey("DISMISSED_CARDS", 9, "dismissed", dataStoreValueType);
        EXPIRED_CARDS = new DataStoreKey("EXPIRED_CARDS", 10, "expired", dataStoreValueType);
        TEST_CARDS = new DataStoreKey("TEST_CARDS", 11, "test", dataStoreValueType);
        LAST_CARD_UPDATED_AT = new DataStoreKey("LAST_CARD_UPDATED_AT", 12, "last_card_updated_at", dataStoreValueType2);
        LAST_FULL_CARD_SYNC_AT = new DataStoreKey("LAST_FULL_CARD_SYNC_AT", 13, "last_full_sync_at", dataStoreValueType2);
        LAST_CARD_STORAGE_UPDATE_TIMESTAMP = new DataStoreKey("LAST_CARD_STORAGE_UPDATE_TIMESTAMP", 14, "last_storage_update_timestamp", dataStoreValueType2);
        DataStoreValueType dataStoreValueType4 = DataStoreValueType.STRING;
        LAST_ACCESSED_SDK_VERSION = new DataStoreKey("LAST_ACCESSED_SDK_VERSION", 15, "last_accessed_sdk_version", dataStoreValueType4);
        TRIGGERED_ACTIONS = new DataStoreKey("TRIGGERED_ACTIONS", 16, "triggers", dataStoreValueType);
        TRIGGERED_ACTIONS_IMPRESSION_MAP = new DataStoreKey("TRIGGERED_ACTIONS_IMPRESSION_MAP", 17, "triggers_impression_map", dataStoreValueType3);
        TRIGGERS_CHECKSUM = new DataStoreKey("TRIGGERS_CHECKSUM", 18, "triggers_checksum", dataStoreValueType4);
        BANNERS = new DataStoreKey("BANNERS", 19, "banners", dataStoreValueType);
        BANNERS_IMPRESSION_MAP = new DataStoreKey("BANNERS_IMPRESSION_MAP", 20, "banners_impression_map", dataStoreValueType3);
        BANNERS_PENDING_DISMISSALS = new DataStoreKey("BANNERS_PENDING_DISMISSALS", 21, "banners_pending_dismissals", dataStoreValueType);
        BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT = new DataStoreKey("BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT", 22, "banners_last_request_time_per_placement", dataStoreValueType3);
        MITE_KEY = new DataStoreKey("MITE_KEY", 23, "mite", dataStoreValueType4);
        DUST_HOST = new DataStoreKey("DUST_HOST", 24, "dust_host", dataStoreValueType4);
        DUST_AUTH = new DataStoreKey("DUST_AUTH", 25, "dust_auth", dataStoreValueType4);
        DUST_RCS = new DataStoreKey("DUST_RCS", 26, "dust_rcs", dataStoreValueType4);
        DUST_AUTH_EXPIRATION_SECONDS = new DataStoreKey("DUST_AUTH_EXPIRATION_SECONDS", 27, "dust_auth_expiration_seconds", dataStoreValueType2);
        SDK_METADATA = new DataStoreKey("SDK_METADATA", 28, "tags", dataStoreValueType);
        PUSH_MAX_LAST_UPDATE = new DataStoreKey("PUSH_MAX_LAST_UPDATE", 29, "lastUpdateTime", dataStoreValueType2);
        PUSH_MAX_CAMPAIGNS = new DataStoreKey("PUSH_MAX_CAMPAIGNS", 30, "push_max_campaigns", dataStoreValueType3);
        PUSH_DELIVERY_EVENTS = new DataStoreKey("PUSH_DELIVERY_EVENTS", 31, "push_delivery_events", dataStoreValueType3);
        SDK_AUTH = new DataStoreKey("SDK_AUTH", 32, "auth_signature", dataStoreValueType4);
        DataStoreValueType dataStoreValueType5 = DataStoreValueType.BOOLEAN;
        SDK_ENABLEMENT = new DataStoreKey("SDK_ENABLEMENT", 33, "appboy_sdk_disabled", dataStoreValueType5);
        CONFIG_TIME = new DataStoreKey("CONFIG_TIME", 34, "config_time", dataStoreValueType2);
        EPHEMERAL_EVENTS_ENABLED = new DataStoreKey("EPHEMERAL_EVENTS_ENABLED", 35, "ephemeral_events_enabled", dataStoreValueType5);
        GEOFENCES_ENABLED_SET = new DataStoreKey("GEOFENCES_ENABLED_SET", 36, "geofences_enabled_set", dataStoreValueType5);
        GEOFENCES_ENABLED = new DataStoreKey("GEOFENCES_ENABLED", 37, "geofences_enabled", dataStoreValueType5);
        DataStoreValueType dataStoreValueType6 = DataStoreValueType.INT;
        GEOFENCES_MIN_TIME_REQUEST = new DataStoreKey("GEOFENCES_MIN_TIME_REQUEST", 38, "geofences_min_time_since_last_request", dataStoreValueType6);
        GEOFENCES_MIN_TIME_REPORT = new DataStoreKey("GEOFENCES_MIN_TIME_REPORT", 39, "geofences_min_time_since_last_report", dataStoreValueType6);
        GEOFENCES_MAX_NUM_TO_REGISTER = new DataStoreKey("GEOFENCES_MAX_NUM_TO_REGISTER", 40, "geofences_max_num_to_register", dataStoreValueType6);
        MESSAGING_SESSION_TIMEOUT = new DataStoreKey("MESSAGING_SESSION_TIMEOUT", 41, "messaging_session_timeout", dataStoreValueType2);
        MINIMUM_SESSION_TIMEOUT = new DataStoreKey("MINIMUM_SESSION_TIMEOUT", 42, "minimum_session_timeout", dataStoreValueType6);
        DUST_ENABLED = new DataStoreKey("DUST_ENABLED", 43, "dust_enabled", dataStoreValueType5);
        DUST_SHOULD_BLOCK_CC_REFRESH = new DataStoreKey("DUST_SHOULD_BLOCK_CC_REFRESH", 44, "dust_should_block_cc_refresh", dataStoreValueType5);
        BLOCKLISTED_EVENTS = new DataStoreKey("BLOCKLISTED_EVENTS", 45, "blacklisted_events", dataStoreValueType);
        BLOCKLISTED_ATTRIBUTES = new DataStoreKey("BLOCKLISTED_ATTRIBUTES", 46, "blacklisted_attributes", dataStoreValueType);
        BLOCKLISTED_PURCHASES = new DataStoreKey("BLOCKLISTED_PURCHASES", 47, "blacklisted_purchases", dataStoreValueType);
        CONTENT_CARDS_ENABLED = new DataStoreKey("CONTENT_CARDS_ENABLED", 48, "content_cards_enabled", dataStoreValueType5);
        FEATURE_FLAGS_ENABLED = new DataStoreKey("FEATURE_FLAGS_ENABLED", 49, "feature_flags_enabled", dataStoreValueType5);
        FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT = new DataStoreKey("FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT", 50, "feature_flags_refresh_rate_limit", dataStoreValueType6);
        PUSH_MAX_ENABLED = new DataStoreKey("PUSH_MAX_ENABLED", 51, "push_max_enabled", dataStoreValueType5);
        PUSH_MAX_REDELIVER_BUFFER = new DataStoreKey("PUSH_MAX_REDELIVER_BUFFER", 52, "push_max_redeliver_buffer", dataStoreValueType2);
        PUSH_MAX_REDELIVER_DEDUPE_BUFFER = new DataStoreKey("PUSH_MAX_REDELIVER_DEDUPE_BUFFER", 53, "push_max_redeliver_dedupe_buffer", dataStoreValueType2);
        GLOBAL_REQUEST_RATE_LIMITING_ENABLED = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_ENABLED", 54, "global_req_rate_limit_enabled", dataStoreValueType5);
        GLOBAL_REQUEST_RATE_LIMITING_CAPACITY = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_CAPACITY", 55, "global_req_rate_capacity", dataStoreValueType6);
        GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE", 56, "global_req_rate_refill_rate", dataStoreValueType6);
        GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES = new DataStoreKey("GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES", 57, "global_req_rate_limit_endpoint_overrides", dataStoreValueType4);
        DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS", 58, "default_backoff_min_sleep_duration__ms", dataStoreValueType6);
        DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS", 59, "default_backoff_max_sleep_duration_ms", dataStoreValueType6);
        DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR = new DataStoreKey("DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR", 60, "default_backoff_scale_factor", dataStoreValueType6);
        SDK_DEBUGGER_ENABLED = new DataStoreKey("SDK_DEBUGGER_ENABLED", 61, "sdk_debugger_enabled", dataStoreValueType5);
        SDK_DEBUGGER_EXPIRATION_TIME = new DataStoreKey("SDK_DEBUGGER_EXPIRATION_TIME", 62, "sdk_debugger_expiration_time", dataStoreValueType2);
        SDK_DEBUGGER_AUTHORIZATION_CODE = new DataStoreKey("SDK_DEBUGGER_AUTHORIZATION_CODE", 63, "sdk_debugger_authorization_code", dataStoreValueType4);
        SDK_DEBUGGER_FLUSH_INTERVAL_BYTES = new DataStoreKey("SDK_DEBUGGER_FLUSH_INTERVAL_BYTES", 64, "sdk_debugger_flush_interval_bytes", dataStoreValueType2);
        SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS = new DataStoreKey("SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS", 65, "sdk_debugger_flush_interval_seconds", dataStoreValueType2);
        SDK_DEBUGGER_MAX_PAYLOAD_BYTES = new DataStoreKey("SDK_DEBUGGER_MAX_PAYLOAD_BYTES", 66, "sdk_debugger_max_payload_bytes", dataStoreValueType2);
        BANNERS_ENABLED = new DataStoreKey("BANNERS_ENABLED", 67, "banners_enabled", dataStoreValueType5);
        MAX_BANNER_PLACEMENTS = new DataStoreKey("MAX_BANNER_PLACEMENTS", 68, "max_banner_placements", dataStoreValueType6);
        BANNERS_DISMISSALS_CACHE_SIZE = new DataStoreKey("BANNERS_DISMISSALS_CACHE_SIZE", 69, "banners_dismissals_cache_size", dataStoreValueType6);
        PUSH_REGISTRATION_VERSION_CODE = new DataStoreKey("PUSH_REGISTRATION_VERSION_CODE", 70, "version_code", dataStoreValueType6);
        PUSH_REGISTRATION_PERSISTENT_DEVICE_ID = new DataStoreKey("PUSH_REGISTRATION_PERSISTENT_DEVICE_ID", 71, "device_identifier", dataStoreValueType4);
        PUSH_REGISTRATION_ID_KEY = new DataStoreKey("PUSH_REGISTRATION_ID_KEY", 72, "registration_id", dataStoreValueType4);
        CURRENT_OPEN_SESSION_ID = new DataStoreKey("CURRENT_OPEN_SESSION_ID", 73, "current_open_session", dataStoreValueType4);
        SESSION_STORAGE_MAP = new DataStoreKey("SESSION_STORAGE_MAP", 74, "session_storage_map", dataStoreValueType3);
        DELAYED_INIT_ENABLED = new DataStoreKey("DELAYED_INIT_ENABLED", 75, "delayed_initialization_enabled", dataStoreValueType5);
        DELAYED_INIT_SET_DURING_RUNTIME_FLAG = new DataStoreKey("DELAYED_INIT_SET_DURING_RUNTIME_FLAG", 76, "was_set_during_runtime", dataStoreValueType5);
        DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG = new DataStoreKey("DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG", 77, "analytics_behavior", dataStoreValueType4);
        MESSAGING_SESSION_END_TIMESTAMP = new DataStoreKey("MESSAGING_SESSION_END_TIMESTAMP", 78, "messaging_session_timestamp", dataStoreValueType2);
        EVENT_STORAGE_MAP = new DataStoreKey("EVENT_STORAGE_MAP", 79, "events", dataStoreValueType3);
        PUSH_ID_MAP = new DataStoreKey("PUSH_ID_MAP", 80, "push_id_map", dataStoreValueType3);
        SERIALIZED_USER_OBJECT = new DataStoreKey("SERIALIZED_USER_OBJECT", 81, "user_cache_attributes_object", dataStoreValueType4);
        PUSH_TOKEN = new DataStoreKey("PUSH_TOKEN", 82, "push_token", dataStoreValueType4);
        EVENT_DUPLICATION_VALIDATION_STORAGE_MAP = new DataStoreKey("EVENT_DUPLICATION_VALIDATION_STORAGE_MAP", 83, "event_duplication_validation_storage_map", dataStoreValueType3);
        API_KEY = new DataStoreKey("API_KEY", 84, "com_braze_api_key", dataStoreValueType4);
        SERVER_TARGET = new DataStoreKey("SERVER_TARGET", 85, "com_braze_server_target", dataStoreValueType4);
        SDK_FLAVOR = new DataStoreKey("SDK_FLAVOR", 86, "com_braze_sdk_flavor", dataStoreValueType4);
        CUSTOM_ENDPOINT = new DataStoreKey("CUSTOM_ENDPOINT", 87, "com_braze_custom_endpoint", dataStoreValueType4);
        SMALL_NOTIFICATION_ICON = new DataStoreKey("SMALL_NOTIFICATION_ICON", 88, "com_braze_push_small_notification_icon", dataStoreValueType4);
        LARGE_NOTIFICATION_ICON = new DataStoreKey("LARGE_NOTIFICATION_ICON", 89, "com_braze_push_large_notification_icon", dataStoreValueType4);
        SESSION_TIMEOUT = new DataStoreKey("SESSION_TIMEOUT", 90, "com_braze_session_timeout", dataStoreValueType6);
        DEFAULT_NOTIFICATION_ACCENT_COLOR = new DataStoreKey("DEFAULT_NOTIFICATION_ACCENT_COLOR", 91, "com_braze_default_notification_accent_color", dataStoreValueType6);
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS = new DataStoreKey("TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS", 92, "com_braze_trigger_action_minimum_time_interval_seconds", dataStoreValueType6);
        ADM_MESSAGING_REGISTRATION_ENABLED = new DataStoreKey("ADM_MESSAGING_REGISTRATION_ENABLED", 93, "com_braze_push_adm_messaging_registration_enabled", dataStoreValueType5);
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY = new DataStoreKey("HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY", 94, "com_braze_handle_push_deep_links_automatically", dataStoreValueType5);
        AUTOMATIC_LOCATION_COLLECTION = new DataStoreKey("AUTOMATIC_LOCATION_COLLECTION", 95, "com_braze_enable_location_collection", dataStoreValueType5);
        DATA_SYNC_BAD_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_BAD_NETWORK_INTERVAL", 96, "com_braze_data_flush_interval_bad_network", dataStoreValueType6);
        DATA_SYNC_GOOD_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_GOOD_NETWORK_INTERVAL", 97, "com_braze_data_flush_interval_good_network", dataStoreValueType6);
        DATA_SYNC_GREAT_NETWORK_INTERVAL = new DataStoreKey("DATA_SYNC_GREAT_NETWORK_INTERVAL", 98, "com_braze_data_flush_interval_great_network", dataStoreValueType6);
        DEFAULT_NOTIFICATION_CHANNEL_NAME = new DataStoreKey("DEFAULT_NOTIFICATION_CHANNEL_NAME", 99, "com_braze_default_notification_channel_name", dataStoreValueType4);
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION = new DataStoreKey("DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION", 100, "com_braze_default_notification_channel_description", dataStoreValueType4);
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED = new DataStoreKey("PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED", 101, "com_braze_push_deep_link_back_stack_activity_enabled", dataStoreValueType5);
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME = new DataStoreKey("PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME", 102, "com_braze_push_deep_link_back_stack_activity_class_name", dataStoreValueType4);
        SESSION_START_BASED_TIMEOUT_ENABLED = new DataStoreKey("SESSION_START_BASED_TIMEOUT_ENABLED", 103, "com_braze_session_start_based_timeout_enabled", dataStoreValueType5);
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED = new DataStoreKey("FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED", 104, "com_braze_firebase_cloud_messaging_registration_enabled", dataStoreValueType5);
        FIREBASE_CLOUD_MESSAGING_SENDER_ID = new DataStoreKey("FIREBASE_CLOUD_MESSAGING_SENDER_ID", 105, "com_braze_firebase_cloud_messaging_sender_id", dataStoreValueType4);
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED = new DataStoreKey("CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED", GwiErrorCode.ALG_LIBRARY_NOT_EXIST, "com_braze_content_cards_unread_visual_indicator_enabled", dataStoreValueType5);
        DEVICE_OBJECT_ALLOWLISTING_ENABLED = new DataStoreKey("DEVICE_OBJECT_ALLOWLISTING_ENABLED", 107, "com_braze_device_object_whitelisting_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED = new DataStoreKey("IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED", ActivityIdentificationData.RUNNING, "com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", dataStoreValueType5);
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED = new DataStoreKey("PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED", 109, "com_braze_push_wake_screen_for_notification_enabled", dataStoreValueType5);
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED = new DataStoreKey("PUSH_NOTIFICATION_HTML_RENDERING_ENABLED", 110, "com_braze_push_notification_html_rendering_enabled", dataStoreValueType5);
        DOES_PUSH_STORY_DISMISS_ON_CLICK = new DataStoreKey("DOES_PUSH_STORY_DISMISS_ON_CLICK", 111, "com_braze_does_push_story_dismiss_on_click", dataStoreValueType5);
        GEOFENCES_ENABLED_CONFIG = new DataStoreKey("GEOFENCES_ENABLED_CONFIG", 112, "com_braze_geofences_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY = new DataStoreKey("IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY", 113, "com_braze_in_app_message_push_test_eager_display_enabled", dataStoreValueType5);
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME = new DataStoreKey("CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME", 114, "com_braze_custom_html_webview_activity_class_name", dataStoreValueType4);
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED = new DataStoreKey("GEOFENCES_AUTOMATIC_REQUESTS_ENABLED", 115, "com_braze_automatic_geofence_requests_enabled", dataStoreValueType5);
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT = new DataStoreKey("IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT", 116, "com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", dataStoreValueType6);
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN = new DataStoreKey("FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN", 117, "com_braze_firebase_messaging_service_automatically_register_on_new_token", dataStoreValueType5);
        SDK_AUTH_ENABLED = new DataStoreKey("SDK_AUTH_ENABLED", 118, "com_braze_sdk_authentication_enabled", dataStoreValueType5);
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS = new DataStoreKey("REQUIRE_TOUCH_MODE_FOR_HTML_IAMS", 119, "com_braze_require_touch_mode_for_html_in_app_messages", dataStoreValueType5);
        HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS = new DataStoreKey("HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS", 120, "com_braze_html_in_app_message_apply_insets", dataStoreValueType5);
        HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET = new DataStoreKey("HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET", 121, "com_braze_html_in_app_message_enable_html_link_target", dataStoreValueType5);
        DEVICE_OBJECT_ALLOWLIST = new DataStoreKey("DEVICE_OBJECT_ALLOWLIST", 122, "com_braze_device_object_whitelist", dataStoreValueType);
        CUSTOM_LOCATION_PROVIDERS_LIST = new DataStoreKey("CUSTOM_LOCATION_PROVIDERS_LIST", 123, "com_braze_custom_location_providers_list", dataStoreValueType);
        SDK_METADATA_CONFIG = new DataStoreKey("SDK_METADATA_CONFIG", 124, "com_braze_sdk_metadata", dataStoreValueType);
        FALLBACK_FCM_SERVICE_ENABLED = new DataStoreKey("FALLBACK_FCM_SERVICE_ENABLED", 125, "com_braze_fallback_firebase_cloud_messaging_service_enabled", dataStoreValueType5);
        FALLBACK_FCM_SERVICE_CLASSPATH = new DataStoreKey("FALLBACK_FCM_SERVICE_CLASSPATH", 126, "com_braze_fallback_firebase_cloud_messaging_service_classpath", dataStoreValueType4);
        OPTIN_WHEN_PUSH_AUTHORIZED = new DataStoreKey("OPTIN_WHEN_PUSH_AUTHORIZED", 127, "com_braze_optin_when_push_authorized", dataStoreValueType5);
        USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES = new DataStoreKey("USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES", Fields.SpotShadowColor, "com_braze_use_activity_window_flag_secure", dataStoreValueType5);
        PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP = new DataStoreKey("PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP", 129, "com_braze_persist_webview_when_backgrounding_app", dataStoreValueType5);
        IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING = new DataStoreKey("IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING", 130, "com_braze_in_app_message_add_status_bar_padding", dataStoreValueType5);
        INAPP_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("INAPP_LISTENER_GAME_OBJECT_NAME", 131, "com_braze_inapp_listener_game_object_name", dataStoreValueType4);
        INAPP_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("INAPP_LISTENER_CALLBACK_METHOD_NAME", 132, "com_braze_inapp_listener_callback_method_name", dataStoreValueType4);
        INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY = new DataStoreKey("INAPP_SHOW_INAPP_MESSAGES_AUTOMATICALLY", 133, "com_braze_inapp_show_inapp_messages_automatically", dataStoreValueType5);
        PUSH_RECEIVED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_RECEIVED_GAME_OBJECT_NAME", 134, "com_braze_push_received_game_object_name", dataStoreValueType4);
        PUSH_RECEIVED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_RECEIVED_CALLBACK_METHOD_NAME", 135, "com_braze_push_received_callback_method_name", dataStoreValueType4);
        PUSH_OPENED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_OPENED_GAME_OBJECT_NAME", 136, "com_braze_push_opened_game_object_name", dataStoreValueType4);
        PUSH_OPENED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_OPENED_CALLBACK_METHOD_NAME", 137, "com_braze_push_opened_callback_method_name", dataStoreValueType4);
        PUSH_DELETED_GAME_OBJECT_NAME = new DataStoreKey("PUSH_DELETED_GAME_OBJECT_NAME", 138, "com_braze_push_deleted_game_object_name", dataStoreValueType4);
        PUSH_DELETED_CALLBACK_METHOD_NAME = new DataStoreKey("PUSH_DELETED_CALLBACK_METHOD_NAME", 139, "com_braze_push_deleted_callback_method_name", dataStoreValueType4);
        CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("CONTENT_CARDS_UPDATED_LISTENER_GAME_OBJECT_NAME", 140, "com_braze_content_cards_updated_listener_game_object_name", dataStoreValueType4);
        CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("CONTENT_CARDS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", 141, "com_braze_content_cards_updated_listener_callback_method_name", dataStoreValueType4);
        FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("FEATURE_FLAGS_UPDATED_LISTENER_GAME_OBJECT_NAME", 142, "com_braze_feature_flags_updated_listener_game_object_name", dataStoreValueType4);
        FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("FEATURE_FLAGS_UPDATED_LISTENER_CALLBACK_METHOD_NAME", 143, "com_braze_feature_flags_updated_listener_callback_method_name", dataStoreValueType4);
        SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME = new DataStoreKey("SDK_AUTHENTICATION_FAILURE_LISTENER_GAME_OBJECT_NAME", 144, "com_braze_sdk_authentication_failure_listener_game_object_name", dataStoreValueType4);
        SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME = new DataStoreKey("SDK_AUTHENTICATION_FAILURE_LISTENER_CALLBACK_METHOD_NAME", 145, "com_braze_sdk_authentication_failure_listener_callback_method_name", dataStoreValueType4);
        INAPP_AUTO_SET_MANAGER_LISTENER = new DataStoreKey("INAPP_AUTO_SET_MANAGER_LISTENER", 146, "com_braze_inapp_auto_set_manager_listener_key", dataStoreValueType5);
        INAPP_INITIAL_DISPLAY_OPERATION = new DataStoreKey("INAPP_INITIAL_DISPLAY_OPERATION", 147, "com_braze_inapp_initial_display_operation_key", dataStoreValueType4);
        LAST_USER_ID = new DataStoreKey("LAST_USER_ID", 148, "last_user", dataStoreValueType4);
        SUFFIX_CACHE_USER_ID_HASH = new DataStoreKey("SUFFIX_CACHE_USER_ID_HASH", 149, StringUtils.SUFFIX_CACHE_USER_ID_HASH_VALUE, dataStoreValueType4);
        SUFFIX_CACHE_USER_ID_KEY = new DataStoreKey("SUFFIX_CACHE_USER_ID_KEY", 150, StringUtils.SUFFIX_CACHE_USER_ID_KEY, dataStoreValueType4);
        DEVICE_ID = new DataStoreKey("DEVICE_ID", 151, "device_id", dataStoreValueType4);
        LEGACY_DEVICE_ID = new DataStoreKey("LEGACY_DEVICE_ID", 152, "legacy_device_id", dataStoreValueType4);
        PERSISTENT_DEVICE_ID = new DataStoreKey("PERSISTENT_DEVICE_ID", 153, "persistent_device_id", dataStoreValueType4);
        CACHED_DEVICE = new DataStoreKey("CACHED_DEVICE", 154, "cached_device", dataStoreValueType4);
        DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT = new DataStoreKey("DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT", ModuleDescriptor.MODULE_VERSION, "sfone", dataStoreValueType5);
        DEVICE_CACHE_LAST_OS_VERSION = new DataStoreKey("DEVICE_CACHE_LAST_OS_VERSION", 156, "ldov", dataStoreValueType6);
        PERMISSION_REQUEST_COUNTS = new DataStoreKey("PERMISSION_REQUEST_COUNTS", 157, "permission_request_counts", dataStoreValueType3);
        GOOGLE_ADVERTISING_ID = new DataStoreKey("GOOGLE_ADVERTISING_ID", 158, "google_ad_id", dataStoreValueType4);
        AD_TRACKING_ENABLED = new DataStoreKey("AD_TRACKING_ENABLED", 159, "ad_tracking_enabled", dataStoreValueType5);
        ENDPOINT_LAST_REQUEST_MAP = new DataStoreKey("ENDPOINT_LAST_REQUEST_MAP", 160, "endpoint_last_request_map", dataStoreValueType3);
        ENDPOINT_ATTEMPT_COUNT_MAP = new DataStoreKey("ENDPOINT_ATTEMPT_COUNT_MAP", 161, "endpoint_attempt_count_map", dataStoreValueType3);
        DataStoreValueType dataStoreValueType7 = DataStoreValueType.FLOAT;
        TOKEN_BUCKET_CURRENT_TOKEN_COUNT = new DataStoreKey("TOKEN_BUCKET_CURRENT_TOKEN_COUNT", 162, "current_token_count", dataStoreValueType7);
        TOKEN_BUCKET_LAST_CALL_AT_MS = new DataStoreKey("TOKEN_BUCKET_LAST_CALL_AT_MS", 163, "last_call_at_ms", dataStoreValueType2);
        TEST_STRING_KEY = new DataStoreKey("TEST_STRING_KEY", 164, "string_key", dataStoreValueType4);
        TEST_STRING_KEY_2 = new DataStoreKey("TEST_STRING_KEY_2", 165, "string_key_2", dataStoreValueType4);
        TEST_LONG_KEY = new DataStoreKey("TEST_LONG_KEY", 166, "long_key", dataStoreValueType2);
        TEST_LONG_KEY_2 = new DataStoreKey("TEST_LONG_KEY_2", 167, "long_key_2", dataStoreValueType2);
        TEST_INT_KEY = new DataStoreKey("TEST_INT_KEY", DateTimeConstants.HOURS_PER_WEEK, "int_key", dataStoreValueType6);
        TEST_INT_KEY_2 = new DataStoreKey("TEST_INT_KEY_2", 169, "int_key_2", dataStoreValueType6);
        TEST_DOUBLE_KEY = new DataStoreKey("TEST_DOUBLE_KEY", 170, "double_key", DataStoreValueType.DOUBLE);
        TEST_FLOAT_KEY = new DataStoreKey("TEST_FLOAT_KEY", 171, "float_key", dataStoreValueType7);
        TEST_FLOAT_KEY_2 = new DataStoreKey("TEST_FLOAT_KEY_2", 172, "float_key_2", dataStoreValueType7);
        TEST_BOOLEAN_KEY = new DataStoreKey("TEST_BOOLEAN_KEY", 173, "boolean_key", dataStoreValueType5);
        TEST_BOOLEAN_KEY_2 = new DataStoreKey("TEST_BOOLEAN_KEY_2", 174, "boolean_key_2", dataStoreValueType5);
        TEST_MAP_KEY = new DataStoreKey("TEST_MAP_KEY", 175, "map_key", dataStoreValueType3);
        TEST_LIST_KEY = new DataStoreKey("TEST_LIST_KEY", 176, "list_key", dataStoreValueType);
        TEST_ENUM_STRING_KEY = new DataStoreKey("TEST_ENUM_STRING_KEY", 177, "cached_configuration_provider_test_enum_string", dataStoreValueType4);
        TEST_STRING_SET_KEY = new DataStoreKey("TEST_STRING_SET_KEY", 178, "cached_configuration_provider_test_string_set", dataStoreValueType);
        DataStoreKey[] dataStoreKeyArr$values = $values();
        $VALUES = dataStoreKeyArr$values;
        $ENTRIES = UtilsKt.read((Enum[]) dataStoreKeyArr$values);
        Companion = new i4();
        keyMap$delegate = new isAdapterPositionOnScreen(new c$$ExternalSyntheticLambda7(10));
    }

    public static DataStoreKey valueOf(String str) {
        return (DataStoreKey) Enum.valueOf(DataStoreKey.class, str);
    }

    public static DataStoreKey[] values() {
        return (DataStoreKey[]) $VALUES.clone();
    }

    private DataStoreKey(String str, int i, String str2, DataStoreValueType dataStoreValueType) {
        super(str, i);
        this.key = str2;
        this.type = dataStoreValueType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map keyMap_delegate$lambda$0() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = getEntries();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(entries, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Object obj : entries) {
            linkedHashMap.put(((DataStoreKey) obj).key, obj);
        }
        return linkedHashMap;
    }
}

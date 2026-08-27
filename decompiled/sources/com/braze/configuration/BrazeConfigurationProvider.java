package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.f1;
import bo.app.h1;
import bo.app.i1;
import bo.app.l3;
import bo.app.m7;
import bo.app.v6$$ExternalSyntheticLambda7;
import com.braze.BrazeUser$$ExternalSyntheticLambda1;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import com.braze.support.c$$ExternalSyntheticLambda7;
import com.braze.support.d;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import o.ItemTouchHelperAdapter;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final h1 Companion = new h1();
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = 15000;
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }

    public final Context getContext$android_sdk_base_release() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_applicationIconResourceId_$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Couldn't find application icon for package: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$0() {
        return "Found an override api key. Using it to configure the Braze SDK";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$1() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$2() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$3() {
        return "**                 !! WARNING !!                  **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$4() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$5() {
        return "**     No API key set in res/values/braze.xml     **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$6() {
        return "** No cached API Key found from Braze.configure   **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$7() {
        return "**          Braze functionality disabled          **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$8() {
        return "**                                                **";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_brazeApiKey_$lambda$9() {
        return "****************************************************";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_defaultNotificationAccentColor_$lambda$0() {
        return "Using default notification accent color found in resources";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_ephemeralEventKeys_$lambda$0() {
        return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_sdkFlavor_$lambda$0() {
        return "Exception while parsing stored SDK flavor. Returning null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_versionCode_$lambda$0() {
        return "Unable to read the version code.";
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, i1 i1Var) {
        String str = i1Var.a;
        if (getConfigurationCache().containsKey(str)) {
            Object obj = getConfigurationCache().get(str);
            obj.getClass();
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(i1Var.a, new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> enumSetA = d.a(cls, stringSetValue);
        getConfigurationCache().put(str, enumSetA);
        return enumSetA;
    }

    public final f1 getBrazeApiKey() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = (String) getConfigurationCache().get("com_braze_api_key");
        if (stringValue == null) {
            stringValue = getRuntimeAppConfigurationProvider().getStringValue("com_braze_api_key", null);
            if (stringValue != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(4), 6, (Object) null);
            } else {
                stringValue = getStringValue("com_braze_api_key", null);
            }
            if (stringValue != null) {
                getConfigurationCache().put("com_braze_api_key", stringValue);
            }
        }
        if (stringValue != null) {
            return new f1(stringValue);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(5), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(6), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(7), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(8), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(28), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(29), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(1), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(2), 6, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(3), 6, (Object) null);
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
        return null;
    }

    public final DelayedInitializationAnalyticsBehavior getDelayedInitializationAnalyticsBehavior() {
        DelayedInitializationAnalyticsBehavior.Companion companion = DelayedInitializationAnalyticsBehavior.Companion;
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior = DelayedInitializationAnalyticsBehavior.QUEUE;
        String stringValue = getStringValue("com_braze_delayed_initialization_analytics_behavior", delayedInitializationAnalyticsBehavior.getValue());
        if (stringValue == null) {
            stringValue = delayedInitializationAnalyticsBehavior.getValue();
        }
        return companion.fromString(stringValue);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        l3 l3Var = l3.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(l3Var, "com_braze_internal_sdk_metadata", new HashSet());
        resourceConfigurationValue.getClass();
        Set<String> setWrite = pauseWebviewIfNecessarylambda10.write(resourceConfigurationValue);
        Object resourceConfigurationValue2 = getResourceConfigurationValue(l3Var, "com_braze_sdk_metadata", new HashSet());
        resourceConfigurationValue2.getClass();
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(l3Var, "com_braze_sdk_metadata", new HashSet());
        runtimeConfigurationValue.getClass();
        setWrite.addAll((Set) resourceConfigurationValue2);
        setWrite.addAll((Set) runtimeConfigurationValue);
        EnumSet<BrazeSdkMetadata> enumSetNoneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : setWrite) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                BrazeSdkMetadata[] brazeSdkMetadataArrValues = BrazeSdkMetadata.values();
                int length = brazeSdkMetadataArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    BrazeSdkMetadata brazeSdkMetadata = brazeSdkMetadataArrValues[i];
                    Object[] objArr = {brazeSdkMetadata.name(), upperCase};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        enumSetNoneOf.add(brazeSdkMetadata);
                        break;
                    }
                    i++;
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d.a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m7(str), 4, (Object) null);
            }
        }
        enumSetNoneOf.getClass();
        return enumSetNoneOf;
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_messaging_service_automatically_register_on_new_token", isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_geofences_enabled", isAutomaticLocationCollectionEnabled());
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().clearAllConfigurationValues();
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = serverTarget.toUpperCase(locale);
        upperCase.getClass();
        return "STAGING".equals(upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, i1.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Integer colorValue = getColorValue("com_braze_default_notification_accent_color");
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(16), 7, (Object) null);
        return colorValue.intValue();
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, i1.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final Set<String> getEphemeralEventKeys() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        Set<String> set = ItemTouchHelperAdapter.serializer;
        Set<String> stringSetValue = getStringSetValue("com_braze_ephemeral_events_keys", set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(17), 6, (Object) null);
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(onContentCardDismissed.read(set, 12));
    }

    public final String getCustomEndpoint() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_endpoint", null);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_handle_push_deep_links_automatically", false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_does_push_story_dismiss_on_click", true);
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_fallback_firebase_cloud_messaging_service_classpath", null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_firebase_cloud_messaging_sender_id", null);
    }

    public final int getLargeNotificationIconResourceId() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_large_notification_icon", 0);
    }

    public final int getLoggerInitialLogLevel() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_logger_initial_log_level", 4);
    }

    public final SdkFlavor getSdkFlavor() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_sdk_flavor", null);
        if (stringValue != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) stringValue)) {
            try {
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = stringValue.toUpperCase(locale);
                upperCase.getClass();
                return SdkFlavor.valueOf(upperCase);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(18), 4, (Object) null);
            }
        }
        return null;
    }

    public final boolean getShouldAddStatusBarPaddingToInAppMessages() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_add_status_bar_padding", false);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_optin_when_push_authorized", true);
    }

    public final boolean getShouldPersistWebViewWhenBackgroundingApp() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_persist_webview_when_backgrounding_app", true);
    }

    public final boolean getShouldUseWindowFlagSecureInActivities() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_use_activity_window_flag_secure", false);
    }

    public final int getSmallNotificationIconResourceId() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getDrawableValue("com_braze_push_small_notification_icon", 0);
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_adm_messaging_registration_enabled", false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_automatic_geofence_requests_enabled", true);
    }

    public final boolean isAutomaticLocationCollectionEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_location_collection", false);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_content_cards_unread_visual_indicator_enabled", true);
    }

    public final boolean isDelayedInitializationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_enable_delayed_initialization", false);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_object_whitelisting_enabled", false);
    }

    public final boolean isEphemeralEventsEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_ephemeral_events_enabled", false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_fallback_firebase_cloud_messaging_service_enabled", false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_firebase_cloud_messaging_registration_enabled", false);
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_apply_insets", true);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_html_in_app_message_enable_html_link_target", true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_in_app_message_push_test_eager_display_enabled", true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_deep_link_back_stack_activity_enabled", true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_notification_html_rendering_enabled", false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_push_wake_screen_for_notification_enabled", true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_sdk_authentication_enabled", false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_session_start_based_timeout_enabled", false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getBooleanValue("com_braze_require_touch_mode_for_html_in_app_messages", true);
    }

    private final String getServerTarget() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_server_target", "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final int getApplicationIconResourceId() {
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        int i = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.context;
            ApplicationInfo applicationInfo = i2 >= 33 ? context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : context.getPackageManager().getApplicationInfo(packageName, 0);
            applicationInfo.getClass();
            i = applicationInfo.icon;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda1(packageName, 24), 4, (Object) null);
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i));
        return i;
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_custom_html_webview_activity_class_name", "");
    }

    public final String getDefaultNotificationChannelDescription() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_description", "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        String stringValue = getStringValue("com_braze_default_notification_channel_name", DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getStringValue("com_braze_push_deep_link_back_stack_activity_class_name", "");
    }

    public final int getSessionTimeoutSeconds() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_session_timeout", 10);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        i1 i1Var = i1.DEVICE_OBJECT_ALLOWLIST_VALUE;
        return getIntValue("com_braze_trigger_action_minimum_time_interval_seconds", 30);
    }

    public final int getVersionCode() {
        int i;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            obj.getClass();
            return ((Integer) obj).intValue();
        }
        try {
            i = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(15), 4, (Object) null);
            i = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i));
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.context = applicationContext;
    }
}

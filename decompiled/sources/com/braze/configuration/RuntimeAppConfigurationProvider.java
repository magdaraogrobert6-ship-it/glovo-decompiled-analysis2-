package com.braze.configuration;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ig$$ExternalSyntheticLambda1;
import com.braze.Braze$Companion$$ExternalSyntheticLambda21;
import com.braze.BrazeInternal;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.m;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeAppConfigurationProvider {
    private final m configDataStoreProvider;
    private final Context context;

    public static /* synthetic */ void getConfigDataStoreProvider$android_sdk_base_release$annotations() {
    }

    public final m getConfigDataStoreProvider$android_sdk_base_release() {
        return this.configDataStoreProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clearAllConfigurationValues$lambda$0() {
        return "Clearing Braze Override configuration cache";
    }

    public RuntimeAppConfigurationProvider(Context context) {
        context.getClass();
        this.context = context;
        this.configDataStoreProvider = new m(context);
    }

    public final boolean containsKey(String str) {
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        if (dataStoreKeyA != null) {
            return this.configDataStoreProvider.contains(dataStoreKeyA);
        }
        return false;
    }

    public final boolean getBooleanValue(String str, boolean z) {
        Boolean bool;
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        return (dataStoreKeyA == null || (bool = this.configDataStoreProvider.readBoolean(dataStoreKeyA, Boolean.valueOf(z))) == null) ? z : bool.booleanValue();
    }

    public final int getIntValue(String str, int i) {
        Integer num;
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        return (dataStoreKeyA == null || (num = this.configDataStoreProvider.readInt(dataStoreKeyA, Integer.valueOf(i))) == null) ? i : num.intValue();
    }

    public final Set<String> getStringSetValue(String str) {
        ArrayList arrayList;
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        if (dataStoreKeyA == null) {
            return null;
        }
        m mVar = this.configDataStoreProvider;
        if (dataStoreKeyA.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKeyA), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKeyA, "");
                data.getClass();
                String str2 = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2);
                    List list = instance_delegatelambda0.write;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str2, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str2), 4, (Object) null);
                            }
                        }
                    }
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKeyA), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        return onContentCardDismissed.ParcelableVolumeInfo(arrayList);
    }

    public final String getStringValue(String str, String str2) {
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        if (dataStoreKeyA != null) {
            return this.configDataStoreProvider.readString(dataStoreKeyA, str2);
        }
        return null;
    }

    public final void setConfiguration(BrazeConfig brazeConfig) {
        brazeConfig.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Braze$Companion$$ExternalSyntheticLambda21(brazeConfig, 1), 6, (Object) null);
        String str = brazeConfig.apiKey;
        if (str != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.API_KEY, str);
        }
        String str2 = brazeConfig.serverTarget;
        if (str2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SERVER_TARGET, str2);
        }
        putEnumAsString(DataStoreKey.SDK_FLAVOR, brazeConfig.sdkFlavor);
        String str3 = brazeConfig.customEndpoint;
        if (str3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_ENDPOINT, str3);
        }
        String str4 = brazeConfig.smallNotificationIcon;
        if (str4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SMALL_NOTIFICATION_ICON, str4);
        }
        String str5 = brazeConfig.largeNotificationIcon;
        if (str5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.LARGE_NOTIFICATION_ICON, str5);
        }
        Integer num = brazeConfig.sessionTimeout;
        if (num != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_TIMEOUT, Integer.valueOf(num.intValue()));
        }
        Integer num2 = brazeConfig.defaultNotificationAccentColor;
        if (num2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_ACCENT_COLOR, Integer.valueOf(num2.intValue()));
        }
        Integer num3 = brazeConfig.triggerActionMinimumTimeIntervalSeconds;
        if (num3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_SECONDS, Integer.valueOf(num3.intValue()));
        }
        Boolean bool = brazeConfig.isAdmMessagingRegistrationEnabled;
        if (bool != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.ADM_MESSAGING_REGISTRATION_ENABLED, bool);
        }
        Boolean bool2 = brazeConfig.willHandlePushDeepLinksAutomatically;
        if (bool2 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY, bool2);
        }
        Boolean bool3 = brazeConfig.isAutomaticLocationCollectionEnabled;
        if (bool3 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.AUTOMATIC_LOCATION_COLLECTION, bool3);
        }
        Integer num4 = brazeConfig.badNetworkInterval;
        if (num4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_BAD_NETWORK_INTERVAL, Integer.valueOf(num4.intValue()));
        }
        Integer num5 = brazeConfig.goodNetworkInterval;
        if (num5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GOOD_NETWORK_INTERVAL, Integer.valueOf(num5.intValue()));
        }
        Integer num6 = brazeConfig.greatNetworkInterval;
        if (num6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DATA_SYNC_GREAT_NETWORK_INTERVAL, Integer.valueOf(num6.intValue()));
        }
        String str6 = brazeConfig.defaultNotificationChannelName;
        if (str6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_NAME, str6);
        }
        String str7 = brazeConfig.defaultNotificationChannelDescription;
        if (str7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION, str7);
        }
        Boolean bool4 = brazeConfig.isPushDeepLinkBackStackActivityEnabled;
        if (bool4 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED, bool4);
        }
        String str8 = brazeConfig.pushDeepLinkBackStackActivityClassName;
        if (str8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME, str8);
        }
        Boolean bool5 = brazeConfig.isSessionStartBasedTimeoutEnabled;
        if (bool5 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SESSION_START_BASED_TIMEOUT_ENABLED, bool5);
        }
        Boolean bool6 = brazeConfig.isFirebaseCloudMessagingRegistrationEnabled;
        if (bool6 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED, bool6);
        }
        String str9 = brazeConfig.firebaseCloudMessagingSenderIdKey;
        if (str9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_CLOUD_MESSAGING_SENDER_ID, str9);
        }
        Boolean bool7 = brazeConfig.isContentCardsUnreadVisualIndicatorEnabled;
        if (bool7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED, bool7);
        }
        Boolean bool8 = brazeConfig.isDeviceObjectAllowlistEnabled;
        if (bool8 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DEVICE_OBJECT_ALLOWLISTING_ENABLED, bool8);
        }
        Boolean bool9 = brazeConfig.isInAppMessageAccessibilityExclusiveModeEnabled;
        if (bool9 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED, bool9);
        }
        Boolean bool10 = brazeConfig.isPushWakeScreenForNotificationEnabled;
        if (bool10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED, bool10);
        }
        Boolean bool11 = brazeConfig.isPushHtmlRenderingEnabled;
        if (bool11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED, bool11);
        }
        Boolean bool12 = brazeConfig.doesPushStoryDismissOnClick;
        if (bool12 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.DOES_PUSH_STORY_DISMISS_ON_CLICK, bool12);
        }
        Boolean bool13 = brazeConfig.areGeofencesEnabled;
        if (bool13 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_ENABLED_CONFIG, bool13);
        }
        Boolean bool14 = brazeConfig.isInAppMessageTestPushEagerDisplayEnabled;
        if (bool14 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY, bool14);
        }
        String str10 = brazeConfig.customHtmlWebViewActivityClassName;
        if (str10 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME, str10);
        }
        Boolean bool15 = brazeConfig.areAutomaticGeofenceRequestsEnabled;
        if (bool15 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED, bool15);
        }
        Integer num7 = brazeConfig.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        if (num7 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT, Integer.valueOf(num7.intValue()));
        }
        Boolean bool16 = brazeConfig.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        if (bool16 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN, bool16);
        }
        Boolean bool17 = brazeConfig.isSdkAuthEnabled;
        if (bool17 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.SDK_AUTH_ENABLED, bool17);
        }
        Boolean bool18 = brazeConfig.isTouchModeRequiredForHtmlInAppMessages;
        if (bool18 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS, bool18);
        }
        Boolean bool19 = brazeConfig.isHtmlInAppMessageApplyWindowInsetsEnabled;
        if (bool19 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS, bool19);
        }
        Boolean bool20 = brazeConfig.isHtmlInAppMessageHtmlLinkTargetEnabled;
        if (bool20 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET, bool20);
        }
        putEnumSet(brazeConfig.deviceObjectAllowlist, DataStoreKey.DEVICE_OBJECT_ALLOWLIST);
        putEnumSet(brazeConfig.customLocationProviderNames, DataStoreKey.CUSTOM_LOCATION_PROVIDERS_LIST);
        EnumSet<BrazeSdkMetadata> enumSet = brazeConfig.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(DataStoreKey.SDK_METADATA_CONFIG, enumSet);
        }
        Boolean bool21 = brazeConfig.isFallbackFirebaseMessagingServiceEnabled;
        if (bool21 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_ENABLED, bool21);
        }
        String str11 = brazeConfig.fallbackFirebaseMessagingServiceClasspath;
        if (str11 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.FALLBACK_FCM_SERVICE_CLASSPATH, str11);
        }
        Boolean bool22 = brazeConfig.shouldOptInWhenPushAuthorized;
        if (bool22 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.OPTIN_WHEN_PUSH_AUTHORIZED, bool22);
        }
        Boolean bool23 = brazeConfig.shouldUseWindowFlagSecureInActivities;
        if (bool23 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.USE_WINDOW_FLAG_SECURE_IN_ACTIVITIES, bool23);
        }
        Boolean bool24 = brazeConfig.shouldPersistWebViewWhenBackgroundingApp;
        if (bool24 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.PERSIST_IAM_WEBVIEW_WHEN_BACKGROUNDING_APP, bool24);
        }
        Boolean bool25 = brazeConfig.shouldAddStatusBarPaddingToInAppMessages;
        if (bool25 != null) {
            this.configDataStoreProvider.writeData(DataStoreKey.IN_APP_MESSAGE_ADD_STATUS_BAR_PADDING, bool25);
        }
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final void writeString(String str, String str2) {
        str.getClass();
        DataStoreKey dataStoreKeyA = DataStoreKey.Companion.a(str);
        if (dataStoreKeyA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, str2, 23), 6, (Object) null);
        } else if (str2 != null) {
            this.configDataStoreProvider.writeData(dataStoreKeyA, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setConfiguration$lambda$0(BrazeConfig brazeConfig) {
        return "Setting Braze Override configuration with config: " + brazeConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeString$lambda$1(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("DataStoreKey:", str, " not found. Not storing value:", str2);
    }

    public final <T extends Enum<T>> void updateEnumSetData(DataStoreKey dataStoreKey, EnumSet<T> enumSet) {
        ArrayList arrayList;
        String strRemoteActionCompatParcelizer;
        dataStoreKey.getClass();
        enumSet.getClass();
        m mVar = this.configDataStoreProvider;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = mVar.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    List list = instance_delegatelambda0.write;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                            }
                        }
                    }
                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(arrayList);
        setParcelableVolumeInfo.addAll(d.a(enumSet));
        m mVar2 = this.configDataStoreProvider;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(setParcelableVolumeInfo);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                isverticalswipeinalloweddirection2.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                if ((listPlaybackStateCompat instanceof Map) || !(listPlaybackStateCompat instanceof List)) {
                    strRemoteActionCompatParcelizer = "{}";
                } else {
                    strRemoteActionCompatParcelizer = "[]";
                }
            }
            mVar2.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void putEnumAsString(DataStoreKey dataStoreKey, Enum<?> r3) {
        dataStoreKey.getClass();
        if (r3 != null) {
            this.configDataStoreProvider.writeData(dataStoreKey, r3.toString());
        }
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, DataStoreKey dataStoreKey) {
        String strRemoteActionCompatParcelizer;
        if (enumSet == null) {
            return;
        }
        Set setA = d.a(enumSet);
        m mVar = this.configDataStoreProvider;
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(setA);
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                if ((listPlaybackStateCompat instanceof Map) || !(listPlaybackStateCompat instanceof List)) {
                    strRemoteActionCompatParcelizer = "{}";
                } else {
                    strRemoteActionCompatParcelizer = "[]";
                }
            }
            mVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(20), 7, (Object) null);
        this.configDataStoreProvider.clearAllData();
    }
}

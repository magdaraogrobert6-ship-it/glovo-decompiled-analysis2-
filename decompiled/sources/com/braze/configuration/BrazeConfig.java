package com.braze.configuration;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda0;
import com.braze.BrazeUser$$ExternalSyntheticLambda3;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isAutomaticLocationCollectionEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final Boolean shouldAddStatusBarPaddingToInAppMessages;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final Boolean shouldPersistWebViewWhenBackgroundingApp;
    public final Boolean shouldUseWindowFlagSecureInActivities;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isAutomaticLocationCollectionEnabled;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private Boolean shouldAddStatusBarPaddingToInAppMessages;
        private Boolean shouldOptInWhenPushAuthorized;
        private Boolean shouldPersistWebViewWhenBackgroundingApp;
        private Boolean shouldUseWindowFlagSecureInActivities;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        public final Boolean getAdmMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String getApiKey$android_sdk_base_release() {
            return this.apiKey;
        }

        public final Boolean getAutomaticGeofenceRequestsEnabled$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Integer getBadNetworkInterval$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final String getCustomEndpoint$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String getCustomHtmlWebViewActivityClassName$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final Integer getDefaultNotificationAccentColor$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final String getDefaultNotificationChannelDescription$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String getDefaultNotificationChannelName$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean getDoesPushStoryDismissOnClick$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final String getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final String getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Integer getGoodNetworkInterval$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer getGreatNetworkInterval$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Boolean getHandlePushDeepLinksAutomatically$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final String getLargeNotificationIconName$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final String getPushDeepLinkBackStackActivityClassName$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final SdkFlavor getSdkFlavor$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final String getServerTarget$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Integer getSessionTimeout$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final Boolean getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release() {
            return this.shouldAddStatusBarPaddingToInAppMessages;
        }

        public final Boolean getShouldOptInWhenPushAuthorized$android_sdk_base_release() {
            return this.shouldOptInWhenPushAuthorized;
        }

        public final Boolean getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release() {
            return this.shouldPersistWebViewWhenBackgroundingApp;
        }

        public final Boolean getShouldUseWindowFlagSecureInActivities$android_sdk_base_release() {
            return this.shouldUseWindowFlagSecureInActivities;
        }

        public final String getSmallNotificationIconName$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Integer getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public final Boolean isAutomaticLocationCollectionEnabled$android_sdk_base_release() {
            return this.isAutomaticLocationCollectionEnabled;
        }

        public final Boolean isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean isDeviceObjectAllowlistEnabled$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final Boolean isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final Boolean isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean isGeofencesEnabled$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean isPushHtmlRenderingEnabled$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final Boolean isPushWakeScreenForNotificationEnabled$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean isSdkAuthEnabled$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final Boolean isSessionStartBasedTimeoutEnabled$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final void setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.admMessagingRegistrationEnabled = bool;
        }

        public final void setApiKey$android_sdk_base_release(String str) {
            this.apiKey = str;
        }

        public final void setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean bool) {
            this.automaticGeofenceRequestsEnabled = bool;
        }

        public final void setAutomaticLocationCollectionEnabled$android_sdk_base_release(Boolean bool) {
            this.isAutomaticLocationCollectionEnabled = bool;
        }

        public final void setBadNetworkInterval$android_sdk_base_release(Integer num) {
            this.badNetworkInterval = num;
        }

        public final void setBrazeSdkMetadata$android_sdk_base_release(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
        }

        public final void setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean bool) {
            this.isContentCardsUnreadVisualIndicatorEnabled = bool;
        }

        public final void setCustomEndpoint$android_sdk_base_release(String str) {
            this.customEndpoint = str;
        }

        public final void setCustomHtmlWebViewActivityClassName$android_sdk_base_release(String str) {
            this.customHtmlWebViewActivityClassName = str;
        }

        public final void setCustomLocationProviderNames$android_sdk_base_release(EnumSet<LocationProviderName> enumSet) {
            this.customLocationProviderNames = enumSet;
        }

        public final void setDefaultNotificationAccentColor$android_sdk_base_release(Integer num) {
            this.defaultNotificationAccentColor = num;
        }

        public final void setDefaultNotificationChannelDescription$android_sdk_base_release(String str) {
            this.defaultNotificationChannelDescription = str;
        }

        public final void setDefaultNotificationChannelName$android_sdk_base_release(String str) {
            this.defaultNotificationChannelName = str;
        }

        public final void setDeviceObjectAllowlist$android_sdk_base_release(EnumSet<DeviceKey> enumSet) {
            this.deviceObjectAllowlist = enumSet;
        }

        public final void setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean bool) {
            this.isDeviceObjectAllowlistEnabled = bool;
        }

        public final void setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean bool) {
            this.doesPushStoryDismissOnClick = bool;
        }

        public final void setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release(String str) {
            this.fallbackFirebaseMessagingServiceClasspath = str;
        }

        public final void setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release(Boolean bool) {
            this.isFallbackFirebaseMessagingServiceEnabled = bool;
        }

        public final void setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseCloudMessagingRegistrationEnabled = bool;
        }

        public final void setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release(String str) {
            this.firebaseCloudMessagingSenderIdKey = str;
        }

        public final void setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool;
        }

        public final void setGeofencesEnabled$android_sdk_base_release(Boolean bool) {
            this.isGeofencesEnabled = bool;
        }

        public final void setGoodNetworkInterval$android_sdk_base_release(Integer num) {
            this.goodNetworkInterval = num;
        }

        public final void setGreatNetworkInterval$android_sdk_base_release(Integer num) {
            this.greatNetworkInterval = num;
        }

        public final void setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean bool) {
            this.handlePushDeepLinksAutomatically = bool;
        }

        public final void setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool;
        }

        public final void setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool;
        }

        public final void setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean bool) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool;
        }

        public final void setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean bool) {
            this.inAppMessageTestPushEagerDisplayEnabled = bool;
        }

        public final void setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release(Integer num) {
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num;
        }

        public final void setLargeNotificationIconName$android_sdk_base_release(String str) {
            this.largeNotificationIconName = str;
        }

        public final void setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(String str) {
            this.pushDeepLinkBackStackActivityClassName = str;
        }

        public final void setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushDeepLinkBackStackActivityEnabled = bool;
        }

        public final void setPushHtmlRenderingEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushHtmlRenderingEnabled = bool;
        }

        public final void setPushWakeScreenForNotificationEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushWakeScreenForNotificationEnabled = bool;
        }

        public final void setSdkAuthEnabled$android_sdk_base_release(Boolean bool) {
            this.isSdkAuthEnabled = bool;
        }

        public final Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
            return this;
        }

        public final void setSdkFlavor$android_sdk_base_release(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
            return this;
        }

        public final void setServerTarget$android_sdk_base_release(String str) {
            this.serverTarget = str;
        }

        public final void setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean bool) {
            this.isSessionStartBasedTimeoutEnabled = bool;
        }

        public final void setSessionTimeout$android_sdk_base_release(Integer num) {
            this.sessionTimeout = num;
        }

        public final void setShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release(Boolean bool) {
            this.shouldAddStatusBarPaddingToInAppMessages = bool;
        }

        public final void setShouldOptInWhenPushAuthorized$android_sdk_base_release(Boolean bool) {
            this.shouldOptInWhenPushAuthorized = bool;
        }

        public final void setShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release(Boolean bool) {
            this.shouldPersistWebViewWhenBackgroundingApp = bool;
        }

        public final void setShouldUseWindowFlagSecureInActivities$android_sdk_base_release(Boolean bool) {
            this.shouldUseWindowFlagSecureInActivities = bool;
        }

        public final void setSmallNotificationIconName$android_sdk_base_release(String str) {
            this.smallNotificationIconName = str;
        }

        public final void setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean bool) {
            this.isTouchModeRequiredForHtmlInAppMessages = bool;
        }

        public final void setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer num) {
            this.triggerActionMinimumTimeIntervalSeconds = num;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setApiKey$lambda$0() {
            return "Cannot set Braze API key to blank string. API key field not set";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setDefaultNotificationChannelDescription$lambda$0() {
            return "Cannot set Braze default NotificationChannel description to null or blank string. NotificationChannel description field not set.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setDefaultNotificationChannelName$lambda$0() {
            return "Cannot set Braze default NotificationChannel name to blank string. NotificationChannel name field not set.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setFirebaseCloudMessagingSenderIdKey$lambda$0() {
            return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
        }

        public String toString() {
            String str = this.apiKey;
            String str2 = this.serverTarget;
            String str3 = this.smallNotificationIconName;
            String str4 = this.largeNotificationIconName;
            String str5 = this.customEndpoint;
            String str6 = this.defaultNotificationChannelName;
            String str7 = this.defaultNotificationChannelDescription;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            String str10 = this.customHtmlWebViewActivityClassName;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            Integer num = this.sessionTimeout;
            Integer num2 = this.defaultNotificationAccentColor;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            Integer num4 = this.badNetworkInterval;
            Integer num5 = this.goodNetworkInterval;
            Integer num6 = this.greatNetworkInterval;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            Boolean bool = this.admMessagingRegistrationEnabled;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            Boolean bool3 = this.isAutomaticLocationCollectionEnabled;
            Boolean bool4 = this.isPushDeepLinkBackStackActivityEnabled;
            Boolean bool5 = this.isSessionStartBasedTimeoutEnabled;
            Boolean bool6 = this.isFirebaseCloudMessagingRegistrationEnabled;
            Boolean bool7 = this.isContentCardsUnreadVisualIndicatorEnabled;
            Boolean bool8 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            Boolean bool9 = this.isPushWakeScreenForNotificationEnabled;
            Boolean bool10 = this.isPushHtmlRenderingEnabled;
            Boolean bool11 = this.isGeofencesEnabled;
            Boolean bool12 = this.inAppMessageTestPushEagerDisplayEnabled;
            Boolean bool13 = this.automaticGeofenceRequestsEnabled;
            Boolean bool14 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            Boolean bool15 = this.isTouchModeRequiredForHtmlInAppMessages;
            Boolean bool16 = this.isSdkAuthEnabled;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            Boolean bool17 = this.isDeviceObjectAllowlistEnabled;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            Boolean bool18 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            Boolean bool19 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            Boolean bool20 = this.doesPushStoryDismissOnClick;
            Boolean bool21 = this.isFallbackFirebaseMessagingServiceEnabled;
            String str11 = this.fallbackFirebaseMessagingServiceClasspath;
            Boolean bool22 = this.shouldOptInWhenPushAuthorized;
            Boolean bool23 = this.shouldUseWindowFlagSecureInActivities;
            Boolean bool24 = this.shouldAddStatusBarPaddingToInAppMessages;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Builder(apiKey=", str, ", serverTarget=", str2, ", smallNotificationIconName=");
            c8$$ExternalSyntheticOutline0.m(sbM, str3, ", largeNotificationIconName=", str4, ", customEndpoint=");
            c8$$ExternalSyntheticOutline0.m(sbM, str5, ", defaultNotificationChannelName=", str6, ", defaultNotificationChannelDescription=");
            c8$$ExternalSyntheticOutline0.m(sbM, str7, ", pushDeepLinkBackStackActivityClassName=", str8, ", firebaseCloudMessagingSenderIdKey=");
            c8$$ExternalSyntheticOutline0.m(sbM, str9, ", customHtmlWebViewActivityClassName=", str10, ", sdkFlavor=");
            sbM.append(sdkFlavor);
            sbM.append(", sessionTimeout=");
            sbM.append(num);
            sbM.append(", defaultNotificationAccentColor=");
            sbM.append(num2);
            sbM.append(", triggerActionMinimumTimeIntervalSeconds=");
            sbM.append(num3);
            sbM.append(", badNetworkInterval=");
            sbM.append(num4);
            sbM.append(", goodNetworkInterval=");
            sbM.append(num5);
            sbM.append(", greatNetworkInterval=");
            sbM.append(num6);
            sbM.append(", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=");
            sbM.append(num7);
            sbM.append(", admMessagingRegistrationEnabled=");
            sbM.append(bool);
            sbM.append(", handlePushDeepLinksAutomatically=");
            sbM.append(bool2);
            sbM.append(", isAutomaticLocationCollectionEnabled=");
            sbM.append(bool3);
            sbM.append(", isPushDeepLinkBackStackActivityEnabled=");
            sbM.append(bool4);
            sbM.append(", isSessionStartBasedTimeoutEnabled=");
            sbM.append(bool5);
            sbM.append(", isFirebaseCloudMessagingRegistrationEnabled=");
            sbM.append(bool6);
            sbM.append(", isContentCardsUnreadVisualIndicatorEnabled=");
            sbM.append(bool7);
            sbM.append(", isInAppMessageAccessibilityExclusiveModeEnabled=");
            sbM.append(bool8);
            sbM.append(", isPushWakeScreenForNotificationEnabled=");
            sbM.append(bool9);
            sbM.append(", isPushHtmlRenderingEnabled=");
            sbM.append(bool10);
            sbM.append(", isGeofencesEnabled=");
            sbM.append(bool11);
            sbM.append(", inAppMessageTestPushEagerDisplayEnabled=");
            sbM.append(bool12);
            sbM.append(", automaticGeofenceRequestsEnabled=");
            sbM.append(bool13);
            sbM.append(", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=");
            sbM.append(bool14);
            sbM.append(", isTouchModeRequiredForHtmlInAppMessages=");
            sbM.append(bool15);
            sbM.append(", isSdkAuthEnabled=");
            sbM.append(bool16);
            sbM.append(", deviceObjectAllowlist=");
            sbM.append(enumSet);
            sbM.append(", isDeviceObjectAllowlistEnabled=");
            sbM.append(bool17);
            sbM.append(", brazeSdkMetadata=");
            sbM.append(enumSet2);
            sbM.append(", customLocationProviderNames=");
            sbM.append(enumSet3);
            sbM.append(", isHtmlInAppMessageApplyWindowInsetsEnabled=");
            sbM.append(bool18);
            sbM.append(", isHtmlInAppMessageHtmlLinkTargetEnabled=");
            sbM.append(bool19);
            sbM.append(", doesPushStoryDismissOnClick=");
            sbM.append(bool20);
            sbM.append(", isFallbackFirebaseMessagingServiceEnabled=");
            sbM.append(bool21);
            sbM.append(", fallbackFirebaseMessagingServiceClasspath=");
            sbM.append(str11);
            sbM.append(", shouldOptInWhenPushAuthorized=");
            sbM.append(bool22);
            sbM.append(", shouldUseWindowFlagSecureInActivities=");
            sbM.append(bool23);
            sbM.append(", shouldAddStatusBarPaddingToInAppMessages=");
            sbM.append(bool24);
            sbM.append("))");
            return sbM.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$lambda$0(int i) {
            return c8$$ExternalSyntheticOutline0.m(i, "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: ");
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        public final Builder setApiKey(String str) {
            str.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(12), 6, (Object) null);
                return this;
            }
            this.apiKey = str;
            return this;
        }

        public final Builder setCustomEndpoint(String str) {
            str.getClass();
            this.customEndpoint = str;
            return this;
        }

        public final Builder setCustomLocationProviderNames(EnumSet<LocationProviderName> enumSet) {
            enumSet.getClass();
            this.customLocationProviderNames = enumSet;
            return this;
        }

        public final Builder setCustomWebViewActivityClass(Class<?> cls) {
            cls.getClass();
            this.customHtmlWebViewActivityClassName = cls.getName();
            return this;
        }

        public final Builder setDefaultNotificationChannelDescription(String str) {
            str.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(14), 6, (Object) null);
                return this;
            }
            this.defaultNotificationChannelDescription = str;
            return this;
        }

        public final Builder setDefaultNotificationChannelName(String str) {
            str.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(13), 6, (Object) null);
                return this;
            }
            this.defaultNotificationChannelName = str;
            return this;
        }

        public final Builder setDeviceObjectAllowlist(EnumSet<DeviceKey> enumSet) {
            enumSet.getClass();
            this.deviceObjectAllowlist = enumSet;
            return this;
        }

        public final Builder setFallbackFirebaseMessagingServiceClasspath(String str) {
            str.getClass();
            this.fallbackFirebaseMessagingServiceClasspath = str;
            return this;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String str) {
            str.getClass();
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda3(11), 6, (Object) null);
                return this;
            }
            this.firebaseCloudMessagingSenderIdKey = str;
            return this;
        }

        public final Builder setLargeNotificationIcon(String str) {
            str.getClass();
            this.largeNotificationIconName = str;
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityClass(Class<?> cls) {
            cls.getClass();
            this.pushDeepLinkBackStackActivityClassName = cls.getName();
            return this;
        }

        public final Builder setServerTarget(String str) {
            str.getClass();
            this.serverTarget = str;
            return this;
        }

        public final Builder setSmallNotificationIcon(String str) {
            str.getClass();
            this.smallNotificationIconName = str;
            return this;
        }

        public final Builder setAdmMessagingRegistrationEnabled(boolean z) {
            this.admMessagingRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setAutomaticGeofenceRequestsEnabled(boolean z) {
            this.automaticGeofenceRequestsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setBadNetworkDataFlushInterval(int i) {
            this.badNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public final Builder setContentCardsUnreadVisualIndicatorEnabled(boolean z) {
            this.isContentCardsUnreadVisualIndicatorEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int i) {
            this.defaultNotificationAccentColor = Integer.valueOf(i);
            return this;
        }

        public final Builder setDeviceObjectAllowlistEnabled(boolean z) {
            this.isDeviceObjectAllowlistEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setDoesPushStoryDismissOnClick(boolean z) {
            this.doesPushStoryDismissOnClick = Boolean.valueOf(z);
            return this;
        }

        public final Builder setFallbackFirebaseMessagingServiceEnabled(boolean z) {
            this.isFallbackFirebaseMessagingServiceEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setGeofencesEnabled(boolean z) {
            this.isGeofencesEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setGoodNetworkDataFlushInterval(int i) {
            this.goodNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public final Builder setGreatNetworkDataFlushInterval(int i) {
            this.greatNetworkInterval = Integer.valueOf(i);
            return this;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean z) {
            this.handlePushDeepLinksAutomatically = Boolean.valueOf(z);
            return this;
        }

        public final Builder setInAppMessageTestPushEagerDisplayEnabled(boolean z) {
            this.inAppMessageTestPushEagerDisplayEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsAutomaticLocationCollectionEnabled(boolean z) {
            this.isAutomaticLocationCollectionEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean z) {
            this.isFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean z) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsHtmlInAppMessageApplyWindowInsetsEnabled(boolean z) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsHtmlInAppMessageHtmlLinkTargetEnabled(boolean z) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean z) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsPushWakeScreenForNotificationEnabled(boolean z) {
            this.isPushWakeScreenForNotificationEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsSdkAuthenticationEnabled(boolean z) {
            this.isSdkAuthEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsSessionStartBasedTimeoutEnabled(boolean z) {
            this.isSessionStartBasedTimeoutEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean z) {
            this.isTouchModeRequiredForHtmlInAppMessages = Boolean.valueOf(z);
            return this;
        }

        public final Builder setOptInWhenPushAuthorized(boolean z) {
            this.shouldOptInWhenPushAuthorized = Boolean.valueOf(z);
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityEnabled(boolean z) {
            this.isPushDeepLinkBackStackActivityEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setPushHtmlRenderingEnabled(boolean z) {
            this.isPushHtmlRenderingEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setSessionTimeout(int i) {
            this.sessionTimeout = Integer.valueOf(i);
            return this;
        }

        public final Builder setShouldAddStatusBarPaddingToInAppMessages(boolean z) {
            this.shouldAddStatusBarPaddingToInAppMessages = Boolean.valueOf(z);
            return this;
        }

        public final Builder setShouldPersistWebViewWhenBackgroundingApp(boolean z) {
            this.shouldPersistWebViewWhenBackgroundingApp = Boolean.valueOf(z);
            return this;
        }

        public final Builder setShouldUseWindowFlagSecureInActivities(boolean z) {
            this.shouldUseWindowFlagSecureInActivities = Boolean.valueOf(z);
            return this;
        }

        public final Builder setTriggerActionMinimumTimeIntervalSeconds(int i) {
            this.triggerActionMinimumTimeIntervalSeconds = Integer.valueOf(i);
            return this;
        }

        public final Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(int i) {
            if (i >= 0) {
                this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(i);
                return this;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 6), 6, (Object) null);
            return this;
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet enumSet, Boolean bool17, EnumSet enumSet2, EnumSet enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, String str11, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & Fields.SpotShadowColor) != 0 ? null : str8, (i & Fields.RotationX) != 0 ? null : str9, (i & Fields.RotationY) != 0 ? null : str10, (i & Fields.RotationZ) != 0 ? null : sdkFlavor, (i & Fields.CameraDistance) != 0 ? null : num, (i & Fields.TransformOrigin) != 0 ? null : num2, (i & 8192) != 0 ? null : num3, (i & Fields.Clip) != 0 ? null : num4, (i & Fields.CompositingStrategy) != 0 ? null : num5, (i & 65536) != 0 ? null : num6, (i & Fields.RenderEffect) != 0 ? null : num7, (i & Fields.ColorFilter) != 0 ? null : bool, (i & Fields.BlendMode) != 0 ? null : bool2, (i & 1048576) != 0 ? null : bool3, (i & 2097152) != 0 ? null : bool4, (i & 4194304) != 0 ? null : bool5, (i & 8388608) != 0 ? null : bool6, (i & 16777216) != 0 ? null : bool7, (i & 33554432) != 0 ? null : bool8, (i & 67108864) != 0 ? null : bool9, (i & 134217728) != 0 ? null : bool10, (i & 268435456) != 0 ? null : bool11, (i & 536870912) != 0 ? null : bool12, (i & 1073741824) != 0 ? null : bool13, (i & Integer.MIN_VALUE) != 0 ? null : bool14, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : enumSet, (i2 & 8) != 0 ? null : bool17, (i2 & 16) != 0 ? null : enumSet2, (i2 & 32) != 0 ? null : enumSet3, (i2 & 64) != 0 ? null : bool18, (i2 & Fields.SpotShadowColor) != 0 ? null : bool19, (i2 & Fields.RotationX) != 0 ? null : bool20, (i2 & Fields.RotationY) != 0 ? null : bool21, (i2 & Fields.RotationZ) != 0 ? null : str11, (i2 & Fields.CameraDistance) != 0 ? null : bool22, (i2 & Fields.TransformOrigin) != 0 ? null : bool23, (i2 & 8192) != 0 ? null : bool24, (i2 & Fields.Clip) != 0 ? null : bool25);
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, EnumSet<DeviceKey> enumSet, Boolean bool17, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, String str11, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isAutomaticLocationCollectionEnabled = bool3;
            this.isPushDeepLinkBackStackActivityEnabled = bool4;
            this.isSessionStartBasedTimeoutEnabled = bool5;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool6;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool7;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool8;
            this.isPushWakeScreenForNotificationEnabled = bool9;
            this.isPushHtmlRenderingEnabled = bool10;
            this.isGeofencesEnabled = bool11;
            this.inAppMessageTestPushEagerDisplayEnabled = bool12;
            this.automaticGeofenceRequestsEnabled = bool13;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool14;
            this.isTouchModeRequiredForHtmlInAppMessages = bool15;
            this.isSdkAuthEnabled = bool16;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool17;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool18;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool19;
            this.doesPushStoryDismissOnClick = bool20;
            this.isFallbackFirebaseMessagingServiceEnabled = bool21;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool22;
            this.shouldUseWindowFlagSecureInActivities = bool23;
            this.shouldPersistWebViewWhenBackgroundingApp = bool24;
            this.shouldAddStatusBarPaddingToInAppMessages = bool25;
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 32767, null);
        }
    }

    public String toString() {
        return this.builder.toString();
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey$android_sdk_base_release();
        this.serverTarget = builder.getServerTarget$android_sdk_base_release();
        this.smallNotificationIcon = builder.getSmallNotificationIconName$android_sdk_base_release();
        this.largeNotificationIcon = builder.getLargeNotificationIconName$android_sdk_base_release();
        this.customEndpoint = builder.getCustomEndpoint$android_sdk_base_release();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName$android_sdk_base_release();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription$android_sdk_base_release();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName$android_sdk_base_release();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName$android_sdk_base_release();
        this.sdkFlavor = builder.getSdkFlavor$android_sdk_base_release();
        this.sessionTimeout = builder.getSessionTimeout$android_sdk_base_release();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor$android_sdk_base_release();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release();
        this.badNetworkInterval = builder.getBadNetworkInterval$android_sdk_base_release();
        this.goodNetworkInterval = builder.getGoodNetworkInterval$android_sdk_base_release();
        this.greatNetworkInterval = builder.getGreatNetworkInterval$android_sdk_base_release();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled$android_sdk_base_release();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically$android_sdk_base_release();
        this.isAutomaticLocationCollectionEnabled = builder.isAutomaticLocationCollectionEnabled$android_sdk_base_release();
        this.isPushDeepLinkBackStackActivityEnabled = builder.isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release();
        this.isSessionStartBasedTimeoutEnabled = builder.isSessionStartBasedTimeoutEnabled$android_sdk_base_release();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release();
        this.isPushWakeScreenForNotificationEnabled = builder.isPushWakeScreenForNotificationEnabled$android_sdk_base_release();
        this.isPushHtmlRenderingEnabled = builder.isPushHtmlRenderingEnabled$android_sdk_base_release();
        this.areGeofencesEnabled = builder.isGeofencesEnabled$android_sdk_base_release();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled$android_sdk_base_release();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release();
        this.isSdkAuthEnabled = builder.isSdkAuthEnabled$android_sdk_base_release();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.isDeviceObjectAllowlistEnabled$android_sdk_base_release();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick$android_sdk_base_release();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized$android_sdk_base_release();
        this.shouldUseWindowFlagSecureInActivities = builder.getShouldUseWindowFlagSecureInActivities$android_sdk_base_release();
        this.shouldPersistWebViewWhenBackgroundingApp = builder.getShouldPersistWebViewWhenBackgroundingApp$android_sdk_base_release();
        this.shouldAddStatusBarPaddingToInAppMessages = builder.getShouldAddStatusBarPaddingToInAppMessages$android_sdk_base_release();
    }

    public /* synthetic */ BrazeConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}

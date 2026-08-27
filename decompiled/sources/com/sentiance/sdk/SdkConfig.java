package com.sentiance.sdk;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SdkConfig {
    private final String mAppId;
    private final boolean mIsAppSessionDataCollectionEnabled;
    private final Notification mNotification;
    private final int mNotificationId;
    private final OnSdkStatusUpdateHandler mOnSdkStatusUpdateHandler;
    private final String mPlatformURL;
    private final String mSecret;
    private final boolean mTriggeredTripsEnabled;
    private final UserLinker mUserLinker;
    private final UserLinkerAsync mUserLinkerAsync;

    public String getAppId() {
        return this.mAppId;
    }

    public String getBaseURL() {
        return this.mPlatformURL;
    }

    public Notification getNotification() {
        return this.mNotification;
    }

    public int getNotificationId() {
        return this.mNotificationId;
    }

    public OnSdkStatusUpdateHandler getOnSdkStatusUpdateHandler() {
        return this.mOnSdkStatusUpdateHandler;
    }

    public String getSecret() {
        return this.mSecret;
    }

    public UserLinker getUserLinker() {
        return this.mUserLinker;
    }

    public UserLinkerAsync getUserLinkerAsync() {
        return this.mUserLinkerAsync;
    }

    public boolean isAppSessionDataCollectionEnabled() {
        return this.mIsAppSessionDataCollectionEnabled;
    }

    public boolean isTriggeredTripsEnabled() {
        return this.mTriggeredTripsEnabled;
    }

    /* JADX INFO: loaded from: classes4.dex */
    @DontObfuscate
    public static class Builder {
        String appId;
        OnSdkStatusUpdateHandler handler;
        boolean isAppSessionDataCollectionEnabled;
        Notification notification;
        int notificationId = 2123874432;
        String platformURL = "https://api.sentiance.com/";
        String secret;
        boolean triggeredTripsEnabled;
        UserLinker userLinker;
        UserLinkerAsync userLinkerAsync;

        public Builder baseURL(String str) {
            this.platformURL = str;
            return this;
        }

        public Builder collectAppSessionData(boolean z) {
            this.isAppSessionDataCollectionEnabled = z;
            return this;
        }

        public Builder setNotificationId(int i) {
            this.notificationId = i;
            return this;
        }

        public Builder setOnSdkStatusUpdateHandler(OnSdkStatusUpdateHandler onSdkStatusUpdateHandler) {
            this.handler = onSdkStatusUpdateHandler;
            return this;
        }

        public Builder setTriggeredTripsEnabled(boolean z) {
            this.triggeredTripsEnabled = z;
            return this;
        }

        public SdkConfig build() {
            return new SdkConfig(this);
        }

        public Builder setUserLinker(UserLinker userLinker) {
            this.userLinker = userLinker;
            this.userLinkerAsync = null;
            return this;
        }

        private short getTargetSdkVersion(Context context) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                if (applicationInfo != null) {
                    return (short) applicationInfo.targetSdkVersion;
                }
                return (short) -1;
            } catch (Exception unused) {
                return (short) -1;
            }
        }

        @SuppressLint
        public Builder(String str, String str2, Notification notification) {
            this.appId = str;
            this.secret = str2;
            this.notification = notification;
            if (str == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("App id cannot be null");
                throw null;
            }
            if (str2 == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Secret cannot be null");
                throw null;
            }
            if (notification != null) {
                return;
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Notification cannot be null");
            throw null;
        }

        public Builder setUserLinker(UserLinkerAsync userLinkerAsync) {
            this.userLinkerAsync = userLinkerAsync;
            this.userLinker = null;
            return this;
        }
    }

    private SdkConfig(Builder builder) {
        this.mAppId = builder.appId;
        this.mSecret = builder.secret;
        this.mOnSdkStatusUpdateHandler = builder.handler;
        this.mNotification = builder.notification;
        this.mTriggeredTripsEnabled = builder.triggeredTripsEnabled;
        this.mNotificationId = builder.notificationId;
        this.mUserLinker = builder.userLinker;
        this.mUserLinkerAsync = builder.userLinkerAsync;
        this.mIsAppSessionDataCollectionEnabled = builder.isAppSessionDataCollectionEnabled;
        String strTrim = builder.platformURL.trim();
        builder.platformURL = strTrim;
        if (!strTrim.endsWith("/")) {
            builder.platformURL = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), builder.platformURL, "/");
        }
        this.mPlatformURL = builder.platformURL;
    }

    public SdkConfig() {
        this.mAppId = "";
        this.mSecret = "";
        this.mOnSdkStatusUpdateHandler = null;
        this.mNotification = null;
        this.mTriggeredTripsEnabled = false;
        this.mNotificationId = 2123874432;
        this.mUserLinker = null;
        this.mUserLinkerAsync = null;
        this.mPlatformURL = "https://api.sentiance.com/";
        this.mIsAppSessionDataCollectionEnabled = false;
    }
}

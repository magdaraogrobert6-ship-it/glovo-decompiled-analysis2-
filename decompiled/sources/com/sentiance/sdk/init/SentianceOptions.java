package com.sentiance.sdk.init;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Context;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.diagnostics.SdkDiagnostics;
import o.migrateBannerStorageToJsonlambda3;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class SentianceOptions {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mIsAppSessionDataCollectionEnabled;
    private final boolean mIsIncorrectInitializationNotificationDisabled;
    private final Notification mNotification;
    private final int mNotificationId;
    private final SdkDiagnostics mSdkDiagnostics;

    @DontObfuscate
    public static class Builder {
        private final Context mContext;
        private boolean mIsIncorrectInitializationNotificationDisabled;
        private Notification mNotification;
        private SdkDiagnostics mSdkDiagnostics;
        private int mNotificationId = 2123874432;
        private boolean mIsAppSessionDataCollectionEnabled = false;

        public Builder collectAppSessionData(boolean z) {
            this.mIsAppSessionDataCollectionEnabled = z;
            return this;
        }

        public Builder diagnostics(SdkDiagnostics sdkDiagnostics) {
            this.mSdkDiagnostics = sdkDiagnostics;
            return this;
        }

        public Builder disableIncorrectInitializationNotification() {
            this.mIsIncorrectInitializationNotificationDisabled = true;
            return this;
        }

        @SuppressLint
        public Builder setNotification(Notification notification, int i) {
            if (notification == null) {
                MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Passing null Notification is not allowed");
                return null;
            }
            this.mNotification = notification;
            this.mNotificationId = i;
            return this;
        }

        public Builder(Context context) {
            this.mContext = context.getApplicationContext();
        }

        public SentianceOptions build() {
            if (this.mNotification == null) {
                this.mNotification = migrateBannerStorageToJsonlambda3.read(this.mContext);
            }
            return new SentianceOptions(this);
        }
    }

    public Notification getNotification() {
        return this.mNotification;
    }

    public int getNotificationId() {
        return this.mNotificationId;
    }

    public SdkDiagnostics getSdkDiagnostics() {
        return this.mSdkDiagnostics;
    }

    public boolean isAppSessionDataCollectionEnabled() {
        return this.mIsAppSessionDataCollectionEnabled;
    }

    public boolean isIncorrectInitializationNotificationDisabled() {
        return this.mIsIncorrectInitializationNotificationDisabled;
    }

    private SentianceOptions(Builder builder) {
        this.mNotification = builder.mNotification;
        this.mNotificationId = builder.mNotificationId;
        this.mIsAppSessionDataCollectionEnabled = builder.mIsAppSessionDataCollectionEnabled;
        this.mIsIncorrectInitializationNotificationDisabled = builder.mIsIncorrectInitializationNotificationDisabled;
        this.mSdkDiagnostics = builder.mSdkDiagnostics;
    }
}

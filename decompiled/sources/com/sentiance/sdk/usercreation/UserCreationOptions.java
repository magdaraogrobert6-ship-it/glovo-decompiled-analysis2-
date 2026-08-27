package com.sentiance.sdk.usercreation;

import android.annotation.SuppressLint;
import android.util.Patterns;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.UserLinker;
import com.sentiance.sdk.UserLinkerAsync;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserCreationOptions {
    private final String mAppId;
    private final String mAuthCode;
    private final String mPlatformUrl;
    private final String mSecret;
    private final UserLinker mUserLinker;
    private final UserLinkerAsync mUserLinkerAsync;

    @DontObfuscate
    public static class Builder {
        private final String mAppId;
        private final String mAuthCode;
        private String mPlatformUrl;
        private final String mSecret;
        private final UserLinker mUserLinker;
        private final UserLinkerAsync mUserLinkerAsync;

        public Builder setPlatformUrl(String str) {
            this.mPlatformUrl = str;
            return this;
        }

        public static /* synthetic */ String access$584(Builder builder, Object obj) {
            String str = builder.mPlatformUrl + obj;
            builder.mPlatformUrl = str;
            return str;
        }

        public Builder(String str) {
            this.mPlatformUrl = "https://api.sentiance.com/";
            this.mAuthCode = str;
            this.mAppId = null;
            this.mSecret = null;
            this.mUserLinker = null;
            this.mUserLinkerAsync = null;
        }

        @SuppressLint
        public UserCreationOptions build() {
            String str;
            String str2 = this.mAuthCode;
            if (str2 == null || str2.isEmpty()) {
                String str3 = this.mAppId;
                if (str3 == null || str3.isEmpty() || (str = this.mSecret) == null || str.isEmpty()) {
                    MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Invalid auth code or Sentiance credentials");
                    return null;
                }
                if (this.mUserLinker == null && this.mUserLinkerAsync == null) {
                    MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("A valid user linker must be specified");
                    return null;
                }
            }
            if (Patterns.WEB_URL.matcher(this.mPlatformUrl).matches()) {
                return new UserCreationOptions(this);
            }
            MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0.m("Invalid platform URL");
            return null;
        }

        public Builder(String str, String str2, UserLinkerAsync userLinkerAsync) {
            this.mPlatformUrl = "https://api.sentiance.com/";
            this.mAppId = str;
            this.mSecret = str2;
            this.mUserLinkerAsync = userLinkerAsync;
            this.mUserLinker = null;
            this.mAuthCode = null;
        }

        public Builder(String str, String str2, UserLinker userLinker) {
            this.mPlatformUrl = "https://api.sentiance.com/";
            this.mAppId = str;
            this.mSecret = str2;
            this.mUserLinker = userLinker;
            this.mAuthCode = null;
            this.mUserLinkerAsync = null;
        }
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAuthCode() {
        return this.mAuthCode;
    }

    public String getPlatformUrl() {
        return this.mPlatformUrl;
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

    public UserCreationOptions(Builder builder) {
        this.mAppId = builder.mAppId;
        this.mSecret = builder.mSecret;
        this.mAuthCode = builder.mAuthCode;
        this.mUserLinker = builder.mUserLinker;
        this.mUserLinkerAsync = builder.mUserLinkerAsync;
        builder.mPlatformUrl = builder.mPlatformUrl.trim();
        if (!builder.mPlatformUrl.endsWith("/")) {
            Builder.access$584(builder, "/");
        }
        this.mPlatformUrl = builder.mPlatformUrl;
    }
}

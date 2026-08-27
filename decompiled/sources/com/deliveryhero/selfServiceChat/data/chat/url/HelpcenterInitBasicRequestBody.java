package com.deliveryhero.selfServiceChat.data.chat.url;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class HelpcenterInitBasicRequestBody {
    public final String appVersion;
    public final boolean bridge;
    public final String email;
    public final String globalEntityId;
    public final boolean guest;
    public final String hostPerseusSessionId;
    public final String locale;
    public final String logCountryCode;
    public final String name;
    public final String p2pChatCountry;
    public final String p2pChatToken;
    public final String p2pChatType;
    public final String p2pSdkVersion;
    public final String platformToken;
    public final String serviceType;
    public final String userId;
    public final String verificationToken;

    public final int hashCode() {
        return this.hostPerseusSessionId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.appVersion.hashCode() * 31, 31, this.bridge), 31, this.email), 31, this.globalEntityId), 31, this.guest), 31, this.locale), 31, this.logCountryCode), 31, this.name), 31, this.p2pChatToken), 31, this.p2pChatType), 31, this.p2pSdkVersion), 31, this.p2pChatCountry), 31, this.platformToken), 31, this.serviceType), 31, this.userId), 31, this.verificationToken);
    }

    public HelpcenterInitBasicRequestBody(@getDensityDpi(serializer = "app_version") String str, @getDensityDpi(serializer = "bridge") boolean z, @getDensityDpi(serializer = "email") String str2, @getDensityDpi(serializer = "global_entity_id") String str3, @getDensityDpi(serializer = "guest") boolean z2, @getDensityDpi(serializer = "locale") String str4, @getDensityDpi(serializer = "log_country_code") String str5, @getDensityDpi(serializer = "name") String str6, @getDensityDpi(serializer = "p2p_chat_token") String str7, @getDensityDpi(serializer = "p2p_chat_type") String str8, @getDensityDpi(serializer = "p2p_sdk_version") String str9, @getDensityDpi(serializer = "p2p_chat_country") String str10, @getDensityDpi(serializer = "platform_token") String str11, @getDensityDpi(serializer = "service_type") String str12, @getDensityDpi(serializer = "user_id") String str13, @getDensityDpi(serializer = "verification_token") String str14, @getDensityDpi(serializer = "host_perseus_session_id") String str15) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        m1$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        m1$$ExternalSyntheticOutline0.m(str11, str12, str13, str14, str15);
        this.appVersion = str;
        this.bridge = z;
        this.email = str2;
        this.globalEntityId = str3;
        this.guest = z2;
        this.locale = str4;
        this.logCountryCode = str5;
        this.name = str6;
        this.p2pChatToken = str7;
        this.p2pChatType = str8;
        this.p2pSdkVersion = str9;
        this.p2pChatCountry = str10;
        this.platformToken = str11;
        this.serviceType = str12;
        this.userId = str13;
        this.verificationToken = str14;
        this.hostPerseusSessionId = str15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpcenterInitBasicRequestBody)) {
            return false;
        }
        HelpcenterInitBasicRequestBody helpcenterInitBasicRequestBody = (HelpcenterInitBasicRequestBody) obj;
        return this.appVersion.equals(helpcenterInitBasicRequestBody.appVersion) && this.bridge == helpcenterInitBasicRequestBody.bridge && this.email.equals(helpcenterInitBasicRequestBody.email) && this.globalEntityId.equals(helpcenterInitBasicRequestBody.globalEntityId) && this.guest == helpcenterInitBasicRequestBody.guest && this.locale.equals(helpcenterInitBasicRequestBody.locale) && this.logCountryCode.equals(helpcenterInitBasicRequestBody.logCountryCode) && this.name.equals(helpcenterInitBasicRequestBody.name) && this.p2pChatToken.equals(helpcenterInitBasicRequestBody.p2pChatToken) && this.p2pChatType.equals(helpcenterInitBasicRequestBody.p2pChatType) && this.p2pSdkVersion.equals(helpcenterInitBasicRequestBody.p2pSdkVersion) && this.p2pChatCountry.equals(helpcenterInitBasicRequestBody.p2pChatCountry) && this.platformToken.equals(helpcenterInitBasicRequestBody.platformToken) && this.serviceType.equals(helpcenterInitBasicRequestBody.serviceType) && this.userId.equals(helpcenterInitBasicRequestBody.userId) && this.verificationToken.equals(helpcenterInitBasicRequestBody.verificationToken) && this.hostPerseusSessionId.equals(helpcenterInitBasicRequestBody.hostPerseusSessionId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HelpcenterInitBasicRequestBody(appVersion=");
        sb.append(this.appVersion);
        sb.append(", bridge=");
        sb.append(this.bridge);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", globalEntityId=");
        sb.append(this.globalEntityId);
        sb.append(", guest=");
        sb.append(this.guest);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", logCountryCode=");
        sb.append(this.logCountryCode);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", p2pChatToken=");
        sb.append(this.p2pChatToken);
        sb.append(", p2pChatType=");
        sb.append(this.p2pChatType);
        sb.append(", p2pSdkVersion=");
        sb.append(this.p2pSdkVersion);
        sb.append(", p2pChatCountry=");
        sb.append(this.p2pChatCountry);
        sb.append(", platformToken=");
        sb.append(this.platformToken);
        sb.append(", serviceType=");
        sb.append(this.serviceType);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", verificationToken=");
        sb.append(this.verificationToken);
        sb.append(", hostPerseusSessionId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.hostPerseusSessionId, ')');
    }
}

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
public final class HelpcenterInitRequestBody {
    public final String appVersion;
    public final boolean bridge;
    public final String email;
    public final String globalEntityId;
    public final boolean guest;
    public final String hostPerseusSessionId;
    public final String locale;
    public final String logCountryCode;
    public final String name;
    public final String orderId;
    public final String p2pChatCountry;
    public final String p2pChatToken;
    public final String p2pChatType;
    public final String p2pSdkVersion;
    public final String platformToken;
    public final String serviceType;
    public final String userId;
    public final String verificationToken;

    public final int hashCode() {
        return this.hostPerseusSessionId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.appVersion.hashCode() * 31, 31, this.bridge), 31, this.email), 31, this.globalEntityId), 31, this.guest), 31, this.locale), 31, this.logCountryCode), 31, this.name), 31, this.orderId), 31, this.p2pChatToken), 31, this.p2pChatType), 31, this.p2pSdkVersion), 31, this.p2pChatCountry), 31, this.platformToken), 31, this.serviceType), 31, this.userId), 31, this.verificationToken);
    }

    public HelpcenterInitRequestBody(@getDensityDpi(serializer = "app_version") String str, @getDensityDpi(serializer = "bridge") boolean z, @getDensityDpi(serializer = "email") String str2, @getDensityDpi(serializer = "global_entity_id") String str3, @getDensityDpi(serializer = "guest") boolean z2, @getDensityDpi(serializer = "locale") String str4, @getDensityDpi(serializer = "log_country_code") String str5, @getDensityDpi(serializer = "name") String str6, @getDensityDpi(serializer = "order_id") String str7, @getDensityDpi(serializer = "p2p_chat_token") String str8, @getDensityDpi(serializer = "p2p_chat_type") String str9, @getDensityDpi(serializer = "p2p_sdk_version") String str10, @getDensityDpi(serializer = "p2p_chat_country") String str11, @getDensityDpi(serializer = "platform_token") String str12, @getDensityDpi(serializer = "service_type") String str13, @getDensityDpi(serializer = "user_id") String str14, @getDensityDpi(serializer = "verification_token") String str15, @getDensityDpi(serializer = "host_perseus_session_id") String str16) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        m1$$ExternalSyntheticOutline0.m(str6, str7, str8, str9, str10);
        m1$$ExternalSyntheticOutline0.m(str11, str12, str13, str14, str15);
        str16.getClass();
        this.appVersion = str;
        this.bridge = z;
        this.email = str2;
        this.globalEntityId = str3;
        this.guest = z2;
        this.locale = str4;
        this.logCountryCode = str5;
        this.name = str6;
        this.orderId = str7;
        this.p2pChatToken = str8;
        this.p2pChatType = str9;
        this.p2pSdkVersion = str10;
        this.p2pChatCountry = str11;
        this.platformToken = str12;
        this.serviceType = str13;
        this.userId = str14;
        this.verificationToken = str15;
        this.hostPerseusSessionId = str16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpcenterInitRequestBody)) {
            return false;
        }
        HelpcenterInitRequestBody helpcenterInitRequestBody = (HelpcenterInitRequestBody) obj;
        return this.appVersion.equals(helpcenterInitRequestBody.appVersion) && this.bridge == helpcenterInitRequestBody.bridge && this.email.equals(helpcenterInitRequestBody.email) && this.globalEntityId.equals(helpcenterInitRequestBody.globalEntityId) && this.guest == helpcenterInitRequestBody.guest && this.locale.equals(helpcenterInitRequestBody.locale) && this.logCountryCode.equals(helpcenterInitRequestBody.logCountryCode) && this.name.equals(helpcenterInitRequestBody.name) && this.orderId.equals(helpcenterInitRequestBody.orderId) && this.p2pChatToken.equals(helpcenterInitRequestBody.p2pChatToken) && this.p2pChatType.equals(helpcenterInitRequestBody.p2pChatType) && this.p2pSdkVersion.equals(helpcenterInitRequestBody.p2pSdkVersion) && this.p2pChatCountry.equals(helpcenterInitRequestBody.p2pChatCountry) && this.platformToken.equals(helpcenterInitRequestBody.platformToken) && this.serviceType.equals(helpcenterInitRequestBody.serviceType) && this.userId.equals(helpcenterInitRequestBody.userId) && this.verificationToken.equals(helpcenterInitRequestBody.verificationToken) && this.hostPerseusSessionId.equals(helpcenterInitRequestBody.hostPerseusSessionId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HelpcenterInitRequestBody(appVersion=");
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
        sb.append(", orderId=");
        sb.append(this.orderId);
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

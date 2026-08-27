package com.deliveryhero.perseus.data.remote.api.model;

import androidx.annotation.Keep;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.pauseWebviewIfNecessarylambda10;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class BaseHitDetails {

    @SerializedName("adjustId")
    private String adjustId;

    @SerializedName("advertisingId")
    private String advertisingId;

    @SerializedName("androidId")
    private final String androidId;

    @SerializedName("appBuildVersion")
    private final String appBuildVersion;

    @SerializedName("appId")
    private String appId;

    @SerializedName("appName")
    private String appName;

    @SerializedName("appVersionCode")
    private String appVersionCode;

    @SerializedName("clientId")
    private String clientId;

    @SerializedName("clientSentTimestamp")
    private String clientSentTimestamp;

    @SerializedName("consent")
    private String consent;

    @SerializedName(PushNotificationParserObj.COUNTRY_KEY)
    private String country;

    @SerializedName("mobileDeviceBranding")
    private final String deviceBrand;

    @SerializedName("deviceMobileDeviceInfo")
    private final String deviceInfo;

    @SerializedName("deviceLanguage")
    private final String deviceLanguage;

    @SerializedName("mobileDeviceModel")
    private final String deviceModel;

    @SerializedName("firebaseInstanceId")
    private final String firebaseInstanceId;

    @SerializedName("globalEntityId")
    private String globalEntityId;

    @SerializedName("hitNumber")
    private Long hitNumber;

    @SerializedName("isDebug")
    private final boolean isDebug;

    @SerializedName("mobileDeviceMarketingName")
    private final String marketingName;

    @SerializedName("deviceOperatingSystemVersion")
    private final String operatingSystemVersion;

    @SerializedName("payloadTimestamp")
    private String payloadTimestamp;

    @SerializedName("platform")
    private String platform;

    @SerializedName(RemoteMessageConst.Notification.PRIORITY)
    private final Integer priority;

    @SerializedName("rechargeTo")
    private final String rechargeTo;

    @SerializedName("deviceScreenResolution")
    private final String screenResolution;

    @SerializedName("sdkVersion")
    private String sdkVersion;

    @SerializedName("sessionId")
    private String sessionId;

    @SerializedName("uaId")
    private String uaId;

    @SerializedName("userAgent")
    private String userAgent;

    @SerializedName("userId")
    private String userId;

    public final String getAdjustId() {
        return this.adjustId;
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final String getAndroidId() {
        return this.androidId;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientSentTimestamp() {
        return this.clientSentTimestamp;
    }

    public final String getConsent() {
        return this.consent;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getDeviceLanguage() {
        return this.deviceLanguage;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getFirebaseInstanceId() {
        return this.firebaseInstanceId;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final Long getHitNumber() {
        return this.hitNumber;
    }

    public final String getMarketingName() {
        return this.marketingName;
    }

    public final String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public final String getPayloadTimestamp() {
        return this.payloadTimestamp;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getRechargeTo() {
        return this.rechargeTo;
    }

    public final String getScreenResolution() {
        return this.screenResolution;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getUaId() {
        return this.uaId;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final void setAdjustId(String str) {
        this.adjustId = str;
    }

    public final void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public final void setConsent(String str) {
        this.consent = str;
    }

    public final void setGlobalEntityId(String str) {
        this.globalEntityId = str;
    }

    public final void setHitNumber(Long l) {
        this.hitNumber = l;
    }

    public final void setUaId(String str) {
        this.uaId = str;
    }

    public final void setAppId(String str) {
        str.getClass();
        this.appId = str;
    }

    public final void setAppName(String str) {
        str.getClass();
        this.appName = str;
    }

    public final void setAppVersionCode(String str) {
        str.getClass();
        this.appVersionCode = str;
    }

    public final void setClientId(String str) {
        str.getClass();
        this.clientId = str;
    }

    public final void setClientSentTimestamp(String str) {
        str.getClass();
        this.clientSentTimestamp = str;
    }

    public final void setCountry(String str) {
        str.getClass();
        this.country = str;
    }

    public final void setPayloadTimestamp(String str) {
        str.getClass();
        this.payloadTimestamp = str;
    }

    public final void setPlatform(String str) {
        str.getClass();
        this.platform = str;
    }

    public final void setSdkVersion(String str) {
        str.getClass();
        this.sdkVersion = str;
    }

    public final void setSessionId(String str) {
        str.getClass();
        this.sessionId = str;
    }

    public final void setUserAgent(String str) {
        str.getClass();
        this.userAgent = str;
    }

    public final void setUserId(String str) {
        str.getClass();
        this.userId = str;
    }

    public BaseHitDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Long l, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z, String str25, String str26, String str27, String str28, Integer num) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str6);
        m1$$ExternalSyntheticOutline0.m(str7, str8, str10, str11, str13);
        m1$$ExternalSyntheticOutline0.m(str14, str17, str18, str19, str20);
        m1$$ExternalSyntheticOutline0.m(str21, str22, str23, str24, str25);
        this.platform = str;
        this.payloadTimestamp = str2;
        this.clientSentTimestamp = str3;
        this.country = str4;
        this.advertisingId = str5;
        this.appId = str6;
        this.appName = str7;
        this.appVersionCode = str8;
        this.adjustId = str9;
        this.userAgent = str10;
        this.userId = str11;
        this.uaId = str12;
        this.clientId = str13;
        this.sessionId = str14;
        this.globalEntityId = str15;
        this.consent = str16;
        this.sdkVersion = str17;
        this.hitNumber = l;
        this.deviceInfo = str18;
        this.operatingSystemVersion = str19;
        this.screenResolution = str20;
        this.marketingName = str21;
        this.deviceModel = str22;
        this.deviceBrand = str23;
        this.deviceLanguage = str24;
        this.isDebug = z;
        this.androidId = str25;
        this.appBuildVersion = str26;
        this.rechargeTo = str27;
        this.firebaseInstanceId = str28;
        this.priority = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseHitDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Long l, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z, String str25, String str26, String str27, String str28, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str29;
        if ((i & 67108864) != 0) {
            String str30 = pauseWebviewIfNecessarylambda10.serializer;
            str29 = str30 == null ? "" : str30;
        } else {
            str29 = str25;
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, l, str18, str19, str20, str21, str22, str23, str24, z, str29, (i & 134217728) != 0 ? "" : str26, (i & 268435456) != 0 ? "" : str27, (i & 536870912) != 0 ? "" : str28, (i & 1073741824) != 0 ? null : num);
    }
}

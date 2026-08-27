package com.deliveryhero.customerchat.fwf;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Custom {
    public final String appVersion;
    public final String applicationId;
    public final String country;
    public final String customUserId;
    public final String deviceOsVersion;
    public final String gid;
    public final String platformName;
    public final String userType;

    public final int hashCode() {
        return this.applicationId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.customUserId.hashCode() * 31, 31, this.gid), 31, this.country), 31, this.userType), 31, this.deviceOsVersion), 31, this.platformName), 31, this.appVersion);
    }

    public Custom(@getDensityDpi(serializer = "customUserId") String str, @getDensityDpi(serializer = "gid") String str2, @getDensityDpi(serializer = PushNotificationParserObj.COUNTRY_KEY) String str3, @getDensityDpi(serializer = "userType") String str4, @getDensityDpi(serializer = "deviceOsVersion") String str5, @getDensityDpi(serializer = "platformName") String str6, @getDensityDpi(serializer = "appVersion") String str7, @getDensityDpi(serializer = "applicationId") String str8) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        af$$ExternalSyntheticOutline0.m3978m(str6, str7, str8);
        this.customUserId = str;
        this.gid = str2;
        this.country = str3;
        this.userType = str4;
        this.deviceOsVersion = str5;
        this.platformName = str6;
        this.appVersion = str7;
        this.applicationId = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Custom)) {
            return false;
        }
        Custom custom = (Custom) obj;
        return this.customUserId.equals(custom.customUserId) && this.gid.equals(custom.gid) && this.country.equals(custom.country) && this.userType.equals(custom.userType) && this.deviceOsVersion.equals(custom.deviceOsVersion) && this.platformName.equals(custom.platformName) && this.appVersion.equals(custom.appVersion) && this.applicationId.equals(custom.applicationId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Custom(customUserId=");
        sb.append(this.customUserId);
        sb.append(", gid=");
        sb.append(this.gid);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", userType=");
        sb.append(this.userType);
        sb.append(", deviceOsVersion=");
        sb.append(this.deviceOsVersion);
        sb.append(", platformName=");
        sb.append(this.platformName);
        sb.append(", appVersion=");
        sb.append(this.appVersion);
        sb.append(", applicationId=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.applicationId, ')');
    }
}

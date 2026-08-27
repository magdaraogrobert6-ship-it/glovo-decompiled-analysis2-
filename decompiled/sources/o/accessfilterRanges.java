package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class accessfilterRanges {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @SerializedName("app_version")
    private final String appVersion;

    @SerializedName("bridge")
    private final boolean bridge;

    @SerializedName("email")
    private final String email;

    @SerializedName("global_entity_id")
    private final String globalEntityId;

    @SerializedName("guest")
    private final boolean guest;

    @SerializedName("host_perseus_session_id")
    private final String hostPerseusSessionId;

    @SerializedName("locale")
    private final String locale;

    @SerializedName("log_country_code")
    private final String logCountryCode;

    @SerializedName("name")
    private final String name;

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("p2p_chat_country")
    private final String p2pChatCountry;

    @SerializedName("p2p_chat_token")
    private final String p2pChatToken;

    @SerializedName("p2p_chat_type")
    private final String p2pChatType;

    @SerializedName("p2p_sdk_version")
    private final String p2pSdkVersion;

    @SerializedName("platform_token")
    private final String platformToken;

    @SerializedName("service_type")
    private final String serviceType;

    @SerializedName("user_id")
    private final String userId;

    @SerializedName("verification_token")
    private final String verificationToken;

    public accessfilterRanges(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        d$$ExternalSyntheticOutline0.m(str6, str7, str11, str13);
        this.appVersion = str;
        this.bridge = true;
        this.email = str2;
        this.globalEntityId = str3;
        this.guest = false;
        this.locale = str4;
        this.logCountryCode = str5;
        this.name = str6;
        this.orderId = str7;
        this.p2pChatToken = str8;
        this.p2pChatType = "p2p";
        this.p2pSdkVersion = null;
        this.p2pChatCountry = str9;
        this.platformToken = str10;
        this.serviceType = "rider";
        this.userId = str11;
        this.verificationToken = str12;
        this.hostPerseusSessionId = str13;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.appVersion;
        boolean z = this.bridge;
        String str2 = this.globalEntityId;
        boolean z2 = this.guest;
        String str3 = this.locale;
        String str4 = this.logCountryCode;
        String str5 = this.name;
        String str6 = this.orderId;
        String str7 = this.p2pChatType;
        String str8 = this.p2pSdkVersion;
        String str9 = this.p2pChatCountry;
        String str10 = this.serviceType;
        String str11 = this.hostPerseusSessionId;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("HelpCenterInitRequestBody(appVersion=", str, ", bridge=", ", email=REDACTED, globalEntityId=", z);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(str2, ", guest=", ", locale=", sbM, z2);
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", logCountryCode=", str4, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, str5, ", orderId=", str6, ", p2pChatToken=REDACTED, p2pChatType=");
        c8$$ExternalSyntheticOutline0.m(sbM, str7, ", p2pSdkVersion=", str8, ", p2pChatCountry=");
        c8$$ExternalSyntheticOutline0.m(sbM, str9, ", platformToken=REDACTED, serviceType=", str10, ", userId=REDACTED, verificationToken=REDACTED, hostPerseusSessionId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, str11, ")");
        int i4 = RemoteActionCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = write + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.appVersion.hashCode() * 31, 31, this.bridge), 31, this.email), 31, this.globalEntityId), 31, this.guest), 31, this.locale), 31, this.logCountryCode), 31, this.name), 31, this.orderId), 31, this.p2pChatToken), 31, this.p2pChatType);
        String str = this.p2pSdkVersion;
        if (str == null) {
            int i5 = write + 81;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i7 = write + 33;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        return this.hostPerseusSessionId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + i) * 31, 31, this.p2pChatCountry), 31, this.platformToken), 31, this.serviceType), 31, this.userId), 31, this.verificationToken);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessfilterRanges)) {
            return false;
        }
        accessfilterRanges accessfilterranges = (accessfilterRanges) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appVersion, accessfilterranges.appVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object obj2 = null;
        if (this.bridge != accessfilterranges.bridge) {
            int i2 = RemoteActionCompatParcelizer + 51;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, accessfilterranges.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, accessfilterranges.globalEntityId}, getCieXyz.write())).booleanValue() || this.guest != accessfilterranges.guest) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locale, accessfilterranges.locale}, getCieXyz.write())).booleanValue()) {
            int i3 = write + 55;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logCountryCode, accessfilterranges.logCountryCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, accessfilterranges.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderId, accessfilterranges.orderId}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 29;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatToken, accessfilterranges.p2pChatToken}, getCieXyz.write())).booleanValue()) {
            int i7 = write + 111;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatType, accessfilterranges.p2pChatType}, getCieXyz.write())).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 99;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pSdkVersion, accessfilterranges.p2pSdkVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatCountry, accessfilterranges.p2pChatCountry}, getCieXyz.write())).booleanValue()) {
            int i11 = RemoteActionCompatParcelizer + 51;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformToken, accessfilterranges.platformToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serviceType, accessfilterranges.serviceType}, getCieXyz.write())).booleanValue()) {
            int i12 = RemoteActionCompatParcelizer + 11;
            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i12 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, accessfilterranges.userId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.verificationToken, accessfilterranges.verificationToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hostPerseusSessionId, accessfilterranges.hostPerseusSessionId}, getCieXyz.write())).booleanValue();
    }
}

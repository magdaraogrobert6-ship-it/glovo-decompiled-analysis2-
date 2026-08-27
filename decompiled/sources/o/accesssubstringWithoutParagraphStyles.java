package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssubstringWithoutParagraphStyles {
    private static int IconCompatParcelizer = 1;
    private static int read;

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

    public accesssubstringWithoutParagraphStyles(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        af$$ExternalSyntheticOutline0.m3978m(str6, str10, str12);
        this.appVersion = str;
        this.bridge = false;
        this.email = str2;
        this.globalEntityId = str3;
        this.guest = false;
        this.locale = str4;
        this.logCountryCode = str5;
        this.name = str6;
        this.p2pChatToken = str7;
        this.p2pChatType = "p2p";
        this.p2pSdkVersion = null;
        this.p2pChatCountry = str8;
        this.platformToken = str9;
        this.serviceType = "rider";
        this.userId = str10;
        this.verificationToken = str11;
        this.hostPerseusSessionId = str12;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.appVersion;
        boolean z = this.bridge;
        String str2 = this.globalEntityId;
        boolean z2 = this.guest;
        String str3 = this.locale;
        String str4 = this.logCountryCode;
        String str5 = this.name;
        String str6 = this.p2pChatType;
        String str7 = this.p2pSdkVersion;
        String str8 = this.p2pChatCountry;
        String str9 = this.serviceType;
        String str10 = this.hostPerseusSessionId;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("HelpCenterInitBasicRequestBody(appVersion=", str, ", bridge=", ", email=REDACTED, globalEntityId=", z);
        SweepGradientShader9KIMszodefault.IconCompatParcelizer(str2, ", guest=", ", locale=", sbM, z2);
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", logCountryCode=", str4, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, str5, ", p2pChatToken=REDACTED, p2pChatType=", str6, ", p2pSdkVersion=");
        c8$$ExternalSyntheticOutline0.m(sbM, str7, ", p2pChatCountry=", str8, ", platformToken=REDACTED, serviceType=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, str9, ", userId=REDACTED, verificationToken=REDACTED, hostPerseusSessionId=", str10, ")");
        int i4 = IconCompatParcelizer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.appVersion.hashCode() * 31, 31, this.bridge), 31, this.email), 31, this.globalEntityId), 31, this.guest), 31, this.locale), 31, this.logCountryCode), 31, this.name), 31, this.p2pChatToken), 31, this.p2pChatType);
        String str = this.p2pSdkVersion;
        int iHashCode = this.hostPerseusSessionId.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + (str == null ? 0 : str.hashCode())) * 31, 31, this.p2pChatCountry), 31, this.platformToken), 31, this.serviceType), 31, this.userId), 31, this.verificationToken);
        int i4 = IconCompatParcelizer + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 37;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 89;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof accesssubstringWithoutParagraphStyles)) {
            return false;
        }
        accesssubstringWithoutParagraphStyles accesssubstringwithoutparagraphstyles = (accesssubstringWithoutParagraphStyles) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appVersion, accesssubstringwithoutparagraphstyles.appVersion}, getCieXyz.write())).booleanValue() || this.bridge != accesssubstringwithoutparagraphstyles.bridge) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.email, accesssubstringwithoutparagraphstyles.email}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, accesssubstringwithoutparagraphstyles.globalEntityId}, getCieXyz.write())).booleanValue() || this.guest != accesssubstringwithoutparagraphstyles.guest) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locale, accesssubstringwithoutparagraphstyles.locale}, getCieXyz.write())).booleanValue()) {
            int i6 = IconCompatParcelizer + 81;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 78 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logCountryCode, accesssubstringwithoutparagraphstyles.logCountryCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, accesssubstringwithoutparagraphstyles.name}, getCieXyz.write())).booleanValue()) {
            int i8 = read + 45;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i8 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatToken, accesssubstringwithoutparagraphstyles.p2pChatToken}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatType, accesssubstringwithoutparagraphstyles.p2pChatType}, getCieXyz.write())).booleanValue()) {
            int i9 = read + 49;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pSdkVersion, accesssubstringwithoutparagraphstyles.p2pSdkVersion}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.p2pChatCountry, accesssubstringwithoutparagraphstyles.p2pChatCountry}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platformToken, accesssubstringwithoutparagraphstyles.platformToken}, getCieXyz.write())).booleanValue()) {
                int i11 = IconCompatParcelizer + 1;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serviceType, accesssubstringwithoutparagraphstyles.serviceType}, getCieXyz.write())).booleanValue()) {
                int i13 = read + 77;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, accesssubstringwithoutparagraphstyles.userId}, getCieXyz.write())).booleanValue()) {
                int i15 = IconCompatParcelizer + 101;
                read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.verificationToken, accesssubstringwithoutparagraphstyles.verificationToken}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.hostPerseusSessionId, accesssubstringwithoutparagraphstyles.hostPerseusSessionId}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i17 = read + 107;
                IconCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i18 = i17 % 2;
                return false;
            }
        }
        return false;
    }
}

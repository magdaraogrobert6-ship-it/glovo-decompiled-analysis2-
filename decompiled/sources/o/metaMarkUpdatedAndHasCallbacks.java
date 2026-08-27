package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.country.config.api.model.CountryConfig$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class metaMarkUpdatedAndHasCallbacks {
    public static final CountryConfig$Companion Companion = new CountryConfig$Companion();
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    public final String brand;
    public final String countryCode;
    public final String countryIsoCode;
    public final String currency;
    public final String globalEntityId;
    public final String name;
    public final String privacyPolicyUrl;
    public final String registerUrl;
    public final String url;

    static {
        int i = IconCompatParcelizer + 35;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ metaMarkUpdatedAndHasCallbacks(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (511 == (i & 511)) {
            this.name = str;
            this.countryCode = str2;
            this.countryIsoCode = str3;
            this.brand = str4;
            this.currency = str5;
            this.url = str6;
            this.globalEntityId = str7;
            this.registerUrl = str8;
            this.privacyPolicyUrl = str9;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 511, metaMarkFlags.read.getDescriptor());
        throw null;
    }

    public metaMarkUpdatedAndHasCallbacks(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        this.name = str;
        this.countryCode = str2;
        this.countryIsoCode = str3;
        this.brand = str4;
        this.currency = str5;
        this.url = str6;
        this.globalEntityId = str7;
        this.registerUrl = str8;
        this.privacyPolicyUrl = str9;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CountryConfig(name=", this.name, ", countryCode=", this.countryCode, ", countryIsoCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.countryIsoCode, ", brand=", this.brand, ", currency=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.currency, ", url=", this.url, ", globalEntityId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.globalEntityId, ", registerUrl=", this.registerUrl, ", privacyPolicyUrl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.privacyPolicyUrl, ")");
        int i4 = RemoteActionCompatParcelizer + 3;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.countryCode), 31, this.countryIsoCode), 31, this.brand), 31, this.currency), 31, this.url), 31, this.globalEntityId);
        String str = this.registerUrl;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.privacyPolicyUrl;
        if (str2 == null) {
            int i4 = RemoteActionCompatParcelizer + 81;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 2 / 4;
            }
        } else {
            iHashCode = str2.hashCode();
        }
        return ((iM + iHashCode2) * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 119;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            int i6 = i4 + 81;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof metaMarkUpdatedAndHasCallbacks) {
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacks = (metaMarkUpdatedAndHasCallbacks) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, metamarkupdatedandhascallbacks.name}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, metamarkupdatedandhascallbacks.countryCode}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryIsoCode, metamarkupdatedandhascallbacks.countryIsoCode}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, metamarkupdatedandhascallbacks.brand}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, metamarkupdatedandhascallbacks.currency}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, metamarkupdatedandhascallbacks.url}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, metamarkupdatedandhascallbacks.globalEntityId}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.registerUrl, metamarkupdatedandhascallbacks.registerUrl}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.privacyPolicyUrl, metamarkupdatedandhascallbacks.privacyPolicyUrl}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i7 = RemoteActionCompatParcelizer + 49;
                        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        return i7 % 2 != 0;
                    }
                    int i8 = read + 93;
                    RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i8 % 2 == 0;
                }
                int i9 = RemoteActionCompatParcelizer + 39;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }
            int i11 = RemoteActionCompatParcelizer + 49;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = i2 + 21;
        RemoteActionCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i14 = i13 % 2;
        return false;
    }
}

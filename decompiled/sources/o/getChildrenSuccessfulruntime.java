package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.login.data.countryselection.CountryResponse$Companion;
import kotlinx.serialization.Serializable;
import o.checkThreadConfinementruntime;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getChildrenSuccessfulruntime {
    public static final CountryResponse$Companion Companion = new Object() { // from class: com.roadrunner.login.data.countryselection.CountryResponse$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 93;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            checkThreadConfinementruntime checkthreadconfinementruntime = checkThreadConfinementruntime.IconCompatParcelizer;
            int i4 = read + 35;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return checkthreadconfinementruntime;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write = 1;
    public final String brand;
    public final String countryCode;
    public final String countryIsoCode;
    public final String currency;
    public final String endpoint;
    public final String globalEntityId;
    public final String privacyPolicyUrl;
    public final String registerUrl;
    public final String url;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.login.data.countryselection.CountryResponse$Companion] */
    static {
        int i = read + 105;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ getChildrenSuccessfulruntime(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Object obj = null;
        if (154 != (i & 154)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 154, checkThreadConfinementruntime.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.brand = null;
        } else {
            this.brand = str;
            int i2 = 2 % 2;
        }
        this.countryCode = str2;
        if ((i & 4) == 0) {
            int i3 = write + 79;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                this.countryIsoCode = null;
                int i4 = 25 / 0;
            } else {
                this.countryIsoCode = null;
            }
        } else {
            this.countryIsoCode = str3;
            int i5 = 2 % 2;
        }
        this.currency = str4;
        this.endpoint = str5;
        if ((i & 32) == 0) {
            this.globalEntityId = null;
        } else {
            this.globalEntityId = str6;
        }
        if ((i & 64) == 0) {
            int i6 = IconCompatParcelizer;
            int i7 = i6 + 87;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            this.registerUrl = null;
            int i9 = i6 + 37;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
        } else {
            this.registerUrl = str7;
        }
        this.url = str8;
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.privacyPolicyUrl = null;
            int i11 = IconCompatParcelizer + 121;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return;
        }
        this.privacyPolicyUrl = str9;
        int i13 = write + 109;
        IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CountryResponse(brand=", this.brand, ", countryCode=", this.countryCode, ", countryIsoCode=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.countryIsoCode, ", currency=", this.currency, ", endpoint=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.endpoint, ", globalEntityId=", this.globalEntityId, ", registerUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.registerUrl, ", url=", this.url, ", privacyPolicyUrl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.privacyPolicyUrl, ")");
        int i4 = IconCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = write + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.brand;
        int iHashCode4 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = write + 3;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int iM = af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.countryCode);
        String str2 = this.countryIsoCode;
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((iM + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.currency), 31, this.endpoint);
        String str3 = this.globalEntityId;
        if (str3 == null) {
            int i6 = IconCompatParcelizer + 83;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i8 = write + 81;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        String str4 = this.registerUrl;
        if (str4 == null) {
            int i10 = write + 81;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        int iM3 = af$$ExternalSyntheticOutline0.m((((iM2 + iHashCode2) * 31) + iHashCode3) * 31, 31, this.url);
        String str5 = this.privacyPolicyUrl;
        if (str5 == null) {
            int i12 = IconCompatParcelizer + 41;
            write = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            iHashCode4 = str5.hashCode();
        }
        return iM3 + iHashCode4;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getChildrenSuccessfulruntime)) {
                int i2 = write + 23;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            getChildrenSuccessfulruntime getchildrensuccessfulruntime = (getChildrenSuccessfulruntime) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, getchildrensuccessfulruntime.brand}, getCieXyz.write())).booleanValue()) {
                int i4 = write + 73;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i4 % 2 != 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, getchildrensuccessfulruntime.countryCode}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryIsoCode, getchildrensuccessfulruntime.countryIsoCode}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, getchildrensuccessfulruntime.currency}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endpoint, getchildrensuccessfulruntime.endpoint}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, getchildrensuccessfulruntime.globalEntityId}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.registerUrl, getchildrensuccessfulruntime.registerUrl}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, getchildrensuccessfulruntime.url}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.privacyPolicyUrl, getchildrensuccessfulruntime.privacyPolicyUrl}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = IconCompatParcelizer + 27;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = write + 37;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        int i8 = IconCompatParcelizer + 35;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 != 0;
    }
}

package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import com.roadrunner.country.config.implementation.data.network.CountryConfigResponse$Companion;
import kotlinx.serialization.Serializable;
import o.packXY;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class toLong {
    public static final CountryConfigResponse$Companion Companion = new Object() { // from class: com.roadrunner.country.config.implementation.data.network.CountryConfigResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 89;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return packXY.RemoteActionCompatParcelizer;
            }
            int i3 = 0 / 0;
            return packXY.RemoteActionCompatParcelizer;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final String brand;
    public final String countryCode;
    public final String countryIsoCode;
    public final String currency;
    public final String endpoint;
    public final String globalEntityId;
    public final String privacyPolicyUrl;
    public final String registerUrl;
    public final String url;

    public static /* synthetic */ Object serializer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = i5 | i7;
        int i11 = (~(i5 | i6)) | (~(i7 | (~i6) | i8)) | (~(i6 | i));
        int i12 = i6 + i + i2 + (764943627 * i4) + (189947931 * i3);
        int i13 = i12 * i12;
        int i14 = ((i6 * (-973936384)) - 801505280) + ((-973936384) * i) + (1838296578 * i9) + (1228335359 * i10) + ((-1228335359) * i11) + (2092695552 * i2) + ((-1475084288) * i4) + ((-1479278592) * i3) + ((-626393088) * i13);
        int i15 = (i6 * 1860537600) + 224780607 + (i * 1860537600) + (i9 * 1034) + (i10 * (-517)) + (i11 * 517) + (i2 * 1860538117) + (i4 * (-1861700041)) + (i3 * (-831392377)) + (i13 * 995229696);
        return i14 + ((i15 * i15) * 1053163520) != 1 ? IconCompatParcelizer(objArr) : read(objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.country.config.implementation.data.network.CountryConfigResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 67;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        toLong tolong = (toLong) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = tolong.globalEntityId;
        int i5 = i2 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        toLong tolong = (toLong) objArr[0];
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 115;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = tolong.url;
        int i5 = i2 + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.endpoint;
        int i4 = i3 + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = read + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.privacyPolicyUrl;
        }
        throw null;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.registerUrl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.countryIsoCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.currency;
        int i5 = i3 + 107;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.countryCode;
        int i5 = i3 + 53;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.brand;
        }
        throw null;
    }

    public /* synthetic */ toLong(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Object obj = null;
        if (255 == (i & 255)) {
            this.brand = str;
            this.countryCode = str2;
            this.currency = str3;
            this.endpoint = str4;
            this.url = str5;
            this.countryIsoCode = str6;
            this.globalEntityId = str7;
            this.privacyPolicyUrl = str8;
            if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
                this.registerUrl = null;
                int i2 = serializer + 17;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 48 / 0;
                    return;
                }
                return;
            }
            this.registerUrl = str9;
            int i4 = serializer + 63;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 255, packXY.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CountryConfigResponse(brand=", this.brand, ", countryCode=", this.countryCode, ", currency=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.currency, ", endpoint=", this.endpoint, ", url=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.url, ", countryIsoCode=", this.countryIsoCode, ", globalEntityId=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.globalEntityId, ", privacyPolicyUrl=", this.privacyPolicyUrl, ", registerUrl=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.registerUrl, ")");
        int i4 = serializer + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.brand.hashCode() * 31, 31, this.countryCode), 31, this.currency), 31, this.endpoint), 31, this.url), 31, this.countryIsoCode), 31, this.globalEntityId), 31, this.privacyPolicyUrl);
        String str = this.registerUrl;
        if (str == null) {
            int i2 = read + 63;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 107;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof toLong)) {
                return false;
            }
            toLong tolong = (toLong) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, tolong.brand}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, tolong.countryCode}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, tolong.currency}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endpoint, tolong.endpoint}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, tolong.url}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryIsoCode, tolong.countryIsoCode}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, tolong.globalEntityId}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.privacyPolicyUrl, tolong.privacyPolicyUrl}, getCieXyz.write())).booleanValue()) {
                            int i2 = read + 67;
                            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i3 = i2 % 2;
                            return false;
                        }
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.registerUrl, tolong.registerUrl}, getCieXyz.write())).booleanValue();
                    }
                    int i4 = read + 41;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = serializer + 17;
                read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = read + 49;
            serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = serializer + 57;
        read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return true;
    }

    public final String MediaMetadataCompat() {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (String) serializer(780702862, iRemoteActionCompatParcelizer2, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, -780702861);
    }

    public final String RatingCompat() {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        return (String) serializer(-213759796, iRemoteActionCompatParcelizer2, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), new Object[]{this}, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, 213759796);
    }
}

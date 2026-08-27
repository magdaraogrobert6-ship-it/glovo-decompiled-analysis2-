package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class bExternalSyntheticLambda3 {
    private static int serializer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public bExternalSyntheticLambda3(String str, String str2) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OtpNavData(userName=REDACTED, countryPhoneCode=", this.IconCompatParcelizer, ")");
        int i4 = write + 69;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 7;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i4 = write + 57;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 93;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bExternalSyntheticLambda3)) {
            return false;
        }
        bExternalSyntheticLambda3 bexternalsyntheticlambda3 = (bExternalSyntheticLambda3) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, bexternalsyntheticlambda3.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, bexternalsyntheticlambda3.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i3 = serializer + 23;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = write + 61;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 71;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}

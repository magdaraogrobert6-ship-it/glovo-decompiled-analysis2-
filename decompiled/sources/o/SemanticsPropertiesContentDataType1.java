package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesContentDataType1 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long write;

    public SemanticsPropertiesContentDataType1(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
        this.write = j;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return m1$$ExternalSyntheticOutline0.m(this.write, "WebRefreshTokenResponse(accessToken=REDACTED, refreshToken=REDACTED, expiresIn=", ")");
        }
        m1$$ExternalSyntheticOutline0.m(this.write, "WebRefreshTokenResponse(accessToken=REDACTED, refreshToken=REDACTED, expiresIn=", ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.read);
        int i4 = IconCompatParcelizer + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 125;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SemanticsPropertiesContentDataType1) {
            SemanticsPropertiesContentDataType1 semanticsPropertiesContentDataType1 = (SemanticsPropertiesContentDataType1) obj;
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, semanticsPropertiesContentDataType1.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, semanticsPropertiesContentDataType1.read}, getCieXyz.write())).booleanValue()) {
                    return this.write == semanticsPropertiesContentDataType1.write;
                }
                int i5 = IconCompatParcelizer + 103;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = serializer + 101;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i7 % 2 != 0;
        }
        int i8 = i2 + 67;
        serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}

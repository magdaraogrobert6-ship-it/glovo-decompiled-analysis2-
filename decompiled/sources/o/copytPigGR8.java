package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class copytPigGR8 extends takeOrElseD5KLDUw {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;

    public copytPigGR8(String str) {
        str.getClass();
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            int i3 = 22 / 0;
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
        }
        int i4 = write + 63;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("QrCodeUiItem(qrCodeContent=", this.IconCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m("QrCodeUiItem(qrCodeContent=", this.IconCompatParcelizer, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (!(obj instanceof copytPigGR8)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((copytPigGR8) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = write + 1;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 103;
            write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i9 = i2 + 35;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i9 % 2 == 0;
    }
}

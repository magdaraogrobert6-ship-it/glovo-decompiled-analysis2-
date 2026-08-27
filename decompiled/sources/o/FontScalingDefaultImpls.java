package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class FontScalingDefaultImpls implements timesGh9hcWk {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final long write;

    public FontScalingDefaultImpls(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.write = j;
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read.hashCode() % af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) % 66, 81, this.RemoteActionCompatParcelizer);
        }
        return this.read.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.write) * 31, 31, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenQrCodeScanScreen(deliveryId=", ", deliveryState=", this.write, this.RemoteActionCompatParcelizer), ", taskId=", this.read, ")");
        int i4 = serializer + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof FontScalingDefaultImpls) {
            FontScalingDefaultImpls fontScalingDefaultImpls = (FontScalingDefaultImpls) obj;
            if (this.write == fontScalingDefaultImpls.write) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, fontScalingDefaultImpls.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue())) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, fontScalingDefaultImpls.read}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 75;
                    serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i2 % 2 != 0;
                }
                int i3 = serializer + 55;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            int i4 = serializer + 95;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = IconCompatParcelizer + 71;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 31;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}

package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class WrapPreviewlambda0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public WrapPreviewlambda0(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.serializer;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i3 + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("OnlyBags(bags=", this.serializer, ")");
        int i4 = read + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 1;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof WrapPreviewlambda0)) {
            return false;
        }
        Object[] objArr = {this.serializer, ((WrapPreviewlambda0) obj).serializer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read + 37;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 44 / 0;
        }
        return false;
    }
}

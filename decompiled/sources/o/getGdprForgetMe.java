package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class getGdprForgetMe {
    private static int read = 1;
    private static int serializer;
    public final Uri IconCompatParcelizer;

    public getGdprForgetMe(Uri uri) {
        this.IconCompatParcelizer = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OpenExternalUrl(url=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 67;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 39;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            int i6 = 2 / 5;
            return true;
        }
        if (obj instanceof getGdprForgetMe) {
            return this.IconCompatParcelizer.equals(((getGdprForgetMe) obj).IconCompatParcelizer);
        }
        int i7 = i3 + 117;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return false;
        }
        int i8 = 3 / 2;
        return false;
    }
}

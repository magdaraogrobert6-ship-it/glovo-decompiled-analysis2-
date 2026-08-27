package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class sendNextSdkClickI implements sendNextSdkClick {
    private static int read = 0;
    private static int write = 1;
    public final Uri serializer;

    public sendNextSdkClickI(Uri uri) {
        this.serializer = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = write + 115;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToExternalUri(uri=" + this.serializer + ")";
        int i2 = read + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof sendNextSdkClickI) && this.serializer.equals(((sendNextSdkClickI) obj).serializer);
        }
        int i5 = i3 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

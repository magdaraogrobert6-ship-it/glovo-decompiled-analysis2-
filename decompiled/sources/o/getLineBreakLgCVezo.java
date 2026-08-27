package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineBreakLgCVezo extends mergedefault {
    private static int serializer = 1;
    private static int write;
    public final Uri read;

    public final Uri IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        Uri uri = this.read;
        int i5 = i2 + 93;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return uri;
    }

    public getLineBreakLgCVezo(Uri uri) {
        this.read = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read.hashCode();
        }
        this.read.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NativeChooser(photoUri=" + this.read + ")";
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 35;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            return (obj instanceof getLineBreakLgCVezo) && this.read.equals(((getLineBreakLgCVezo) obj).read);
        }
        int i4 = i3 + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}

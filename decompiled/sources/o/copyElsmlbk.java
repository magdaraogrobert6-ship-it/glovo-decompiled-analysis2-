package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class copyElsmlbk extends mergedefault {
    private static int read = 0;
    private static int write = 1;
    public final Uri serializer;

    public final Uri read() {
        int i = 2 % 2;
        int i2 = write + 43;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        Uri uri = this.serializer;
        int i5 = i3 + 35;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return uri;
    }

    public copyElsmlbk(Uri uri) {
        this.serializer = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Camera(photoUri=" + this.serializer + ")";
        int i2 = read + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 27;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if ((obj instanceof copyElsmlbk) && this.serializer.equals(((copyElsmlbk) obj).serializer)) {
            return true;
        }
        int i4 = write + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

package o;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class addSpan extends applyPausedPrecomposition {
    private static int read = 1;
    private static int write;
    public final Uri IconCompatParcelizer;

    public addSpan(Uri uri) {
        this.IconCompatParcelizer = uri;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode();
        }
        this.IconCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Data(uri=" + this.IconCompatParcelizer + ")";
        int i2 = write + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj || ((obj instanceof addSpan) && !(!this.IconCompatParcelizer.equals(((addSpan) obj).IconCompatParcelizer)))) {
            return true;
        }
        int i4 = read + 69;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

package o;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerViewItemAnimator implements setHasStableIds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final File read;

    public RecyclerViewItemAnimator(File file) {
        this.read = file;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode();
            int i3 = 10 / 0;
        } else {
            iHashCode = this.read.hashCode();
        }
        int i4 = serializer + 57;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShareContent(file=" + this.read + ")";
        int i2 = IconCompatParcelizer + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 20 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof RecyclerViewItemAnimator) && this.read.equals(((RecyclerViewItemAnimator) obj).read);
        }
        int i5 = i3 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

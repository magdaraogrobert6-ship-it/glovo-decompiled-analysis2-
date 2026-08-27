package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setEnterSharedElementCallback extends removeStaleIds {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final int read;

    public setEnterSharedElementCallback(int i) {
        this.read = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Integer.hashCode(this.read);
        }
        int i3 = 17 / 0;
        return Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = d$$ExternalSyntheticOutline0.m(this.read, "LottieResource(lottieRes=", ")");
            int i3 = IconCompatParcelizer + 1;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        d$$ExternalSyntheticOutline0.m(this.read, "LottieResource(lottieRes=", ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 79;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
            if (this != obj) {
                if ((obj instanceof setEnterSharedElementCallback) || this.read != ((setEnterSharedElementCallback) obj).read) {
                    return false;
                }
            }
        } else if (this != obj) {
            if (obj instanceof setEnterSharedElementCallback) {
            }
            return false;
        }
        int i5 = i2 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

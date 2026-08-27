package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class logCustomEventlambda13 extends logCustomEventlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final String read;

    public logCustomEventlambda13(String str) {
        this.read = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = serializer + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("DismissOneClickStartWorkingWithError(errorMessage=", this.read, ")");
            int i3 = IconCompatParcelizer + 47;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("DismissOneClickStartWorkingWithError(errorMessage=", this.read, ")");
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
            if (this != obj) {
                if ((obj instanceof logCustomEventlambda13) || !this.read.equals(((logCustomEventlambda13) obj).read)) {
                    return false;
                }
            }
        } else if (this != obj) {
            if (obj instanceof logCustomEventlambda13) {
            }
            return false;
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}

package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDefaultSizecp {
    private static int read = 1;
    private static int write;
    public final String serializer;

    public final String write() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 21;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.serializer;
        int i4 = i2 + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public accessgetDefaultSizecp(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = write + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("WebChatErrorMetadata(reason=null, error=", this.serializer, ")");
        int i4 = read + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 75;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
            if (this != obj) {
                if ((obj instanceof accessgetDefaultSizecp) || !this.serializer.equals(((accessgetDefaultSizecp) obj).serializer)) {
                    return false;
                }
            }
        } else if (this != obj) {
            if (obj instanceof accessgetDefaultSizecp) {
            }
            return false;
        }
        int i4 = read + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return true;
    }
}

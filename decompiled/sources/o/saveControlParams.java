package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class saveControlParams extends saveThirdPartySharingResult {
    private static int read = 0;
    private static int write = 1;
    public final String serializer;

    public saveControlParams(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("Available(title=", this.serializer, ")");
        }
        int i3 = 10 / 0;
        return ff$$ExternalSyntheticOutline0.m("Available(title=", this.serializer, ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if ((obj instanceof saveControlParams) && this.serializer.equals(((saveControlParams) obj).serializer)) {
            return true;
        }
        int i4 = read + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

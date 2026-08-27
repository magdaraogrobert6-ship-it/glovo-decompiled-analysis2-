package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class emojiSupportMatchSaverlambda0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final boolean read;
    public final boolean serializer;

    public emojiSupportMatchSaverlambda0(boolean z, boolean z2) {
        this.read = z;
        this.serializer = z2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.serializer) - d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) >>> 114, 117, true);
        } else {
            iHashCode = Boolean.hashCode(this.serializer) + d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) * 31, 31, false);
        }
        int i3 = IconCompatParcelizer + 89;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 45;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof emojiSupportMatchSaverlambda0)) {
                return false;
            }
            emojiSupportMatchSaverlambda0 emojisupportmatchsaverlambda0 = (emojiSupportMatchSaverlambda0) obj;
            if (this.read != emojisupportmatchsaverlambda0.read || this.serializer != emojisupportmatchsaverlambda0.serializer) {
                return false;
            }
        }
        int i5 = i3 + 71;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EndShift(endShiftTitle=, endShiftDescription=, isEndShiftOn=" + this.read + ", isEndShiftEnabled=false, isEndShiftVisible=" + this.serializer + ")";
        int i2 = write + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return str;
    }
}

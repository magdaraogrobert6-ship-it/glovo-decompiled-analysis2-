package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class og extends ob {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final long RemoteActionCompatParcelizer;
    public final long read;

    public og(long j, long j2) {
        this.read = j;
        this.RemoteActionCompatParcelizer = j2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer) >> (Long.hashCode(this.read) / 13);
        } else {
            iHashCode = (Long.hashCode(this.read) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer);
        }
        int i3 = IconCompatParcelizer + 47;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = c8$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, ")", c8$$ExternalSyntheticOutline0.m(this.read, "Active(remainingSeconds=", ", elapsedSeconds="));
        int i4 = IconCompatParcelizer + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 35;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof og) {
            og ogVar = (og) obj;
            if (this.read != ogVar.read) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer == ogVar.RemoteActionCompatParcelizer) {
                return true;
            }
            int i3 = write + 123;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 93;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}

package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class toDebugStringlambda1 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final long RemoteActionCompatParcelizer;

    public toDebugStringlambda1(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = IconCompatParcelizer + 5;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = m1$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "Params(deliveryId=", ")");
        int i4 = write + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 93;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 47;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof toDebugStringlambda1) {
            return this.RemoteActionCompatParcelizer == ((toDebugStringlambda1) obj).RemoteActionCompatParcelizer;
        }
        int i6 = i2 + 115;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        throw null;
    }
}

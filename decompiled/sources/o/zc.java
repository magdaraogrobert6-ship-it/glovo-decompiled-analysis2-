package o;

import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class zc extends za {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final long RemoteActionCompatParcelizer;

    public zc(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Long.hashCode(this.RemoteActionCompatParcelizer);
        }
        Long.hashCode(this.RemoteActionCompatParcelizer);
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = m1$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, "Collected(value=", ")");
        int i4 = IconCompatParcelizer + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 17;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 59 / 0;
            }
            return true;
        }
        if (!(obj instanceof zc)) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == ((zc) obj).RemoteActionCompatParcelizer) {
            return true;
        }
        int i7 = i2 + 55;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}

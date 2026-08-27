package o;

/* JADX INFO: renamed from: o.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0181l extends ac {
    private static int read = 1;
    private static int serializer;
    public final Throwable RemoteActionCompatParcelizer;

    public C0181l(Throwable th) {
        this.RemoteActionCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = read + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowError(throwable=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = read + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof C0181l) && this.RemoteActionCompatParcelizer.equals(((C0181l) obj).RemoteActionCompatParcelizer);
        }
        int i5 = i3 + 101;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

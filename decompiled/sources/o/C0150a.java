package o;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0150a extends StatementParameterInterceptor {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final setApplicationContext IconCompatParcelizer;

    public C0150a(setApplicationContext setapplicationcontext) {
        this.IconCompatParcelizer = setapplicationcontext;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBar=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0150a) && this.IconCompatParcelizer.equals(((C0150a) obj).IconCompatParcelizer)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

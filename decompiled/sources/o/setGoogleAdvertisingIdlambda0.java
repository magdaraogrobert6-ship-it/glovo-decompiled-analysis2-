package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setGoogleAdvertisingIdlambda0 extends runGuardedForResultandroid_sdk_base_releasedefault {
    private static int read = 1;
    private static int serializer;
    public final Throwable IconCompatParcelizer;

    public setGoogleAdvertisingIdlambda0(Throwable th) {
        this.IconCompatParcelizer = th;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = serializer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowError(throwable=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof setGoogleAdvertisingIdlambda0) || !this.IconCompatParcelizer.equals(((setGoogleAdvertisingIdlambda0) obj).IconCompatParcelizer))) {
            return false;
        }
        int i4 = serializer + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return true;
    }
}

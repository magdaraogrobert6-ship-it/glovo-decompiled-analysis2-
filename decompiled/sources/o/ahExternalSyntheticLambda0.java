package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ahExternalSyntheticLambda0 extends bExternalSyntheticLambda0 {
    private static int read = 1;
    private static int write;
    public final registerFacebookSDKJSInterface serializer;

    public ahExternalSyntheticLambda0(registerFacebookSDKJSInterface registerfacebooksdkjsinterface) {
        this.serializer = registerfacebooksdkjsinterface;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode();
        int i4 = read + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ErrorSnackbarEntity(snackbar=" + this.serializer + ")";
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 45;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (!(obj instanceof ahExternalSyntheticLambda0) || (!this.serializer.equals(((ahExternalSyntheticLambda0) obj).serializer))) {
            return false;
        }
        return true;
    }
}

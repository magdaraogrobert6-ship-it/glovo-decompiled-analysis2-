package o;

/* JADX INFO: loaded from: classes3.dex */
public final class executeQuery0yMERmw extends AndroidPreparedStatement {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final registerFacebookSDKJSInterface write;

    public executeQuery0yMERmw(registerFacebookSDKJSInterface registerfacebooksdkjsinterface) {
        this.write = registerfacebooksdkjsinterface;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = read + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackBar(snackBarType=" + this.write + ")";
        int i2 = read + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj) {
            return (obj instanceof executeQuery0yMERmw) && this.write.equals(((executeQuery0yMERmw) obj).write);
        }
        int i5 = i3 + 27;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}

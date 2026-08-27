package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSharedElementSourceNames extends getSharedElementReturnTransition {
    private static int read = 0;
    private static int serializer = 1;
    public final getListParameter RemoteActionCompatParcelizer;

    public final getListParameter IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getListParameter getlistparameter = this.RemoteActionCompatParcelizer;
        int i4 = i3 + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getlistparameter;
    }

    public getSharedElementSourceNames(getListParameter getlistparameter) {
        this.RemoteActionCompatParcelizer = getlistparameter;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = read + 61;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SendBridgeMessage(bridgeMessage=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj && (!(obj instanceof getSharedElementSourceNames) || !this.RemoteActionCompatParcelizer.equals(((getSharedElementSourceNames) obj).RemoteActionCompatParcelizer))) {
            return false;
        }
        int i4 = serializer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}

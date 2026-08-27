package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMovecp {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final long IconCompatParcelizer;
    public final int write;

    public accessgetMovecp(int i, long j) {
        this.write = i;
        this.IconCompatParcelizer = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.IconCompatParcelizer) + (Integer.hashCode(this.write) * 31);
        int i4 = RemoteActionCompatParcelizer + 73;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 85;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (obj instanceof accessgetMovecp) {
                accessgetMovecp accessgetmovecp = (accessgetMovecp) obj;
                return this.write == accessgetmovecp.write && this.IconCompatParcelizer == accessgetmovecp.IconCompatParcelizer;
            }
            int i4 = i2 + 65;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i2 + 63;
        int i7 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i7;
        boolean z = i6 % 2 == 0;
        int i8 = i7 + 39;
        RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return z;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GetHelpCenterParamsStatus(unreadMessagesCount=" + this.write + ", lastMessageTime=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return str;
    }
}

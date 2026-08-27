package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getMinHeight {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final boolean RemoteActionCompatParcelizer;
    public final int write;

    public getMinHeight(int i, boolean z) {
        this.write = i;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 11;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode2 = Integer.hashCode(this.write);
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
            i = iHashCode2 >> 39;
        } else {
            int iHashCode3 = Integer.hashCode(this.write);
            iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i5 = i4 + 35;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        if (!(obj instanceof getMinHeight)) {
            int i6 = i2 + 73;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        getMinHeight getminheight = (getMinHeight) obj;
        if (this.write != getminheight.write) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == getminheight.RemoteActionCompatParcelizer) {
            return true;
        }
        int i8 = i4 + 85;
        IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 78 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WebChatStatus(count=" + this.write + ", isChatActive=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public final class valueOfkPa1_AA extends getAutovmbZdU8 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final boolean write;

    public valueOfkPa1_AA(boolean z) {
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Boolean.hashCode(this.write);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.write);
        int i3 = RemoteActionCompatParcelizer + 79;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return MediaSessionCompatQueueItem.serializer("Recenter(isButtonExpanded=", ")", this.write);
        }
        int i3 = 25 / 0;
        return MediaSessionCompatQueueItem.serializer("Recenter(isButtonExpanded=", ")", this.write);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof valueOfkPa1_AA)) {
            return false;
        }
        if (this.write != ((valueOfkPa1_AA) obj).write) {
            int i4 = i3 + 85;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = i3 + 41;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return true;
        }
        obj2.hashCode();
        throw null;
    }
}

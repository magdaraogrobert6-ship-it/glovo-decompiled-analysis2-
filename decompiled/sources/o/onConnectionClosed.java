package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onConnectionClosed implements getPlatformImeOptions {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String read;
    public final boolean serializer;

    public onConnectionClosed(String str, boolean z) {
        this.read = str;
        this.serializer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.serializer) - (this.read.hashCode() >>> 20);
        } else {
            iHashCode = Boolean.hashCode(this.serializer) + (this.read.hashCode() * 31);
        }
        int i3 = RemoteActionCompatParcelizer + 43;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof onConnectionClosed) {
            onConnectionClosed onconnectionclosed = (onConnectionClosed) obj;
            if (this.read.equals(onconnectionclosed.read) && this.serializer == onconnectionclosed.serializer) {
                return true;
            }
        } else {
            int i5 = i2 + 9;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 4 / 3;
            }
        }
        int i7 = RemoteActionCompatParcelizer + 21;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ShowSnackbar(message=" + this.read + ", isError=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}

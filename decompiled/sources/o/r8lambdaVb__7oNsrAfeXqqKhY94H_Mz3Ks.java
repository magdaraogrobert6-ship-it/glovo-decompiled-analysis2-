package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final boolean write;

    public r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks(boolean z) {
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write);
        int i4 = read + 7;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strSerializer = MediaSessionCompatQueueItem.serializer("GpsViewState(shouldShowGpsPopup=", ")", this.write);
            int i3 = RemoteActionCompatParcelizer + 89;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strSerializer;
        }
        MediaSessionCompatQueueItem.serializer("GpsViewState(shouldShowGpsPopup=", ")", this.write);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks) || this.write != ((r8lambdaVb__7oNsrAfeXqqKhY94H_Mz3Ks) obj).write) {
                return false;
            }
            int i2 = RemoteActionCompatParcelizer + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = read;
        int i5 = i4 + 31;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 81;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return true;
    }
}

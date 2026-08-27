package o;

/* JADX INFO: loaded from: classes3.dex */
public final class extractApplicationContext extends getDefaultInstance {
    private static int serializer = 0;
    private static int write = 1;
    public final boolean RemoteActionCompatParcelizer;

    public extractApplicationContext(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = write + 63;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strSerializer = MediaSessionCompatQueueItem.serializer("RequestActivityRecognition(isRequestedBefore=", ")", this.RemoteActionCompatParcelizer);
            int i3 = write + 29;
            serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strSerializer;
        }
        MediaSessionCompatQueueItem.serializer("RequestActivityRecognition(isRequestedBefore=", ")", this.RemoteActionCompatParcelizer);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 123;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this != obj) {
            if (obj instanceof extractApplicationContext) {
                return this.RemoteActionCompatParcelizer == ((extractApplicationContext) obj).RemoteActionCompatParcelizer;
            }
            int i5 = i2 + 99;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 61;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}

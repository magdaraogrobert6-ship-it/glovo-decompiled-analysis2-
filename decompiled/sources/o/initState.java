package o;

/* JADX INFO: loaded from: classes3.dex */
public final class initState extends hasOptionsMenu {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final boolean write;

    public initState(boolean z) {
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.write);
        }
        Boolean.hashCode(this.write);
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("ReportFullyDrawn(availabilityStatus=", ")", this.write);
        int i4 = read + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this != obj && (!(obj instanceof initState) || this.write != ((initState) obj).write)) {
            return false;
        }
        int i5 = i3 + 79;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return true;
    }
}

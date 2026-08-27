package o;

/* JADX INFO: loaded from: classes3.dex */
public final class useSideChannelForNotification extends pushSideChannelQueue {
    private static int read = 1;
    private static int serializer;
    public final generatePOSTBodyString write;

    public useSideChannelForNotification(generatePOSTBodyString generatepostbodystring) {
        this.write = generatepostbodystring;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = serializer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Available(entity=" + this.write + ")";
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof useSideChannelForNotification) {
                if (!this.write.equals(((useSideChannelForNotification) obj).write)) {
                    return false;
                }
            } else {
                int i2 = read + 61;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
        }
        int i4 = read + 93;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }
}

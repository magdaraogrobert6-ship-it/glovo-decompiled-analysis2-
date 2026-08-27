package o;

/* JADX INFO: loaded from: classes3.dex */
public final class putExtraData implements getExtraData {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public final String IconCompatParcelizer;
    public final String write;

    public putExtraData(String str, String str2) {
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    static {
        new putExtraData("Not available", "Switch to schedule tab");
        new putExtraData("No sessions here", "Try switching to other zones");
        new putExtraData("Other zone opportunities", "For the next 30 minutes");
        int i = RemoteActionCompatParcelizer + 51;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Available(title=", this.write, ", description=", this.IconCompatParcelizer, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Available(title=", this.write, ", description=", this.IconCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = MediaMetadataCompat + 35;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof putExtraData)) {
                return false;
            }
            putExtraData putextradata = (putExtraData) obj;
            if (this.write.equals(putextradata.write)) {
                if (!this.IconCompatParcelizer.equals(putextradata.IconCompatParcelizer)) {
                    return false;
                }
            } else {
                int i4 = serializer + 87;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }
}

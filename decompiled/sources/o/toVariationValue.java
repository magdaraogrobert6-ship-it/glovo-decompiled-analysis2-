package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toVariationValue implements resizeToBitmapDimensionslambda0 {
    public static final toVariationValue IconCompatParcelizer = new toVariationValue(null, false);
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final boolean read;
    public final String write;

    public toVariationValue(String str, boolean z) {
        this.write = str;
        this.read = z;
    }

    static {
        int i = serializer + 81;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.write;
        if (str == null) {
            int i2 = MediaSessionCompatQueueItem;
            int i3 = i2 + 53;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return Boolean.hashCode(this.read) + (iHashCode * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toVariationValue)) {
            return false;
        }
        toVariationValue tovariationvalue = (toVariationValue) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, tovariationvalue.write}, getCieXyz.write())).booleanValue()) {
            if (this.read == tovariationvalue.read) {
                return true;
            }
            int i2 = RatingCompat + 37;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ChatViewState(unreadCount=" + this.write + ", isChatEnabled=" + this.read + ")";
        int i2 = RatingCompat + 45;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}

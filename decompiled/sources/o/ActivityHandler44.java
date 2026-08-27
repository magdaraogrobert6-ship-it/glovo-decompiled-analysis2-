package o;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler44 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return "ApplicantArgument(REDACTED)";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ActivityHandler44(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode() << (this.serializer.hashCode() / 114);
        } else {
            iHashCode = (this.serializer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = read + 55;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityHandler44)) {
            return false;
        }
        ActivityHandler44 activityHandler44 = (ActivityHandler44) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, activityHandler44.serializer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, activityHandler44.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i2 = IconCompatParcelizer + 115;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = IconCompatParcelizer + 67;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i4 = IconCompatParcelizer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}

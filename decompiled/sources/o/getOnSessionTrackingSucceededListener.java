package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getOnSessionTrackingSucceededListener {
    private static int RatingCompat = 1;
    private static int read;
    public final getPreinstallFilePath IconCompatParcelizer;
    public final getPreinstallFilePath RemoteActionCompatParcelizer;
    public final getPreinstallFilePath serializer;
    public final getPreinstallFilePath write;

    public getOnSessionTrackingSucceededListener(getPreinstallFilePath getpreinstallfilepath, getPreinstallFilePath getpreinstallfilepath2, getPreinstallFilePath getpreinstallfilepath3, getPreinstallFilePath getpreinstallfilepath4) {
        this.write = getpreinstallfilepath;
        this.RemoteActionCompatParcelizer = getpreinstallfilepath2;
        this.IconCompatParcelizer = getpreinstallfilepath3;
        this.serializer = getpreinstallfilepath4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = RatingCompat + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Scores(overall=" + this.write + ", speed=" + this.RemoteActionCompatParcelizer + ", braking=" + this.IconCompatParcelizer + ", attention=" + this.serializer + ")";
        int i2 = RatingCompat + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 45;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof getOnSessionTrackingSucceededListener)) {
                return false;
            }
            getOnSessionTrackingSucceededListener getonsessiontrackingsucceededlistener = (getOnSessionTrackingSucceededListener) obj;
            if (!this.write.equals(getonsessiontrackingsucceededlistener.write) || !this.RemoteActionCompatParcelizer.equals(getonsessiontrackingsucceededlistener.RemoteActionCompatParcelizer) || !this.IconCompatParcelizer.equals(getonsessiontrackingsucceededlistener.IconCompatParcelizer) || (!this.serializer.equals(getonsessiontrackingsucceededlistener.serializer))) {
                return false;
            }
        }
        int i4 = RatingCompat + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}

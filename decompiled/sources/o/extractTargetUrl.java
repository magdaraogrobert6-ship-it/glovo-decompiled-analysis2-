package o;

/* JADX INFO: loaded from: classes3.dex */
public final class extractTargetUrl {
    private static int read = 0;
    private static int serializer = 1;
    public final String RemoteActionCompatParcelizer;
    public final float write;

    public extractTargetUrl(String str, float f) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = f;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 45;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Float.hashCode(this.write) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = read + 113;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SliderCountdownState(secondsLeft=" + this.RemoteActionCompatParcelizer + ", countdownProgress=" + this.write + ")";
        int i2 = read + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 7;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(obj instanceof extractTargetUrl)) {
            return false;
        }
        extractTargetUrl extracttargeturl = (extractTargetUrl) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, extracttargeturl.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (Float.compare(this.write, extracttargeturl.write) == 0) {
            return true;
        }
        int i3 = serializer + 1;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return false;
    }
}

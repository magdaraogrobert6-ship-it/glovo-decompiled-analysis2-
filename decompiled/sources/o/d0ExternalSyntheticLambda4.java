package o;

/* JADX INFO: loaded from: classes3.dex */
public final class d0ExternalSyntheticLambda4 extends d0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 79;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = i2 + 117;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return "NavigateToCheckEmailScreen(email=REDACTED)";
    }

    public d0ExternalSyntheticLambda4(String str) {
        str.getClass();
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        int i3 = 61 / 0;
        return this.serializer.hashCode();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 119;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (obj instanceof d0ExternalSyntheticLambda4) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((d0ExternalSyntheticLambda4) obj).serializer}, getCieXyz.write())).booleanValue();
        }
        int i3 = RemoteActionCompatParcelizer + 91;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}

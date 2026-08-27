package o;

/* JADX INFO: loaded from: classes3.dex */
public final class MathUtilsKt implements getUriPjHm6EE {
    private static int serializer = 1;
    private static int write;
    public final boolean RemoteActionCompatParcelizer;
    public final copyYTHSh70default read;

    @Override // o.getUriPjHm6EE
    public final copyYTHSh70default IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.read;
        }
        int i3 = 24 / 0;
        return this.read;
    }

    public MathUtilsKt(copyYTHSh70default copyythsh70default, boolean z) {
        copyythsh70default.getClass();
        this.read = copyythsh70default;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.read.hashCode() * 31);
        int i4 = write + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 21 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof MathUtilsKt) {
            MathUtilsKt mathUtilsKt = (MathUtilsKt) obj;
            Object[] objArr = {this.read, mathUtilsKt.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = serializer + 53;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else if (this.RemoteActionCompatParcelizer == mathUtilsKt.RemoteActionCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FromUploadCompletion(state=" + this.read + ", isSuccess=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}

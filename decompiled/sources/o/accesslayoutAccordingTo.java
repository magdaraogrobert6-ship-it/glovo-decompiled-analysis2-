package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesslayoutAccordingTo {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final Throwable read;
    public final Object serializer;

    public accesslayoutAccordingTo(Object obj, Throwable th) {
        this.serializer = obj;
        this.read = th;
    }

    public final int hashCode() {
        Object obj;
        int iHashCode;
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0 ? (obj = this.serializer) != null : (obj = this.serializer) != null) {
            iHashCode = obj.hashCode();
        } else {
            int i4 = i3 + 73;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        Throwable th = this.read;
        int iHashCode2 = (iHashCode * 31) + (th != null ? th.hashCode() : 0);
        int i6 = write + 113;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RecoverableResult(data=" + this.serializer + ", error=" + this.read + ")";
        int i2 = write + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof accesslayoutAccordingTo) {
                accesslayoutAccordingTo accesslayoutaccordingto = (accesslayoutAccordingTo) obj;
                Object[] objArr = {this.serializer, accesslayoutaccordingto.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr2 = {this.read, accesslayoutaccordingto.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    int i2 = write + 17;
                    IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                int i4 = write + 21;
                int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                IconCompatParcelizer = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 121;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = IconCompatParcelizer + 49;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = write + 107;
        IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return true;
    }
}

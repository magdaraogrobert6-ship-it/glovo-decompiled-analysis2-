package o;

/* JADX INFO: loaded from: classes3.dex */
public final class isFbIdReadingEnabled {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final String write;

    public isFbIdReadingEnabled(boolean z, String str) {
        this.serializer = z;
        this.write = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iHashCode = Boolean.hashCode(this.serializer);
            str = this.write;
            int i3 = 92 / 0;
            if (str == null) {
                int i4 = RemoteActionCompatParcelizer + 49;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = Boolean.hashCode(this.serializer);
            str = this.write;
            if (str == null) {
                int i6 = RemoteActionCompatParcelizer + 49;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        int i8 = (iHashCode * 31) + iHashCode2;
        int i9 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return i8;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof isFbIdReadingEnabled) {
            isFbIdReadingEnabled isfbidreadingenabled = (isFbIdReadingEnabled) obj;
            if (this.serializer == isfbidreadingenabled.serializer) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, isfbidreadingenabled.write}, getCieXyz.write())).booleanValue();
            }
            int i2 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "WelcomeMessageState(isVisible=" + this.serializer + ", emoji=" + this.write + ")";
        int i2 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

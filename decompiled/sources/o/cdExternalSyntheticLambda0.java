package o;

/* JADX INFO: loaded from: classes3.dex */
public final class cdExternalSyntheticLambda0 implements resizeToBitmapDimensionslambda0 {
    private static int serializer = 0;
    private static int write = 1;
    public final ca IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;

    public cdExternalSyntheticLambda0(String str, ca caVar) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = caVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[PHI: r1 r3
  0x0033: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v5 o.ca) = (r3v0 o.ca), (r3v6 o.ca) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1
  0x0026: PHI (r1v6 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0024, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        ca caVar;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 75;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            caVar = this.IconCompatParcelizer;
            int i4 = 2 / 0;
            if (caVar == null) {
                i = serializer + 107;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = caVar.hashCode();
            }
        } else {
            iHashCode = this.RemoteActionCompatParcelizer.hashCode();
            caVar = this.IconCompatParcelizer;
            if (caVar == null) {
                i = serializer + 107;
                write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = caVar.hashCode();
            }
        }
        int i5 = (iHashCode * 31) + iHashCode2;
        int i6 = serializer + 25;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RouterViewState(versionName=" + this.RemoteActionCompatParcelizer + ", dialog=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cdExternalSyntheticLambda0) {
            cdExternalSyntheticLambda0 cdexternalsyntheticlambda0 = (cdExternalSyntheticLambda0) obj;
            if (this.RemoteActionCompatParcelizer.equals(cdexternalsyntheticlambda0.RemoteActionCompatParcelizer)) {
                Object[] objArr = {this.IconCompatParcelizer, cdexternalsyntheticlambda0.IconCompatParcelizer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        int i4 = write + 21;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }
}

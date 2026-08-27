package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getLineThroughannotations {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final ImeAction RemoteActionCompatParcelizer;
    public final getSpanVerticalAligndo9XGgannotations read;
    public final String write;

    public getLineThroughannotations(String str, getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations, ImeAction imeAction) {
        str.getClass();
        this.write = str;
        this.read = getspanverticalaligndo9xggannotations;
        this.RemoteActionCompatParcelizer = imeAction;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r1 r3
  0x0028: PHI (r1v10 int) = (r1v5 int), (r1v12 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v1 o.getSpanVerticalAligndo9XGgannotations) = (r3v0 o.getSpanVerticalAligndo9XGgannotations), (r3v5 o.getSpanVerticalAligndo9XGgannotations) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public final int hashCode() {
        int iHashCode;
        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 1;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i3 % 2 != 0) {
            iHashCode = this.write.hashCode();
            getspanverticalaligndo9xggannotations = this.read;
            int i4 = 68 / 0;
            if (getspanverticalaligndo9xggannotations != null) {
                iHashCode2 = getspanverticalaligndo9xggannotations.hashCode();
                i = IconCompatParcelizer + 77;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i5 = 2 % 4;
                }
            }
        } else {
            iHashCode = this.write.hashCode();
            getspanverticalaligndo9xggannotations = this.read;
            if (getspanverticalaligndo9xggannotations != null) {
                iHashCode2 = getspanverticalaligndo9xggannotations.hashCode();
                i = IconCompatParcelizer + 77;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i6 = 2 % 4;
                }
            }
        }
        return this.RemoteActionCompatParcelizer.hashCode() + (((iHashCode * 31) + iHashCode2) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Destination(name=" + this.write + ", phoneNumber=REDACTED, primaryAddress=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof getLineThroughannotations) {
            getLineThroughannotations getlinethroughannotations = (getLineThroughannotations) obj;
            Object[] objArr = {this.write, getlinethroughannotations.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.read, getlinethroughannotations.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    i = serializer + 91;
                    IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                } else if (this.RemoteActionCompatParcelizer.equals(getlinethroughannotations.RemoteActionCompatParcelizer)) {
                    return true;
                }
            } else {
                i = IconCompatParcelizer + 49;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i3 = i % 2;
        }
        int i4 = IconCompatParcelizer + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

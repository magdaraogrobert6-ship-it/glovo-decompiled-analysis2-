package o;

/* JADX INFO: loaded from: classes.dex */
public final class sweepGradientUv8p0NA {
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final boolean RemoteActionCompatParcelizer() {
        int i;
        int i2;
        int i3;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = 4;
        if ((i4 & 7) != 0) {
            int i6 = this.serializer;
            int i7 = this.read;
            if (i6 > i7) {
                i3 = 1;
            } else {
                i3 = i6 == i7 ? 2 : 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.serializer;
            int i9 = this.IconCompatParcelizer;
            if (i8 > i9) {
                i2 = 1;
            } else {
                i2 = i8 == i9 ? 2 : 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.write;
            int i11 = this.read;
            if (i10 > i11) {
                i = 1;
            } else {
                i = i10 == i11 ? 2 : 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.write;
            int i13 = this.IconCompatParcelizer;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 == i13) {
                i5 = 2;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

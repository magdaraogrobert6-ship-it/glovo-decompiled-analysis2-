package o;

/* JADX INFO: loaded from: classes.dex */
public final class onDensityChange {
    public int IconCompatParcelizer;
    public long[] RemoteActionCompatParcelizer;
    public int[] read;
    public int serializer;
    public int[] write;

    public final void read(int i, int i2) {
        long[] jArr = this.RemoteActionCompatParcelizer;
        int[] iArr = this.read;
        int[] iArr2 = this.write;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public final int read(long j) {
        int i = this.IconCompatParcelizer;
        long[] jArr = this.RemoteActionCompatParcelizer;
        int length = jArr.length;
        if (i + 1 > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            onContentCardClicked.IconCompatParcelizer(jArr, jArr2, 0, 0, jArr.length);
            onContentCardClicked.read(this.read, 0, iArr, 0, 14);
            this.RemoteActionCompatParcelizer = jArr2;
            this.read = iArr;
        }
        int i3 = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i3 + 1;
        int length2 = this.write.length;
        if (this.serializer >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            onContentCardClicked.read(this.write, 0, iArr2, 0, 14);
            this.write = iArr2;
        }
        int i7 = this.serializer;
        int[] iArr3 = this.write;
        this.serializer = iArr3[i7];
        long[] jArr3 = this.RemoteActionCompatParcelizer;
        jArr3[i3] = j;
        this.read[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (removeNodeAtDepth.read(jArr3[i8], j) <= 0) {
                break;
            }
            read(i8, i3);
            i3 = i8;
        }
        return i7;
    }
}

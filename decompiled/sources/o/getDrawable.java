package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getDrawable {
    public static final int[] RemoteActionCompatParcelizer;
    public byte[] serializer = new byte[32];
    public int write;

    public final void IconCompatParcelizer(int i) {
        write(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.serializer;
            int i3 = this.write;
            this.write = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    public final void write(int i, long j) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.serializer;
            int i3 = this.write;
            if (i2 >= i) {
                bArr[i3 + i] = (byte) j;
                this.write = i + 1 + i3;
                return;
            } else {
                bArr[i3 + i2] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i2++;
            }
        }
    }

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        RemoteActionCompatParcelizer = iArr;
    }

    public final byte[] serializer() {
        int i = this.write;
        byte[] bArr = new byte[i];
        onContentCardClicked.IconCompatParcelizer(this.serializer, 0, bArr, i, 2);
        return bArr;
    }

    public final void write(long j) {
        write(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.serializer;
            int i2 = this.write;
            this.write = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }

    public final void write(int i) {
        int i2 = this.write + i;
        if (i2 <= this.serializer.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        onContentCardClicked.IconCompatParcelizer(this.serializer, 0, bArr, 0, 14);
        this.serializer = bArr;
    }
}

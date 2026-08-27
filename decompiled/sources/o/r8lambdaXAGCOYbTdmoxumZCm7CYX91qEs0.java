package o;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0 {
    public static final long[] write = new long[0];
    public final long[] IconCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA read;
    public long serializer;

    public final int IconCompatParcelizer() {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int iNumberOfTrailingZeros;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.read;
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        do {
            long j = this.serializer;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
            if (j == -1) {
                if (iIconCompatParcelizer <= 64) {
                    return -1;
                }
                long[] jArr = this.IconCompatParcelizer;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i3 = iNumberOfTrailingZeros2 + (i2 * 64);
                        if (((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(r8lambda92m0p9sit5uf70mvjf4rwmruda, Integer.valueOf(i3))).booleanValue()) {
                            jArr[i] = j2;
                            return i3;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.serializer |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(r8lambda92m0p9sit5uf70mvjf4rwmruda, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.read = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        if (iIconCompatParcelizer <= 64) {
            this.serializer = iIconCompatParcelizer != 64 ? (-1) << iIconCompatParcelizer : 0L;
            this.IconCompatParcelizer = write;
            return;
        }
        this.serializer = 0L;
        int i = (iIconCompatParcelizer - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iIconCompatParcelizer & 63) != 0) {
            jArr[i - 1] = (-1) << iIconCompatParcelizer;
        }
        this.IconCompatParcelizer = jArr;
    }

    public final void write(int i) {
        if (i < 64) {
            this.serializer = (1 << i) | this.serializer;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.IconCompatParcelizer;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }
}

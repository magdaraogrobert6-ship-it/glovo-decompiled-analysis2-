package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelableVolumeInfo implements Serializable {
    public static final AtomicLong read = new AtomicLong(System.nanoTime());
    public long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            long j = (this.IconCompatParcelizer * 6364136223846793005L) + this.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = j;
            bArr[i] = (byte) (((j ^ (j >>> 22)) >>> ((int) ((j >>> 61) + 22))) >>> 24);
        }
    }

    public static long serializer() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = read;
            j = atomicLong.get();
            long j3 = (j >> 12) ^ j;
            long j4 = j3 ^ (j3 << 25);
            j2 = (j4 ^ (j4 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2;
    }

    public ParcelableVolumeInfo() {
        long jSerializer = serializer();
        long jSerializer2 = (serializer() << 1) | 1;
        this.RemoteActionCompatParcelizer = jSerializer2;
        this.IconCompatParcelizer = jSerializer2 + jSerializer;
    }

    public final double IconCompatParcelizer() {
        long j = this.IconCompatParcelizer;
        long j2 = this.RemoteActionCompatParcelizer;
        long j3 = (j * 6364136223846793005L) + j2;
        long j4 = (6364136223846793005L * j3) + j2;
        this.IconCompatParcelizer = j4;
        return ((((((j3 ^ (j3 >>> 22)) >>> ((int) ((j3 >>> 61) + 22))) & 4294967295L) >>> 6) << 27) + (((((j4 >>> 22) ^ j4) >>> ((int) ((j4 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}

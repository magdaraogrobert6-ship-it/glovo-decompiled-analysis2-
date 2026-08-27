package com.deliveryhero.fwf_evaluator.util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Hasher {
    private final byte[] chunk;
    private final int chunkSize;
    private final int digestSize;
    private long totalWritten;
    private int writtenInChunk;

    public abstract void coreDigest(byte[] bArr);

    public abstract byte[] corePadding(long j);

    public abstract void coreReset();

    public abstract void coreUpdate(byte[] bArr);

    public final int getChunkSize() {
        return this.chunkSize;
    }

    public final int getDigestSize() {
        return this.digestSize;
    }

    public final Hash digest() {
        byte[] bArr = new byte[this.digestSize];
        digestOut(bArr);
        return new Hash(bArr);
    }

    public Hasher(int i, int i2) {
        this.chunkSize = i;
        this.digestSize = i2;
        this.chunk = new byte[i];
    }

    public final void digestOut(byte[] bArr) {
        bArr.getClass();
        byte[] bArrCorePadding = corePadding(this.totalWritten);
        int i = 0;
        while (i < bArrCorePadding.length) {
            int i2 = this.chunkSize;
            int i3 = this.writtenInChunk;
            int i4 = i2 - i3;
            CommonHashKt.arraycopy(bArrCorePadding, i, this.chunk, i3, i4);
            coreUpdate(this.chunk);
            this.writtenInChunk = 0;
            i += i4;
        }
        coreDigest(bArr);
        coreReset();
    }

    public final Hasher reset() {
        coreReset();
        this.writtenInChunk = 0;
        this.totalWritten = 0L;
        return this;
    }

    public final Hasher update(byte[] bArr, int i, int i2) {
        bArr.getClass();
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(this.chunkSize - this.writtenInChunk, i3);
            CommonHashKt.arraycopy(bArr, i, this.chunk, this.writtenInChunk, iMin);
            i3 -= iMin;
            i += iMin;
            int i4 = this.writtenInChunk + iMin;
            this.writtenInChunk = i4;
            int i5 = this.chunkSize;
            if (i4 >= i5) {
                this.writtenInChunk = i4 - i5;
                coreUpdate(this.chunk);
            }
        }
        this.totalWritten += (long) i2;
        return this;
    }

    public final Hasher update(byte[] bArr) {
        bArr.getClass();
        return update(bArr, 0, bArr.length);
    }
}

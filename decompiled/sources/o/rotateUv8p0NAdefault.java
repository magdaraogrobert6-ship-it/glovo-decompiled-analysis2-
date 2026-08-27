package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class rotateUv8p0NAdefault extends FilterInputStream {
    public final long RemoteActionCompatParcelizer;
    public int read;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int iMax;
        synchronized (this) {
            iMax = (int) Math.max(this.RemoteActionCompatParcelizer - ((long) this.read), ((FilterInputStream) this).in.available());
        }
        return iMax;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        synchronized (this) {
            i = super.read();
            RemoteActionCompatParcelizer(i >= 0 ? 1 : -1);
        }
        return i;
    }

    public rotateUv8p0NAdefault(InputStream inputStream, long j) {
        super(inputStream);
        this.RemoteActionCompatParcelizer = j;
    }

    public final void RemoteActionCompatParcelizer(int i) throws IOException {
        int i2 = this.read;
        if (i >= 0) {
            this.read = i2 + i;
            return;
        }
        long j = this.RemoteActionCompatParcelizer;
        if (j - ((long) i2) <= 0) {
            return;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Failed to read all expected data, expected: ", ", but read: ");
        sbM.append(this.read);
        throw new IOException(sbM.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this) {
            i3 = super.read(bArr, i, i2);
            RemoteActionCompatParcelizer(i3);
        }
        return i3;
    }
}

package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class getTransferParameters extends FilterInputStream {
    public final byte serializer;
    public int write;
    public static final byte[] RemoteActionCompatParcelizer = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int IconCompatParcelizer = 31;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.write;
        int i5 = IconCompatParcelizer;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.serializer;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(RemoteActionCompatParcelizer, this.write - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.write += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.write = (int) (((long) this.write) + jSkip);
        }
        return jSkip;
    }

    public getTransferParameters(int i, InputStream inputStream) {
        super(inputStream);
        if (i < -1 || i > 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Cannot add invalid orientation: "));
            throw null;
        }
        this.serializer = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.write;
        if (i3 < 2 || i3 > (i2 = IconCompatParcelizer)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.serializer;
        } else {
            i = RemoteActionCompatParcelizer[i3 - 2] & 255;
        }
        if (i != -1) {
            this.write++;
        }
        return i;
    }
}

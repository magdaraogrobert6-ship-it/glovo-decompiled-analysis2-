package org.tukaani.xz;

import java.io.IOException;
import java.io.InputStream;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class DeltaInputStream extends InputStream {
    public final DeltaDecoder RemoteActionCompatParcelizer;
    public InputStream write;
    public IOException IconCompatParcelizer = null;
    public final byte[] serializer = new byte[1];

    public DeltaInputStream(int i, InputStream inputStream) {
        inputStream.getClass();
        this.write = inputStream;
        this.RemoteActionCompatParcelizer = new DeltaDecoder(i);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        InputStream inputStream = this.write;
        if (inputStream == null) {
            throw new XZIOException("Stream closed");
        }
        IOException iOException = this.IconCompatParcelizer;
        if (iOException == null) {
            return inputStream.available();
        }
        throw iOException;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.write;
        if (inputStream != null) {
            IOException iOException = this.IconCompatParcelizer;
            if (iOException == null) {
                try {
                    int i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        return -1;
                    }
                    DeltaDecoder deltaDecoder = this.RemoteActionCompatParcelizer;
                    byte[] bArr2 = (byte[]) deltaDecoder.serializer;
                    int i4 = deltaDecoder.write;
                    int iMin = Math.min(i3, i4);
                    int i5 = 0;
                    while (i5 < iMin) {
                        int i6 = i + i5;
                        bArr[i6] = (byte) (bArr[i6] + bArr2[i5]);
                        i5++;
                    }
                    while (i5 < i3) {
                        int i7 = i + i5;
                        bArr[i7] = (byte) (bArr[i7] + bArr[i7 - i4]);
                        i5++;
                    }
                    if (i3 >= i4) {
                        System.arraycopy(bArr, (i + i3) - i4, bArr2, 0, i4);
                        return i3;
                    }
                    int i8 = i4 - i5;
                    System.arraycopy(bArr2, i5, bArr2, 0, i8);
                    System.arraycopy(bArr, i, bArr2, i8, i3);
                    return i3;
                } catch (IOException e) {
                    this.IconCompatParcelizer = e;
                    throw e;
                }
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.write;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.write = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.serializer;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}

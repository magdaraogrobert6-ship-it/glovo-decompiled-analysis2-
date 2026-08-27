package o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class getOetf extends OutputStream {
    public final OutputStream IconCompatParcelizer;
    public byte[] RemoteActionCompatParcelizer;
    public final getF read;
    public int serializer;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.IconCompatParcelizer;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.RemoteActionCompatParcelizer;
            if (bArr != null) {
                this.read.IconCompatParcelizer(bArr);
                this.RemoteActionCompatParcelizer = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.serializer;
        OutputStream outputStream = this.IconCompatParcelizer;
        if (i > 0) {
            outputStream.write(this.RemoteActionCompatParcelizer, 0, i);
            this.serializer = 0;
        }
        outputStream.flush();
    }

    public getOetf(FileOutputStream fileOutputStream, getF getf) {
        this.IconCompatParcelizer = fileOutputStream;
        this.read = getf;
        this.RemoteActionCompatParcelizer = (byte[]) getf.IconCompatParcelizer(byte[].class, 65536);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.serializer;
            OutputStream outputStream = this.IconCompatParcelizer;
            if (i6 == 0 && i4 >= this.RemoteActionCompatParcelizer.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.RemoteActionCompatParcelizer.length - i6);
            System.arraycopy(bArr, i5, this.RemoteActionCompatParcelizer, this.serializer, iMin);
            int i7 = this.serializer + iMin;
            this.serializer = i7;
            i3 += iMin;
            byte[] bArr2 = this.RemoteActionCompatParcelizer;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.serializer = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.RemoteActionCompatParcelizer;
        int i2 = this.serializer;
        int i3 = i2 + 1;
        this.serializer = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.IconCompatParcelizer.write(bArr, 0, i3);
        this.serializer = 0;
    }
}

package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class handleUrlOverridelambda0 extends InputStream implements requestPushPermissionPromptlambda0 {
    public getCacheFileSuffixlambda1 read;

    @Override // java.io.InputStream
    public final int available() {
        return this.read.write();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.read.read();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = this.read;
        if (getcachefilesuffixlambda1.write() == 0) {
            return -1;
        }
        int iMin = Math.min(getcachefilesuffixlambda1.write(), i2);
        getcachefilesuffixlambda1.read(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.read.serializer();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = this.read;
        int iMin = (int) Math.min(getcachefilesuffixlambda1.write(), j);
        getcachefilesuffixlambda1.write(iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        getCacheFileSuffixlambda1 getcachefilesuffixlambda1 = this.read;
        if (getcachefilesuffixlambda1.write() == 0) {
            return -1;
        }
        return getcachefilesuffixlambda1.IconCompatParcelizer();
    }
}

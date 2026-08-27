package o;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class padChain extends OutputStream {
    public long RemoteActionCompatParcelizer;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.RemoteActionCompatParcelizer += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.RemoteActionCompatParcelizer += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.RemoteActionCompatParcelizer++;
    }
}

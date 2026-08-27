package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getChannelID extends FilterInputStream {
    public getChannelID(FwFClientDB fwFClientDB, BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        return ((FilterInputStream) this).in.read();
    }
}

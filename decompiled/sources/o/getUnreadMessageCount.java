package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getUnreadMessageCount extends CheckedInputStream {
    public final long read;
    public long serializer;

    public getUnreadMessageCount(InputStream inputStream, long j, long j2) {
        super(inputStream, new CRC32());
        this.read = j2;
        this.serializer = j;
    }

    public final void IconCompatParcelizer() throws IOException {
        if (this.serializer <= 0) {
            if (this.read == getChecksum().getValue()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Checksum verification failed");
        }
    }

    @Override // java.util.zip.CheckedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.serializer <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.serializer--;
        }
        IconCompatParcelizer();
        return i;
    }

    @Override // java.util.zip.CheckedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = super.read(bArr, i, i2);
        if (i3 >= 0) {
            this.serializer -= (long) i3;
        }
        IconCompatParcelizer();
        return i3;
    }
}

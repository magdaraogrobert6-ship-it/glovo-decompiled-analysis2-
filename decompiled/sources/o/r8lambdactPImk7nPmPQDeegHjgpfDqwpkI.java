package o;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdactPImk7nPmPQDeegHjgpfDqwpkI extends r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 {
    private final InputStream read;

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final void write() throws IOException {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.read.read(bArr, i, i2);
    }

    public r8lambdactPImk7nPmPQDeegHjgpfDqwpkI(InputStream inputStream) {
        this.read = inputStream;
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    @SuppressLint
    public final void write(byte[] bArr, int i) throws IOException {
        throw new UnsupportedOperationException("InputStreamTransport can only be read from, not written to.");
    }
}

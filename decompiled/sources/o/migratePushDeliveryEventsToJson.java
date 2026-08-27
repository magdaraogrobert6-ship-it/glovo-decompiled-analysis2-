package o;

import android.annotation.SuppressLint;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class migratePushDeliveryEventsToJson extends r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4 {
    private final OutputStream RemoteActionCompatParcelizer;

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final void write(byte[] bArr, int i) throws IOException {
        this.RemoteActionCompatParcelizer.write(bArr, 0, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    public final void write() throws IOException {
        this.RemoteActionCompatParcelizer.flush();
    }

    public migratePushDeliveryEventsToJson(OutputStream outputStream) {
        this.RemoteActionCompatParcelizer = outputStream;
    }

    @Override // o.r8lambdafix1o_Kc7cAFkSaZjXDbyayn9j4
    @SuppressLint
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        throw new UnsupportedOperationException("OutputStreamTransport can only be written to, not read from.");
    }
}

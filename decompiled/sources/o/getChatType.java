package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class getChatType implements Closeable {
    public static final long[] serializer = new long[64];
    public long IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final ByteOrder read;
    public final HttpAuthInterceptor write;

    static {
        for (int i = 1; i <= 63; i++) {
            long[] jArr = serializer;
            jArr[i] = (jArr[i - 1] << 1) + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.write.close();
    }

    public final long read(int i) {
        long j;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        long j2 = this.IconCompatParcelizer;
        long[] jArr = serializer;
        if (this.read == byteOrder) {
            j = jArr[i] & j2;
            this.IconCompatParcelizer = j2 >>> i;
        } else {
            j = jArr[i] & (j2 >> (this.RemoteActionCompatParcelizer - i));
        }
        this.RemoteActionCompatParcelizer -= i;
        return j;
    }

    public getChatType(InputStream inputStream, ByteOrder byteOrder) {
        this.write = new HttpAuthInterceptor(0, inputStream);
        this.read = byteOrder;
    }

    public final long IconCompatParcelizer(int i) throws IOException {
        int i2;
        ByteOrder byteOrder;
        HttpAuthInterceptor httpAuthInterceptor;
        long j;
        if (i < 0 || i > 63) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("count must not be negative or greater than 63");
            return 0L;
        }
        while (true) {
            i2 = this.RemoteActionCompatParcelizer;
            byteOrder = this.read;
            httpAuthInterceptor = this.write;
            if (i2 >= i || i2 >= 57) {
                break;
            }
            long j2 = httpAuthInterceptor.read();
            if (j2 < 0) {
                return -1L;
            }
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            long j3 = this.IconCompatParcelizer;
            if (byteOrder == byteOrder2) {
                this.IconCompatParcelizer = (j2 << this.RemoteActionCompatParcelizer) | j3;
            } else {
                this.IconCompatParcelizer = (j3 << 8) | j2;
            }
            this.RemoteActionCompatParcelizer += 8;
        }
        if (i2 < i) {
            int i3 = i - i2;
            int i4 = 8 - i3;
            long j4 = httpAuthInterceptor.read();
            if (j4 < 0) {
                return j4;
            }
            ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
            long[] jArr = serializer;
            if (byteOrder == byteOrder3) {
                this.IconCompatParcelizer = ((jArr[i3] & j4) << this.RemoteActionCompatParcelizer) | this.IconCompatParcelizer;
                j = (j4 >>> i3) & jArr[i4];
            } else {
                this.IconCompatParcelizer = (this.IconCompatParcelizer << i3) | (jArr[i3] & (j4 >>> i4));
                j = jArr[i4] & j4;
            }
            long j5 = this.IconCompatParcelizer;
            long j6 = jArr[i];
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = i4;
            return j6 & j5;
        }
        return read(i);
    }
}

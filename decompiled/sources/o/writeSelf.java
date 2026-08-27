package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class writeSelf extends getcachedSerializer {
    public static final byte[] IconCompatParcelizer = new byte[0];
    public final int RemoteActionCompatParcelizer;
    public int serializer;

    public final byte[] RemoteActionCompatParcelizer() throws IOException {
        int i = this.serializer;
        if (i == 0) {
            return IconCompatParcelizer;
        }
        int i2 = this.RatingCompat;
        if (i >= i2) {
            throw new IOException("corrupted stream - out of bounds length found: " + this.serializer + " >= " + i2);
        }
        byte[] bArr = new byte[i];
        int iWrite = i - getEvaluationsfwf_client_releasedefault.write(this.MediaDescriptionCompat, bArr, i);
        this.serializer = iWrite;
        if (iWrite == 0) {
            serializer();
            return bArr;
        }
        UserAgentHeaderInterceptor.serializer(this.RemoteActionCompatParcelizer, iWrite);
        return null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.serializer;
        if (i3 == 0) {
            return -1;
        }
        int i4 = this.MediaDescriptionCompat.read(bArr, i, Math.min(i2, i3));
        if (i4 < 0) {
            UserAgentHeaderInterceptor.serializer(this.RemoteActionCompatParcelizer, this.serializer);
            return 0;
        }
        int i5 = this.serializer - i4;
        this.serializer = i5;
        if (i5 == 0) {
            serializer();
        }
        return i4;
    }

    public writeSelf(InputStream inputStream, int i, int i2) {
        super(i2, inputStream);
        if (i <= 0) {
            if (i < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("negative lengths not allowed");
                throw null;
            }
            serializer();
        }
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.serializer == 0) {
            return -1;
        }
        int i = this.MediaDescriptionCompat.read();
        if (i < 0) {
            UserAgentHeaderInterceptor.serializer(this.RemoteActionCompatParcelizer, this.serializer);
            return 0;
        }
        int i2 = this.serializer - 1;
        this.serializer = i2;
        if (i2 == 0) {
            serializer();
        }
        return i;
    }
}

package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class getHeightannotations extends getSizeNHjbRcannotations {
    public getHeightannotations(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.RemoteActionCompatParcelizer.mark(Integer.MAX_VALUE);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(long j) throws IOException {
        long j2 = this.write;
        if (j2 > j) {
            this.write = 0;
            this.RemoteActionCompatParcelizer.reset();
        } else {
            j -= j2;
        }
        IconCompatParcelizer((int) j);
    }

    public getHeightannotations(byte[] bArr) {
        super(bArr);
        this.RemoteActionCompatParcelizer.mark(Integer.MAX_VALUE);
    }
}

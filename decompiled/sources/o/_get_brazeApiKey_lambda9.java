package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda9 extends _get_brazeApiKey_lambda6 {
    public boolean read;

    @Override // o._get_brazeApiKey_lambda6, o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        if (this.read) {
            return -1L;
        }
        long j2 = super.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L);
        if (j2 != -1) {
            return j2;
        }
        this.read = true;
        read(true, (IOException) null);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        if (!this.read) {
            read(false, (IOException) null);
        }
        this.write = true;
    }

    public _get_brazeApiKey_lambda9(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3) {
        super(_get_brazeapikey_lambda3);
    }
}

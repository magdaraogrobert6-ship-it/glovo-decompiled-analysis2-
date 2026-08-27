package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_ephemeralEventKeys_lambda0 extends _get_brazeApiKey_lambda6 {
    public long read;

    @Override // o._get_brazeApiKey_lambda6, o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return 0L;
        }
        long j2 = this.read;
        if (j2 == 0) {
            return -1L;
        }
        long j3 = super.read(r8lambdabeyrnr8p6809bwlboro_stans, Math.min(j2, 8192L));
        if (j3 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            read(false, (IOException) protocolException);
            throw protocolException;
        }
        long j4 = this.read - j3;
        this.read = j4;
        if (j4 == 0) {
            read(true, (IOException) null);
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.write) {
            return;
        }
        if (this.read != 0) {
            try {
                if (!r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.read(this, 100)) {
                    read(false, (IOException) null);
                }
            } catch (IOException unused) {
            }
        }
        this.write = true;
    }

    public _get_ephemeralEventKeys_lambda0(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3) {
        super(_get_brazeapikey_lambda3);
    }
}

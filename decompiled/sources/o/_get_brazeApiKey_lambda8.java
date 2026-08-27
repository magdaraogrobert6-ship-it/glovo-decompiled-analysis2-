package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda8 implements getConfigurationValue {
    public boolean IconCompatParcelizer;
    public final getRuntimeConfigurationValuelambda0 read;
    public long serializer;
    public final /* synthetic */ _get_brazeApiKey_lambda3 write;

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.read;
    }

    public _get_brazeApiKey_lambda8(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3, long j) {
        this.write = _get_brazeapikey_lambda3;
        this.read = new getRuntimeConfigurationValuelambda0(_get_brazeapikey_lambda3.IconCompatParcelizer.IconCompatParcelizer());
        this.serializer = j;
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws ProtocolException {
        if (this.IconCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
            return;
        }
        long j2 = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        long j3 = this.serializer;
        if (j <= j3) {
            this.write.IconCompatParcelizer.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
            this.serializer -= j;
        } else {
            throw new ProtocolException("expected " + j3 + " bytes but received " + j);
        }
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.write.IconCompatParcelizer.flush();
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        if (this.serializer > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        getRuntimeConfigurationValuelambda0 getruntimeconfigurationvaluelambda0 = this.read;
        isPushDeepLinkBackStackActivityEnabled ispushdeeplinkbackstackactivityenabled = getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer;
        getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer = isPushDeepLinkBackStackActivityEnabled.write;
        ispushdeeplinkbackstackactivityenabled.serializer();
        ispushdeeplinkbackstackactivityenabled.read();
        this.write.read = 3;
    }
}

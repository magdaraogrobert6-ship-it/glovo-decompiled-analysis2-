package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda0 implements getConfigurationValue {
    public final getConfigurationValue RemoteActionCompatParcelizer;

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        this.RemoteActionCompatParcelizer.flush();
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        this.RemoteActionCompatParcelizer.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
    }

    public final String toString() {
        return _get_brazeApiKey_lambda0.class.getSimpleName() + "(" + this.RemoteActionCompatParcelizer.toString() + ")";
    }

    public _get_brazeApiKey_lambda0(getConfigurationValue getconfigurationvalue) {
        if (getconfigurationvalue != null) {
            this.RemoteActionCompatParcelizer = getconfigurationvalue;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("delegate == null");
            throw null;
        }
    }
}

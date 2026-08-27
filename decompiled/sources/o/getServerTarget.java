package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getServerTarget implements getResourceConfigurationValue {
    public final /* synthetic */ com.sentiance.okhttp3.internal.http2.d IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public boolean read;
    public final getResourceConfigurationValue serializer;

    @Override // o.getResourceConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.serializer.IconCompatParcelizer();
    }

    public final void read() throws IOException {
        this.serializer.close();
    }

    public final String toString() {
        return getServerTarget.class.getSimpleName() + "(" + this.serializer.toString() + ")";
    }

    public getServerTarget(com.sentiance.okhttp3.internal.http2.d dVar, getResourceConfigurationValue getresourceconfigurationvalue) {
        this.IconCompatParcelizer = dVar;
        if (getresourceconfigurationvalue == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("delegate == null");
            throw null;
        }
        this.serializer = getresourceconfigurationvalue;
        this.read = false;
        this.RemoteActionCompatParcelizer = 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        read();
        if (this.read) {
            return;
        }
        this.read = true;
        com.sentiance.okhttp3.internal.http2.d dVar = this.IconCompatParcelizer;
        dVar.RemoteActionCompatParcelizer.IconCompatParcelizer(false, dVar, null);
    }

    @Override // o.getResourceConfigurationValue
    public final long read(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) throws IOException {
        try {
            long j2 = this.serializer.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L);
            if (j2 > 0) {
                this.RemoteActionCompatParcelizer += j2;
            }
            return j2;
        } catch (IOException e) {
            if (!this.read) {
                this.read = true;
                com.sentiance.okhttp3.internal.http2.d dVar = this.IconCompatParcelizer;
                dVar.RemoteActionCompatParcelizer.IconCompatParcelizer(false, dVar, e);
            }
            throw e;
        }
    }
}

package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class _get_brazeApiKey_lambda4 implements getConfigurationValue {
    public final getRuntimeConfigurationValuelambda0 IconCompatParcelizer;
    public boolean read;
    public final /* synthetic */ _get_brazeApiKey_lambda3 serializer;

    @Override // o.getConfigurationValue
    public final isPushDeepLinkBackStackActivityEnabled IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o.getConfigurationValue, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.read) {
                return;
            }
            this.read = true;
            this.serializer.IconCompatParcelizer.serializer("0\r\n\r\n");
            getRuntimeConfigurationValuelambda0 getruntimeconfigurationvaluelambda0 = this.IconCompatParcelizer;
            isPushDeepLinkBackStackActivityEnabled ispushdeeplinkbackstackactivityenabled = getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer;
            getruntimeconfigurationvaluelambda0.RemoteActionCompatParcelizer = isPushDeepLinkBackStackActivityEnabled.write;
            ispushdeeplinkbackstackactivityenabled.serializer();
            ispushdeeplinkbackstackactivityenabled.read();
            this.serializer.read = 3;
        }
    }

    @Override // o.getConfigurationValue, java.io.Flushable
    public final void flush() {
        synchronized (this) {
            if (this.read) {
                return;
            }
            this.serializer.IconCompatParcelizer.flush();
        }
    }

    @Override // o.getConfigurationValue
    public final void serializer(r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, long j) {
        r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.serializer.IconCompatParcelizer;
        if (this.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("closed");
        } else {
            if (j == 0) {
                return;
            }
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.write(j);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer("\r\n");
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer("\r\n");
        }
    }

    public _get_brazeApiKey_lambda4(_get_brazeApiKey_lambda3 _get_brazeapikey_lambda3) {
        this.serializer = _get_brazeapikey_lambda3;
        this.IconCompatParcelizer = new getRuntimeConfigurationValuelambda0(_get_brazeapikey_lambda3.IconCompatParcelizer.IconCompatParcelizer());
    }
}

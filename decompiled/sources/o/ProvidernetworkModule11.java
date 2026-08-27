package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes4.dex */
public final class ProvidernetworkModule11 implements Enumeration {
    public int read = 0;
    public final /* synthetic */ ProvidernetworkModule1 serializer;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.read < this.serializer.RemoteActionCompatParcelizer.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.read;
        logErrordefault[] logerrordefaultArr = this.serializer.RemoteActionCompatParcelizer;
        if (i < logerrordefaultArr.length) {
            this.read = i + 1;
            return logerrordefaultArr[i];
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read();
        return null;
    }

    public ProvidernetworkModule11(ProvidernetworkModule1 providernetworkModule1) {
        this.serializer = providernetworkModule1;
    }
}

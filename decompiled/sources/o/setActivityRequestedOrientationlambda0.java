package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setActivityRequestedOrientationlambda0 extends ProxySelector {
    public static final setActivityRequestedOrientationlambda0 RemoteActionCompatParcelizer = new setActivityRequestedOrientationlambda0();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("uri must not be null");
            return null;
        }
        Object[] objArr = {Proxy.NO_PROXY};
        int iSerializer = getQueryParameterslambda2.serializer();
        return (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer);
    }
}
